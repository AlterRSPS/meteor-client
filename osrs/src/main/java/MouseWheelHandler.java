import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aq")
@Implements("MouseWheelHandler")
public final class MouseWheelHandler implements class173, MouseWheelListener {
	@ObfuscatedName("at")
	@Export("rotation")
	int rotation;

	MouseWheelHandler() {
		super();
		this.rotation = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;S)V",
		garbageValue = "-4007"
	)
	@Export("addTo")
	void addTo(Component var1) {
		var1.addMouseWheelListener(this);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "75"
	)
	void method72(Component var1) {
		var1.removeMouseWheelListener(this);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "825300005"
	)
	@Export("useRotation")
	public synchronized int useRotation() {
		int var1 = this.rotation;
		this.rotation = 0;
		return var1;
	}

	@Export("mouseWheelMoved")
	@ObfuscatedName("mouseWheelMoved")
	public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
		this.rotation += var1.getWheelRotation();
	}
}
