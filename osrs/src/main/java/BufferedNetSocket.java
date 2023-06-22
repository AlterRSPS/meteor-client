import java.io.IOException;
import java.net.Socket;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qw")
@Implements("BufferedNetSocket")
public class BufferedNetSocket extends AbstractSocket {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	@Export("clock")
	static Clock clock;
	@ObfuscatedName("ad")
	static int field3758;
	@ObfuscatedName("at")
	@Export("socket")
	Socket socket;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	@Export("source")
	BufferedSource source;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	@Export("sink")
	BufferedSink sink;

	BufferedNetSocket(Socket var1, int var2, int var3) throws IOException {
		super();
		this.socket = var1;
		this.socket.setSoTimeout(30000);
		this.socket.setTcpNoDelay(true);
		this.socket.setReceiveBufferSize(65536);
		this.socket.setSendBufferSize(65536);
		this.source = new BufferedSource(this.socket.getInputStream(), var2);
		this.sink = new BufferedSink(this.socket.getOutputStream(), var3);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1623804098"
	)
	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		return this.source.isAvailable(var1);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("available")
	public int available() throws IOException {
		return this.source.available();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "82"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() throws IOException {
		return this.source.readUnsignedByte();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "([BIIB)I",
		garbageValue = "-22"
	)
	@Export("read")
	public int read(byte[] var1, int var2, int var3) throws IOException {
		return this.source.read(var1, var2, var3);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-1586948718"
	)
	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		this.sink.write(var1, var2, var3);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-22185"
	)
	@Export("close")
	public void close() {
		this.sink.close();

		try {
			this.socket.close();
		} catch (IOException var2) {
		}

		this.source.close();
	}

	@Export("finalize")
	@ObfuscatedName("finalize")
	protected void finalize() {
		this.close();
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "-667099299"
	)
	static int method2227(int var0, Script var1, boolean var2) {
		String var3;
		int var4;
		if (var0 == 4100) {
			var3 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
			var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3 + var4;
			return 1;
		} else {
			String var9;
			if (var0 == 4101) {
				class149.Interpreter_stringStackSize -= 2;
				var3 = Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize];
				var9 = Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize + 1];
				Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3 + var9;
				return 1;
			} else if (var0 == 4102) {
				var3 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3 + ChatChannel.intToString(var4, true);
				return 1;
			} else if (var0 == 4103) {
				var3 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
				Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3.toLowerCase();
				return 1;
			} else {
				int var6;
				int var10;
				if (var0 == 4104) {
					var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					long var11 = (11745L + (long)var10) * 86400000L;
					Interpreter.Interpreter_calendar.setTime(new Date(var11));
					var6 = Interpreter.Interpreter_calendar.get(5);
					int var17 = Interpreter.Interpreter_calendar.get(2);
					int var8 = Interpreter.Interpreter_calendar.get(1);
					Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8;
					return 1;
				} else if (var0 != 4105) {
					if (var0 == 4106) {
						var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = Integer.toString(var10);
						return 1;
					} else if (var0 == 4107) {
						class149.Interpreter_stringStackSize -= 2;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class157.method822(class196.compareStrings(Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize + 1], TriBool.clientLanguage));
						return 1;
					} else {
						int var5;
						byte[] var13;
						Font var14;
						if (var0 == 4108) {
							var3 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
							Interpreter.Interpreter_intStackSize -= 2;
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var13 = class310.archive13.takeFile(var5, 0);
							var14 = new Font(var13);
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14.lineCount(var3, var4);
							return 1;
						} else if (var0 == 4109) {
							var3 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
							Interpreter.Interpreter_intStackSize -= 2;
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var13 = class310.archive13.takeFile(var5, 0);
							var14 = new Font(var13);
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14.lineWidth(var3, var4);
							return 1;
						} else if (var0 == 4110) {
							class149.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize];
							var9 = Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize + 1];
							if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
								Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var9;
							}

							return 1;
						} else if (var0 == 4111) {
							var3 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3);
							return 1;
						} else if (var0 == 4112) {
							var3 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3 + (char)var4;
							return 1;
						} else if (var0 == 4113) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class323.isCharPrintable((char)var10) ? 1 : 0;
							return 1;
						} else if (var0 == 4114) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class209.isAlphaNumeric((char)var10) ? 1 : 0;
							return 1;
						} else if (var0 == 4115) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class382.isCharAlphabetic((char)var10) ? 1 : 0;
							return 1;
						} else if (var0 == 4116) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class159.isDigit((char)var10) ? 1 : 0;
							return 1;
						} else if (var0 == 4117) {
							var3 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
							if (var3 != null) {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							}

							return 1;
						} else if (var0 == 4118) {
							var3 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
							Interpreter.Interpreter_intStackSize -= 2;
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3.substring(var4, var5);
							return 1;
						} else if (var0 == 4119) {
							var3 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
							StringBuilder var18 = new StringBuilder(var3.length());
							boolean var16 = false;

							for (var6 = 0; var6 < var3.length(); ++var6) {
								char var7 = var3.charAt(var6);
								if (var7 == '<') {
									var16 = true;
								} else if (var7 == '>') {
									var16 = false;
								} else if (!var16) {
									var18.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var18.toString();
							return 1;
						} else if (var0 == 4120) {
							var3 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.indexOf(var4);
							return 1;
						} else if (var0 == 4121) {
							class149.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize];
							var9 = Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize + 1];
							var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.indexOf(var9, var5);
							return 1;
						} else if (var0 == 4122) {
							var3 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3.toUpperCase();
							return 1;
						} else if (var0 == 4123) {
							class149.Interpreter_stringStackSize -= 3;
							var3 = Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize];
							var9 = Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize + 1];
							String var15 = Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize + 2];
							if (Projectile.localPlayer.appearance == null) {
								Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var15;
								return 1;
							} else {
								switch(Projectile.localPlayer.appearance.field2874) {
								case 0:
									Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3;
									break;
								case 1:
									Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var9;
									break;
								case 2:
								default:
									Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var15;
								}

								return 1;
							}
						} else {
							return 2;
						}
					}
				} else {
					class149.Interpreter_stringStackSize -= 2;
					var3 = Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize];
					var9 = Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize + 1];
					if (Projectile.localPlayer.appearance != null && Projectile.localPlayer.appearance.field2875 != 0) {
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var9;
					} else {
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3;
					}

					return 1;
				}
			}
		}
	}
}
