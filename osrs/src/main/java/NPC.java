import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("ak")
	static int field1057;
	@ObfuscatedName("af")
	static int field1056;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ltj;"
	)
	static IndexedSprite field1058;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("av")
	@Export("nameChange")
	String nameChange;
	@ObfuscatedName("ax")
	int field1062;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	class501 field1064;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	NewShit field1060;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	NewShit field1061;

	static {
		field1057 = 1;
		field1056 = 1;
	}

	NPC() {
		super();
		this.nameChange = "";
		this.field1062 = 31;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1715187311"
	)
	void method559(String var1) {
		this.nameChange = var1 == null ? "" : var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljd;",
		garbageValue = "-1953039490"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? WorldMapLabelSize.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence != -1 && (super.idleSequence * 794059635 != super.movementSequence || var1 == null) ? WorldMapLabelSize.SequenceDefinition_get(super.movementSequence) : null;
			Model var3 = null;
			if (this.field1060 != null && this.field1060.field1554) {
				var3 = Projectile.localPlayer.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			} else {
				var3 = this.definition.method971(var1, super.sequenceFrame, var2, super.movementFrame, this.field1060);
			}

			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				int var4 = var3.indicesCount;
				var3 = this.method501(var3);
				if (this.definition.size == 1) {
					var3.isSingleTile = true;
				}

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
		descriptor = "(IB)V",
		garbageValue = "-27"
	)
	void method560(int var1) {
		this.field1062 = var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1165032246"
	)
	boolean method561(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1062 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "73"
	)
	final String method562() {
		if (!this.nameChange.isEmpty()) {
			return this.nameChange;
		} else {
			NPCComposition var1 = this.definition;
			if (var1.transforms != null) {
				var1 = var1.transform();
				if (var1 == null) {
					var1 = this.definition;
				}
			}

			return var1.name;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILie;I)V",
		garbageValue = "-1245339497"
	)
	@Export("move")
	final void move(int var1, MoveSpeed var2) {
		int var3 = super.pathX[0];
		int var4 = super.pathY[0];
		if (var1 == 0) {
			--var3;
			++var4;
		}

		if (var1 == 1) {
			++var4;
		}

		if (var1 == 2) {
			++var3;
			++var4;
		}

		if (var1 == 3) {
			--var3;
		}

		if (var1 == 4) {
			++var3;
		}

		if (var1 == 5) {
			--var3;
			--var4;
		}

		if (var1 == 6) {
			--var4;
		}

		if (var1 == 7) {
			++var3;
			--var4;
		}

		if (super.sequence != -1 && WorldMapLabelSize.SequenceDefinition_get(super.sequence).priority == 1) {
			super.sequence = -1;
		}

		if (super.pathLength < 9) {
			++super.pathLength;
		}

		for (int var5 = super.pathLength; var5 > 0; --var5) {
			super.pathX[var5] = super.pathX[var5 - 1];
			super.pathY[var5] = super.pathY[var5 - 1];
			super.pathTraversed[var5] = super.pathTraversed[var5 - 1];
		}

		super.pathX[0] = var3;
		super.pathY[0] = var4;
		super.pathTraversed[0] = var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-977903962"
	)
	final void method564(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && WorldMapLabelSize.SequenceDefinition_get(super.sequence).priority == 1) {
			super.sequence = -1;
		}

		if (!var3) {
			int var4 = var1 - super.pathX[0];
			int var5 = var2 - super.pathY[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (super.pathLength < 9) {
					++super.pathLength;
				}

				for (int var6 = super.pathLength; var6 > 0; --var6) {
					super.pathX[var6] = super.pathX[var6 - 1];
					super.pathY[var6] = super.pathY[var6 - 1];
					super.pathTraversed[var6] = super.pathTraversed[var6 - 1];
				}

				super.pathX[0] = var1;
				super.pathY[0] = var2;
				super.pathTraversed[0] = MoveSpeed.WALK;
				return;
			}
		}

		super.pathLength = 0;
		super.field1002 = 0;
		super.field1003 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.field_27 = super.field950 * 64 + super.pathX[0] * 128;
		super.field_28 = super.field950 * 64 + super.pathY[0] * 128;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(S)[I",
		garbageValue = "1212"
	)
	int[] method567() {
		return this.field1064 != null ? this.field1064.method2558() : this.definition.method979();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "-1461252941"
	)
	short[] method568() {
		return this.field1064 != null ? this.field1064.method2559() : this.definition.method981();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IISB)V",
		garbageValue = "20"
	)
	void method569(int var1, int var2, short var3) {
		if (this.field1064 == null) {
			this.field1064 = new class501(this.definition);
		}

		this.field1064.method2560(var1, var2, var3);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "([I[SB)V",
		garbageValue = "-80"
	)
	void method570(int[] var1, short[] var2) {
		if (this.field1064 == null) {
			this.field1064 = new class501(this.definition);
		}

		this.field1064.method2561(var1, var2);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-157831765"
	)
	void method571() {
		this.field1064 = null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lhs;I)V",
		garbageValue = "-1965176620"
	)
	void method572(NewShit var1) {
		this.field1061 = var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lhs;",
		garbageValue = "-1700618787"
	)
	NewShit method573() {
		return this.field1061;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lhs;I)V",
		garbageValue = "933852691"
	)
	void method574(NewShit var1) {
		this.field1060 = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "11"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1679673754"
	)
	void method575() {
		this.field1061 = null;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "91"
	)
	void method576() {
		this.field1060 = null;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "469671388"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		int var2 = var1.readUnsignedByte();
		int var3 = var1.readInt();
		if (var3 >= 0 && (AbstractArchive.maximumContainerSize == 0 || var3 <= AbstractArchive.maximumContainerSize)) {
			if (var2 == 0) {
				byte[] var4 = new byte[var3];
				var1.readBytes(var4, 0, var3);
				return var4;
			} else {
				int var6 = var1.readInt();
				if (var6 < 0 || AbstractArchive.maximumContainerSize != 0 && var6 > AbstractArchive.maximumContainerSize) {
					throw new RuntimeException();
				} else {
					byte[] var5 = new byte[var6];
					if (var2 == 1) {
						BZip2Decompressor.BZip2Decompressor_decompress(var5, var6, var0, var3, 9);
					} else {
						AbstractArchive.gzipDecompressor.decompress(var1, var5);
					}

					return var5;
				}
			}
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2119265268"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (class406.friendsChat != null) {
			PacketBufferNode var1 = ObjectComposition.getPacketBufferNode(ClientPacket.field2502, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(Widget.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
