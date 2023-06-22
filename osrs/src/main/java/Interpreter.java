import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("as")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("ax")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("ap")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("ab")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("ak")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("ae")
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("af")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("aa")
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lcm;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	@Export("scriptActiveWidget")
	static Widget scriptActiveWidget;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lgv;"
	)
	static ClanChannel field700;
	@ObfuscatedName("ah")
	static int field703;
	@ObfuscatedName("az")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("au")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("aq")
	static boolean field696;
	@ObfuscatedName("aw")
	static boolean field697;
	@ObfuscatedName("ay")
	static ArrayList field711;
	@ObfuscatedName("al")
	static int field704;
	@ObfuscatedName("bj")
	static final double field714;
	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	static Task field699;

	static {
		Interpreter_arrayLengths = new int[5];
		Interpreter_arrays = new int[5][5000];
		Interpreter_intStack = new int[1000];
		Interpreter_stringStack = new String[1000];
		Interpreter_frameDepth = 0;
		Interpreter_frames = new ScriptFrame[50];
		Interpreter_calendar = java.util.Calendar.getInstance();
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		field696 = false;
		field697 = false;
		field711 = new ArrayList();
		field704 = 0;
		field714 = Math.log(2.0D);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([BB)Ltm;",
		garbageValue = "8"
	)
	public static final SpritePixels method412(byte[] var0) {
		BufferedImage var1 = null;

		try {
			Class var2 = ImageIO.class;
			synchronized(ImageIO.class) {
				var1 = ImageIO.read(new ByteArrayInputStream(var0));
			}

			int var6 = var1.getWidth();
			int var7 = var1.getHeight();
			int[] var4 = new int[var6 * var7];
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var6, var7, var4, 0, var6);
			var5.grabPixels();
			return new SpritePixels(var4, var6, var7);
		} catch (IOException var9) {
		} catch (InterruptedException var10) {
		}

		return new SpritePixels(0, 0);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "554074328"
	)
	public static int method413(int var0) {
		return var0 >> 17 & 7;
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-5020"
	)
	static final void method414() {
		if (Client.logoutTimer > 0) {
			FriendSystem.logOut();
		} else {
			Client.timer.method2110();
			UserComparator8.updateGameState(40);
			ArchiveLoader.field846 = Client.packetWriter.getSocket();
			Client.packetWriter.removeSocket();
		}
	}
}
