import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("op")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("deque")
	IterableNodeDeque deque;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	Node field3591;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	@Export("last")
	Node last;

	@ObfuscatedSignature(
		descriptor = "(Lom;)V"
	)
	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		super();
		this.last = null;
		this.setDeque(var1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lom;)V"
	)
	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1;
		this.start();
	}

	@ObfuscatedName("an")
	@Export("start")
	void start() {
		this.field3591 = this.deque != null ? this.deque.sentinel.previous : null;
		this.last = null;
	}

	@Export("next")
	@ObfuscatedName("next")
	public Object next() {
		Node var1 = this.field3591;
		if (var1 == this.deque.sentinel) {
			var1 = null;
			this.field3591 = null;
		} else {
			this.field3591 = var1.previous;
		}

		this.last = var1;
		return var1;
	}

	@Export("hasNext")
	@ObfuscatedName("hasNext")
	public boolean hasNext() {
		return this.deque.sentinel != this.field3591 && this.field3591 != null;
	}

	public void remove() {
		this.last.remove();
		this.last = null;
	}
}
