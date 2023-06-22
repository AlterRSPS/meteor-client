import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sy")
public class class478 implements class477 {
	@ObfuscatedName("at")
	Map field4002;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ltn;"
	)
	final class508 field4003;

	@ObfuscatedSignature(
		descriptor = "(Ltn;)V"
	)
	public class478(class508 var1) {
		super();
		this.field4003 = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-117"
	)
	@Export("vmethod8144")
	public int vmethod8144(int var1) {
		if (this.field4002 != null) {
			class509 var2 = (class509)this.field4002.get(var1);
			if (var2 != null) {
				return (Integer)var2.field4120;
			}
		}

		return (Integer)this.field4003.vmethod8697(var1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "-291731808"
	)
	@Export("vmethod8143")
	public void vmethod8143(int var1, Object var2) {
		if (this.field4002 == null) {
			this.field4002 = new HashMap();
			this.field4002.put(var1, new class509(var1, var2));
		} else {
			class509 var3 = (class509)this.field4002.get(var1);
			if (var3 == null) {
				this.field4002.put(var1, new class509(var1, var2));
			} else {
				var3.field4120 = var2;
			}
		}

	}

	@Export("iterator")
	@ObfuscatedName("iterator")
	public Iterator iterator() {
		return this.field4002 == null ? Collections.emptyList().iterator() : this.field4002.values().iterator();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lnq;Lnq;Ljava/lang/String;Ljava/lang/String;I)Lph;",
		garbageValue = "-1413034825"
	)
	public static Font method2416(AbstractArchive var0, AbstractArchive var1, String var2, String var3) {
		if (!var0.isValidFileName(var2, var3)) {
			return null;
		} else {
			int var4 = var0.getGroupId(var2);
			int var5 = var0.getFileId(var4, var3);
			byte[] var8 = var0.takeFile(var4, var5);
			boolean var7;
			if (var8 == null) {
				var7 = false;
			} else {
				UserComparator2.SpriteBuffer_decode(var8);
				var7 = true;
			}

			Font var6;
			if (!var7) {
				var6 = null;
			} else {
				byte[] var9 = var1.takeFile(var4, var5);
				Font var11;
				if (var9 == null) {
					var11 = null;
				} else {
					Font var10 = new Font(var9, class515.SpriteBuffer_xOffsets, class402.SpriteBuffer_yOffsets, class515.SpriteBuffer_spriteWidths, class515.SpriteBuffer_spriteHeights, class515.SpriteBuffer_spritePalette, class515.SpriteBuffer_pixels);
					TextureProvider.method1309();
					var11 = var10;
				}

				var6 = var11;
			}

			return var6;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-1731010551"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0;
		Login.Login_response2 = var1;
		Login.Login_response3 = var2;
	}
}
