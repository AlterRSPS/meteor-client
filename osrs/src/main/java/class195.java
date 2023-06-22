import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
public enum class195 implements class369 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	field1606(2, 0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	field1605(0, 1),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	field1607(1, 2);

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "[Ltj;"
	)
	@Export("modIconSprites")
	static IndexedSprite[] modIconSprites;
	@ObfuscatedName("sw")
	@ObfuscatedSignature(
		descriptor = "Lgv;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;
	@ObfuscatedName("as")
	public final int field1609;
	@ObfuscatedName("ax")
	final int field1608;

	class195(int var3, int var4) {
		this.field1609 = var3;
		this.field1608 = var4;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-14"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1608;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "724345939"
	)
	static long method986() {
		try {
			URL var0 = new URL(Widget.method1853("services", false) + "m=accountappeal/login.ws");
			URLConnection var1 = var0.openConnection();
			var1.setRequestProperty("connection", "close");
			var1.setDoInput(true);
			var1.setDoOutput(true);
			var1.setConnectTimeout(5000);
			OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
			var2.write("data1=req");
			var2.flush();
			InputStream var3 = var1.getInputStream();
			Buffer var4 = new Buffer(new byte[1000]);

			do {
				int var5 = var3.read(var4.array, var4.offset, 1000 - var4.offset);
				if (var5 == -1) {
					var4.offset = 0;
					long var7 = var4.readLong();
					return var7;
				}

				var4.offset += var5;
			} while(var4.offset < 1000);

			return 0L;
		} catch (Exception var9) {
			return 0L;
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "1899018290"
	)
	static int method987(int var0, Script var1, boolean var2) {
		if (var0 == 6200) {
			Interpreter.Interpreter_intStackSize -= 2;
			Client.field638 = (short)class389.method2009(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
			if (Client.field638 <= 0) {
				Client.field638 = 256;
			}

			Client.field642 = (short)class389.method2009(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
			if (Client.field642 <= 0) {
				Client.field642 = 256;
			}

			return 1;
		} else if (var0 == 6201) {
			Interpreter.Interpreter_intStackSize -= 2;
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			if (Client.zoomHeight <= 0) {
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			if (Client.zoomWidth <= 0) {
				Client.zoomWidth = 320;
			}

			return 1;
		} else if (var0 == 6202) {
			Interpreter.Interpreter_intStackSize -= 4;
			Client.field641 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			if (Client.field641 <= 0) {
				Client.field641 = 1;
			}

			Client.field640 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			if (Client.field640 <= 0) {
				Client.field640 = 32767;
			} else if (Client.field640 < Client.field641) {
				Client.field640 = Client.field641;
			}

			Client.field644 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
			if (Client.field644 <= 0) {
				Client.field644 = 1;
			}

			Client.field637 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
			if (Client.field637 <= 0) {
				Client.field637 = 32767;
			} else if (Client.field637 < Client.field644) {
				Client.field637 = Client.field644;
			}

			return 1;
		} else if (var0 == 6203) {
			if (Client.viewportWidget != null) {
				WorldMapDecorationType.setViewportShape(0, 0, Client.viewportWidget.width * 1387970291, Client.viewportWidget.height * -175088023, false);
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportWidth;
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportHeight;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
			}

			return 1;
		} else if (var0 == 6204) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomHeight;
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomWidth;
			return 1;
		} else if (var0 == 6205) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapRegion.method1475(Client.field638);
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapRegion.method1475(Client.field642);
			return 1;
		} else if (var0 == 6220) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class448.canvasWidth;
			return 1;
		} else if (var0 == 6223) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class270.canvasHeight;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-31"
	)
	static void method988(int var0) {
		UrlRequester.tempMenuAction = new MenuAction();
		UrlRequester.tempMenuAction.param0 = Client.menuArguments1[var0];
		UrlRequester.tempMenuAction.param1 = Client.menuArguments2[var0];
		UrlRequester.tempMenuAction.opcode = Client.menuOpcodes[var0];
		UrlRequester.tempMenuAction.identifier = Client.menuIdentifiers[var0];
		UrlRequester.tempMenuAction.itemId = Client.menuItemIds[var0];
		UrlRequester.tempMenuAction.action = Client.menuActions[var0];
		UrlRequester.tempMenuAction.target = Client.menuTargets[var0];
	}
}
