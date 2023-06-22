import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ao")
public class class10 {
	@ObfuscatedName("vn")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("at")
	final HttpsURLConnection field31;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	final class407 field32;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	final class9 field30;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lrp;"
	)
	class449 field29;
	@ObfuscatedName("ax")
	boolean field27;
	@ObfuscatedName("ap")
	boolean field26;
	@ObfuscatedName("ab")
	int field28;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Laf;Lpj;Z)V"
	)
	public class10(URL var1, class9 var2, class407 var3, boolean var4) throws IOException {
		super();
		this.field27 = false;
		this.field26 = false;
		this.field28 = 300000;
		if (!var2.method27()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method28());
		} else {
			this.field31 = (HttpsURLConnection)var1.openConnection();
			if (!var4) {
				this.field31.setSSLSocketFactory(class15.method54());
			}

			this.field30 = var2;
			this.field32 = var3 != null ? var3 : new class407();
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Laf;Z)V"
	)
	public class10(URL var1, class9 var2, boolean var3) throws IOException {
		this(var1, var2, new class407(), var3);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Lpj;",
		garbageValue = "4"
	)
	public class407 method34() {
		return this.field32;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lrp;B)V",
		garbageValue = "28"
	)
	public void method35(class449 var1) {
		if (!this.field27) {
			if (var1 == null) {
				this.field32.method2123("Content-Type");
				this.field29 = null;
			} else {
				this.field29 = var1;
				if (this.field29.vmethod2213() != null) {
					this.field32.method2127(this.field29.vmethod2213());
				} else {
					this.field32.method2128();
				}

			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-2983"
	)
	void method36() throws ProtocolException {
		if (!this.field27) {
			this.field31.setRequestMethod(this.field30.method28());
			this.field32.method2120(this.field31);
			if (this.field30.method29() && this.field29 != null) {
				this.field31.setDoOutput(true);
				ByteArrayOutputStream var1 = new ByteArrayOutputStream();

				try {
					var1.write(this.field29.vmethod7797());
					var1.writeTo(this.field31.getOutputStream());
				} catch (IOException var11) {
					var11.printStackTrace();
				} finally {
					try {
						var1.close();
					} catch (IOException var10) {
						var10.printStackTrace();
					}

				}
			}

			this.field31.setConnectTimeout(this.field28);
			this.field31.setInstanceFollowRedirects(this.field26);
			this.field27 = true;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2119989742"
	)
	boolean method37() throws IOException {
		if (!this.field27) {
			this.method36();
		}

		this.field31.connect();
		return this.field31.getResponseCode() == -1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Lai;",
		garbageValue = "52"
	)
	class20 method38() {
		try {
			if (!this.field27 || this.field31.getResponseCode() == -1) {
				return new class20("No REST response has been received yet.");
			}
		} catch (IOException var10) {
			this.field31.disconnect();
			return new class20("Error decoding REST response code: " + var10.getMessage());
		}

		class20 var3;
		try {
			class20 var1 = new class20(this.field31);
			return var1;
		} catch (IOException var8) {
			var3 = new class20("Error decoding REST response: " + var8.getMessage());
		} finally {
			this.field31.disconnect();
		}

		return var3;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "126"
	)
	static void method33(int var0) {
		UserComparator9.field1169 = var0;
		class438.field3813 = new class438[var0];
		class438.field3812 = 0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lmb;B)I",
		garbageValue = "46"
	)
	static int method40(Widget var0) {
		if (var0.type != 11) {
			Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
			Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var0.method1839(var1);
			return 1;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-560521371"
	)
	static final void method39(String var0, int var1) {
		PacketBufferNode var2 = ObjectComposition.getPacketBufferNode(ClientPacket.field2559, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(Widget.stringCp1252NullTerminatedByteSize(var0) + 1);
		var2.packetBuffer.writeStringCp1252NullTerminated(var0);
		var2.packetBuffer.method2528(var1);
		Client.packetWriter.addNode(var2);
	}
}
