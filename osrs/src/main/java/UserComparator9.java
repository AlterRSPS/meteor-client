import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("av")
	static int field1169;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("musicTrackArchive")
	public static AbstractArchive musicTrackArchive;
	@ObfuscatedName("at")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		super();
		this.reversed = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lqg;Lqg;B)I",
		garbageValue = "-4"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) {
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
		} else {
			return this.compareUser(var1, var2);
		}
	}

	@Export("compare")
	@ObfuscatedName("compare")
	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lnq;Lnq;I)V",
		garbageValue = "-2028269623"
	)
	public static void method661(AbstractArchive var0, AbstractArchive var1) {
		KitDefinition.KitDefinition_archive = var0;
		KitDefinition.KitDefinition_modelsArchive = var1;
		KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "79027296"
	)
	static final void method662() {
		if (!ViewportMouse.ViewportMouse_false0) {
			int var0 = Scene.Scene_cameraPitchSine;
			int var1 = Scene.Scene_cameraPitchCosine;
			int var2 = Scene.Scene_cameraYawSine;
			int var3 = Scene.Scene_cameraYawCosine;
			byte var4 = 50;
			short var5 = 3500;
			int var6 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.method1187()) * var4 / Rasterizer3D.method1193();
			int var7 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.method1188()) * var4 / Rasterizer3D.method1193();
			int var8 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.method1187()) * var5 / Rasterizer3D.method1193();
			int var9 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.method1188()) * var5 / Rasterizer3D.method1193();
			int var10 = JagexCache.method902(var7, var4, var1, var0);
			int var11 = var1 * var4 - var0 * var7 >> 16;
			var7 = var10;
			var10 = JagexCache.method902(var9, var5, var1, var0);
			int var12 = var1 * var5 - var9 * var0 >> 16;
			var9 = var10;
			var10 = class164.method848(var6, var11, var3, var2);
			int var13 = ClientPreferences.method519(var6, var11, var3, var2);
			var6 = var10;
			var10 = class164.method848(var8, var12, var3, var2);
			int var14 = ClientPreferences.method519(var8, var12, var3, var2);
			class177.field1449 = (var6 + var10) / 2;
			ViewportMouse.field2232 = (var9 + var7) / 2;
			ViewportMouse.field2230 = (var13 + var14) / 2;
			ViewportMouse.field2231 = (var10 - var6) / 2;
			class1.field0 = (var9 - var7) / 2;
			VarpDefinition.field1480 = (var14 - var13) / 2;
			class393.field3632 = Math.abs(ViewportMouse.field2231);
			class337.field3071 = Math.abs(class1.field0);
			class136.field1277 = Math.abs(VarpDefinition.field1480);
		}
	}

	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "(Lmb;I)Z",
		garbageValue = "-215765606"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden;
	}
}
