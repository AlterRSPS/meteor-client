import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ai")
public class class20 {
	@ObfuscatedName("at")
	final int field62;
	@ObfuscatedName("an")
	final Map field64;
	@ObfuscatedName("av")
	final String field63;

	class20(String var1) {
		super();
		this.field62 = 400;
		this.field64 = null;
		this.field63 = "";
	}

	class20(HttpURLConnection var1) throws IOException {
		super();
		this.field62 = var1.getResponseCode();
		var1.getResponseMessage();
		this.field64 = var1.getHeaderFields();
		StringBuilder var2 = new StringBuilder();
		InputStream var3 = this.field62 >= 300 ? var1.getErrorStream() : var1.getInputStream();
		if (var3 != null) {
			InputStreamReader var4 = new InputStreamReader(var3);
			BufferedReader var5 = new BufferedReader(var4);

			String var6;
			while ((var6 = var5.readLine()) != null) {
				var2.append(var6);
			}

			var3.close();
		}

		this.field63 = var2.toString();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1671621028"
	)
	public int method66() {
		return this.field62;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/Map;",
		garbageValue = "6"
	)
	public Map method67() {
		return this.field64;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2017812599"
	)
	public String method68() {
		return this.field63;
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "67341545"
	)
	static final void method69(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
			if (Client.rootWidgetXs[var4] + Client.rootWidgetWidths[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
				Client.field404[var4] = true;
			}
		}

	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(Lmb;IIIIIII)V",
		garbageValue = "1532178928"
	)
	static final void method70(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field379) {
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0;
		}

		Client.field379 = false;
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !class305.mouseCam && MouseHandler.MouseHandler_currentButton == 4) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
				var0.scrollY -= 4;
				Messages.invalidateWidget(var0);
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
				var0.scrollY += 4;
				Messages.invalidateWidget(var0);
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
				var7 = var3 * (var3 - 32) / var4;
				if (var7 < 8) {
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2;
				int var9 = var3 - 32 - var7;
				var0.scrollY = var8 * (var4 - var3) / var9;
				Messages.invalidateWidget(var0);
				Client.field379 = true;
			}
		}

		if (Client.mouseWheelRotation != 0) {
			var7 = var0.width * 1387970291;
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
				var0.scrollY += Client.mouseWheelRotation * 45;
				Messages.invalidateWidget(var0);
			}
		}

	}
}
