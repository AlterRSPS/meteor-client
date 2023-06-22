import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("archive7")
	static Archive archive7;
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	// $FF: renamed from: x int
	@ObfuscatedName("bg")
	@Export("x")
	int field_27;
	// $FF: renamed from: y int
	@ObfuscatedName("bf")
	@Export("y")
	int field_28;
	@ObfuscatedName("bd")
	@Export("rotation")
	int rotation;
	@ObfuscatedName("ba")
	int field950;
	@ObfuscatedName("bn")
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("bb")
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("bx")
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("be")
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("bh")
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("bp")
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("bw")
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("bi")
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("bk")
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("bv")
	@Export("runBackSequence")
	int runBackSequence;
	@ObfuscatedName("bz")
	@Export("runLeftSequence")
	int runLeftSequence;
	@ObfuscatedName("bm")
	@Export("runRightSequence")
	int runRightSequence;
	@ObfuscatedName("br")
	@Export("crawlSequence")
	int crawlSequence;
	@ObfuscatedName("bu")
	@Export("crawlBackSequence")
	int crawlBackSequence;
	@ObfuscatedName("by")
	@Export("crawlLeftSequence")
	int crawlLeftSequence;
	@ObfuscatedName("bt")
	@Export("crawlRightSequence")
	int crawlRightSequence;
	@ObfuscatedName("bl")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("cs")
	@Export("isAutoChatting")
	boolean isAutoChatting;
	@ObfuscatedName("cu")
	@Export("showPublicPlayerChat")
	boolean showPublicPlayerChat;
	@ObfuscatedName("ca")
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("cf")
	int field973;
	@ObfuscatedName("cw")
	int field980;
	@ObfuscatedName("ch")
	int[] field1007;
	@ObfuscatedName("cy")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("cd")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("cv")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("cr")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("cm")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("cg")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("cb")
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("cc")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("ck")
	@Export("movingOrientation")
	int movingOrientation;
	@ObfuscatedName("cq")
	int field978;
	@ObfuscatedName("ce")
	int field972;
	@ObfuscatedName("cj")
	boolean field941;
	@ObfuscatedName("cl")
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("cn")
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("ct")
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("cx")
	int field981;
	@ObfuscatedName("co")
	@Export("sequence")
	int sequence;
	@ObfuscatedName("cz")
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("dd")
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("dl")
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("dm")
	@Export("currentSequenceFrameIndex")
	int currentSequenceFrameIndex;
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	IterableNodeHashTable field1015;
	@ObfuscatedName("dt")
	int field996;
	@ObfuscatedName("dn")
	int field992;
	@ObfuscatedName("dw")
	int field999;
	@ObfuscatedName("df")
	int field987;
	@ObfuscatedName("dx")
	int field1000;
	@ObfuscatedName("dz")
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("do")
	@Export("exactMoveArrive1Cycle")
	int exactMoveArrive1Cycle;
	@ObfuscatedName("db")
	@Export("exactMoveDirection")
	int exactMoveDirection;
	@ObfuscatedName("dq")
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("dh")
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("dp")
	@Export("recolourStartCycle")
	int recolourStartCycle;
	@ObfuscatedName("dv")
	@Export("recolourEndCycle")
	int recolourEndCycle;
	@ObfuscatedName("di")
	@Export("recolourHue")
	byte recolourHue;
	@ObfuscatedName("dj")
	@Export("recolourSaturation")
	byte recolourSaturation;
	@ObfuscatedName("dk")
	@Export("recolourLuminance")
	byte recolourLuminance;
	@ObfuscatedName("dy")
	@Export("recolourAmount")
	byte recolourAmount;
	@ObfuscatedName("dg")
	@Export("orientation")
	int orientation;
	@ObfuscatedName("de")
	int field986;
	@ObfuscatedName("du")
	int field997;
	@ObfuscatedName("dc")
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("ds")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("dr")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "[Lie;"
	)
	@Export("pathTraversed")
	MoveSpeed[] pathTraversed;
	@ObfuscatedName("er")
	int field1003;
	@ObfuscatedName("eh")
	int field1002;
	@ObfuscatedName("eu")
	int field1004;

	Actor() {
		super();
		this.isWalking = false;
		this.field950 = 1;
		this.idleSequence = -1 * -1715570245;
		this.turnLeftSequence = -1 * -1543559101;
		this.turnRightSequence = -1 * 531240293;
		this.walkSequence = -1 * 597536279;
		this.walkBackSequence = -1 * -2105973293;
		this.walkLeftSequence = -1 * 1903502071;
		this.walkRightSequence = -1 * 363085671;
		this.runSequence = -1 * -452785299;
		this.runBackSequence = -1 * -812989361;
		this.runLeftSequence = -1 * -816921381;
		this.runRightSequence = -1 * 1183297019;
		this.crawlSequence = -1 * 432549399;
		this.crawlBackSequence = -1 * -732350005;
		this.crawlLeftSequence = -1 * 957334845;
		this.crawlRightSequence = -1 * 987737355;
		this.overheadText = null;
		this.showPublicPlayerChat = false;
		this.overheadTextCyclesRemaining = 100;
		this.field973 = 0;
		this.field980 = 0;
		this.field1007 = null;
		this.hitSplatCount = 0;
		this.hitSplatTypes = new int[4];
		this.hitSplatValues = new int[4];
		this.hitSplatCycles = new int[4];
		this.hitSplatTypes2 = new int[4];
		this.hitSplatValues2 = new int[4];
		this.healthBars = new IterableNodeDeque();
		this.targetIndex = -1;
		this.false0 = false;
		this.movingOrientation = -1;
		this.field978 = -1;
		this.field972 = -1;
		this.movementSequence = -1;
		this.movementFrame = 0;
		this.movementFrameCycle = 0;
		this.field981 = 0;
		this.sequence = -1;
		this.sequenceFrame = 0;
		this.sequenceFrameCycle = 0;
		this.sequenceDelay = 0;
		this.currentSequenceFrameIndex = 0;
		this.field1015 = new IterableNodeHashTable(4);
		this.field996 = 0;
		this.npcCycle = 0;
		this.defaultHeight = 200;
		this.recolourStartCycle = -1;
		this.recolourEndCycle = -1;
		this.field986 = 0;
		this.field997 = 32;
		this.pathLength = 0;
		this.pathX = new int[10];
		this.pathY = new int[10];
		this.pathTraversed = new MoveSpeed[10];
		this.field1003 = 0;
		this.field1002 = 0;
		this.field1004 = -1 * 1233162511;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "11"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2144229618"
	)
	final void method493() {
		this.pathLength = 0;
		this.field1002 = 0;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "604654467"
	)
	@Export("addHitSplat")
	final void addHitSplat(int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true;
		boolean var8 = true;

		int var9;
		for (var9 = 0; var9 < 4; ++var9) {
			if (this.hitSplatCycles[var9] > var5) {
				var7 = false;
			} else {
				var8 = false;
			}
		}

		var9 = -1;
		int var10 = -1;
		int var11 = 0;
		if (var1 >= 0) {
			HitSplatDefinition var12 = PlayerComposition.method1717(var1);
			var10 = var12.field1680;
			var11 = var12.field1676;
		}

		int var14;
		if (var8) {
			if (var10 == -1) {
				return;
			}

			var9 = 0;
			var14 = 0;
			if (var10 == 0) {
				var14 = this.hitSplatCycles[0];
			} else if (var10 == 1) {
				var14 = this.hitSplatValues[0];
			}

			for (int var13 = 1; var13 < 4; ++var13) {
				if (var10 == 0) {
					if (this.hitSplatCycles[var13] < var14) {
						var9 = var13;
						var14 = this.hitSplatCycles[var13];
					}
				} else if (var10 == 1 && this.hitSplatValues[var13] < var14) {
					var9 = var13;
					var14 = this.hitSplatValues[var13];
				}
			}

			if (var10 == 1 && var14 >= var2) {
				return;
			}
		} else {
			if (var7) {
				this.hitSplatCount = 0;
			}

			for (var14 = 0; var14 < 4; ++var14) {
				byte var15 = this.hitSplatCount;
				this.hitSplatCount = (byte)((this.hitSplatCount + 1) % 4);
				if (this.hitSplatCycles[var15] <= var5) {
					var9 = var15;
					break;
				}
			}
		}

		if (var9 >= 0) {
			this.hitSplatTypes[var9] = var1;
			this.hitSplatValues[var9] = var2;
			this.hitSplatTypes2[var9] = var3;
			this.hitSplatValues2[var9] = var4;
			this.hitSplatCycles[var9] = var5 + var11 + var6;
		}
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "390211439"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var8 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var1);
		HealthBarDefinition var7;
		if (var8 != null) {
			var7 = var8;
		} else {
			byte[] var9 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1);
			var8 = new HealthBarDefinition();
			var8.field1534 = var1;
			if (var9 != null) {
				var8.decode(new Buffer(var9));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var8, (long)var1);
			var7 = var8;
		}

		var8 = var7;
		HealthBar var14 = null;
		HealthBar var10 = null;
		int var11 = var7.int2;
		int var12 = 0;

		HealthBar var13;
		for (var13 = (HealthBar)this.healthBars.last(); var13 != null; var13 = (HealthBar)this.healthBars.previous()) {
			++var12;
			if (var13.definition.field1534 == var8.field1534) {
				var13.put(var2 + var4, var5, var6, var3);
				return;
			}

			if (var13.definition.int1 <= var8.int1) {
				var14 = var13;
			}

			if (var13.definition.int2 > var11) {
				var10 = var13;
				var11 = var13.definition.int2;
			}
		}

		if (var10 != null || var12 < 4) {
			var13 = new HealthBar(var8);
			if (var14 == null) {
				this.healthBars.addLast(var13);
			} else {
				IterableNodeDeque.IterableNodeDeque_addBefore(var13, var14);
			}

			var13.put(var2 + var4, var5, var6, var3);
			if (var12 >= 4) {
				var10.remove();
			}

		}
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "50"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var3 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var1);
		HealthBarDefinition var2;
		if (var3 != null) {
			var2 = var3;
		} else {
			byte[] var4 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1);
			var3 = new HealthBarDefinition();
			var3.field1534 = var1;
			if (var4 != null) {
				var3.decode(new Buffer(var4));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var3, (long)var1);
			var2 = var3;
		}

		var3 = var2;

		for (HealthBar var5 = (HealthBar)this.healthBars.last(); var5 != null; var5 = (HealthBar)this.healthBars.previous()) {
			if (var3 == var5.definition) {
				var5.remove();
				return;
			}
		}

	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "30"
	)
	void method498(int var1, int var2, int var3, int var4) {
		int var5 = var4 + Client.cycle;
		class523 var6 = (class523)this.field1015.get((long)var1);
		if (var6 != null) {
			var6.remove();
			--this.field996;
		}

		if (var2 != 65535 && var2 != -1) {
			byte var7 = 0;
			if (var4 > 0) {
				var7 = -1;
			}

			this.field1015.put(new class523(var2, var3, var5, var7), (long)var1);
			++this.field996;
		}
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)Lsv;",
		garbageValue = "1949828851"
	)
	IterableNodeHashTable method499() {
		return this.field1015;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-131264283"
	)
	void method500() {
		IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.field1015);

		for (class523 var2 = (class523)var1.method2402(); var2 != null; var2 = (class523)var1.next()) {
			var2.remove();
		}

		this.field996 = 0;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Ljd;I)Ljd;",
		garbageValue = "1334524793"
	)
	Model method501(Model var1) {
		if (this.field996 == 0) {
			return var1;
		} else {
			IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.field1015);
			int var3 = var1.verticesCount;
			int var4 = var1.indicesCount;
			int var5 = var1.field2222;
			byte var6 = var1.field2215;

			for (class523 var7 = (class523)var2.method2402(); var7 != null; var7 = (class523)var2.next()) {
				if (var7.field4187 != -1) {
					Model var8 = class53.SpotAnimationDefinition_get(var7.field4189).method995();
					if (var8 != null) {
						var3 += var8.verticesCount;
						var4 += var8.indicesCount;
						var5 += var8.field2222;
					}
				}
			}

			Model var10 = new Model(var3, var4, var5, var6);
			var10.method1314(var1);

			for (class523 var11 = (class523)var2.method2402(); var11 != null; var11 = (class523)var2.next()) {
				if (var11.field4187 != -1) {
					Model var9 = class53.SpotAnimationDefinition_get(var11.field4189).getModel(var11.field4187);
					if (var9 != null) {
						var9.offsetBy(0, -var11.field4191, 0);
						var10.method1314(var9);
					}
				}
			}

			return var10;
		}
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1832865159"
	)
	void method502() {
		this.field941 = false;
		this.movingOrientation = -1;
		this.field978 = -1;
		this.field972 = -1;
	}
}
