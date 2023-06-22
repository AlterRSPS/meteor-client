import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ss")
class class484 implements Iterator {
	@ObfuscatedName("at")
	int field4033;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("this$0")
	@ObfuscatedName("this$0")
	final class485 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lsp;)V"
	)
	class484(class485 var1) {
		super();
		this.this$0 = var1;
	}

	@Export("hasNext")
	@ObfuscatedName("hasNext")
	public boolean hasNext() {
		return this.field4033 < this.this$0.method2284();
	}

	@Export("next")
	@ObfuscatedName("next")
	public Object next() {
		int var1 = ++this.field4033 - 1;
		class444 var2 = (class444)this.this$0.field4036.get((long)var1);
		return var2 != null ? var2 : this.this$0.method2436(var1);
	}

	@Export("remove")
	@ObfuscatedName("remove")
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
