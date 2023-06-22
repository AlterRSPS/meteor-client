import java.util.Collections;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
public class class168 extends class180 {
	@ObfuscatedName("at")
	String field1414;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	@Export("this$0")
	@ObfuscatedName("this$0")
	final class169 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgi;Ljava/lang/String;Ljava/lang/String;)V"
	)
	class168(class169 var1, String var2, String var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field1414 = var3;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1756234342"
	)
	@Export("vmethod3379")
	public int vmethod3379() {
		return 1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1324098336"
	)
	@Export("vmethod3380")
	public String vmethod3380() {
		return this.field1414;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([I[IB)V",
		garbageValue = "-32"
	)
	public static void method867(int[] var0, int[] var1) {
		if (var0 != null && var1 != null) {
			class152.ByteArrayPool_alternativeSizes = var0;
			PendingSpawn.ByteArrayPool_altSizeArrayCounts = new int[var0.length];
			JagexCache.ByteArrayPool_arrays = new byte[var0.length][][];

			for (int var2 = 0; var2 < class152.ByteArrayPool_alternativeSizes.length; ++var2) {
				JagexCache.ByteArrayPool_arrays[var2] = new byte[var1[var2]][];
				ByteArrayPool.field3680.add(var0[var2]);
			}

			Collections.sort(ByteArrayPool.field3680);
		} else {
			class152.ByteArrayPool_alternativeSizes = null;
			PendingSpawn.ByteArrayPool_altSizeArrayCounts = null;
			JagexCache.ByteArrayPool_arrays = null;
			ByteArrayPool.field3680.clear();
			ByteArrayPool.field3680.add(100);
			ByteArrayPool.field3680.add(5000);
			ByteArrayPool.field3680.add(10000);
			ByteArrayPool.field3680.add(30000);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1167974267"
	)
	public static void method868() {
		StructComposition.StructDefinition_cached.clear();
	}
}
