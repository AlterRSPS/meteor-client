import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("az")
public class class18 {
	@ObfuscatedName("wf")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("at")
	Future field55;
	@ObfuscatedName("an")
	String field54;

	class18(Future var1) {
		super();
		this.field55 = var1;
	}

	class18(String var1) {
		super();
		this.method60(var1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-709380893"
	)
	void method60(String var1) {
		if (var1 == null) {
			var1 = "";
		}

		this.field54 = var1;
		if (this.field55 != null) {
			this.field55.cancel(true);
			this.field55 = null;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "-9590"
	)
	public final String method61() {
		return this.field54;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-19"
	)
	public boolean method62() {
		return this.field54 != null || this.field55 == null;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-104"
	)
	public final boolean method63() {
		return this.method62() ? true : this.field55.isDone();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Lai;",
		garbageValue = "-1982612952"
	)
	public final class20 method64() {
		if (this.method62()) {
			return new class20(this.field54);
		} else if (!this.method63()) {
			return null;
		} else {
			try {
				return (class20)this.field55.get();
			} catch (Exception var3) {
				String var2 = "Error retrieving REST request reply";
				System.err.println(var2 + "\r\n" + var3);
				this.method60(var2);
				return new class20(var2);
			}
		}
	}
}
