import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("at")
	static boolean field1807;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("SequenceDefinition_archive")
	static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("SequenceDefinition_animationsArchive")
	static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("SequenceDefinition_cached")
	static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("SequenceDefinition_cachedFrames")
	static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("SequenceDefinition_cachedModel")
	static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("ao")
	@Export("SequenceDefinition_cachedModelId")
	public int SequenceDefinition_cachedModelId;
	@ObfuscatedName("aa")
	@Export("animMayaFrameSounds")
	public Map animMayaFrameSounds;
	@ObfuscatedName("aj")
	@Export("animMayaStart")
	int animMayaStart;
	@ObfuscatedName("ad")
	@Export("animMayaEnd")
	int animMayaEnd;
	@ObfuscatedName("ac")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("ag")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("ar")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("ah")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("az")
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("au")
	@Export("mergedBoneGroups")
	int[] mergedBoneGroups;
	@ObfuscatedName("ai")
	@Export("animMayaMasks")
	boolean[] animMayaMasks;
	@ObfuscatedName("aq")
	@Export("stretches")
	public boolean stretches;
	@ObfuscatedName("aw")
	@Export("forcedPriority")
	public int forcedPriority;
	@ObfuscatedName("ay")
	@Export("shield")
	public int shield;
	@ObfuscatedName("al")
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("am")
	@Export("iterations")
	public int iterations;
	@ObfuscatedName("bs")
	public boolean field1819;
	@ObfuscatedName("bc")
	@Export("precedenceAnimating")
	public int precedenceAnimating;
	@ObfuscatedName("bj")
	@Export("priority")
	public int priority;
	@ObfuscatedName("bo")
	@Export("replyMode")
	public int replyMode;

	static {
		field1807 = false;
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100);
	}

	SequenceDefinition() {
		super();
		this.SequenceDefinition_cachedModelId = -1;
		this.animMayaStart = 0;
		this.animMayaEnd = 0;
		this.frameCount = -1;
		this.stretches = false;
		this.forcedPriority = 5;
		this.shield = -1;
		this.weapon = -1;
		this.iterations = 99;
		this.field1819 = false;
		this.precedenceAnimating = -1;
		this.priority = -1;
		this.replyMode = 2;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)V",
		garbageValue = "-1610732359"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ltz;II)V",
		garbageValue = "-952465976"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.readUnsignedShort();
			this.frameLengths = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameLengths[var4] = var1.readUnsignedShort();
			}

			this.frameIds = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 2) {
			this.frameCount = var1.readUnsignedShort();
		} else if (var2 == 3) {
			var3 = var1.readUnsignedByte();
			this.mergedBoneGroups = new int[var3 + 1];

			for (var4 = 0; var4 < var3; ++var4) {
				this.mergedBoneGroups[var4] = var1.readUnsignedByte();
			}

			this.mergedBoneGroups[var3] = 9999999;
		} else if (var2 == 4) {
			this.stretches = true;
		} else if (var2 == 5) {
			this.forcedPriority = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.iterations = var1.readUnsignedByte();
			this.field1819 = true;
		} else if (var2 == 9) {
			this.precedenceAnimating = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.priority = var1.readUnsignedByte();
		} else if (var2 == 11) {
			this.replyMode = var1.readUnsignedByte();
		} else if (var2 == 12) {
			var3 = var1.readUnsignedByte();
			this.chatFrameIds = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.chatFrameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) {
				this.chatFrameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 13) {
			var3 = var1.readUnsignedByte();
			this.soundEffects = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.soundEffects[var4] = var1.readMedium();
			}
		} else if (var2 == 14) {
			this.SequenceDefinition_cachedModelId = var1.readInt();
		} else if (var2 == 15) {
			var3 = var1.readUnsignedShort();
			this.animMayaFrameSounds = new HashMap();

			for (var4 = 0; var4 < var3; ++var4) {
				int var5 = var1.readUnsignedShort();
				int var6 = var1.readMedium();
				this.animMayaFrameSounds.put(var5, var6);
			}
		} else if (var2 == 16) {
			this.animMayaStart = var1.readUnsignedShort();
			this.animMayaEnd = var1.readUnsignedShort();
		} else if (var2 == 17) {
			this.animMayaMasks = new boolean[256];

			for (var3 = 0; var3 < this.animMayaMasks.length; ++var3) {
				this.animMayaMasks[var3] = false;
			}

			var3 = var1.readUnsignedByte();

			for (var4 = 0; var4 < var3; ++var4) {
				this.animMayaMasks[var1.readUnsignedByte()] = true;
			}
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "764283466"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.precedenceAnimating == -1) {
			if (this.mergedBoneGroups == null && this.animMayaMasks == null) {
				this.precedenceAnimating = 0;
			} else {
				this.precedenceAnimating = 2;
			}
		}

		if (this.priority == -1) {
			if (this.mergedBoneGroups == null && this.animMayaMasks == null) {
				this.priority = 0;
			} else {
				this.priority = 2;
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljd;II)Ljd;",
		garbageValue = "199223145"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var5 = getFrames(var2 >> 16);
			var2 &= 65535;
			if (var5 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var4.animate(var5, var2);
				return var4;
			}
		} else {
			class136 var3 = TaskHandler.method896(this.SequenceDefinition_cachedModelId);
			if (var3 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var3.method722());
				var4.method1325(var3, var2);
				return var4;
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljd;III)Ljd;",
		garbageValue = "-1368116657"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		Model var5;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var6 = getFrames(var2 >> 16);
			var2 &= 65535;
			if (var6 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var6.hasAlphaTransform(var2));
				var3 &= 3;
				if (var3 == 1) {
					var5.rotateY270Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY90Ccw();
				}

				var5.animate(var6, var2);
				if (var3 == 1) {
					var5.rotateY90Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY270Ccw();
				}

				return var5;
			}
		} else {
			class136 var4 = TaskHandler.method896(this.SequenceDefinition_cachedModelId);
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var4.method722());
				var3 &= 3;
				if (var3 == 1) {
					var5.rotateY270Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY90Ccw();
				}

				var5.method1325(var4, var2);
				if (var3 == 1) {
					var5.rotateY90Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY270Ccw();
				}

				return var5;
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljd;II)Ljd;",
		garbageValue = "1339225887"
	)
	Model method1078(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var5 = getFrames(var2 >> 16);
			var2 &= 65535;
			if (var5 == null) {
				return var1.method1317(true);
			} else {
				var4 = var1.method1317(!var5.hasAlphaTransform(var2));
				var4.animate(var5, var2);
				return var4;
			}
		} else {
			class136 var3 = TaskHandler.method896(this.SequenceDefinition_cachedModelId);
			if (var3 == null) {
				return var1.method1317(true);
			} else {
				var4 = var1.method1317(!var3.method722());
				var4.method1325(var3, var2);
				return var4;
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljd;ILhy;II)Ljd;",
		garbageValue = "-1654986799"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field1807 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) {
			return this.method1080(var1, var2, var3, var4);
		} else {
			Model var5 = var1.toSharedSequenceModel(false);
			boolean var6 = false;
			Frames var7 = null;
			Skeleton var8 = null;
			class136 var9;
			if (this.isCachedModelIdSet()) {
				var9 = this.method1085();
				if (var9 == null) {
					return var5;
				}

				if (var3.isCachedModelIdSet() && this.animMayaMasks == null) {
					var5.method1325(var9, var2);
					return var5;
				}

				var8 = var9.field1285;
				var5.method1329(var8, var9, var2, this.animMayaMasks, false, !var3.isCachedModelIdSet());
			} else {
				var2 = this.frameIds[var2];
				var7 = getFrames(var2 >> 16);
				var2 &= 65535;
				if (var7 == null) {
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.mergedBoneGroups == null || var4 == -1)) {
					var5.animate(var7, var2);
					return var5;
				}

				if (this.mergedBoneGroups == null || var4 == -1) {
					var5.animate(var7, var2);
					return var5;
				}

				var6 = var3.isCachedModelIdSet();
				if (!var6) {
					var5.method1330(var7, var2, this.mergedBoneGroups, false);
				}
			}

			if (var3.isCachedModelIdSet()) {
				var9 = var3.method1085();
				if (var9 == null) {
					return var5;
				}

				if (var8 == null) {
					var8 = var9.field1285;
				}

				var5.method1329(var8, var9, var4, this.animMayaMasks, true, true);
			} else {
				var4 = var3.frameIds[var4];
				Frames var10 = getFrames(var4 >> 16);
				var4 &= 65535;
				if (var10 == null) {
					return this.transformActorModel(var1, var2);
				}

				var5.method1330(var10, var4, this.mergedBoneGroups, true);
			}

			if (var6 && var7 != null) {
				var5.method1330(var7, var2, this.mergedBoneGroups, false);
			}

			var5.resetBounds();
			return var5;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljd;ILhy;II)Ljd;",
		garbageValue = "-1794397101"
	)
	Model method1080(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = getFrames(var4 >> 16);
			var4 &= 65535;
			Model var7;
			if (var6 == null) {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var7.animate(var5, var2);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
				var7.animate2(var5, var2, var6, var4, this.mergedBoneGroups);
				return var7;
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljd;IB)Ljd;",
		garbageValue = "-122"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			int var3 = this.frameIds[var2];
			Frames var4 = getFrames(var3 >> 16);
			var3 &= 65535;
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null;
				int var6 = 0;
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
					var6 = this.chatFrameIds[var2];
					var5 = getFrames(var6 >> 16);
					var6 &= 65535;
				}

				Model var7;
				if (var5 != null && var6 != 65535) {
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3) & !var5.hasAlphaTransform(var6));
					var7.animate(var4, var3);
					var7.animate(var5, var6);
					return var7;
				} else {
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3));
					var7.animate(var4, var3);
					return var7;
				}
			}
		} else {
			return this.transformActorModel(var1, var2);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-459482881"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "861664920"
	)
	public int method1083() {
		return this.animMayaEnd - this.animMayaStart;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Lfz;",
		garbageValue = "1212195601"
	)
	class136 method1085() {
		return this.isCachedModelIdSet() ? TaskHandler.method896(this.SequenceDefinition_cachedModelId) : null;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)Liu;",
		garbageValue = "2"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition_cachedFrames.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			AbstractArchive var3 = SequenceDefinition_animationsArchive;
			AbstractArchive var4 = class305.SequenceDefinition_skeletonsArchive;
			boolean var5 = true;
			int[] var6 = var3.getGroupFileIds(var0);

			for (int var7 = 0; var7 < var6.length; ++var7) {
				byte[] var8 = var3.getFile(var0, var6[var7]);
				if (var8 == null) {
					var5 = false;
				} else {
					int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
					byte[] var10 = var4.getFile(var9, 0);
					if (var10 == null) {
						var5 = false;
					}
				}
			}

			Frames var2;
			if (!var5) {
				var2 = null;
			} else {
				try {
					var2 = new Frames(var3, var4, var0, false);
				} catch (Exception var12) {
					var2 = null;
				}
			}

			if (var2 != null) {
				SequenceDefinition_cachedFrames.put(var2, (long)var0);
			}

			return var2;
		}
	}
}
