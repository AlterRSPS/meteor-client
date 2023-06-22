import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mh")
public class class327 {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	class392 field2895;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	class392 field2896;
	@ObfuscatedName("au")
	boolean field2877;
	@ObfuscatedName("ai")
	boolean field2876;
	@ObfuscatedName("aq")
	int field2881;
	@ObfuscatedName("aw")
	boolean field2878;
	@ObfuscatedName("ay")
	int field2882;
	@ObfuscatedName("al")
	int field2879;
	@ObfuscatedName("am")
	int field2880;
	@ObfuscatedName("bs")
	int field2892;
	@ObfuscatedName("bc")
	int field2884;
	@ObfuscatedName("bj")
	int field2888;
	@ObfuscatedName("bo")
	int field2890;
	@ObfuscatedName("bq")
	int field2891;
	@ObfuscatedName("bg")
	int field2887;
	@ObfuscatedName("bf")
	int field2886;
	@ObfuscatedName("bd")
	int field2885;
	@ObfuscatedName("ba")
	int field2883;
	@ObfuscatedName("bn")
	int field2889;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	class321 field2893;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	class321 field2894;

	class327() {
		super();
		this.field2895 = new class392();
		this.field2896 = new class392();
		this.field2877 = false;
		this.field2876 = true;
		this.field2881 = 0;
		this.field2878 = false;
		this.field2882 = 0;
		this.field2879 = 0;
		this.field2880 = 0;
		this.field2892 = 0;
		this.field2884 = 0;
		this.field2888 = 0;
		this.field2890 = 0;
		this.field2891 = Integer.MAX_VALUE;
		this.field2887 = Integer.MAX_VALUE;
		this.field2886 = 0;
		this.field2885 = 0;
		this.field2883 = 0;
		this.field2889 = 0;
		this.field2895.method2026(1);
		this.field2896.method2026(1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1366871947"
	)
	void method1730() {
		this.field2881 = (this.field2881 + 1) % 60;
		if (this.field2890 > 0) {
			--this.field2890;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "102"
	)
	public boolean method1731(boolean var1) {
		var1 = var1 && this.field2876;
		boolean var2 = this.field2877 != var1;
		this.field2877 = var1;
		if (!this.field2877) {
			this.method1755(this.field2892, this.field2892);
		}

		return var2;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1331805463"
	)
	public void method1732(boolean var1) {
		this.field2876 = var1;
		this.field2877 = var1 && this.field2877;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-1468802518"
	)
	boolean method1733(String var1) {
		String var2 = this.field2895.method2021();
		if (!var2.equals(var1)) {
			var1 = this.method1799(var1);
			this.field2895.method2033(var1);
			this.method1740(this.field2883, this.field2889);
			this.method1803();
			this.method1808();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-149482019"
	)
	boolean method1734(String var1) {
		this.field2896.method2033(var1);
		return true;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lpn;I)Z",
		garbageValue = "-1972901380"
	)
	boolean method1735(AbstractFont var1) {
		boolean var2 = !this.field2878;
		this.field2895.method2025(var1);
		this.field2896.method2025(var1);
		this.field2878 = true;
		var2 |= this.method1740(this.field2883, this.field2889);
		var2 |= this.method1755(this.field2884, this.field2892);
		if (this.method1803()) {
			this.method1808();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "156796357"
	)
	public boolean method1736(int var1, int var2) {
		boolean var3 = this.field2886 != var1 || var2 != this.field2885;
		this.field2886 = var1;
		this.field2885 = var2;
		var3 |= this.method1740(this.field2883, this.field2889);
		return var3;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1859935155"
	)
	public boolean method1737(int var1) {
		if (var1 < 0) {
			var1 = Integer.MAX_VALUE;
		}

		boolean var2 = var1 == this.field2895.method2044();
		this.field2895.method2022(var1);
		this.field2896.method2022(var1);
		if (this.method1803()) {
			this.method1808();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1046429285"
	)
	public boolean method1738(int var1) {
		this.field2895.method2023(var1);
		if (this.method1803()) {
			this.method1808();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1518453135"
	)
	public boolean method1739(int var1) {
		this.field2887 = var1;
		if (this.method1803()) {
			this.method1808();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "0"
	)
	public boolean method1740(int var1, int var2) {
		if (!this.method1787()) {
			this.field2883 = var1;
			this.field2889 = var2;
			return false;
		} else {
			int var3 = this.field2883;
			int var4 = this.field2889;
			int var5 = Math.max(0, this.field2895.method2039() - this.field2886 + 2);
			int var6 = Math.max(0, this.field2895.method2040() - this.field2885 + 1);
			this.field2883 = Math.max(0, Math.min(var5, var1));
			this.field2889 = Math.max(0, Math.min(var6, var2));
			return var3 != this.field2883 || var4 != this.field2889;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1434004662"
	)
	public boolean method1741(int var1, int var2) {
		boolean var3 = true;
		if (var1 < 0 || var1 > 2) {
			var3 = false;
		}

		if (var2 < 0 || var2 > 2) {
			var3 = false;
		}

		return var3 ? this.field2895.method2027(var1, var2) : false;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2092078385"
	)
	public void method1742(int var1) {
		this.field2895.method2028(var1);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1102820457"
	)
	public void method1743(int var1) {
		this.field2882 = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "94089397"
	)
	public void method1744(int var1) {
		this.field2895.method2026(var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1327708796"
	)
	public void method1745(int var1) {
		this.field2895.method2024(var1);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "121"
	)
	public boolean method1746(int var1) {
		this.field2880 = var1;
		String var2 = this.field2895.method2021();
		int var3 = var2.length();
		var2 = this.method1799(var2);
		if (var2.length() != var3) {
			this.field2895.method2033(var2);
			this.method1740(this.field2883, this.field2889);
			this.method1803();
			this.method1808();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-91946430"
	)
	public void method1747() {
		this.field2878 = false;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-41"
	)
	public boolean method1748(int var1) {
		if (this.method1809(var1)) {
			this.method1753();
			class393 var2 = this.field2895.method2030((char)var1, this.field2892, this.field2891);
			this.method1755(var2.method2058(), var2.method2058());
			this.method1803();
			this.method1808();
		}

		return true;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1892200113"
	)
	public void method1749() {
		if (!this.method1753() && this.field2892 > 0) {
			int var1 = this.field2895.method2035(this.field2892 - 1);
			this.method1808();
			this.method1755(var1, var1);
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1621563977"
	)
	public void method1750() {
		if (!this.method1753() && this.field2892 < this.field2895.method2020()) {
			int var1 = this.field2895.method2035(this.field2892);
			this.method1808();
			this.method1755(var1, var1);
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1930066506"
	)
	public void method1751() {
		if (!this.method1753() && this.field2892 > 0) {
			class473 var1 = this.method1801(this.field2892 - 1);
			int var2 = this.field2895.method2036((Integer)var1.field3987, this.field2892);
			this.method1808();
			this.method1755(var2, var2);
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1784378069"
	)
	public void method1752() {
		if (!this.method1753() && this.field2892 < this.field2895.method2020()) {
			class473 var1 = this.method1801(this.field2892);
			int var2 = this.field2895.method2036(this.field2892, (Integer)var1.field3986);
			this.method1808();
			this.method1755(var2, var2);
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1362686979"
	)
	boolean method1753() {
		if (!this.method1798()) {
			return false;
		} else {
			int var1 = this.field2895.method2036(this.field2884, this.field2892);
			this.method1808();
			this.method1755(var1, var1);
			return true;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1257491815"
	)
	public void method1754() {
		this.method1755(0, this.field2895.method2020());
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "58"
	)
	public boolean method1755(int var1, int var2) {
		if (!this.method1787()) {
			this.field2884 = var1;
			this.field2892 = var2;
			return false;
		} else {
			if (var1 > this.field2895.method2020()) {
				var1 = this.field2895.method2020();
			}

			if (var2 > this.field2895.method2020()) {
				var2 = this.field2895.method2020();
			}

			boolean var3 = this.field2884 != var1 || var2 != this.field2892;
			this.field2884 = var1;
			if (var2 != this.field2892) {
				this.field2892 = var2;
				this.field2881 = 0;
				this.method1806();
			}

			if (var3 && this.field2894 != null) {
				this.field2894.vmethod5708();
			}

			return var3;
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "65535"
	)
	public void method1756(boolean var1) {
		class473 var2 = this.method1802(this.field2892);
		this.method1804((Integer)var2.field3987, var1);
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-115"
	)
	public void method1757(boolean var1) {
		class473 var2 = this.method1802(this.field2892);
		this.method1804((Integer)var2.field3986, var1);
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1186975323"
	)
	public void method1758(boolean var1) {
		this.method1804(0, var1);
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1751235989"
	)
	public void method1759(boolean var1) {
		this.method1804(this.field2895.method2020(), var1);
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-95"
	)
	public void method1760(boolean var1) {
		if (this.method1798() && !var1) {
			this.method1804(Math.min(this.field2884, this.field2892), var1);
		} else if (this.field2892 > 0) {
			this.method1804(this.field2892 - 1, var1);
		}

	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-48"
	)
	public void method1761(boolean var1) {
		if (this.method1798() && !var1) {
			this.method1804(Math.max(this.field2884, this.field2892), var1);
		} else if (this.field2892 < this.field2895.method2020()) {
			this.method1804(this.field2892 + 1, var1);
		}

	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "899685139"
	)
	public void method1762(boolean var1) {
		if (this.field2892 > 0) {
			class473 var2 = this.method1801(this.field2892 - 1);
			this.method1804((Integer)var2.field3987, var1);
		}

	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1949621946"
	)
	public void method1763(boolean var1) {
		if (this.field2892 < this.field2895.method2020()) {
			class473 var2 = this.method1801(this.field2892 + 1);
			this.method1804((Integer)var2.field3986, var1);
		}

	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "1"
	)
	public void method1764(boolean var1) {
		if (this.field2892 > 0) {
			this.method1804(this.field2895.method2038(this.field2892, -1), var1);
		}

	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "48"
	)
	public void method1765(boolean var1) {
		if (this.field2892 < this.field2895.method2020()) {
			this.method1804(this.field2895.method2038(this.field2892, 1), var1);
		}

	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1183245304"
	)
	public void method1766(boolean var1) {
		if (this.field2892 > 0) {
			int var2 = this.method1805();
			this.method1804(this.field2895.method2038(this.field2892, -var2), var1);
		}

	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1906419112"
	)
	public void method1767(boolean var1) {
		if (this.field2892 < this.field2895.method2020()) {
			int var2 = this.method1805();
			this.method1804(this.field2895.method2038(this.field2892, var2), var1);
		}

	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1430584970"
	)
	public void method1768(boolean var1) {
		class396 var2 = this.field2895.method2029(0, this.field2892);
		class473 var3 = var2.method2102();
		this.method1804(this.field2895.method2037((Integer)var3.field3987, this.field2889), var1);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "14452723"
	)
	public void method1769(boolean var1) {
		class396 var2 = this.field2895.method2029(0, this.field2892);
		class473 var3 = var2.method2102();
		this.method1804(this.field2895.method2037((Integer)var3.field3987, this.field2885 + this.field2889), var1);
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "537466825"
	)
	public void method1770(int var1, int var2, boolean var3, boolean var4) {
		boolean var5 = false;
		class473 var6;
		int var8;
		if (!this.field2878) {
			var8 = 0;
		} else {
			var1 += this.field2883;
			var2 += this.field2889;
			var6 = this.method1810();
			var8 = this.field2895.method2037(var1 - (Integer)var6.field3987, var2 - (Integer)var6.field3986);
		}

		if (var3 && var4) {
			this.field2879 = 1;
			var6 = this.method1801(var8);
			class473 var7 = this.method1801(this.field2888);
			this.method1800(var7, var6);
		} else if (var3) {
			this.field2879 = 1;
			var6 = this.method1801(var8);
			this.method1755((Integer)var6.field3987, (Integer)var6.field3986);
			this.field2888 = (Integer)var6.field3987;
		} else if (var4) {
			this.method1755(this.field2888, var8);
		} else {
			if (this.field2890 > 0 && var8 == this.field2888) {
				if (this.field2884 == this.field2892) {
					this.field2879 = 1;
					var6 = this.method1801(var8);
					this.method1755((Integer)var6.field3987, (Integer)var6.field3986);
				} else {
					this.field2879 = 2;
					var6 = this.method1802(var8);
					this.method1755((Integer)var6.field3987, (Integer)var6.field3986);
				}
			} else {
				this.field2879 = 0;
				this.method1755(var8, var8);
				this.field2888 = var8;
			}

			this.field2890 = 25;
		}

	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-279189279"
	)
	public void method1771(int var1, int var2) {
		if (this.field2878 && this.method1782()) {
			var1 += this.field2883;
			var2 += this.field2889;
			class473 var3 = this.method1810();
			int var4 = this.field2895.method2037(var1 - (Integer)var3.field3987, var2 - (Integer)var3.field3986);
			class473 var5;
			class473 var6;
			switch(this.field2879) {
			case 0:
				this.method1755(this.field2884, var4);
				break;
			case 1:
				var5 = this.method1801(this.field2888);
				var6 = this.method1801(var4);
				this.method1800(var5, var6);
				break;
			case 2:
				var5 = this.method1802(this.field2888);
				var6 = this.method1802(var4);
				this.method1800(var5, var6);
			}
		}

	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-1117002090"
	)
	public void method1772(Clipboard var1) {
		class396 var2 = this.field2895.method2029(this.field2884, this.field2892);
		if (!var2.method2098()) {
			String var3 = var2.method2095();
			if (!var3.isEmpty()) {
				var1.setContents(new StringSelection(var3), (ClipboardOwner)null);
			}
		}

	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;B)V",
		garbageValue = "50"
	)
	public void method1773(Clipboard var1) {
		if (this.method1798()) {
			this.method1772(var1);
			this.method1753();
		}

	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "301106092"
	)
	public void method1774(Clipboard var1) {
		Transferable var2 = var1.getContents((Object)null);
		if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			try {
				String var3 = this.method1799((String)var2.getTransferData(DataFlavor.stringFlavor));
				this.method1753();
				class393 var4 = this.field2895.method2031(var3, this.field2892, this.field2891);
				this.method1755(var4.method2058(), var4.method2058());
				this.method1803();
				this.method1808();
			} catch (Exception var5) {
			}
		}

	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-72"
	)
	public void method1775() {
		this.field2889 = Math.max(0, this.field2889 - this.field2895.method2041());
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-125833639"
	)
	public void method1776() {
		int var1 = Math.max(0, this.field2895.method2040() - this.field2885);
		this.field2889 = Math.min(var1, this.field2889 + this.field2895.method2041());
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lmo;B)V",
		garbageValue = "5"
	)
	public void method1777(class321 var1) {
		this.field2893 = var1;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lmo;I)V",
		garbageValue = "919903927"
	)
	public void method1778(class321 var1) {
		this.field2894 = var1;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(B)Lpk;",
		garbageValue = "58"
	)
	public class392 method1779() {
		return this.field2895;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)Lpk;",
		garbageValue = "-2034054674"
	)
	public class392 method1780() {
		return this.field2896;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(B)Lpw;",
		garbageValue = "-55"
	)
	public class396 method1781() {
		return this.field2895.method2029(this.field2884, this.field2892);
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-405027294"
	)
	public boolean method1782() {
		return this.field2877;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-246360184"
	)
	public boolean method1783() {
		return this.field2876;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1419094514"
	)
	public boolean method1784() {
		return this.method1782() && this.field2881 % 60 < 30;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "2"
	)
	public int method1785() {
		return this.field2892;
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1682671662"
	)
	public int method1786() {
		return this.field2884;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "115320322"
	)
	public boolean method1787() {
		return this.field2878;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "841625291"
	)
	public int method1788() {
		return this.field2883;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "19"
	)
	public int method1789() {
		return this.field2889;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	public int method1790() {
		return this.field2895.method2044();
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-368943571"
	)
	public int method1791() {
		return this.field2895.method2045();
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-173585629"
	)
	public int method1792() {
		return this.field2887;
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "133494003"
	)
	public int method1793() {
		return this.field2882;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-81"
	)
	public int method1794() {
		return this.field2895.method2046();
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-516900515"
	)
	public int method1795() {
		return this.field2880;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "374345971"
	)
	public int method1796() {
		return this.field2895.method2047();
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1962908634"
	)
	public boolean method1797() {
		return this.method1791() > 1;
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1300653391"
	)
	boolean method1798() {
		return this.field2884 != this.field2892;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "37"
	)
	String method1799(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length());

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			char var4 = var1.charAt(var3);
			if (this.method1809(var4)) {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(Lsf;Lsf;I)V",
		garbageValue = "-1064229642"
	)
	void method1800(class473 var1, class473 var2) {
		if ((Integer)var2.field3987 < (Integer)var1.field3987) {
			this.method1755((Integer)var1.field3986, (Integer)var2.field3987);
		} else {
			this.method1755((Integer)var1.field3987, (Integer)var2.field3986);
		}

	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(II)Lsf;",
		garbageValue = "-324312765"
	)
	class473 method1801(int var1) {
		int var2 = this.field2895.method2020();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.method1807(this.field2895.method2016(var5 - 1).field3635)) {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.method1807(this.field2895.method2016(var5).field3635)) {
				var4 = var5;
				break;
			}
		}

		return new class473(var3, var4);
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsf;",
		garbageValue = "89"
	)
	class473 method1802(int var1) {
		int var2 = this.field2895.method2020();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.field2895.method2016(var5 - 1).field3635 == '\n') {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.field2895.method2016(var5).field3635 == '\n') {
				var4 = var5;
				break;
			}
		}

		return new class473(var3, var4);
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-5"
	)
	boolean method1803() {
		if (!this.method1787()) {
			return false;
		} else {
			boolean var1 = false;
			if (this.field2895.method2020() > this.field2887) {
				this.field2895.method2036(this.field2887, this.field2895.method2020());
				var1 = true;
			}

			int var2 = this.method1791();
			int var3;
			if (this.field2895.method2042() > var2) {
				var3 = this.field2895.method2038(0, var2) - 1;
				this.field2895.method2036(var3, this.field2895.method2020());
				var1 = true;
			}

			if (var1) {
				var3 = this.field2892;
				int var4 = this.field2884;
				int var5 = this.field2895.method2020();
				if (this.field2892 > var5) {
					var3 = var5;
				}

				if (this.field2884 > var5) {
					var4 = var5;
				}

				this.method1755(var4, var3);
			}

			return var1;
		}
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-1859543250"
	)
	void method1804(int var1, boolean var2) {
		if (var2) {
			this.method1755(this.field2884, var1);
		} else {
			this.method1755(var1, var1);
		}

	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1409912129"
	)
	int method1805() {
		return this.field2885 / this.field2895.method2041();
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method1806() {
		class396 var1 = this.field2895.method2029(0, this.field2892);
		class473 var2 = var1.method2102();
		int var3 = this.field2895.method2041();
		int var4 = (Integer)var2.field3987 - 10;
		int var5 = var4 + 20;
		int var6 = (Integer)var2.field3986 - 3;
		int var7 = var6 + var3 + 6;
		int var8 = this.field2883;
		int var9 = var8 + this.field2886;
		int var10 = this.field2889;
		int var11 = var10 + this.field2885;
		int var12 = this.field2883;
		int var13 = this.field2889;
		if (var4 < var8) {
			var12 = var4;
		} else if (var5 > var9) {
			var12 = var5 - this.field2886;
		}

		if (var6 < var10) {
			var13 = var6;
		} else if (var7 > var11) {
			var13 = var7 - this.field2885;
		}

		this.method1740(var12, var13);
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-54"
	)
	boolean method1807(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9;
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1795542626"
	)
	void method1808() {
		if (this.field2893 != null) {
			this.field2893.vmethod5708();
		}

	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-565978703"
	)
	boolean method1809(int var1) {
		switch(this.field2880) {
		case 1:
			return class209.isAlphaNumeric((char)var1);
		case 2:
			return class382.isCharAlphabetic((char)var1);
		case 3:
			return class159.isDigit((char)var1);
		case 4:
			char var2 = (char)var1;
			if (class159.isDigit(var2)) {
				return true;
			} else {
				if (var2 != 'k' && var2 != 'K' && var2 != 'm' && var2 != 'M' && var2 != 'b' && var2 != 'B') {
					return false;
				}

				return true;
			}
		default:
			return true;
		}
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(B)Lsf;",
		garbageValue = "0"
	)
	class473 method1810() {
		int var1 = this.field2895.method2048(this.field2886);
		int var2 = this.field2895.method2049(this.field2885);
		return new class473(var1, var2);
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1915884245"
	)
	static final boolean method1811() {
		return Client.isMenuOpen;
	}

	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "689278853"
	)
	static void method1812() {
		if (Client.oculusOrbState == 1) {
			Client.oculusOrbOnLocalPlayer = true;
		}

	}
}
