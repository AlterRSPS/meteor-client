import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

@ObfuscatedName("aa")
class class11 implements TlsAuthentication {
	@ObfuscatedName("av")
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	@Export("this$2")
	@ObfuscatedName("this$2")
	final class13 this$2;

	@ObfuscatedSignature(
		descriptor = "(Lad;)V"
	)
	class11(class13 var1) {
		super();
		this.this$2 = var1;
	}

	@Export("notifyServerCertificate")
	@ObfuscatedName("notifyServerCertificate")
	public void notifyServerCertificate(Certificate var1) throws IOException {
		try {
			CertificateFactory var2 = CertificateFactory.getInstance("X.509");
			LinkedList var3 = new LinkedList();
			org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList();

			for (int var5 = 0; var5 < var4.length; ++var5) {
				org.bouncycastle.asn1.x509.Certificate var6 = var4[var5];
				var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded())));
			}

			this.this$2.this$1.field35 = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0]));
		} catch (CertificateException var7) {
			throw new IOException(var7);
		}
	}

	@Export("getClientCredentials")
	@ObfuscatedName("getClientCredentials")
	public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
		return null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lba;I)V",
		garbageValue = "-790604853"
	)
	static void method41(GameEngine var0) {
		class211 var1 = class350.method1877();

		while (var1.method1104()) {
			if (var1.field1871 == 13) {
				class9.method32();
				return;
			}

			if (var1.field1871 == 96) {
				if (Login.worldSelectPage > 0 && class299.worldSelectLeftSprite != null) {
					--Login.worldSelectPage;
				}
			} else if (var1.field1871 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && class128.worldSelectRightSprite != null) {
				++Login.worldSelectPage;
			}
		}

		if (MouseHandler.MouseHandler_lastButton == 1 || !class305.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
			int var2 = Login.xPadding + 280;
			if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				ScriptFrame.changeWorldSelectSorting(0, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				ScriptFrame.changeWorldSelectSorting(0, 1);
				return;
			}

			int var3 = Login.xPadding + 390;
			if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				ScriptFrame.changeWorldSelectSorting(1, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				ScriptFrame.changeWorldSelectSorting(1, 1);
				return;
			}

			int var4 = Login.xPadding + 500;
			if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				ScriptFrame.changeWorldSelectSorting(2, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				ScriptFrame.changeWorldSelectSorting(2, 1);
				return;
			}

			int var5 = Login.xPadding + 610;
			if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				ScriptFrame.changeWorldSelectSorting(3, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var5 + 15 && MouseHandler.MouseHandler_lastPressedX <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				ScriptFrame.changeWorldSelectSorting(3, 1);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
				class9.method32();
				return;
			}

			if (Login.hoveredWorldIndex != -1) {
				World var6 = World.World_worlds[Login.hoveredWorldIndex];
				class14.changeWorld(var6);
				class9.method32();
				return;
			}

			if (Login.worldSelectPage > 0 && class299.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class299.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= class270.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class270.canvasHeight / 2 + 50) {
				--Login.worldSelectPage;
			}

			if (Login.worldSelectPage < Login.worldSelectPagesCount && class128.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= class448.canvasWidth - class128.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= class448.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= class270.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class270.canvasHeight / 2 + 50) {
				++Login.worldSelectPage;
			}
		}

	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "-109"
	)
	static int method42(int var0, Script var1, boolean var2) {
		return 2;
	}
}
