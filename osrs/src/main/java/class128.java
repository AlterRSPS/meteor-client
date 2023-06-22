import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
public class class128 implements Callable {
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "Ltj;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	final class129 field1213;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class130 field1215;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	final class131 field1214;
	@ObfuscatedName("as")
	final int field1216;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	@Export("this$0")
	@ObfuscatedName("this$0")
	final class136 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;Leq;Lfg;Lfa;I)V"
	)
	class128(class136 var1, class129 var2, class130 var3, class131 var4, int var5) {
		super();
		this.this$0 = var1;
		this.field1213 = var2;
		this.field1215 = var3;
		this.field1214 = var4;
		this.field1216 = var5;
	}

	@Export("call")
	@ObfuscatedName("call")
	public Object call() {
		this.field1213.method694();
		class129[][] var1;
		if (this.field1215 == class130.field1241) {
			var1 = this.this$0.field1279;
		} else {
			var1 = this.this$0.field1284;
		}

		var1[this.field1216][this.field1214.method708()] = this.field1213;
		return null;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-709369885"
	)
	public static int method691(int var0) {
		--var0;
		var0 |= var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "11"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[Clock.Client_plane][var0][var1];
		if (var2 == null) {
			class36.scene.removeGroundItemPile(Clock.Client_plane, var0, var1);
		} else {
			long var3 = -99999999L;
			TileItem var5 = null;

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
				ItemComposition var7 = class300.ItemDefinition_get(var6.field_29);
				long var8 = (long)var7.price;
				if (var7.isStackable == 1) {
					var8 *= var6.quantity < Integer.MAX_VALUE ? (long)(var6.quantity + 1) : (long)var6.quantity;
				}

				if (var8 > var3) {
					var3 = var8;
					var5 = var6;
				}
			}

			if (var5 == null) {
				class36.scene.removeGroundItemPile(Clock.Client_plane, var0, var1);
			} else {
				var2.addLast(var5);
				TileItem var12 = null;
				TileItem var11 = null;

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
					if (var6.field_29 != var5.field_29) {
						if (var12 == null) {
							var12 = var6;
						}

						if (var12.field_29 != var6.field_29 && var11 == null) {
							var11 = var6;
						}
					}
				}

				long var9 = class394.calculateTag(var0, var1, 3, false, 0);
				class36.scene.newGroundItemPile(Clock.Client_plane, var0, var1, Renderable.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, Clock.Client_plane), var5, var9, var12, var11);
			}
		}
	}
}
