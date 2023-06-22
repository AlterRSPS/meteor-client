import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("ap")
	@Export("Tiles_shapes")
	static byte[][][] Tiles_shapes;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("as")
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("ax")
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("ab")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("ak")
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("ae")
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("af")
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("ao")
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("aa")
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("aj")
	int field903;
	@ObfuscatedName("ad")
	@Export("baseTileHeight")
	int baseTileHeight;
	@ObfuscatedName("ac")
	int field898;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("attachedModel")
	Model attachedModel;
	@ObfuscatedName("ar")
	@Export("minX")
	int minX;
	@ObfuscatedName("ah")
	@Export("minY")
	int minY;
	@ObfuscatedName("az")
	@Export("maxX")
	int maxX;
	@ObfuscatedName("au")
	@Export("maxY")
	int maxY;
	@ObfuscatedName("ai")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("aq")
	@Export("team")
	int team;
	@ObfuscatedName("aw")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("ay")
	@Export("plane")
	int plane;
	@ObfuscatedName("al")
	@Export("index")
	int index;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("bj")
	@Export("hasMovementPending")
	boolean hasMovementPending;
	@ObfuscatedName("bo")
	@Export("tileX")
	int tileX;
	@ObfuscatedName("bq")
	@Export("tileY")
	int tileY;

	Player() {
		super();
		this.headIconPk = -1;
		this.headIconPrayer = -1;
		this.actions = new String[3];

		for (int var1 = 0; var1 < 3; ++var1) {
			this.actions[var1] = "";
		}

		this.combatLevel = 0;
		this.skillLevel = 0;
		this.animationCycleStart = 0;
		this.animationCycleEnd = 0;
		this.isUnanimated = false;
		this.team = 0;
		this.isHidden = false;
		this.isFriendTriBool = TriBool.TriBool_unknown;
		this.isInFriendsChat = TriBool.TriBool_unknown;
		this.isInClanChat = TriBool.TriBool_unknown;
		this.hasMovementPending = false;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;B)V",
		garbageValue = "0"
	)
	@Export("read")
	final void read(Buffer var1) {
		var1.offset = 0;
		int var2 = var1.readUnsignedByte();
		boolean var3 = true;
		this.headIconPk = var1.readByte();
		this.headIconPrayer = var1.readByte();
		int var4 = -1;
		this.team = 0;
		int[] var5 = new int[12];

		int var7;
		int var8;
		int var9;
		for (int var6 = 0; var6 < 12; ++var6) {
			var7 = var1.readUnsignedByte();
			if (var7 == 0) {
				var5[var6] = 0;
			} else {
				var8 = var1.readUnsignedByte();
				var5[var6] = var8 + (var7 << 8);
				if (var6 == 0 && var5[0] == 65535) {
					var4 = var1.readUnsignedShort();
					break;
				}

				if (var5[var6] >= 512) {
					var9 = class300.ItemDefinition_get(var5[var6] - 512).team;
					if (var9 != 0) {
						this.team = var9;
					}
				}
			}
		}

		int[] var13 = null;
		if (Client.param25 >= 213) {
			var13 = new int[12];

			for (var7 = 0; var7 < 12; ++var7) {
				var8 = var1.readUnsignedByte();
				if (var8 == 0) {
					var13[var7] = 0;
				} else {
					var9 = var1.readUnsignedByte();
					var13[var7] = var9 + (var8 << 8);
				}
			}
		}

		int[] var14 = new int[5];

		for (var8 = 0; var8 < 5; ++var8) {
			var9 = var1.readUnsignedByte();
			if (var9 < 0 || var9 >= class13.field37[var8].length) {
				var9 = 0;
			}

			var14[var8] = var9;
		}

		super.idleSequence = var1.readUnsignedShort() * -1715570245;
		if (super.idleSequence * 794059635 == 65535) {
			super.idleSequence = -1 * -1715570245;
		}

		super.turnLeftSequence = var1.readUnsignedShort() * -1543559101;
		if (super.turnLeftSequence * 1524655211 == 65535) {
			super.turnLeftSequence = -1 * -1543559101;
		}

		super.turnRightSequence = super.turnLeftSequence * -422419145;
		super.walkSequence = var1.readUnsignedShort() * 597536279;
		if (super.walkSequence * -1750832729 == 65535) {
			super.walkSequence = -1 * 597536279;
		}

		super.walkBackSequence = var1.readUnsignedShort() * -2105973293;
		if (super.walkBackSequence * -1413662117 == 65535) {
			super.walkBackSequence = -1 * -2105973293;
		}

		super.walkLeftSequence = var1.readUnsignedShort() * 1903502071;
		if (super.walkLeftSequence * 869678791 == 65535) {
			super.walkLeftSequence = -1 * 1903502071;
		}

		super.walkRightSequence = var1.readUnsignedShort() * 363085671;
		if (super.walkRightSequence * -1883673513 == 65535) {
			super.walkRightSequence = -1 * 363085671;
		}

		super.runSequence = var1.readUnsignedShort() * -452785299;
		if (super.runSequence * -918440347 == 65535) {
			super.runSequence = -1 * -452785299;
		}

		this.username = new Username(var1.readStringCp1252NullTerminated(), WorldMapScaleHandler.loginType);
		this.clearIsFriend();
		this.clearIsInFriendsChat();
		this.method474();
		if (this == Projectile.localPlayer) {
			RunException.field4196 = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte();
		this.skillLevel = var1.readUnsignedShort();
		this.isHidden = var1.readUnsignedByte() == 1;
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) {
			this.isHidden = false;
		}

		ObjTypeCustomisation[] var15 = null;
		boolean var17 = false;
		int var10 = var1.readUnsignedShort();
		var17 = (var10 >> 15 & 1) == 1;
		int var11;
		if (var10 > 0 && var10 != 32768) {
			var15 = new ObjTypeCustomisation[12];

			for (var11 = 0; var11 < 12; ++var11) {
				int var12 = var10 >> 12 - var11 & 1;
				if (var12 == 1) {
					var15[var11] = class161.method834(var5[var11] - 512, var1);
				}
			}
		}

		for (var11 = 0; var11 < 3; ++var11) {
			this.actions[var11] = var1.readStringCp1252NullTerminated();
		}

		int var16 = var1.readUnsignedByte();
		if (this.appearance == null) {
			this.appearance = new PlayerComposition();
		}

		this.appearance.method1716(var13, var5, var15, var17, var14, var2, var4, var16);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljd;",
		garbageValue = "-1953039490"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? WorldMapLabelSize.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence != -1 && !this.isUnanimated && (super.idleSequence * 794059635 != super.movementSequence || var1 == null) ? WorldMapLabelSize.SequenceDefinition_get(super.movementSequence) : null;
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				int var4 = var3.indicesCount;
				if (!this.isUnanimated) {
					var3 = this.method501(var3);
				}

				if (!this.isUnanimated && this.attachedModel != null) {
					if (Client.cycle >= this.animationCycleEnd) {
						this.attachedModel = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) {
						Model var5 = this.attachedModel;
						var5.offsetBy(this.field903 - super.field_27, this.baseTileHeight - this.tileHeight, this.field898 - super.field_28);
						if (super.orientation == 512) {
							var5.rotateY90Ccw();
							var5.rotateY90Ccw();
							var5.rotateY90Ccw();
						} else if (super.orientation == 1024) {
							var5.rotateY90Ccw();
							var5.rotateY90Ccw();
						} else if (super.orientation == 1536) {
							var5.rotateY90Ccw();
						}

						Model[] var6 = new Model[]{var3, var5};
						var3 = new Model(var6, 2);
						if (super.orientation == 512) {
							var5.rotateY90Ccw();
						} else if (super.orientation == 1024) {
							var5.rotateY90Ccw();
							var5.rotateY90Ccw();
						} else if (super.orientation == 1536) {
							var5.rotateY90Ccw();
							var5.rotateY90Ccw();
							var5.rotateY90Ccw();
						}

						var5.offsetBy(super.field_27 - this.field903, this.tileHeight - this.baseTileHeight, super.field_28 - this.field898);
					}
				}

				var3.isSingleTile = true;
				if (super.recolourAmount != 0 && Client.cycle >= super.recolourStartCycle && Client.cycle < super.recolourEndCycle) {
					var3.overrideHue = super.recolourHue;
					var3.overrideSaturation = super.recolourSaturation;
					var3.overrideLuminance = super.recolourLuminance;
					var3.overrideAmount = super.recolourAmount;
					var3.field2223 = (short)var4;
				} else {
					var3.overrideAmount = 0;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "62243914"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) {
			this.checkIsFriend();
		}

		return this.isFriendTriBool == TriBool.TriBool_true;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1187470612"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = ApproximateRouteStrategy.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "15"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) {
			this.updateIsInFriendsChat();
		}

		return this.isInFriendsChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-28"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "88"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = class406.friendsChat != null && class406.friendsChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "260673707"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) {
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method791(this.username.getName()) != -1 && var1 != 2) {
				this.isInClanChat = TriBool.TriBool_true;
				return;
			}
		}

		this.isInClanChat = TriBool.TriBool_false;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1545837402"
	)
	void method474() {
		this.isInClanChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-124"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) {
			this.updateIsInClanChat();
		}

		return this.isInClanChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-52698941"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? Bounds.getNpcDefinition(this.appearance.npcTransformId).size : 1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IILie;I)V",
		garbageValue = "2094470882"
	)
	@Export("move")
	final void move(int var1, int var2, MoveSpeed var3) {
		if (super.sequence != -1 && WorldMapLabelSize.SequenceDefinition_get(super.sequence).priority == 1) {
			super.sequence = -1;
		}

		this.method502();
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
				if (var3 == MoveSpeed.RUN) {
					PlayerComposition.method1729(this, var1, var2, MoveSpeed.RUN);
				}

				this.method480(var1, var2, var3);
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1799040998"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0;
		super.field1002 = 0;
		super.field1003 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		int var3 = this.transformedSize();
		super.field_27 = var3 * 64 + super.pathX[0] * 128;
		super.field_28 = var3 * 64 + super.pathY[0] * 128;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IILie;I)V",
		garbageValue = "-1805329488"
	)
	final void method480(int var1, int var2, MoveSpeed var3) {
		if (super.pathLength < 9) {
			++super.pathLength;
		}

		for (int var4 = super.pathLength; var4 > 0; --var4) {
			super.pathX[var4] = super.pathX[var4 - 1];
			super.pathY[var4] = super.pathY[var4 - 1];
			super.pathTraversed[var4] = super.pathTraversed[var4 - 1];
		}

		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.pathTraversed[0] = var3;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "11"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null;
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1085648107"
	)
	static void method482() {
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
	}

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1840896945"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		PendingSpawn.method489();
		if (class406.friendsChat != null) {
			class406.friendsChat.invalidateIgnoreds();
		}

	}
}
