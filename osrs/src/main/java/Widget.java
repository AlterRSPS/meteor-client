import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mb")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("Widget_archive")
	public static AbstractArchive Widget_archive;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("Widget_cachedSprites")
	static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("Widget_cachedSpriteMasks")
	static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	static class411 field2908;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	static class411 field2907;
	@ObfuscatedName("bx")
	public static boolean field2901;
	@ObfuscatedName("be")
	@Export("isIf3")
	public boolean isIf3;
	// $FF: renamed from: id int
	@ObfuscatedName("bh")
	@Export("id")
	public int field_9;
	@ObfuscatedName("bp")
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("bw")
	@Export("type")
	public int type;
	@ObfuscatedName("bi")
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("bk")
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("bv")
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("bz")
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("bm")
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("br")
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("bu")
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("by")
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("bt")
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("bl")
	@Export("rawHeight")
	public int rawHeight;
	// $FF: renamed from: x int
	@ObfuscatedName("cs")
	@Export("x")
	public int field_10;
	// $FF: renamed from: y int
	@ObfuscatedName("cu")
	@Export("y")
	public int field_11;
	@ObfuscatedName("ca")
	@Export("width")
	public int width;
	@ObfuscatedName("cf")
	@Export("height")
	public int height;
	@ObfuscatedName("cw")
	public int field2967;
	@ObfuscatedName("ch")
	public int field2956;
	@ObfuscatedName("cp")
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("cy")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("cd")
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("cv")
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("cr")
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("cm")
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("cg")
	@Export("color")
	public int color;
	@ObfuscatedName("ci")
	@Export("color2")
	public int color2;
	@ObfuscatedName("cb")
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("cc")
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("ck")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	@Export("fillMode")
	public class512 fillMode;
	@ObfuscatedName("ce")
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("cj")
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("cl")
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("cn")
	public boolean field2918;
	@ObfuscatedName("ct")
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("cx")
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("co")
	public String field3048;
	@ObfuscatedName("cz")
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("dd")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("dl")
	@Export("outline")
	public int outline;
	@ObfuscatedName("dm")
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("da")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("dt")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("dn")
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("dw")
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("df")
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("dx")
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("dz")
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("do")
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("db")
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("dq")
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("dh")
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("dp")
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("dv")
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("di")
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("dj")
	@Export("modelRotation")
	public int modelRotation;
	@ObfuscatedName("dk")
	@Export("rotationKey")
	public int rotationKey;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public PlayerComposition field3058;
	@ObfuscatedName("dg")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("de")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("du")
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("dc")
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("ds")
	@Export("text")
	public String text;
	@ObfuscatedName("dr")
	@Export("text2")
	public String text2;
	@ObfuscatedName("ee")
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("er")
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("eh")
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("eu")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	class169 field2909;
	@ObfuscatedName("ez")
	int field2912;
	@ObfuscatedName("em")
	HashMap field2914;
	@ObfuscatedName("ea")
	HashMap field2913;
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	class325 field2915;
	@ObfuscatedName("ek")
	@Export("flags")
	public int flags;
	@ObfuscatedName("ec")
	public boolean field2925;
	@ObfuscatedName("el")
	public byte[][] field2935;
	@ObfuscatedName("ed")
	public byte[][] field2934;
	@ObfuscatedName("ep")
	public int[] field3003;
	@ObfuscatedName("ew")
	public int[] field3004;
	@ObfuscatedName("ex")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("ev")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("ey")
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("eg")
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("eq")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("fg")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("fa")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("fm")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("fc")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("fl")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("fe")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("fz")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("fp")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("fw")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("ff")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("ft")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("fv")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("fu")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("fd")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("fr")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("fh")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("fj")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("fo")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("fb")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("fy")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("fx")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("fq")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("fi")
	public Object[] field3019;
	@ObfuscatedName("fs")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("fn")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("fk")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("gw")
	public Object[] field3046;
	@ObfuscatedName("gd")
	public Object[] field3037;
	@ObfuscatedName("go")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("gh")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("ge")
	public Object[] field3038;
	@ObfuscatedName("gb")
	public Object[] field3036;
	@ObfuscatedName("gv")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("ga")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("gk")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("gt")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("gz")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("gm")
	public Object[] field3042;
	@ObfuscatedName("gg")
	public Object[] field3039;
	@ObfuscatedName("gi")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("gr")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("gc")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("gn")
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("gp")
	public String field3053;
	@ObfuscatedName("gy")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("gf")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("gx")
	public int[] field3011;
	@ObfuscatedName("gl")
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("gj")
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("gu")
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("gq")
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "[Lmb;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("he")
	public boolean field2930;
	@ObfuscatedName("ha")
	public boolean field2929;
	@ObfuscatedName("hk")
	public int field2998;
	@ObfuscatedName("hn")
	public int field2999;
	@ObfuscatedName("ht")
	public int field3001;
	@ObfuscatedName("hi")
	public int field2997;
	@ObfuscatedName("hv")
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("hp")
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("hc")
	public int[] field3012;
	@ObfuscatedName("hh")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("hw")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("hs")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		Widget_cachedSprites = new EvictingDualNodeHashTable(200);
		Widget_cachedModels = new EvictingDualNodeHashTable(50);
		Widget_cachedFonts = new EvictingDualNodeHashTable(20);
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8);
		field2908 = new class411(10, class409.field3702);
		field2907 = new class411(10, class409.field3702);
		field2901 = false;
	}

	public Widget() {
		super();
		this.isIf3 = false;
		this.field_9 = -1 * 1647896013;
		this.childIndex = -1 * 341335557;
		this.buttonType = 0;
		this.contentType = 0;
		this.xAlignment = 0;
		this.yAlignment = 0;
		this.widthAlignment = 0;
		this.heightAlignment = 0;
		this.rawX = 0;
		this.rawY = 0;
		this.rawWidth = 0;
		this.rawHeight = 0;
		this.field_10 = 0;
		this.field_11 = 0;
		this.width = 0;
		this.height = 0;
		this.field2967 = 1;
		this.field2956 = 1;
		this.parentId = -1;
		this.isHidden = false;
		this.scrollX = 0;
		this.scrollY = 0;
		this.scrollWidth = 0;
		this.scrollHeight = 0;
		this.color = 0;
		this.color2 = 0;
		this.mouseOverColor = 0;
		this.mouseOverColor2 = 0;
		this.fill = false;
		this.fillMode = class512.field4134;
		this.transparencyTop = 0;
		this.transparencyBot = 0;
		this.lineWid = 1;
		this.field2918 = false;
		this.spriteId2 = -1 * 2008423007;
		this.spriteId = -1 * -1636900483;
		this.spriteAngle = 0;
		this.spriteTiling = false;
		this.outline = 0;
		this.spriteShadow = 0;
		this.modelType = 1;
		this.modelId = -1;
		this.modelType2 = 1;
		this.modelId2 = -1;
		this.sequenceId = -1;
		this.sequenceId2 = -1;
		this.modelOffsetX = 0;
		this.modelOffsetY = 0;
		this.modelAngleX = 0;
		this.modelAngleY = 0;
		this.modelAngleZ = 0;
		this.modelZoom = 100;
		this.modelRotation = 0;
		this.rotationKey = 0;
		this.modelOrthog = false;
		this.modelTransparency = false;
		this.itemQuantityMode = 2;
		this.fontId = -1;
		this.text = "";
		this.text2 = "";
		this.textLineHeight = 0;
		this.textXAlignment = 0;
		this.textYAlignment = 0;
		this.textShadowed = false;
		this.field2912 = -1;
		this.flags = 0;
		this.field2925 = false;
		this.dataText = "";
		this.parent = null;
		this.dragZoneSize = 0;
		this.dragThreshold = 0;
		this.isScrollBar = false;
		this.spellActionName = "";
		this.hasListener = false;
		this.mouseOverRedirect = -1;
		this.field3053 = "";
		this.buttonText = "Ok";
		this.itemId = -1;
		this.itemQuantity = 0;
		this.modelFrame = 0;
		this.modelFrameCycle = 0;
		this.field2930 = false;
		this.field2929 = false;
		this.field2998 = -1;
		this.field2999 = 0;
		this.field3001 = 0;
		this.field2997 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)V",
		garbageValue = "-145893950"
	)
	@Export("decodeLegacy")
	void decodeLegacy(Buffer var1) {
		this.isIf3 = false;
		this.type = var1.readUnsignedByte();
		this.buttonType = var1.readUnsignedByte();
		this.contentType = var1.readUnsignedShort();
		this.rawX = var1.readShort();
		this.rawY = var1.readShort();
		this.rawWidth = var1.readUnsignedShort();
		this.rawHeight = var1.readUnsignedShort();
		this.transparencyTop = var1.readUnsignedByte();
		this.parentId = var1.readUnsignedShort();
		if (this.parentId == 65535) {
			this.parentId = -1;
		} else {
			this.parentId += this.field_9 * 1486786309 & -65536;
		}

		this.mouseOverRedirect = var1.readUnsignedShort();
		if (this.mouseOverRedirect == 65535) {
			this.mouseOverRedirect = -1;
		}

		int var2 = var1.readUnsignedByte();
		int var3;
		if (var2 > 0) {
			this.cs1Comparisons = new int[var2];
			this.cs1ComparisonValues = new int[var2];

			for (var3 = 0; var3 < var2; ++var3) {
				this.cs1Comparisons[var3] = var1.readUnsignedByte();
				this.cs1ComparisonValues[var3] = var1.readUnsignedShort();
			}
		}

		var3 = var1.readUnsignedByte();
		int var4;
		if (var3 > 0) {
			this.cs1Instructions = new int[var3][];

			for (var4 = 0; var4 < var3; ++var4) {
				int var5 = var1.readUnsignedShort();
				this.cs1Instructions[var4] = new int[var5];

				for (int var6 = 0; var6 < var5; ++var6) {
					this.cs1Instructions[var4][var6] = var1.readUnsignedShort();
					if (this.cs1Instructions[var4][var6] == 65535) {
						this.cs1Instructions[var4][var6] = -1;
					}
				}
			}
		}

		if (this.type == 0) {
			this.scrollHeight = var1.readUnsignedShort() * 2142090161;
			this.isHidden = var1.readUnsignedByte() == 1;
		}

		if (this.type == 1) {
			var1.readUnsignedShort();
			var1.readUnsignedByte();
		}

		if (this.type == 3) {
			this.fill = var1.readUnsignedByte() == 1;
		}

		if (this.type == 4 || this.type == 1) {
			this.textXAlignment = var1.readUnsignedByte();
			this.textYAlignment = var1.readUnsignedByte();
			this.textLineHeight = var1.readUnsignedByte();
			this.fontId = var1.readUnsignedShort();
			if (this.fontId == 65535) {
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1;
		}

		if (this.type == 4) {
			this.text = var1.readStringCp1252NullTerminated();
			this.text2 = var1.readStringCp1252NullTerminated();
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) {
			this.color = var1.readInt();
		}

		if (this.type == 3 || this.type == 4) {
			this.color2 = var1.readInt();
			this.mouseOverColor = var1.readInt();
			this.mouseOverColor2 = var1.readInt();
		}

		if (this.type == 5) {
			this.spriteId2 = var1.readInt() * 2008423007;
			this.spriteId = var1.readInt() * -1636900483;
		}

		if (this.type == 6) {
			this.modelType = 1;
			this.modelId = var1.readUnsignedShort();
			if (this.modelId == 65535) {
				this.modelId = -1;
			}

			this.modelType2 = 1;
			this.modelId2 = var1.readUnsignedShort();
			if (this.modelId2 == 65535) {
				this.modelId2 = -1;
			}

			this.sequenceId = var1.readUnsignedShort();
			if (this.sequenceId == 65535) {
				this.sequenceId = -1;
			}

			this.sequenceId2 = var1.readUnsignedShort();
			if (this.sequenceId2 == 65535) {
				this.sequenceId2 = -1;
			}

			this.modelZoom = var1.readUnsignedShort();
			this.modelAngleX = var1.readUnsignedShort();
			this.modelAngleY = var1.readUnsignedShort();
		}

		if (this.type == 8) {
			this.text = var1.readStringCp1252NullTerminated();
		}

		if (this.buttonType == 2) {
			this.spellActionName = var1.readStringCp1252NullTerminated();
			this.field3053 = var1.readStringCp1252NullTerminated();
			var4 = var1.readUnsignedShort() & 63;
			this.flags |= var4 << 11;
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) {
			this.buttonText = var1.readStringCp1252NullTerminated();
			if (this.buttonText.length() == 0) {
				if (this.buttonType == 1) {
					this.buttonText = "Ok";
				}

				if (this.buttonType == 4) {
					this.buttonText = "Select";
				}

				if (this.buttonType == 5) {
					this.buttonText = "Select";
				}

				if (this.buttonType == 6) {
					this.buttonText = "Continue";
				}
			}
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5) {
			this.flags |= 4194304;
		}

		if (this.buttonType == 6) {
			this.flags |= 1;
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)V",
		garbageValue = "714197315"
	)
	@Export("decode")
	void decode(Buffer var1) {
		var1.readUnsignedByte();
		this.isIf3 = true;
		this.type = var1.readUnsignedByte();
		this.contentType = var1.readUnsignedShort();
		this.rawX = var1.readShort();
		this.rawY = var1.readShort();
		this.rawWidth = var1.readUnsignedShort();
		if (this.type == 9) {
			this.rawHeight = var1.readShort();
		} else {
			this.rawHeight = var1.readUnsignedShort();
		}

		this.widthAlignment = var1.readByte();
		this.heightAlignment = var1.readByte();
		this.xAlignment = var1.readByte();
		this.yAlignment = var1.readByte();
		this.parentId = var1.readUnsignedShort();
		if (this.parentId == 65535) {
			this.parentId = -1;
		} else {
			this.parentId += this.field_9 * 1486786309 & -65536;
		}

		this.isHidden = var1.readUnsignedByte() == 1;
		if (this.type == 0) {
			this.scrollWidth = var1.readUnsignedShort() * 877366487;
			this.scrollHeight = var1.readUnsignedShort() * 2142090161;
			this.noClickThrough = var1.readUnsignedByte() == 1;
		}

		if (this.type == 5) {
			this.spriteId2 = var1.readInt() * 2008423007;
			this.spriteAngle = var1.readUnsignedShort();
			this.spriteTiling = var1.readUnsignedByte() == 1;
			this.transparencyTop = var1.readUnsignedByte();
			this.outline = var1.readUnsignedByte();
			this.spriteShadow = var1.readInt() * -2131228937;
			this.spriteFlipV = var1.readUnsignedByte() == 1;
			this.spriteFlipH = var1.readUnsignedByte() == 1;
		}

		if (this.type == 6) {
			this.modelType = 1;
			this.modelId = var1.readUnsignedShort();
			if (this.modelId == 65535) {
				this.modelId = -1;
			}

			this.modelOffsetX = var1.readShort();
			this.modelOffsetY = var1.readShort();
			this.modelAngleX = var1.readUnsignedShort();
			this.modelAngleY = var1.readUnsignedShort();
			this.modelAngleZ = var1.readUnsignedShort();
			this.modelZoom = var1.readUnsignedShort();
			this.sequenceId = var1.readUnsignedShort();
			if (this.sequenceId == 65535) {
				this.sequenceId = -1;
			}

			this.modelOrthog = var1.readUnsignedByte() == 1;
			var1.readUnsignedShort();
			if (this.widthAlignment != 0) {
				this.modelRotation = var1.readUnsignedShort();
			}

			if (this.heightAlignment != 0) {
				var1.readUnsignedShort();
			}
		}

		if (this.type == 4) {
			this.fontId = var1.readUnsignedShort();
			if (this.fontId == 65535) {
				this.fontId = -1;
			}

			this.text = var1.readStringCp1252NullTerminated();
			this.textLineHeight = var1.readUnsignedByte();
			this.textXAlignment = var1.readUnsignedByte();
			this.textYAlignment = var1.readUnsignedByte();
			this.textShadowed = var1.readUnsignedByte() == 1;
			this.color = var1.readInt();
		}

		if (this.type == 3) {
			this.color = var1.readInt();
			this.fill = var1.readUnsignedByte() == 1;
			this.transparencyTop = var1.readUnsignedByte();
		}

		if (this.type == 9) {
			this.lineWid = var1.readUnsignedByte();
			this.color = var1.readInt();
			this.field2918 = var1.readUnsignedByte() == 1;
		}

		this.flags = var1.readMedium();
		this.dataText = var1.readStringCp1252NullTerminated();
		int var2 = var1.readUnsignedByte();
		if (var2 > 0) {
			this.actions = new String[var2];

			for (int var3 = 0; var3 < var2; ++var3) {
				this.actions[var3] = var1.readStringCp1252NullTerminated();
			}
		}

		this.dragZoneSize = var1.readUnsignedByte();
		this.dragThreshold = var1.readUnsignedByte();
		this.isScrollBar = var1.readUnsignedByte() == 1;
		this.spellActionName = var1.readStringCp1252NullTerminated();
		this.onLoad = this.readListener(var1);
		this.onMouseOver = this.readListener(var1);
		this.onMouseLeave = this.readListener(var1);
		this.onTargetLeave = this.readListener(var1);
		this.onTargetEnter = this.readListener(var1);
		this.onVarTransmit = this.readListener(var1);
		this.onInvTransmit = this.readListener(var1);
		this.onStatTransmit = this.readListener(var1);
		this.onTimer = this.readListener(var1);
		this.onOp = this.readListener(var1);
		this.onMouseRepeat = this.readListener(var1);
		this.onClick = this.readListener(var1);
		this.onClickRepeat = this.readListener(var1);
		this.onRelease = this.readListener(var1);
		this.onHold = this.readListener(var1);
		this.onDrag = this.readListener(var1);
		this.onDragComplete = this.readListener(var1);
		this.onScroll = this.readListener(var1);
		this.varTransmitTriggers = this.readListenerTriggers(var1);
		this.invTransmitTriggers = this.readListenerTriggers(var1);
		this.statTransmitTriggers = this.readListenerTriggers(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)[Ljava/lang/Object;",
		garbageValue = "399481851"
	)
	@Export("readListener")
	Object[] readListener(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 == 0) {
			return null;
		} else {
			Object[] var3 = new Object[var2];

			for (int var4 = 0; var4 < var2; ++var4) {
				int var5 = var1.readUnsignedByte();
				if (var5 == 0) {
					var3[var4] = new Integer(var1.readInt());
				} else if (var5 == 1) {
					var3[var4] = var1.readStringCp1252NullTerminated();
				}
			}

			this.hasListener = true;
			return var3;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)[I",
		garbageValue = "-1822709459"
	)
	@Export("readListenerTriggers")
	int[] readListenerTriggers(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 == 0) {
			return null;
		} else {
			int[] var3 = new int[var2];

			for (int var4 = 0; var4 < var2; ++var4) {
				var3[var4] = var1.readInt();
			}

			return var3;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ZLea;I)Ltm;",
		garbageValue = "-1389466695"
	)
	@Export("getSprite")
	public SpritePixels getSprite(boolean var1, UrlRequester var2) {
		field2901 = false;
		if (this.field3048 != null) {
			SpritePixels var3 = this.method1821(var2);
			if (var3 != null) {
				return var3;
			}
		}

		int var7;
		if (var1) {
			var7 = this.spriteId * 86335445;
		} else {
			var7 = this.spriteId2 * 712819103;
		}

		if (var7 == -1) {
			return null;
		} else {
			long var4 = ((long)this.outline << 36) + (long)var7 + ((this.spriteFlipV ? 1L : 0L) << 38) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.spriteShadow * -7306543919833113913L << 40);
			SpritePixels var6 = (SpritePixels)Widget_cachedSprites.get(var4);
			if (var6 != null) {
				return var6;
			} else {
				var6 = class107.SpriteBuffer_getSprite(MenuAction.Widget_spritesArchive, var7, 0);
				if (var6 == null) {
					field2901 = true;
					return null;
				} else {
					this.method1824(var6);
					Widget_cachedSprites.put(var6, var4);
					return var6;
				}
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lea;B)Ltm;",
		garbageValue = "10"
	)
	SpritePixels method1821(UrlRequester var1) {
		if (!this.method1823()) {
			return this.method1822(var1);
		} else {
			String var2 = this.field3048 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow * 1116641991;
			SpritePixels var3 = (SpritePixels)field2907.method2138(var2);
			if (var3 == null) {
				SpritePixels var4 = this.method1822(var1);
				if (var4 != null) {
					var3 = var4.method2614();
					this.method1824(var3);
					field2907.method2139(var2, var3);
				}
			}

			return var3;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lea;I)Ltm;",
		garbageValue = "69187803"
	)
	SpritePixels method1822(UrlRequester var1) {
		if (this.field3048 != null && var1 != null) {
			class324 var2 = (class324)field2908.method2138(this.field3048);
			if (var2 == null) {
				var2 = new class324(this.field3048, var1);
				field2908.method2139(this.field3048, var2);
			}

			return var2.method1713();
		} else {
			return null;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1715273921"
	)
	boolean method1823() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow * 1116641991 != 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ltm;B)V",
		garbageValue = "-3"
	)
	void method1824(SpritePixels var1) {
		if (this.spriteFlipV) {
			var1.flipVertically();
		}

		if (this.spriteFlipH) {
			var1.flipHorizontally();
		}

		if (this.outline > 0) {
			var1.pad(this.outline);
		}

		if (this.outline >= 1) {
			var1.outline(1);
		}

		if (this.outline >= 2) {
			var1.outline(16777215);
		}

		if (this.spriteShadow * 1116641991 != 0) {
			var1.shadow(this.spriteShadow * 1116641991);
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Lph;",
		garbageValue = "821843286"
	)
	@Export("getFont")
	public Font getFont() {
		field2901 = false;
		if (this.fontId == -1) {
			return null;
		} else {
			Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId);
			if (var1 != null) {
				return var1;
			} else {
				var1 = Bounds.method2248(MenuAction.Widget_spritesArchive, class13.Widget_fontsArchive, this.fontId, 0);
				if (var1 != null) {
					Widget_cachedFonts.put(var1, (long)this.fontId);
				} else {
					field2901 = true;
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lhy;IZLmk;Lhd;Lhs;B)Ljd;",
		garbageValue = "1"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4, NPCComposition var5, NewShit var6) {
		field2901 = false;
		int var7;
		int var8;
		if (var3) {
			var7 = this.modelType2;
			var8 = this.modelId2;
		} else {
			var7 = this.modelType;
			var8 = this.modelId;
		}

		if (var7 == 6) {
			if (var5 == null) {
				return null;
			}

			var8 = var5.field_12;
		}

		if (var7 == 0) {
			return null;
		} else if (var7 == 1 && var8 == -1) {
			return null;
		} else {
			if (var6 != null && var6.field1554 && var7 == 6) {
				var7 = 3;
			}

			long var9 = (long)(var8 + (var7 << 16));
			if (var6 != null) {
				var9 |= var6.field1555 << 20;
			}

			Model var11 = (Model)Widget_cachedModels.get(var9);
			if (var11 == null) {
				ModelData var12 = null;
				int var13 = 64;
				int var14 = 768;
				switch(var7) {
				case 1:
					var12 = ModelData.ModelData_get(class309.field2794, var8, 0);
					break;
				case 2:
					var12 = Bounds.getNpcDefinition(var8).method972((NewShit)null);
					break;
				case 3:
					var12 = var4 != null ? var4.getModelData() : null;
					break;
				case 4:
					ItemComposition var15 = class300.ItemDefinition_get(var8);
					var12 = var15.getModelData(10);
					var13 += var15.field1780;
					var14 += var15.field1782;
				case 5:
				default:
					break;
				case 6:
					var12 = Bounds.getNpcDefinition(var8).method972(var6);
				}

				if (var12 == null) {
					field2901 = true;
					return null;
				}

				var11 = var12.toModel(var13, var14, -50, -10, -50);
				Widget_cachedModels.put(var11, var9);
			}

			if (var1 != null) {
				var11 = var1.transformWidgetModel(var11, var2);
			}

			return var11;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lmc;",
		garbageValue = "78"
	)
	@Export("getSpriteMask")
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId * 86335445 == -1) {
			var1 = false;
		}

		int var2 = var1 ? this.spriteId * 86335445 : this.spriteId2 * 712819103;
		if (var2 == -1) {
			return null;
		} else {
			long var3 = ((long)this.spriteShadow * -7306543919833113913L << 40) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.outline << 36) + (long)var2 + ((this.spriteFlipH ? 1L : 0L) << 39);
			SpriteMask var5 = (SpriteMask)Widget_cachedSpriteMasks.get(var3);
			if (var5 != null) {
				return var5;
			} else {
				SpritePixels var6 = this.getSprite(var1, (UrlRequester)null);
				if (var6 == null) {
					return null;
				} else {
					SpritePixels var7 = var6.copyNormalized();
					int[] var8 = new int[var7.subHeight];
					int[] var9 = new int[var7.subHeight];

					for (int var10 = 0; var10 < var7.subHeight; ++var10) {
						int var11 = 0;
						int var12 = var7.subWidth;

						int var13;
						for (var13 = 0; var13 < var7.subWidth; ++var13) {
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) {
								var11 = var13;
								break;
							}
						}

						for (var13 = var7.subWidth - 1; var13 >= var11; --var13) {
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) {
								var12 = var13 + 1;
								break;
							}
						}

						var8[var10] = var11;
						var9[var10] = var12 - var11;
					}

					var5 = new SpriteMask(var7.subWidth, var7.subHeight, var9, var8, var2);
					Widget_cachedSpriteMasks.put(var5, var3);
					return var5;
				}
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "1"
	)
	@Export("setAction")
	public void setAction(int var1, String var2) {
		if (this.actions == null || this.actions.length <= var1) {
			String[] var3 = new String[var1 + 1];
			if (this.actions != null) {
				for (int var4 = 0; var4 < this.actions.length; ++var4) {
					var3[var4] = this.actions[var4];
				}
			}

			this.actions = var3;
		}

		this.actions[var1] = var2;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-777535745"
	)
	public boolean method1829() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1178243183"
	)
	public boolean method1830() {
		return this.type == 11 || this.type == 12;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lea;J)V"
	)
	public void method1831(String var1, UrlRequester var2, long var3) {
		if (this.type == 11 && var3 != -1L) {
			var1 = var1.replaceAll("%userid%", Long.toString(var3));
			this.field2909 = new class169();
			if (!this.field2909.method872(var1, var2)) {
				this.field2909 = null;
			} else {
				if (this.field2914 == null || this.field2913 == null) {
					this.method1833();
				}

			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lea;S)V",
		garbageValue = "24161"
	)
	public void method1832(String var1, UrlRequester var2) {
		if (this.type == 11 && var1 != null) {
			this.field2909 = new class169();
			this.field2909.method891(var1, var2);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "20"
	)
	void method1833() {
		this.field2914 = new HashMap();
		this.field2913 = new HashMap();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2068642484"
	)
	public void method1834(int var1, int var2) {
		if (this.type == 11) {
			if (this.field2914 == null) {
				this.method1833();
			}

			this.field2914.put(var1, var2);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-1088050959"
	)
	public void method1835(String var1, int var2) {
		if (this.type == 11) {
			if (this.field2913 == null) {
				this.method1833();
			}

			this.field2913.put(var1, var2);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "-1747555331"
	)
	public boolean method1836(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field2909 != null && this.method1837()) {
			var1 -= var3;
			var2 -= var4;
			int var5 = (int)(this.field2909.method880()[0] * (float)(this.width * 1387970291));
			int var6 = (int)(this.field2909.method880()[1] * (float)(this.height * -175088023));
			int var7 = var5 + (int)(this.field2909.method880()[2] * (float)(this.width * 1387970291));
			int var8 = var6 + (int)(this.field2909.method880()[3] * (float)(this.height * -175088023));
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1668828074"
	)
	public boolean method1837() {
		return this.field2912 == 2;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-711592025"
	)
	public int method1838(String var1) {
		return this.type == 11 && this.field2909 != null && this.method1837() ? this.field2909.method875(var1) : -1;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "73"
	)
	public String method1839(String var1) {
		return this.type == 11 && this.field2909 != null && this.method1837() ? this.field2909.method876(var1) : null;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "709282331"
	)
	public int method1840() {
		return this.field2913 != null && this.field2913.size() > 0 ? 1 : 0;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "69"
	)
	public int method1841() {
		if (this.type == 11 && this.field2909 != null && this.field2913 != null && !this.field2913.isEmpty()) {
			String var1 = this.field2909.method879();
			return var1 != null && this.field2913.containsKey(this.field2909.method879()) ? (Integer)this.field2913.get(var1) : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2125916472"
	)
	public String method1842() {
		if (this.type == 11 && this.field2909 != null) {
			String var1 = this.field2909.method879();
			Iterator var2 = this.field2909.method881().iterator();

			while (var2.hasNext()) {
				class180 var3 = (class180)var2.next();
				String var4 = String.format("%%%S%%", var3.method915());
				if (var3.vmethod3379() == 0) {
					var1.replaceAll(var4, Integer.toString(var3.vmethod3378()));
				} else {
					var1.replaceAll(var4, var3.vmethod3380());
				}
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-840348115"
	)
	public int[] method1843() {
		if (this.type == 11 && this.field2909 != null) {
			int[] var1 = new int[3];
			int var2 = 0;
			Iterator var3 = this.field2909.method881().iterator();

			while (var3.hasNext()) {
				class180 var4 = (class180)var3.next();
				if (!var4.method915().equals("user_id")) {
					if (var4.vmethod3379() != 0) {
						return null;
					}

					var1[var2++] = var4.vmethod3378();
					if (var2 > 3) {
						return null;
					}
				}
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lea;I)Z",
		garbageValue = "-2135243363"
	)
	public boolean method1844(UrlRequester var1) {
		if (this.type == 11 && this.field2909 != null) {
			this.field2909.method873(var1);
			if (this.field2909.method874() != this.field2912) {
				this.field2912 = this.field2909.method874();
				if (this.field2912 >= 100) {
					return true;
				}

				if (this.field2912 == 2) {
					this.method1845();
					return true;
				}
			}

			return false;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-753090979"
	)
	void method1845() {
		this.noClickThrough = true;
		ArrayList var1 = this.field2909.method877();
		ArrayList var2 = this.field2909.method878();
		int var3 = var1.size() + var2.size();
		this.children = new Widget[var3];
		int var4 = 0;

		Iterator var5;
		Widget var7;
		for (var5 = var1.iterator(); var5.hasNext(); this.children[var4++] = var7) {
			class175 var6 = (class175)var5.next();
			var7 = class490.method2452(5, this, var4, 0, 0, 0, 0, var6.field1443);
			var7.field3048 = var6.field1442.method643();
			class324 var8 = new class324(var6.field1442);
			field2908.method2139(var7.field3048, var8);
		}

		for (var5 = var2.iterator(); var5.hasNext(); this.children[var4++] = var7) {
			class176 var9 = (class176)var5.next();
			var7 = class490.method2452(4, this, var4, 0, 0, 0, 0, var9.field1444);
			var7.text = var9.field1448;
			var7.fontId = (Integer)this.field2914.get(var9.field1446);
			var7.textXAlignment = var9.field1447;
			var7.textYAlignment = var9.field1445;
		}

	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-953704093"
	)
	public void method1846() {
		this.field2915 = new class325();

		for (int var1 = 1; var1 <= 12; ++var1) {
			this.field2915.field2857.method94(var1, 0);
		}

		for (char var2 = 0; var2 < ' '; ++var2) {
			this.field2915.field2857.method95(var2, 0);
		}

		this.field2915.field2857.method95('\u0080', 0);
		this.field2915.field2857.method94(82, 2);
		this.field2915.field2857.method94(81, 2);
		this.field2915.field2857.method94(86, 2);
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)Lmh;",
		garbageValue = "40455266"
	)
	public class327 method1847() {
		return this.field2915 != null ? this.field2915.field2863 : null;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(S)Lmx;",
		garbageValue = "-16401"
	)
	public class322 method1848() {
		return this.field2915 != null ? this.field2915.field2858 : null;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)Lbc;",
		garbageValue = "1764483065"
	)
	public class27 method1849() {
		return this.field2915 != null ? this.field2915.field2857 : null;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)Lms;",
		garbageValue = "-121385664"
	)
	public class325 method1850() {
		return this.field2915;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lmh;I)Z",
		garbageValue = "8388608"
	)
	boolean method1851(class327 var1) {
		boolean var2 = false;
		String var5;
		String var6;
		StringBuilder var7;
		int var8;
		int var9;
		int var10;
		char var11;
		String var12;
		if (this.text != null && !this.text.isEmpty()) {
			var6 = this.text;
			var7 = new StringBuilder(var6.length());
			var8 = 0;
			var9 = -1;

			for (var10 = 0; var10 < var6.length(); ++var10) {
				var11 = var6.charAt(var10);
				if (var11 == '<') {
					var7.append(var6.substring(var8, var10));
					var9 = var10;
				} else if (var11 == '>' && var9 != -1) {
					var12 = var6.substring(var9 + 1, var10);
					var9 = -1;
					if (var12.equals("lt")) {
						var7.append("<");
					} else if (var12.equals("gt")) {
						var7.append(">");
					} else if (var12.equals("br")) {
						var7.append("\n");
					}

					var8 = var10 + 1;
				}
			}

			if (var8 < var6.length()) {
				var7.append(var6.substring(var8, var6.length()));
			}

			var5 = var7.toString();
			var2 |= var1.method1733(var5);
			this.text = "";
		}

		if (this.text2 != null && !this.text2.isEmpty()) {
			var6 = this.text2;
			var7 = new StringBuilder(var6.length());
			var8 = 0;
			var9 = -1;

			for (var10 = 0; var10 < var6.length(); ++var10) {
				var11 = var6.charAt(var10);
				if (var11 == '<') {
					var7.append(var6.substring(var8, var10));
					var9 = var10;
				} else if (var11 == '>' && var9 != -1) {
					var12 = var6.substring(var9 + 1, var10);
					var9 = -1;
					if (var12.equals("lt")) {
						var7.append("<");
					} else if (var12.equals("gt")) {
						var7.append(">");
					} else if (var12.equals("br")) {
						var7.append("\n");
					}

					var8 = var10 + 1;
				}
			}

			if (var8 < var6.length()) {
				var7.append(var6.substring(var8, var6.length()));
			}

			var5 = var7.toString();
			var2 |= var1.method1734(var5);
			this.text2 = "";
		}

		return var2;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-275597364"
	)
	public boolean method1852() {
		class327 var1 = this.method1847();
		if (var1 == null) {
			return false;
		} else {
			boolean var2 = false;
			if (!var1.method1787() && this.fontId != -1) {
				int var3 = var1.method1788();
				int var4 = var1.method1789();
				int var5 = var1.method1786();
				int var6 = var1.method1785();
				Font var7 = this.getFont();
				if (var7 != null) {
					var2 |= var1.method1735(var7);
					var2 |= this.method1851(var1);
					var2 |= var1.method1740(var3, var4);
					var2 |= var1.method1755(var5, var6);
				}
			} else if (var1.method1787()) {
				var2 |= this.method1851(var1);
			}

			var1.method1730();
			return var2;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfa;",
		garbageValue = "1613415260"
	)
	static class131[] method1814() {
		return new class131[]{class131.field1264, class131.field1259, class131.field1265, class131.field1263, class131.field1266, class131.field1261, class131.field1251, class131.field1258, class131.field1254, class131.field1255, class131.field1260, class131.field1250, class131.field1257, class131.field1253, class131.field1252, class131.field1256, class131.field1262};
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "1"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1;
	}

	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;",
		garbageValue = "1605418477"
	)
	static String method1853(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://";
		if (Client.gameBuild == 1) {
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) {
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) {
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) {
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) {
			var0 = "local";
		}

		String var3 = "";
		if (class443.param9 != null) {
			var3 = "/p=" + class443.param9;
		}

		String var4 = "runescape.com";
		return var2 + var0 + "." + var4 + "/l=" + TriBool.clientLanguage + "/a=" + class156.field1380 + var3 + "/";
	}
}
