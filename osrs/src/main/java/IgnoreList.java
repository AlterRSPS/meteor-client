import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pg")
@Implements("IgnoreList")
public class IgnoreList extends UserList {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	final LoginType field3719;

	@ObfuscatedSignature(
		descriptor = "(Lsj;)V"
	)
	public IgnoreList(LoginType var1) {
		super(400);
		this.field3719 = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lqm;",
		garbageValue = "328216456"
	)
	@Export("newInstance")
	User newInstance() {
		return new Ignored();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lqm;",
		garbageValue = "20"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new Ignored[var1];
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ltz;II)V",
		garbageValue = "-299047858"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (var1.offset < var2) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 4) {
				Username var4 = new Username(var1.readStringCp1252NullTerminated(), this.field3719);
				boolean var5 = false;
				ApproximateRouteStrategy.friendSystem.removeIgnore(var4.getName(), var5);
			} else {
				boolean var9 = (var3 & 1) != 0;
				Username var10 = new Username(var1.readStringCp1252NullTerminated(), this.field3719);
				Username var6 = new Username(var1.readStringCp1252NullTerminated(), this.field3719);
				var1.readStringCp1252NullTerminated();
				Ignored var7 = (Ignored)this.getByCurrentUsername(var10);
				if (var9) {
					Ignored var8 = (Ignored)this.getByCurrentUsername(var6);
					if (var8 != null && var7 != var8) {
						if (var7 != null) {
							this.remove(var8);
						} else {
							var7 = var8;
						}
					}
				}

				if (var7 != null) {
					this.changeName(var7, var10, var6);
				} else if (this.getSize() < 400) {
					int var11 = this.getSize();
					var7 = (Ignored)this.addLast(var10, var6);
					var7.field_48 = var11;
				}
			}
		}

	}
}
