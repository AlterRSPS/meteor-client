import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ta")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("at")
	final int field4106;
	@ObfuscatedName("an")
	final int field4103;
	@ObfuscatedName("av")
	final int field4107;
	@ObfuscatedName("as")
	final int field4105;
	@ObfuscatedName("ax")
	final int field4108;
	@ObfuscatedName("ap")
	final int field4104;
	@ObfuscatedName("ab")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("ak")
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("ae")
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("af")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("ao")
	@Export("next_out")
	int next_out;
	@ObfuscatedName("aa")
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("aj")
	int field4087;
	@ObfuscatedName("ad")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("ac")
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("ag")
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("ar")
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("ah")
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("az")
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("au")
	int field4092;
	@ObfuscatedName("ai")
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("aq")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("aw")
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("ay")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("am")
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("bs")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("bc")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("bj")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("bo")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("bq")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("bg")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("bf")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("bd")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("ba")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("bn")
	@Export("base")
	int[][] base;
	@ObfuscatedName("bb")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("bx")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("be")
	int field4095;

	BZip2State() {
		super();
		this.field4106 = 4096;
		this.field4103 = 16;
		this.field4107 = 258;
		this.field4105 = 6;
		this.field4108 = 50;
		this.field4104 = 18002;
		this.nextByte = 0;
		this.next_out = 0;
		this.unzftab = new int[256];
		this.cftab = new int[257];
		this.inUse = new boolean[256];
		this.inUse16 = new boolean[16];
		this.seqToUnseq = new byte[256];
		this.ll8 = new byte[4096];
		this.getAndMoveToFrontDecode_yy = new int[16];
		this.selector = new byte[18002];
		this.selectorMtf = new byte[18002];
		this.temp_charArray2d = new byte[6][258];
		this.limit = new int[6][258];
		this.base = new int[6][258];
		this.perm = new int[6][258];
		this.minLens = new int[6];
	}
}
