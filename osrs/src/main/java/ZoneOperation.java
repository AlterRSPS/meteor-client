import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
@Implements("ZoneOperation")
public class ZoneOperation {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	public static final ZoneOperation field2586;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	public static final ZoneOperation field2582;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	public static final ZoneOperation field2587;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	public static final ZoneOperation field2585;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	public static final ZoneOperation field2588;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	public static final ZoneOperation field2584;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	public static final ZoneOperation field2578;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	public static final ZoneOperation field2581;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	public static final ZoneOperation field2579;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	public static final ZoneOperation field2580;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	public static final ZoneOperation field2583;

	static {
		field2586 = new ZoneOperation(4);
		field2582 = new ZoneOperation(11);
		field2587 = new ZoneOperation(5);
		field2585 = new ZoneOperation(14);
		field2588 = new ZoneOperation(16);
		field2584 = new ZoneOperation(4);
		field2578 = new ZoneOperation(2);
		field2581 = new ZoneOperation(5);
		field2579 = new ZoneOperation(7);
		field2580 = new ZoneOperation(14);
		field2583 = new ZoneOperation(6);
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "4"
	)
	ZoneOperation(int var1) {
		super();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "67"
	)
	public static void method1607(int var0) {
		if (var0 != -1) {
			if (class143.Widget_loadedInterfaces[var0]) {
				Widget.Widget_archive.clearFilesGroup(var0);
				if (class16.Widget_interfaceComponents[var0] != null) {
					for (int var1 = 0; var1 < class16.Widget_interfaceComponents[var0].length; ++var1) {
						if (class16.Widget_interfaceComponents[var0][var1] != null) {
							class16.Widget_interfaceComponents[var0][var1] = null;
						}
					}

					class16.Widget_interfaceComponents[var0] = null;
					class143.Widget_loadedInterfaces[var0] = false;
				}
			}
		}
	}
}
