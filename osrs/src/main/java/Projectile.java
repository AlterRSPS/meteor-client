import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	@Export("localPlayer")
	static Player localPlayer;
	// $FF: renamed from: id int
	@ObfuscatedName("at")
	@Export("id")
	int field_16;
	@ObfuscatedName("an")
	@Export("plane")
	int plane;
	@ObfuscatedName("av")
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("as")
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("ax")
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("ap")
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("ab")
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("ak")
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("ae")
	@Export("slope")
	int slope;
	@ObfuscatedName("af")
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("ao")
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("aa")
	@Export("isMoving")
	boolean isMoving;
	// $FF: renamed from: x double
	@ObfuscatedName("aj")
	@Export("x")
	double field_17;
	// $FF: renamed from: y double
	@ObfuscatedName("ad")
	@Export("y")
	double field_18;
	// $FF: renamed from: z double
	@ObfuscatedName("ac")
	@Export("z")
	double field_19;
	@ObfuscatedName("ag")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("ar")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("ah")
	@Export("speed")
	double speed;
	@ObfuscatedName("az")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("au")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("ai")
	@Export("yaw")
	int yaw;
	@ObfuscatedName("aq")
	@Export("pitch")
	int pitch;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lhy;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("ay")
	@Export("frame")
	int frame;
	@ObfuscatedName("al")
	@Export("frameCycle")
	int frameCycle;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		super();
		this.isMoving = false;
		this.frame = 0;
		this.frameCycle = 0;
		this.field_16 = var1;
		this.plane = var2;
		this.sourceX = var3;
		this.sourceY = var4;
		this.sourceZ = var5;
		this.cycleStart = var6;
		this.cycleEnd = var7;
		this.slope = var8;
		this.startHeight = var9;
		this.targetIndex = var10;
		this.endHeight = var11;
		this.isMoving = false;
		int var12 = class53.SpotAnimationDefinition_get(this.field_16).sequence;
		if (var12 != -1) {
			this.sequenceDefinition = WorldMapLabelSize.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-109"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) {
			var5 = (double)(var1 - this.sourceX);
			double var7 = (double)(var2 - this.sourceY);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			this.field_17 = var5 * (double)this.startHeight / var9 + (double)this.sourceX;
			this.field_18 = (double)this.sourceY + var7 * (double)this.startHeight / var9;
			this.field_19 = (double)this.sourceZ;
		}

		var5 = (double)(this.cycleEnd + 1 - var4);
		this.speedX = ((double)var1 - this.field_17) / var5;
		this.speedY = ((double)var2 - this.field_18) / var5;
		this.speed = Math.sqrt(this.speedY * this.speedY + this.speedX * this.speedX);
		if (!this.isMoving) {
			this.speedZ = -this.speed * Math.tan((double)this.slope * 0.02454369D);
		}

		this.accelerationZ = ((double)var3 - this.field_19 - this.speedZ * var5) * 2.0D / (var5 * var5);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljd;",
		garbageValue = "-1953039490"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = class53.SpotAnimationDefinition_get(this.field_16);
		Model var2 = var1.getModel(this.frame);
		if (var2 == null) {
			return null;
		} else {
			var2.rotateZ(this.pitch);
			return var2;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-124"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true;
		this.field_17 += this.speedX * (double)var1;
		this.field_18 += (double)var1 * this.speedY;
		this.field_19 += (double)var1 * (double)var1 * 0.5D * this.accelerationZ + (double)var1 * this.speedZ;
		this.speedZ += (double)var1 * this.accelerationZ;
		this.yaw = (int)(Math.atan2(this.speedX, this.speedY) * 325.949D) + 1024 & 2047;
		this.pitch = (int)(Math.atan2(this.speedZ, this.speed) * 325.949D) & 2047;
		if (this.sequenceDefinition != null) {
			if (!this.sequenceDefinition.isCachedModelIdSet()) {
				this.frameCycle += var1;

				while (true) {
					do {
						do {
							if (this.frameCycle <= this.sequenceDefinition.frameLengths[this.frame]) {
								return;
							}

							this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
							++this.frame;
						} while(this.frame < this.sequenceDefinition.frameIds.length);

						this.frame -= this.sequenceDefinition.frameCount;
					} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length);

					this.frame = 0;
				}
			} else {
				this.frame += var1;
				int var2 = this.sequenceDefinition.method1083();
				if (this.frame >= var2) {
					this.frame = var2 - this.sequenceDefinition.frameCount;
				}
			}
		}

	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "([Lmb;Lmb;ZB)V",
		garbageValue = "-44"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth * 83109607 != 0 ? var1.scrollWidth * 83109607 : var1.width * 1387970291;
		int var4 = var1.scrollHeight * 2136913233 != 0 ? var1.scrollHeight * 2136913233 : var1.height * -175088023;
		class104.resizeInterface(var0, var1.field_9 * 1486786309, var3, var4, var2);
		if (var1.children != null) {
			class104.resizeInterface(var1.children, var1.field_9 * 1486786309, var3, var4, var2);
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.field_9 * 6060303756424023813L);
		if (var5 != null) {
			class13.method46(var5.group, var3, var4, var2);
		}

		if (var1.contentType == 1337) {
		}

	}
}
