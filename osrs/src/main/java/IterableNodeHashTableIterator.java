import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sc")
@Implements("IterableNodeHashTableIterator")
public class IterableNodeHashTableIterator implements Iterator {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	@Export("hashTable")
	IterableNodeHashTable hashTable;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	@Export("head")
	Node head;
	@ObfuscatedName("av")
	@Export("index")
	int index;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	@Export("last")
	Node last;

	@ObfuscatedSignature(
		descriptor = "(Lsv;)V"
	)
	public IterableNodeHashTableIterator(IterableNodeHashTable var1) {
		super();
		this.last = null;
		this.hashTable = var1;
		this.start();
	}

	@ObfuscatedName("at")
	@Export("start")
	void start() {
		this.head = this.hashTable.buckets[0].previous;
		this.index = 1;
		this.last = null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Lrz;"
	)
	public Node method2402() {
		this.start();
		return (Node)this.next();
	}

	@Export("next")
	@ObfuscatedName("next")
	public Object next() {
		Node var1;
		if (this.hashTable.buckets[this.index - 1] != this.head) {
			var1 = this.head;
			this.head = var1.previous;
			this.last = var1;
			return var1;
		} else {
			do {
				if (this.index >= this.hashTable.size) {
					return null;
				}

				var1 = this.hashTable.buckets[this.index++].previous;
			} while(var1 == this.hashTable.buckets[this.index - 1]);

			this.head = var1.previous;
			this.last = var1;
			return var1;
		}
	}

	@Export("hasNext")
	@ObfuscatedName("hasNext")
	public boolean hasNext() {
		if (this.hashTable.buckets[this.index - 1] != this.head) {
			return true;
		} else {
			while (this.index < this.hashTable.size) {
				if (this.hashTable.buckets[this.index++].previous != this.hashTable.buckets[this.index - 1]) {
					this.head = this.hashTable.buckets[this.index - 1].previous;
					return true;
				}

				this.head = this.hashTable.buckets[this.index - 1];
			}

			return false;
		}
	}

	@Export("remove")
	@ObfuscatedName("remove")
	public void remove() {
		this.last.remove();
		this.last = null;
	}
}
