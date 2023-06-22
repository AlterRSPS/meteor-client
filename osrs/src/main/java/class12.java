import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

@ObfuscatedName("aj")
class class12 extends SSLSocket {
	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "[Ltm;"
	)
	@Export("crossSprites")
	static SpritePixels[] crossSprites;
	@ObfuscatedName("at")
	Certificate[] field35;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	@Export("this$0")
	@ObfuscatedName("this$0")
	final class15 this$0;
	// $FF: synthetic field
	@Export("val$tlsClientProtocol")
	@ObfuscatedName("val$tlsClientProtocol")
	final TlsClientProtocol val$tlsClientProtocol;
	// $FF: synthetic field
	@Export("val$host")
	@ObfuscatedName("val$host")
	final String val$host;

	@ObfuscatedSignature(
		descriptor = "(Lag;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V"
	)
	class12(class15 var1, TlsClientProtocol var2, String var3) {
		super();
		this.this$0 = var1;
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream();
	}

	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream();
	}

	@Export("close")
	@ObfuscatedName("close")
	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close();
	}

	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	}

	public boolean getEnableSessionCreation() {
		return false;
	}

	public String[] getEnabledCipherSuites() {
		return null;
	}

	public String[] getEnabledProtocols() {
		return null;
	}

	public boolean getNeedClientAuth() {
		return false;
	}

	@Export("getSession")
	@ObfuscatedName("getSession")
	public SSLSession getSession() {
		return new class17(this);
	}

	public String[] getSupportedProtocols() {
		return null;
	}

	public String[] getSupportedCipherSuites() {
		return null;
	}

	public boolean getUseClientMode() {
		return false;
	}

	public boolean getWantClientAuth() {
		return false;
	}

	public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
	}

	public void setEnableSessionCreation(boolean var1) {
	}

	public void setEnabledCipherSuites(String[] var1) {
	}

	public void setEnabledProtocols(String[] var1) {
	}

	public void setNeedClientAuth(boolean var1) {
	}

	public void setUseClientMode(boolean var1) {
	}

	public void setWantClientAuth(boolean var1) {
	}

	@Export("startHandshake")
	@ObfuscatedName("startHandshake")
	public void startHandshake() throws IOException {
		this.val$tlsClientProtocol.connect(new class13(this));
	}

	@ObfuscatedName("ak")
	static final void method43(long var0) {
		ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var0;
	}
}
