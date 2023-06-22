import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("an")
	static int field1153;
	@ObfuscatedName("av")
	static int field1154;
	@ObfuscatedName("at")
	final URL field1155;
	@ObfuscatedName("as")
	volatile int field1157;
	@ObfuscatedName("ax")
	@Export("response0")
	volatile byte[] response0;

	static {
		field1153 = -1;
		field1154 = -2;
	}

	UrlRequest(URL var1) {
		super();
		this.field1157 = field1153;
		this.field1155 = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-57"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.field1157 != field1153;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "-91"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1290466605"
	)
	public String method643() {
		return this.field1155.toString();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ltl;B)V",
		garbageValue = "-27"
	)
	static final void method640(PacketBuffer var0) {
		int var1 = 0;
		var0.importIndex();

		byte[] var10000;
		int var2;
		int var3;
		int var4;
		for (var2 = 0; var2 < Players.Players_count; ++var2) {
			var3 = Players.Players_indices[var2];
			if ((Players.activityFlags[var3] & 1) == 0) {
				if (var1 > 0) {
					--var1;
					var10000 = Players.activityFlags;
					var10000[var3] = (byte)(var10000[var3] | 2);
				} else {
					var4 = var0.readBits(1);
					if (var4 == 0) {
						var1 = InterfaceParent.method452(var0);
						var10000 = Players.activityFlags;
						var10000[var3] = (byte)(var10000[var3] | 2);
					} else {
						class72.readPlayerUpdate(var0, var3);
					}
				}
			}
		}

		var0.exportIndex();
		if (var1 != 0) {
			throw new RuntimeException();
		} else {
			var0.importIndex();

			for (var2 = 0; var2 < Players.Players_count; ++var2) {
				var3 = Players.Players_indices[var2];
				if ((Players.activityFlags[var3] & 1) != 0) {
					if (var1 > 0) {
						--var1;
						var10000 = Players.activityFlags;
						var10000[var3] = (byte)(var10000[var3] | 2);
					} else {
						var4 = var0.readBits(1);
						if (var4 == 0) {
							var1 = InterfaceParent.method452(var0);
							var10000 = Players.activityFlags;
							var10000[var3] = (byte)(var10000[var3] | 2);
						} else {
							class72.readPlayerUpdate(var0, var3);
						}
					}
				}
			}

			var0.exportIndex();
			if (var1 != 0) {
				throw new RuntimeException();
			} else {
				var0.importIndex();

				for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) {
					var3 = Players.Players_emptyIndices[var2];
					if ((Players.activityFlags[var3] & 1) != 0) {
						if (var1 > 0) {
							--var1;
							var10000 = Players.activityFlags;
							var10000[var3] = (byte)(var10000[var3] | 2);
						} else {
							var4 = var0.readBits(1);
							if (var4 == 0) {
								var1 = InterfaceParent.method452(var0);
								var10000 = Players.activityFlags;
								var10000[var3] = (byte)(var10000[var3] | 2);
							} else if (UserComparator7.updateExternalPlayer(var0, var3)) {
								var10000 = Players.activityFlags;
								var10000[var3] = (byte)(var10000[var3] | 2);
							}
						}
					}
				}

				var0.exportIndex();
				if (var1 != 0) {
					throw new RuntimeException();
				} else {
					var0.importIndex();

					for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) {
						var3 = Players.Players_emptyIndices[var2];
						if ((Players.activityFlags[var3] & 1) == 0) {
							if (var1 > 0) {
								--var1;
								var10000 = Players.activityFlags;
								var10000[var3] = (byte)(var10000[var3] | 2);
							} else {
								var4 = var0.readBits(1);
								if (var4 == 0) {
									var1 = InterfaceParent.method452(var0);
									var10000 = Players.activityFlags;
									var10000[var3] = (byte)(var10000[var3] | 2);
								} else if (UserComparator7.updateExternalPlayer(var0, var3)) {
									var10000 = Players.activityFlags;
									var10000[var3] = (byte)(var10000[var3] | 2);
								}
							}
						}
					}

					var0.exportIndex();
					if (var1 != 0) {
						throw new RuntimeException();
					} else {
						Players.Players_count = 0;
						Players.Players_emptyIdxCount = 0;

						for (var2 = 1; var2 < 2048; ++var2) {
							var10000 = Players.activityFlags;
							var10000[var2] = (byte)(var10000[var2] >> 1);
							Player var5 = Client.players[var2];
							if (var5 != null) {
								Players.Players_indices[++Players.Players_count - 1] = var2;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var2;
							}
						}

					}
				}
			}
		}
	}
}
