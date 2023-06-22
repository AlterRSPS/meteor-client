import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nf")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements class369 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3078(0, 0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3094(1, 0),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3079(2, 0),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3077(3, 0),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3080(9, 2),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3096(4, 1),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3084(5, 1),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3093(6, 1),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3087(7, 1),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3088(8, 1),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3095(12, 2),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3083(13, 2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3092(14, 2),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3086(15, 2),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3085(16, 2),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3089(17, 2),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3098(18, 2),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3090(19, 2),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3101(20, 2),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3099(21, 2),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3091(10, 2),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3097(11, 2),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3100(22, 3);

	@ObfuscatedName("by")
	static String field3081;
	@ObfuscatedName("gl")
	static String field3082;
	// $FF: renamed from: id int
	@ObfuscatedName("ay")
	@Export("id")
	public final int field_66;

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	WorldMapDecorationType(int var3, int var4) {
		this.field_66 = var3;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-14"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field_66;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)[Ldb;",
		garbageValue = "31"
	)
	static class89[] method1865() {
		return new class89[]{class89.field879, class89.field881, class89.field878, class89.field880, class89.field882};
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(IIIIZB)V",
		garbageValue = "-113"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) {
			var2 = 1;
		}

		if (var3 < 1) {
			var3 = 1;
		}

		int var5 = var3 - 334;
		int var6;
		if (var5 < 0) {
			var6 = Client.field638;
		} else if (var5 >= 100) {
			var6 = Client.field642;
		} else {
			var6 = (Client.field642 - Client.field638) * var5 / 100 + Client.field638;
		}

		int var7 = var3 * var6 * 512 / (var2 * 334);
		int var8;
		int var9;
		short var10;
		if (var7 < Client.field644) {
			var10 = Client.field644;
			var6 = var10 * var2 * 334 / (var3 * 512);
			if (var6 > Client.field640) {
				var6 = Client.field640;
				var8 = var3 * var6 * 512 / (var10 * 334);
				var9 = (var2 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216);
				}

				var0 += var9;
				var2 -= var9 * 2;
			}
		} else if (var7 > Client.field637) {
			var10 = Client.field637;
			var6 = var10 * var2 * 334 / (var3 * 512);
			if (var6 < Client.field641) {
				var6 = Client.field641;
				var8 = var10 * var2 * 334 / (var6 * 512);
				var9 = (var3 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216);
				}

				var1 += var9;
				var3 -= var9 * 2;
			}
		}

		Client.viewportZoom = var3 * var6 / 334;
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) {
			class157.method823(var2, var3);
		}

		Client.viewportOffsetX = var0;
		Client.viewportOffsetY = var1;
		Client.viewportWidth = var2;
		Client.viewportHeight = var3;
	}
}
