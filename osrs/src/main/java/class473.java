import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sf")
public class class473 {
	@ObfuscatedName("at")
	public final Object field3987;
	@ObfuscatedName("an")
	public final Object field3986;

	public class473(Object var1, Object var2) {
		super();
		this.field3987 = var1;
		this.field3986 = var2;
	}

	@Export("toString")
	@ObfuscatedName("toString")
	public String toString() {
		return this.field3987 + ", " + this.field3986;
	}

	@Export("equals")
	@ObfuscatedName("equals")
	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof class473) {
			class473 var2 = (class473)var1;
			if (this.field3987 == null) {
				if (var2.field3987 != null) {
					return false;
				}
			} else if (!this.field3987.equals(var2.field3987)) {
				return false;
			}

			if (this.field3986 == null) {
				if (var2.field3986 != null) {
					return false;
				}
			} else if (!this.field3986.equals(var2.field3986)) {
				return false;
			}

			return true;
		} else {
			return false;
		}
	}

	@Export("hashCode")
	@ObfuscatedName("hashCode")
	public int hashCode() {
		int var1 = 0;
		if (this.field3987 != null) {
			var1 += this.field3987.hashCode();
		}

		if (this.field3986 != null) {
			var1 += 31 * this.field3986.hashCode();
		}

		return var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Ltp;",
		garbageValue = "0"
	)
	@Export("getDbRowType")
	public static DbRowType getDbRowType(int var0) {
		DbRowType var1 = (DbRowType)DbRowType.DBRowType_cache.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DbRowType.field4054.takeFile(38, var0);
			var1 = new DbRowType();
			if (var2 != null) {
				var1.method2463(new Buffer(var2));
			}

			var1.method2466();
			DbRowType.DBRowType_cache.put(var1, (long)var0);
			return var1;
		}
	}
}
