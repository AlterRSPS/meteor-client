import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("he")
@Implements("ObjTypeCustomisation")
public class ObjTypeCustomisation {
	@ObfuscatedName("jr")
	static int field1471;
	@ObfuscatedName("av")
	@Export("recol")
	public short[] recol;
	@ObfuscatedName("as")
	@Export("retex")
	public short[] retex;

	ObjTypeCustomisation(int var1) {
		super();
		ItemComposition var2 = class300.ItemDefinition_get(var1);
		if (var2.hasRecolor()) {
			this.recol = new short[var2.recolorTo.length];
			System.arraycopy(var2.recolorTo, 0, this.recol, 0, this.recol.length);
		}

		if (var2.hasRetexture()) {
			this.retex = new short[var2.retextureTo.length];
			System.arraycopy(var2.retextureTo, 0, this.retex, 0, this.retex.length);
		}

	}
}
