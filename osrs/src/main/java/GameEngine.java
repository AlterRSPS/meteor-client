import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ba")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lba;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("av")
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("as")
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("ax")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("ab")
	@Export("gameCyclesToDo")
	static int gameCyclesToDo;
	@ObfuscatedName("ak")
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("ae")
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("af")
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("aj")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("ac")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("bd")
	static int field101;
	@ObfuscatedName("bi")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lam;"
	)
	@Export("keyHandler")
	protected static KeyHandler keyHandler;
	@ObfuscatedName("bm")
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("br")
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("ap")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("ar")
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("ah")
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("az")
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("au")
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("aw")
	int field114;
	@ObfuscatedName("ay")
	int field115;
	@ObfuscatedName("al")
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("am")
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("bs")
	protected boolean field121;
	@ObfuscatedName("bo")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("bq")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("bg")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("ba")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("bn")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("bb")
	volatile long field126;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Laq;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("bp")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("bw")
	@Export("eventQueue")
	final EventQueue eventQueue;

	static {
		gameEngine = null;
		GameEngine_redundantStartThreadCount = 0;
		stopTimeMs = 0L;
		isKilled = false;
		cycleDurationMillis = 20;
		fiveOrOne = 1;
		fps = 0;
		graphicsTickTimes = new long[32];
		clientTickTimes = new long[32];
		field101 = 500;
		volatileFocus = true;
		keyHandler = new KeyHandler();
		garbageCollectorLastCollectionTime = -1L;
		garbageCollectorLastCheckTimeMs = -1L;
	}

	protected GameEngine() {
		super();
		this.hasErrored = false;
		this.canvasX = 0;
		this.canvasY = 0;
		this.field121 = false;
		this.fullRedraw = true;
		this.resizeCanvasNextFrame = false;
		this.isCanvasInvalid = false;
		this.field126 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.eventQueue = var1;
		class439.method2276(new DevicePcmPlayerProvider());
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "313026208"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
			this.method141();
		}

		this.maxCanvasWidth = var1;
		this.maxCanvasHeight = var2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;B)V",
		garbageValue = "0"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) {
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
				FloorDecoration.method1176(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lgp;",
		garbageValue = "1687069782"
	)
	@Export("mouseWheel")
	protected class173 mouseWheel() {
		if (this.mouseWheelHandler == null) {
			this.mouseWheelHandler = new MouseWheelHandler();
			this.mouseWheelHandler.addTo(this.canvas);
		}

		return this.mouseWheelHandler;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1864005520"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-569645123"
	)
	protected void method125(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "-18720527"
	)
	@Export("getClipboard")
	protected Clipboard getClipboard() {
		return this.clipboard;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-96205193"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
			class28.KeyHandler_keyCodes[186] = 57;
			class28.KeyHandler_keyCodes[187] = 27;
			class28.KeyHandler_keyCodes[188] = 71;
			class28.KeyHandler_keyCodes[189] = 26;
			class28.KeyHandler_keyCodes[190] = 72;
			class28.KeyHandler_keyCodes[191] = 73;
			class28.KeyHandler_keyCodes[192] = 58;
			class28.KeyHandler_keyCodes[219] = 42;
			class28.KeyHandler_keyCodes[220] = 74;
			class28.KeyHandler_keyCodes[221] = 43;
			class28.KeyHandler_keyCodes[222] = 59;
			class28.KeyHandler_keyCodes[223] = 28;
		} else {
			class28.KeyHandler_keyCodes[44] = 71;
			class28.KeyHandler_keyCodes[45] = 26;
			class28.KeyHandler_keyCodes[46] = 72;
			class28.KeyHandler_keyCodes[47] = 73;
			class28.KeyHandler_keyCodes[59] = 57;
			class28.KeyHandler_keyCodes[61] = 27;
			class28.KeyHandler_keyCodes[91] = 42;
			class28.KeyHandler_keyCodes[92] = 74;
			class28.KeyHandler_keyCodes[93] = 43;
			class28.KeyHandler_keyCodes[192] = 28;
			class28.KeyHandler_keyCodes[222] = 58;
			class28.KeyHandler_keyCodes[520] = 59;
		}

		keyHandler.method88(this.canvas);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-331583429"
	)
	protected final void method128() {
		keyHandler.method90();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lbo;II)V",
		garbageValue = "-1406442453"
	)
	protected void method129(class29 var1, int var2) {
		keyHandler.method86(var1, var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1070899817"
	)
	protected final void method130() {
		class237.method1310(this.canvas);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "254887913"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container();
		if (var1 != null) {
			Bounds var2 = this.getFrameContentBounds();
			this.contentWidth = Math.max(var2.highX * -434593771, this.field114);
			this.contentHeight = Math.max(var2.highY * 102827573, this.field115);
			if (this.contentWidth <= 0) {
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) {
				this.contentHeight = 1;
			}

			class448.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
			class270.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
			this.canvasX = (this.contentWidth - class448.canvasWidth) / 2;
			this.canvasY = 0;
			this.canvas.setSize(class448.canvasWidth, class270.canvasHeight);
			WorldMapSectionType.rasterProvider = new RasterProvider(class448.canvasWidth, class270.canvasHeight, this.canvas, this.field121);
			if (var1 == this.frame) {
				Insets var3 = this.frame.getInsets();
				this.canvas.setLocation(var3.left + this.canvasX, this.canvasY + var3.top);
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY);
			}

			this.fullRedraw = true;
			this.resizeGame();
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "57"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "79303459"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX;
		int var2 = this.canvasY;
		int var3 = this.contentWidth - class448.canvasWidth - var1;
		int var4 = this.contentHeight - class270.canvasHeight - var2;
		if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
			try {
				Container var5 = this.container();
				int var6 = 0;
				int var7 = 0;
				if (var5 == this.frame) {
					Insets var8 = this.frame.getInsets();
					var6 = var8.left;
					var7 = var8.top;
				}

				Graphics var10 = var5.getGraphics();
				var10.setColor(Color.black);
				if (var1 > 0) {
					var10.fillRect(var6, var7, var1, this.contentHeight);
				}

				if (var2 > 0) {
					var10.fillRect(var6, var7, this.contentWidth, var2);
				}

				if (var3 > 0) {
					var10.fillRect(var6 + this.contentWidth - var3, var7, var3, this.contentHeight);
				}

				if (var4 > 0) {
					var10.fillRect(var6, var7 + this.contentHeight - var4, this.contentWidth, var4);
				}
			} catch (Exception var9) {
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "729182928"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		keyHandler.method89(this.canvas);
		PendingSpawn.method488(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.method72(this.canvas);
		}

		this.addCanvas();
		keyHandler.method88(this.canvas);
		class237.method1310(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method141();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-31"
	)
	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3, int var4) {
		try {
			if (gameEngine != null) {
				++GameEngine_redundantStartThreadCount;
				if (GameEngine_redundantStartThreadCount >= 3) {
					this.error("alreadyloaded");
					return;
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				return;
			}

			gameEngine = this;
			class448.canvasWidth = var1;
			class270.canvasHeight = var2;
			class160.RunException_revision = var3;
			class163.field1404 = var4;
			RunException.RunException_applet = this;
			if (taskHandler == null) {
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1);
		} catch (Exception var6) {
			class260.RunException_sendStackTrace((String)null, var6);
			this.error("crash");
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1333626461"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container();
		if (this.canvas != null) {
			this.canvas.removeFocusListener(this);
			var1.remove(this.canvas);
		}

		class448.canvasWidth = Math.max(var1.getWidth(), this.field114);
		class270.canvasHeight = Math.max(var1.getHeight(), this.field115);
		Insets var2;
		if (this.frame != null) {
			var2 = this.frame.getInsets();
			class448.canvasWidth -= var2.right + var2.left;
			class270.canvasHeight -= var2.bottom + var2.top;
		}

		this.canvas = new Canvas(this);
		var1.setBackground(Color.BLACK);
		var1.setLayout((LayoutManager)null);
		var1.add(this.canvas);
		this.canvas.setSize(class448.canvasWidth, class270.canvasHeight);
		this.canvas.setVisible(true);
		this.canvas.setBackground(Color.BLACK);
		if (var1 == this.frame) {
			var2 = this.frame.getInsets();
			this.canvas.setLocation(var2.left + this.canvasX, var2.top + this.canvasY);
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY);
		}

		this.canvas.addFocusListener(this);
		this.canvas.requestFocus();
		this.fullRedraw = true;
		if (WorldMapSectionType.rasterProvider != null && class448.canvasWidth == WorldMapSectionType.rasterProvider.width && class270.canvasHeight == WorldMapSectionType.rasterProvider.height) {
			((RasterProvider)WorldMapSectionType.rasterProvider).setComponent(this.canvas);
			WorldMapSectionType.rasterProvider.drawFull(0, 0);
		} else {
			WorldMapSectionType.rasterProvider = new RasterProvider(class448.canvasWidth, class270.canvasHeight, this.canvas, this.field121);
		}

		this.isCanvasInvalid = false;
		this.field126 = BoundaryObject.clockNow();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1666256751"
	)
	protected void method136(boolean var1) {
		if (this.field121 != var1) {
			this.field121 = var1;
			WorldMapSectionType.rasterProvider.method2603(var1);
			WorldMapSectionType.rasterProvider.apply();
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-64"
	)
	@Export("checkHost")
	protected final boolean checkHost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase();
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) {
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) {
				if (var1.endsWith("127.0.0.1")) {
					return true;
				} else {
					while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
						var1 = var1.substring(0, var1.length() - 1);
					}

					if (var1.endsWith("192.168.1.")) {
						return true;
					} else {
						this.error("invalidhost");
						return false;
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "55714431"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = BoundaryObject.clockNow();
		long var3 = clientTickTimes[class112.field1151];
		clientTickTimes[class112.field1151] = var1;
		class112.field1151 = class112.field1151 + 1 & 31;
		if (var3 != 0L && var1 > var3) {
		}

		synchronized(this) {
			class31.hasFocus = volatileFocus;
		}

		this.doCycle();
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1752034937"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container();
		long var2 = BoundaryObject.clockNow();
		long var4 = graphicsTickTimes[BufferedNetSocket.field3758];
		graphicsTickTimes[BufferedNetSocket.field3758] = var2;
		BufferedNetSocket.field3758 = BufferedNetSocket.field3758 + 1 & 31;
		if (0L != var4 && var2 > var4) {
			int var6 = (int)(var2 - var4);
			fps = ((var6 >> 1) + 32000) / var6;
		}

		if (++field101 - 1 > 50) {
			field101 -= 50;
			this.fullRedraw = true;
			this.canvas.setSize(class448.canvasWidth, class270.canvasHeight);
			this.canvas.setVisible(true);
			if (var1 == this.frame) {
				Insets var7 = this.frame.getInsets();
				this.canvas.setLocation(this.canvasX + var7.left, this.canvasY + var7.top);
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY);
			}
		}

		if (this.isCanvasInvalid) {
			this.replaceCanvas();
		}

		this.method140();
		this.draw(this.fullRedraw);
		if (this.fullRedraw) {
			this.clearBackground();
		}

		this.fullRedraw = false;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1550811963"
	)
	final void method140() {
		Bounds var1 = this.getFrameContentBounds();
		if (this.contentWidth != var1.highX * -434593771 || var1.highY * 102827573 != this.contentHeight || this.resizeCanvasNextFrame) {
			this.resizeCanvas();
			this.resizeCanvasNextFrame = false;
		}

	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "934214551"
	)
	final void method141() {
		this.resizeCanvasNextFrame = true;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "501694298"
	)
	@Export("kill")
	final synchronized void kill() {
		if (!isKilled) {
			isKilled = true;

			try {
				this.canvas.removeFocusListener(this);
			} catch (Exception var5) {
			}

			try {
				this.kill0();
			} catch (Exception var4) {
			}

			if (this.frame != null) {
				try {
					System.exit(0);
				} catch (Throwable var3) {
				}
			}

			if (taskHandler != null) {
				try {
					taskHandler.close();
				} catch (Exception var2) {
				}
			}

			this.vmethod1485();
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "44"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "43"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-146179282"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "279913198"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZI)V",
		garbageValue = "1215659496"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics();
			if (DesktopPlatformInfoProvider.fontHelvetica13 == null) {
				DesktopPlatformInfoProvider.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
				class133.loginScreenFontMetrics = this.canvas.getFontMetrics(DesktopPlatformInfoProvider.fontHelvetica13);
			}

			if (var3) {
				var4.setColor(Color.black);
				var4.fillRect(0, 0, class448.canvasWidth, class270.canvasHeight);
			}

			Color var5 = new Color(140, 17, 17);

			try {
				if (class59.field306 == null) {
					class59.field306 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = class59.field306.getGraphics();
				var6.setColor(var5);
				var6.drawRect(0, 0, 303, 33);
				var6.fillRect(2, 2, var1 * 3, 30);
				var6.setColor(Color.black);
				var6.drawRect(1, 1, 301, 31);
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
				var6.setFont(DesktopPlatformInfoProvider.fontHelvetica13);
				var6.setColor(Color.white);
				var6.drawString(var2, (304 - class133.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
				var4.drawImage(class59.field306, class448.canvasWidth / 2 - 152, class270.canvasHeight / 2 - 18, (ImageObserver)null);
			} catch (Exception var9) {
				int var7 = class448.canvasWidth / 2 - 152;
				int var8 = class270.canvasHeight / 2 - 18;
				var4.setColor(var5);
				var4.drawRect(var7, var8, 303, 33);
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30);
				var4.setColor(Color.black);
				var4.drawRect(var7 + 1, var8 + 1, 301, 31);
				var4.fillRect(var1 * 3 + var7 + 2, var8 + 2, 300 - var1 * 3, 30);
				var4.setFont(DesktopPlatformInfoProvider.fontHelvetica13);
				var4.setColor(Color.white);
				var4.drawString(var2, var7 + (304 - class133.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22);
			}
		} catch (Exception var10) {
			this.canvas.repaint();
		}

	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-622954298"
	)
	protected final void method144() {
		class59.field306 = null;
		DesktopPlatformInfoProvider.fontHelvetica13 = null;
		class133.loginScreenFontMetrics = null;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1477771111"
	)
	@Export("error")
	protected void error(String var1) {
		if (!this.hasErrored) {
			this.hasErrored = true;
			System.out.println("error_game_" + var1);

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
			} catch (Exception var3) {
			}

		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/Container;",
		garbageValue = "1128381047"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this);
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(B)Lqs;",
		garbageValue = "48"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container();
		int var2 = Math.max(var1.getWidth(), this.field114);
		int var3 = Math.max(var1.getHeight(), this.field115);
		if (this.frame != null) {
			Insets var4 = this.frame.getInsets();
			var2 -= var4.left + var4.right;
			var3 -= var4.bottom + var4.top;
		}

		return new Bounds(var2, var3);
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1053178714"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-6"
	)
	@Export("vmethod1485")
	protected abstract void vmethod1485();

	@Export("destroy")
	@ObfuscatedName("destroy")
	public final void destroy() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = BoundaryObject.clockNow();
			FloorDecoration.method1176(5000L);
			this.kill();
		}
	}

	@Export("paint")
	@ObfuscatedName("paint")
	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) {
			this.fullRedraw = true;
			if (BoundaryObject.clockNow() - this.field126 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= class448.canvasWidth && var2.height >= class270.canvasHeight) {
					this.isCanvasInvalid = true;
				}
			}

		}
	}

	@Export("run")
	@ObfuscatedName("run")
	public void run() {
		try {
			if (TaskHandler.javaVendor != null) {
				String var1 = TaskHandler.javaVendor.toLowerCase();
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
					String var2 = TaskHandler.javaVersion;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
						this.error("wrongjava");
						return;
					}

					if (var2.startsWith("1.6.0_")) {
						int var3;
						for (var3 = 6; var3 < var2.length() && class159.isDigit(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3);
						if (class146.isNumber(var4) && TextureProvider.method1301(var4) < 10) {
							this.error("wrongjava");
							return;
						}
					}

					fiveOrOne = 5;
				}
			}

			this.setFocusCycleRoot(true);
			this.addCanvas();
			this.setUp();

			Object var8;
			try {
				var8 = new NanoClock();
			} catch (Throwable var6) {
				var8 = new MilliClock();
			}

			BufferedNetSocket.clock = (Clock)var8;

			while (0L == stopTimeMs || BoundaryObject.clockNow() < stopTimeMs) {
				gameCyclesToDo = BufferedNetSocket.clock.wait(cycleDurationMillis, fiveOrOne);

				for (int var5 = 0; var5 < gameCyclesToDo; ++var5) {
					this.clientTick();
				}

				this.graphicsTick();
				this.post(this.canvas);
			}
		} catch (Exception var7) {
			class260.RunException_sendStackTrace((String)null, var7);
			this.error("crash");
		}

		this.kill();
	}

	@Export("start")
	@ObfuscatedName("start")
	public final void start() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = 0L;
		}
	}

	@Export("stop")
	@ObfuscatedName("stop")
	public final void stop() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = BoundaryObject.clockNow() + 4000L;
		}
	}

	@Export("update")
	@ObfuscatedName("update")
	public final void update(Graphics var1) {
		this.paint(var1);
	}

	@Export("focusGained")
	@ObfuscatedName("focusGained")
	public final void focusGained(FocusEvent var1) {
		volatileFocus = true;
		this.fullRedraw = true;
	}

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false;
	}

	public final void windowActivated(WindowEvent var1) {
	}

	public final void windowClosed(WindowEvent var1) {
	}

	@Export("windowClosing")
	@ObfuscatedName("windowClosing")
	public final void windowClosing(WindowEvent var1) {
		this.destroy();
	}

	public final void windowDeactivated(WindowEvent var1) {
	}

	public final void windowDeiconified(WindowEvent var1) {
	}

	public final void windowIconified(WindowEvent var1) {
	}

	public final void windowOpened(WindowEvent var1) {
	}

	@ObfuscatedName("init")
	public abstract void init();

	@ObfuscatedName("at")
	public static boolean method120(long var0) {
		boolean var2 = 0L != var0;
		if (var2) {
			boolean var3 = (int)(var0 >>> 16 & 1L) == 1;
			var2 = !var3;
		}

		return var2;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "301181960"
	)
	static final int method149(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}
}
