import java.awt.Component;
import java.awt.datatransfer.Clipboard;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
@Implements("KeyHandler")
public class KeyHandler implements KeyListener, FocusListener {
	@ObfuscatedName("ah")
	@Export("cacheSubPaths")
	static String[] cacheSubPaths;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	static GameBuild field73;
	@ObfuscatedName("an")
	Collection field76;
	@ObfuscatedName("av")
	Collection field77;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Lbo;"
	)
	class29[] field74;
	@ObfuscatedName("ax")
	@Export("KeyHandler_pressedKeys")
	boolean[] KeyHandler_pressedKeys;
	@ObfuscatedName("ap")
	@Export("KeyHandler_idleCycles")
	volatile int KeyHandler_idleCycles;

	KeyHandler() {
		super();
		this.field74 = new class29[3];
		this.KeyHandler_pressedKeys = new boolean[112];
		this.KeyHandler_idleCycles = 0;
		this.field76 = new ArrayList(100);
		this.field77 = new ArrayList(100);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lbo;II)V",
		garbageValue = "1361676668"
	)
	void method86(class29 var1, int var2) {
		this.field74[var2] = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-97"
	)
	@Export("getIdleCycles")
	public int getIdleCycles() {
		return this.KeyHandler_idleCycles;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "1463326789"
	)
	void method88(Component var1) {
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(this);
		var1.addFocusListener(this);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;S)V",
		garbageValue = "256"
	)
	synchronized void method89(Component var1) {
		var1.removeKeyListener(this);
		var1.removeFocusListener(this);
		synchronized(this) {
			this.field76.add(new class33(4, 0));
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	void method90() {
		++this.KeyHandler_idleCycles;
		this.method91();
		Iterator var1 = this.field77.iterator();

		while (var1.hasNext()) {
			class33 var2 = (class33)var1.next();

			for (int var3 = 0; var3 < this.field74.length && !var2.method118(this.field74[var3]); ++var3) {
			}
		}

		this.field77.clear();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "662992859"
	)
	synchronized void method91() {
		Collection var1 = this.field77;
		this.field77 = this.field76;
		this.field76 = var1;
	}

	@Export("keyPressed")
	@ObfuscatedName("keyPressed")
	public final synchronized void keyPressed(KeyEvent var1) {
		int var2;
		label23: {
			var2 = var1.getKeyCode();
			if (var2 >= 0) {
				int var4 = class28.KeyHandler_keyCodes.length;
				if (var2 < var4) {
					var2 = MilliClock.method914(var2);
					boolean var5 = (var2 & 128) != 0;
					if (var5) {
						var2 = -1;
					}
					break label23;
				}
			}

			var2 = -1;
		}

		if (var2 >= 0) {
			this.KeyHandler_pressedKeys[var2] = true;
			this.field76.add(new class33(1, var2));
			this.KeyHandler_idleCycles = 0;
		}

		var1.consume();
	}

	@Export("keyReleased")
	@ObfuscatedName("keyReleased")
	public final synchronized void keyReleased(KeyEvent var1) {
		int var2;
		label16: {
			var2 = var1.getKeyCode();
			if (var2 >= 0) {
				int var4 = class28.KeyHandler_keyCodes.length;
				if (var2 < var4) {
					var2 = MilliClock.method914(var2) & -129;
					break label16;
				}
			}

			var2 = -1;
		}

		if (var2 >= 0) {
			this.KeyHandler_pressedKeys[var2] = false;
			this.field76.add(new class33(2, var2));
		}

		var1.consume();
	}

	@Export("keyTyped")
	@ObfuscatedName("keyTyped")
	public final synchronized void keyTyped(KeyEvent var1) {
		char var2 = var1.getKeyChar();
		if (var2 != 0 && var2 != '\uffff') {
			boolean var3;
			if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
				var3 = true;
			} else {
				label53: {
					if (var2 != 0) {
						char[] var4 = class382.cp1252AsciiExtension;

						for (int var5 = 0; var5 < var4.length; ++var5) {
							char var6 = var4[var5];
							if (var2 == var6) {
								var3 = true;
								break label53;
							}
						}
					}

					var3 = false;
				}
			}

			if (var3) {
				this.field76.add(new class33(3, var2));
			}
		}

		var1.consume();
	}

	public final synchronized void focusGained(FocusEvent var1) {
		this.field76.add(new class33(4, 1));
	}

	@Export("focusLost")
	@ObfuscatedName("focusLost")
	public final synchronized void focusLost(FocusEvent var1) {
		for (int var2 = 0; var2 < 112; ++var2) {
			if (this.KeyHandler_pressedKeys[var2]) {
				this.KeyHandler_pressedKeys[var2] = false;
				this.field76.add(new class33(2, var2));
			}
		}

		this.field76.add(new class33(4, 0));
	}

	@ObfuscatedName("nq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "890471143"
	)
	public static Clipboard method92() {
		return class347.client.getClipboard();
	}
}
