import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.RefreshAccessTokenRequester;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed, OAuthApi, class312 {
	@ObfuscatedName("wd")
	public static int field366;
	@ObfuscatedName("vm")
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("vw")
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("xj")
	@ObfuscatedSignature(
		descriptor = "Lci;"
	)
	static final ApproximateRouteStrategy field648;
	@ObfuscatedName("vv")
	@ObfuscatedSignature(
		descriptor = "[Loe;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("xg")
	static int[] field591;
	@ObfuscatedName("xs")
	static int[] field592;
	@ObfuscatedName("uq")
	static boolean field399;
	@ObfuscatedName("uz")
	static boolean field401;
	@ObfuscatedName("vl")
	static int field542;
	@ObfuscatedName("vf")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("uj")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	static class466 field633;
	@ObfuscatedName("vu")
	static int field545;
	@ObfuscatedName("ut")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	static class466 field634;
	@ObfuscatedName("wx")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("wm")
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("wv")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("we")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("wk")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("archive5")
	static class411 archive5;
	@ObfuscatedName("vp")
	@ObfuscatedSignature(
		descriptor = "Lrq;"
	)
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("ve")
	static short field638;
	@ObfuscatedName("vs")
	static short field642;
	@ObfuscatedName("vz")
	static short field644;
	@ObfuscatedName("vd")
	static short field637;
	@ObfuscatedName("vo")
	static short field640;
	@ObfuscatedName("vx")
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("vr")
	static short field641;
	@ObfuscatedName("vq")
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("vg")
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("wy")
	static int field550;
	@ObfuscatedName("va")
	static boolean[] field407;
	@ObfuscatedName("vy")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("vk")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("vt")
	static int[] field590;
	@ObfuscatedName("uu")
	static boolean field400;
	@ObfuscatedName("um")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	static class467 field631;
	@ObfuscatedName("vi")
	static int[] field588;
	@ObfuscatedName("vj")
	static int[] field589;
	@ObfuscatedName("vb")
	static int[] field587;
	@ObfuscatedName("wc")
	static List field606;
	@ObfuscatedName("wa")
	@ObfuscatedSignature(
		descriptor = "Lcb;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("wh")
	static int field548;
	@ObfuscatedName("bt")
	@Export("lockMouseRecorder")
	static boolean lockMouseRecorder;
	@ObfuscatedName("bl")
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("cs")
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("ca")
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("ch")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("cp")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("cm")
	@Export("param21")
	static int param21;
	@ObfuscatedName("cg")
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("ci")
	static int field423;
	@ObfuscatedName("cb")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("cc")
	@Export("param25")
	public static int param25;
	@ObfuscatedName("dl")
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("dr")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("ee")
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("er")
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("eu")
	@Export("lastMouseRecordX")
	static int lastMouseRecordX;
	@ObfuscatedName("ef")
	@Export("lastMouseRecordY")
	static int lastMouseRecordY;
	@ObfuscatedName("ez")
	@Export("lastMouseRecordTime")
	static long lastMouseRecordTime;
	@ObfuscatedName("em")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("ea")
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("en")
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("et")
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("ek")
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("ec")
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("el")
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("ed")
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("ep")
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("ew")
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Lds;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "Lds;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("ei")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("fm")
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("fe")
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("fz")
	@Export("js5Cycles")
	static int js5Cycles;
	@ObfuscatedName("gh")
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("gb")
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("gv")
	static int field446;
	@ObfuscatedName("ga")
	static int field442;
	@ObfuscatedName("gk")
	static int field445;
	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	static class138 field416;
	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	static class505 field646;
	@ObfuscatedName("hv")
	static final String field651;
	@ObfuscatedName("hu")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "Lcz;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("hg")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "[Lde;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("il")
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("ic")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("ik")
	static int field447;
	@ObfuscatedName("ig")
	static int[] field552;
	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("io")
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("it")
	static String field596;
	@ObfuscatedName("ia")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("ib")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("jh")
	static int field451;
	@ObfuscatedName("jd")
	static int field450;
	@ObfuscatedName("jz")
	static int field455;
	@ObfuscatedName("jx")
	static int field454;
	@ObfuscatedName("jn")
	static int field453;
	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "[Lic;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("ja")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("jv")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("jt")
	static final int[] field649;
	@ObfuscatedName("ji")
	static int field452;
	@ObfuscatedName("kv")
	static int field464;
	@ObfuscatedName("ks")
	static int field463;
	@ObfuscatedName("kw")
	static int field465;
	@ObfuscatedName("kh")
	static int field458;
	@ObfuscatedName("km")
	static boolean field379;
	@ObfuscatedName("kr")
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("ke")
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("kp")
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("kk")
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("kl")
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("kd")
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("kz")
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("lf")
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("lt")
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("ln")
	static int field473;
	@ObfuscatedName("lh")
	static int field469;
	@ObfuscatedName("li")
	static int field470;
	@ObfuscatedName("lm")
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("ll")
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("lp")
	public static int field365;
	@ObfuscatedName("lq")
	@Export("oculusOrbOnLocalPlayer")
	static boolean oculusOrbOnLocalPlayer;
	@ObfuscatedName("ls")
	@Export("packetIndicator")
	static int packetIndicator;
	@ObfuscatedName("lw")
	@Export("emitPackets")
	static boolean emitPackets;
	@ObfuscatedName("lo")
	static int field474;
	@ObfuscatedName("lg")
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("lu")
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("ly")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("lv")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("lk")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("lb")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("lr")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("le")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("lc")
	static int[][] field593;
	@ObfuscatedName("lz")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("mr")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("mi")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("mv")
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("ma")
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("mu")
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("mn")
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("mc")
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("mq")
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("mg")
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("mo")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("mx")
	static int field488;
	@ObfuscatedName("ml")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "[Ldh;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("mj")
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("mb")
	@Export("isMembers")
	static int isMembers;
	@ObfuscatedName("mp")
	@Export("playerUUID")
	static long playerUUID;
	@ObfuscatedName("mz")
	static boolean field384;
	@ObfuscatedName("me")
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("nf")
	static int field489;
	@ObfuscatedName("nm")
	static int[] field565;
	@ObfuscatedName("nc")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("na")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("nn")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("nt")
	static int[] field566;
	@ObfuscatedName("ng")
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "[[[Loy;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("nb")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("nw")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("nd")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("nz")
	@Export("leftClickOpensMenu")
	static boolean leftClickOpensMenu;
	@ObfuscatedName("ny")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("ns")
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("nh")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("nj")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("nk")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("od")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("oe")
	@Export("menuItemIds")
	static int[] menuItemIds;
	@ObfuscatedName("ow")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("oc")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("og")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("ob")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("oj")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("oo")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("ol")
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("oi")
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("or")
	static int field496;
	@ObfuscatedName("ox")
	static int field499;
	@ObfuscatedName("os")
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("ok")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("ov")
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("oh")
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("on")
	static String field597;
	@ObfuscatedName("ou")
	static String field598;
	@ObfuscatedName("of")
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("pu")
	@ObfuscatedSignature(
		descriptor = "Lsh;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("pn")
	static int field506;
	@ObfuscatedName("pw")
	static int field510;
	@ObfuscatedName("py")
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("pe")
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("pv")
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("ps")
	@Export("weight")
	static int weight;
	@ObfuscatedName("px")
	@Export("staffModLevel")
	static int staffModLevel;
	@ObfuscatedName("pc")
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("pq")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("pz")
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("pp")
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	@Export("clickedWidget")
	public static Widget clickedWidget;
	@ObfuscatedName("pt")
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("pj")
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("pm")
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("po")
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("pi")
	static boolean field392;
	@ObfuscatedName("pa")
	static int field500;
	@ObfuscatedName("pl")
	static int field504;
	@ObfuscatedName("pg")
	static boolean field391;
	@ObfuscatedName("pf")
	static int field502;
	@ObfuscatedName("pr")
	static int field507;
	@ObfuscatedName("qy")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("qi")
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("qg")
	static int[] field572;
	@ObfuscatedName("qh")
	static int field514;
	@ObfuscatedName("qz")
	static int[] field573;
	@ObfuscatedName("qw")
	static int field525;
	@ObfuscatedName("qa")
	static int[] field570;
	@ObfuscatedName("qn")
	static int field519;
	@ObfuscatedName("qc")
	static int[] field571;
	@ObfuscatedName("qd")
	static int field513;
	@ObfuscatedName("qr")
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("qs")
	static int field522;
	@ObfuscatedName("ql")
	static int field518;
	@ObfuscatedName("qk")
	static int field517;
	@ObfuscatedName("qv")
	static int field524;
	@ObfuscatedName("qj")
	static int field516;
	@ObfuscatedName("qp")
	static int field520;
	@ObfuscatedName("qu")
	static int field523;
	@ObfuscatedName("rg")
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("ra")
	@ObfuscatedSignature(
		descriptor = "Ltw;"
	)
	static class518 field647;
	@ObfuscatedName("rj")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("ro")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	static NodeDeque field625;
	@ObfuscatedName("rp")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	static NodeDeque field626;
	@ObfuscatedName("rr")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	static NodeDeque field627;
	@ObfuscatedName("rb")
	@ObfuscatedSignature(
		descriptor = "Lsh;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("rt")
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("ry")
	static int field529;
	@ObfuscatedName("rf")
	static boolean[] field404;
	@ObfuscatedName("rh")
	static boolean[] field405;
	@ObfuscatedName("ru")
	static boolean[] field406;
	@ObfuscatedName("rl")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("rd")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("rz")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("rc")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("rk")
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("rq")
	static long field612;
	@ObfuscatedName("ri")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("sr")
	static int[] field579;
	@ObfuscatedName("sb")
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("sc")
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("sv")
	static String field599;
	@ObfuscatedName("sn")
	static long[] field614;
	@ObfuscatedName("sy")
	static int field534;
	@ObfuscatedName("sz")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	@Export("keyHandlerInstance")
	static class211 keyHandlerInstance;
	@ObfuscatedName("sj")
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	static class209 field419;
	@ObfuscatedName("su")
	static int field533;
	@ObfuscatedName("sq")
	static int[] field578;
	@ObfuscatedName("ss")
	static int[] field580;
	@ObfuscatedName("sp")
	static long field613;
	@ObfuscatedName("sk")
	@ObfuscatedSignature(
		descriptor = "[Lfs;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("sd")
	@ObfuscatedSignature(
		descriptor = "[Lgv;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("sl")
	static int field532;
	@ObfuscatedName("tb")
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("tp")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("th")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("tc")
	@ObfuscatedSignature(
		descriptor = "[Ltm;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("tg")
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("tl")
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("tf")
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("ty")
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("tn")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("tm")
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("tt")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("td")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("tq")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("tw")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("tx")
	@ObfuscatedSignature(
		descriptor = "[Lbh;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("uf")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("ud")
	static boolean field397;
	@ObfuscatedName("gu")
	String field659;
	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "Lac;"
	)
	class14 field652;
	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	class18 field654;
	@ObfuscatedName("he")
	OtlTokenRequester field657;
	@ObfuscatedName("ha")
	Future field660;
	@ObfuscatedName("hk")
	boolean field656;
	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	class18 field655;
	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	RefreshAccessTokenRequester field658;
	@ObfuscatedName("hi")
	Future field661;
	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	Buffer field663;
	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	class7 field653;
	@ObfuscatedName("hz")
	long field662;

	static {
		lockMouseRecorder = true;
		worldId = 1;
		worldProperties = 0;
		gameBuild = 0;
		isMembersWorld = false;
		isLowDetail = false;
		param21 = -1;
		clientType = -1;
		field423 = -1;
		onMobile = false;
		param25 = 214;
		gameState = 0;
		isLoading = true;
		cycle = 0;
		mouseLastLastPressedTimeMillis = -1L;
		lastMouseRecordX = -1;
		lastMouseRecordY = -1;
		lastMouseRecordTime = -1L;
		hadFocus = true;
		rebootTimer = 0;
		hintArrowType = 0;
		hintArrowNpcIndex = 0;
		hintArrowPlayerIndex = 0;
		hintArrowX = 0;
		hintArrowY = 0;
		hintArrowHeight = 0;
		hintArrowSubX = 0;
		hintArrowSubY = 0;
		playerAttackOption = AttackOption.AttackOption_hidden;
		npcAttackOption = AttackOption.AttackOption_hidden;
		renderSelf = false;
		titleLoadingStage = 0;
		js5ConnectState = 0;
		js5Cycles = 0;
		js5Errors = 0;
		loginState = 0;
		field446 = 0;
		field442 = 0;
		field445 = 0;
		field416 = class138.field1302;
		field646 = class505.field4111;
		int var1 = "com_jagex_auth_desktop_osrs:public".length();
		byte[] var2 = new byte[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = "com_jagex_auth_desktop_osrs:public".charAt(var3);
			if (var4 > 127) {
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4;
			}
		}

		String var5 = Archive.method1886(var2, 0, var2.length);
		field651 = var5;
		Login_isUsernameRemembered = false;
		secureRandomFuture = new SecureRandomFuture();
		randomDatData = null;
		npcs = new NPC[65536];
		npcCount = 0;
		npcIndices = new int[65536];
		field447 = 0;
		field552 = new int[250];
		packetWriter = new PacketWriter();
		logoutTimer = 0;
		hadNetworkError = false;
		timer = new Timer();
		fontsMap = new HashMap();
		field451 = 0;
		field450 = 1;
		field455 = 0;
		field454 = 1;
		field453 = 0;
		collisionMaps = new CollisionMap[4];
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		field649 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		field452 = 0;
		field464 = 2301979;
		field463 = 5063219;
		field465 = 3353893;
		field458 = 7759444;
		field379 = false;
		alternativeScrollbarWidth = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		mouseCamClickedX = 0;
		mouseCamClickedY = 0;
		oculusOrbState = 0;
		camFollowHeight = 50;
		field473 = 0;
		field469 = 0;
		field470 = 0;
		oculusOrbNormalSpeed = -1209361491 * 12;
		oculusOrbSlowedSpeed = -412288827 * 6;
		field365 = 0;
		oculusOrbOnLocalPlayer = false;
		packetIndicator = 0;
		emitPackets = false;
		field474 = 0;
		overheadTextCount = 0;
		overheadTextLimit = 50;
		overheadTextXs = new int[overheadTextLimit];
		overheadTextYs = new int[overheadTextLimit];
		overheadTextAscents = new int[overheadTextLimit];
		overheadTextXOffsets = new int[overheadTextLimit];
		overheadTextColors = new int[overheadTextLimit];
		overheadTextEffects = new int[overheadTextLimit];
		field593 = new int[overheadTextLimit][];
		overheadTextCyclesRemaining = new int[overheadTextLimit];
		overheadText = new String[overheadTextLimit];
		tileLastDrawnActor = new int[104][104];
		viewportDrawCount = 0;
		viewportTempX = -1;
		viewportTempY = -1;
		mouseCrossX = 0;
		mouseCrossY = 0;
		mouseCrossState = 0;
		mouseCrossColor = 0;
		showMouseCross = true;
		field488 = 0;
		showLoadingMessages = true;
		players = new Player[2048];
		localPlayerIndex = -1;
		isMembers = 0;
		playerUUID = -1L;
		field384 = true;
		drawPlayerNames = 0;
		field489 = 0;
		field565 = new int[1000];
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
		playerMenuActions = new String[8];
		playerOptionsPriorities = new boolean[8];
		field566 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
		combatTargetPlayerIndex = -1;
		groundItems = new NodeDeque[4][104][104];
		pendingSpawns = new NodeDeque();
		projectiles = new NodeDeque();
		graphicsObjects = new NodeDeque();
		currentLevels = new int[25];
		levels = new int[25];
		experience = new int[25];
		leftClickOpensMenu = false;
		isMenuOpen = false;
		menuOptionsCount = 0;
		menuArguments1 = new int[500];
		menuArguments2 = new int[500];
		menuOpcodes = new int[500];
		menuIdentifiers = new int[500];
		menuItemIds = new int[500];
		menuActions = new String[500];
		menuTargets = new String[500];
		menuShiftClick = new boolean[500];
		followerOpsLowPriority = false;
		tapToDrop = false;
		showMouseOverText = true;
		viewportX = -1;
		viewportY = -1;
		field496 = 0;
		field499 = 50;
		isItemSelected = 0;
		field596 = null;
		isSpellSelected = false;
		selectedSpellChildIndex = -1;
		selectedSpellItemId = -1;
		field597 = null;
		field598 = null;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field506 = 0;
		field510 = -1 * 1647896013;
		chatEffects = 0;
		meslayerContinueWidget = null;
		runEnergy = 0;
		weight = 0;
		staffModLevel = 0;
		followerIndex = -1;
		playerMod = false;
		viewportWidget = null;
		clickedWidget = null;
		clickedWidgetParent = null;
		widgetClickX = 0;
		widgetClickY = 0;
		draggedOnWidget = null;
		field392 = false;
		field500 = -1;
		field504 = -1;
		field391 = false;
		field502 = -1;
		field507 = -1;
		isDraggingWidget = false;
		cycleCntr = 1;
		field572 = new int[32];
		field514 = 0;
		field573 = new int[32];
		field525 = 0;
		field570 = new int[32];
		field519 = 0;
		field571 = new int[32];
		field513 = 0;
		chatCycle = 0;
		field522 = 0;
		field518 = 0;
		field517 = 0;
		field524 = 0;
		field516 = 0;
		field520 = 0;
		field523 = 0;
		mouseWheelRotation = 0;
		field647 = new class518();
		scriptEvents = new NodeDeque();
		field625 = new NodeDeque();
		field626 = new NodeDeque();
		field627 = new NodeDeque();
		widgetFlags = new NodeHashTable(512);
		rootWidgetCount = 0;
		field529 = -2;
		field404 = new boolean[100];
		field405 = new boolean[100];
		field406 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field612 = 0L;
		isResizable = true;
		field579 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		publicChatMode = 0;
		tradeChatMode = 0;
		field599 = "";
		field614 = new long[100];
		field534 = 0;
		keyHandlerInstance = new class211();
		field419 = new class209();
		field533 = 0;
		field578 = new int[128];
		field580 = new int[128];
		field613 = -1L;
		currentClanSettings = new ClanSettings[4];
		currentClanChannels = new ClanChannel[4];
		field532 = -1;
		mapIconCount = 0;
		mapIconXs = new int[1000];
		mapIconYs = new int[1000];
		mapIcons = new SpritePixels[1000];
		destinationX = 0;
		destinationY = 0;
		minimapState = 0;
		currentTrackGroupId = -1;
		playingJingle = false;
		soundEffectCount = 0;
		soundEffectIds = new int[50];
		queuedSoundEffectLoops = new int[50];
		queuedSoundEffectDelays = new int[50];
		soundLocations = new int[50];
		soundEffects = new SoundEffect[50];
		isCameraLocked = false;
		field397 = false;
		field401 = false;
		field400 = false;
		field631 = null;
		field634 = null;
		field633 = null;
		field399 = false;
		field407 = new boolean[5];
		field588 = new int[5];
		field590 = new int[5];
		field589 = new int[5];
		field587 = new int[5];
		field638 = 256;
		field642 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field641 = 1;
		field640 = 32767;
		field644 = 1;
		field637 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		playerAppearance = new PlayerComposition();
		field542 = -1;
		field545 = -1;
		platformInfoProvider = new DesktopPlatformInfoProvider();
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		archive5 = new class411(8, class409.field3702);
		Widget_cachedModels = new EvictingDualNodeHashTable(64);
		Widget_cachedFonts = new EvictingDualNodeHashTable(64);
		field548 = -1;
		field366 = -1;
		field606 = new ArrayList();
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field550 = 0;
		field648 = new ApproximateRouteStrategy();
		field591 = new int[50];
		field592 = new int[50];
	}

	public Client() {
		super();
		this.field656 = false;
		this.field662 = -1L;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "57"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field612 = BoundaryObject.clockNow() + 500L;
		this.resizeJS();
		if (rootInterface != -1) {
			this.resizeRoot(true);
		}

	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "44"
	)
	@Export("setUp")
	protected final void setUp() {
		class168.method867(new int[]{20, 260, 10000}, new int[]{1000, 100, 500});
		PcmPlayer.worldPort = gameBuild == 0 ? 43594 : worldId + 40000;
		SecureRandomFuture.js5Port = gameBuild == 0 ? 443 : worldId + 50000;
		UserComparator8.currentPort = PcmPlayer.worldPort;
		WorldMapSection1.field2435 = class328.field2897;
		class13.field37 = class328.field2899;
		GrandExchangeEvent.field3533 = class328.field2898;
		class209.field1850 = class328.field2900;
		class47.urlRequester = new class112(this.field656, 214);
		this.setUpKeyboard();
		this.method130();
		SpriteMask.mouseWheel = this.mouseWheel();
		this.method129(field419, 0);
		this.method129(keyHandlerInstance, 1);
		ClanChannelMember.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		AccessFile var2 = null;
		ClientPreferences var3 = new ClientPreferences();

		try {
			var2 = FontName.getPreferencesFile("", GameBuild.field3110.name, false);
			byte[] var4 = new byte[(int)var2.length()];

			int var6;
			for (int var5 = 0; var5 < var4.length; var5 += var6) {
				var6 = var2.read(var4, var5, var4.length - var5);
				if (var6 == -1) {
					throw new IOException();
				}
			}

			var3 = new ClientPreferences(new Buffer(var4));
		} catch (Exception var8) {
		}

		try {
			if (var2 != null) {
				var2.close();
			}
		} catch (Exception var7) {
		}

		class10.clientPreferences = var3;
		this.setUpClipboard();
		class323.method1710(this, class136.field1276);
		HealthBar.setWindowedMode(class10.clientPreferences.method546());
		ApproximateRouteStrategy.friendSystem = new FriendSystem(WorldMapScaleHandler.loginType);
		this.field652 = new class14("tokenRequest", 1, 1);
		if (!class304.field2748.contains(this)) {
			class304.field2748.add(this);
		}

		class135.field1275 = new class215[1];
		class213 var9 = class213.field1879;
		class135.field1275[0] = new class215(var9.field1889, var9.field1890);
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "43"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle;
		this.doCycleJs5();

		while (true) {
			ArchiveDiskAction var1;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
				var1 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast();
			}

			if (var1 == null) {
				int var5;
				try {
					label94: {
						if (class304.musicPlayerStatus == 1) {
							var5 = class304.midiPcmStream.method1625();
							if (var5 > 0 && class304.midiPcmStream.isReady()) {
								var5 -= class157.pcmSampleLength;
								if (var5 < 0) {
									var5 = 0;
								}

								class304.midiPcmStream.setPcmStreamVolume(var5);
								break label94;
							}

							class304.midiPcmStream.clear();
							class304.midiPcmStream.removeAll();
							class304.midiPcmStream.field2784.clear();
							if (UserComparator9.musicTrackArchive != null) {
								class304.musicPlayerStatus = 2;
							} else {
								class304.musicPlayerStatus = 0;
							}

							class237.musicTrack = null;
							class304.soundCache = null;
						}

						if (class304.field2740 > -1 && !class304.midiPcmStream.isReady()) {
							class409.method2135(class304.field2740, class304.field2742);
							class304.field2740 = -1;
							class304.field2742 = -1;
						}
					}
				} catch (Exception var8) {
					var8.printStackTrace();
					class304.midiPcmStream.clear();
					class304.musicPlayerStatus = 0;
					class237.musicTrack = null;
					class304.soundCache = null;
					UserComparator9.musicTrackArchive = null;
				}

				WorldMapSectionType.playPcmPlayers();
				keyHandlerInstance.method1103();
				this.method128();
				synchronized(MouseHandler.MouseHandler_instance) {
					MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile;
					MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile * 122488041;
					MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile * 448648939;
					MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile;
					MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile;
					MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile;
					MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile;
					MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile;
					MouseHandler.MouseHandler_lastButtonVolatile = 0;
				}

				if (SpriteMask.mouseWheel != null) {
					var5 = SpriteMask.mouseWheel.useRotation();
					mouseWheelRotation = var5;
				}

				if (gameState == 0) {
					class136.load();
					class125.method676();
				} else if (gameState == 5) {
					class445.method2292(this, MouseHandler.fontPlain11, class404.fontPlain12);
					class136.load();
					class125.method676();
				} else if (gameState != 10 && gameState != 11) {
					if (gameState == 20) {
						class445.method2292(this, MouseHandler.fontPlain11, class404.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState == 50) {
						class445.method2292(this, MouseHandler.fontPlain11, class404.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState == 25) {
						MouseHandler.method160();
					}
				} else {
					class445.method2292(this, MouseHandler.fontPlain11, class404.fontPlain12);
				}

				if (gameState == 30) {
					this.doCycleLoggedIn();
				} else if (gameState == 40 || gameState == 45) {
					this.doCycleLoggedOut();
				}

				return;
			}

			var1.archive.load(var1.archiveDisk, (int)var1.key, var1.data, false);
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-146179282"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2 = WorldMapSection2.method1415();
		if (var2 && playingJingle && MouseRecorder.pcmPlayer0 != null) {
			MouseRecorder.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && field612 != 0L && BoundaryObject.clockNow() > field612) {
			HealthBar.setWindowedMode(class237.getWindowedMode());
		}

		int var3;
		if (var1) {
			for (var3 = 0; var3 < 100; ++var3) {
				field404[var3] = true;
			}
		}

		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) {
			InvDefinition.drawTitle(class166.fontBold12, MouseHandler.fontPlain11, class404.fontPlain12);
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				InvDefinition.drawTitle(class166.fontBold12, MouseHandler.fontPlain11, class404.fontPlain12);
			} else if (gameState == 50) {
				InvDefinition.drawTitle(class166.fontBold12, MouseHandler.fontPlain11, class404.fontPlain12);
			} else if (gameState == 25) {
				if (field453 == 1) {
					if (field451 > field450) {
						field450 = field451;
					}

					var3 = (field450 * 50 - field451 * 50) / field450;
					AABB.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false);
				} else if (field453 == 2) {
					if (field455 > field454) {
						field454 = field455;
					}

					var3 = (field454 * 50 - field455 * 50) / field454 + 50;
					AABB.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false);
				} else {
					AABB.drawLoadingMessage("Loading - please wait.", false);
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				AABB.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) {
				AABB.drawLoadingMessage("Please wait...", false);
			}
		} else {
			InvDefinition.drawTitle(class166.fontBold12, MouseHandler.fontPlain11, class404.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
			for (var3 = 0; var3 < rootWidgetCount; ++var3) {
				if (field405[var3]) {
					WorldMapSectionType.rasterProvider.draw(rootWidgetXs[var3], rootWidgetYs[var3], rootWidgetWidths[var3], rootWidgetHeights[var3]);
					field405[var3] = false;
				}
			}
		} else if (gameState > 0) {
			WorldMapSectionType.rasterProvider.drawFull(0, 0);

			for (var3 = 0; var3 < rootWidgetCount; ++var3) {
				field405[var3] = false;
			}
		}

	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "279913198"
	)
	@Export("kill0")
	protected final void kill0() {
		if (MouseHandler.varcs.hasUnwrittenChanges()) {
			MouseHandler.varcs.write();
		}

		if (class85.mouseRecorder != null) {
			class85.mouseRecorder.isRunning = false;
		}

		class85.mouseRecorder = null;
		packetWriter.close();
		class155.method814();
		SpriteMask.mouseWheel = null;
		if (MouseRecorder.pcmPlayer0 != null) {
			MouseRecorder.pcmPlayer0.shutdown();
		}

		if (class290.pcmPlayer1 != null) {
			class290.pcmPlayer1.shutdown();
		}

		if (NetCache.NetCache_socket != null) {
			NetCache.NetCache_socket.close();
		}

		NPCComposition.method970();
		if (class47.urlRequester != null) {
			class47.urlRequester.close();
			class47.urlRequester = null;
		}

		try {
			JagexCache.JagexCache_dat2File.close();

			for (int var1 = 0; var1 < JagexCache.idxCount; ++var1) {
				WorldMapSection0.JagexCache_idxFiles[var1].close();
			}

			JagexCache.JagexCache_idx255File.close();
			JagexCache.JagexCache_randomDat.close();
		} catch (Exception var3) {
		}

		this.field652.method50();
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-6"
	)
	protected final void vmethod1485() {
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-100"
	)
	boolean method347() {
		return PcmPlayer.field182 != null && !PcmPlayer.field182.trim().isEmpty() && class4.field4 != null && !class4.field4.trim().isEmpty();
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "8"
	)
	boolean method348() {
		return WorldMapDecorationType.field3082 != null && !WorldMapDecorationType.field3082.trim().isEmpty() && Ignored.field3748 != null && !Ignored.field3748.trim().isEmpty();
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "355053416"
	)
	boolean method349() {
		return this.field657 != null;
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-511119349"
	)
	void method350(String var1) throws IOException {
		HashMap var2 = new HashMap();
		var2.put("grant_type", "refresh_token");
		var2.put("scope", "gamesso.token.create");
		var2.put("refresh_token", var1);
		URL var3 = new URL(MusicPatchNode2.field2728 + "shield/oauth/token" + (new class451(var2)).method2305());
		class407 var4 = new class407();
		var4.method2125(field651);
		var4.method2122("Host", (new URL(MusicPatchNode2.field2728)).getHost());
		var4.method2129(class448.field3839);
		class9 var5 = class9.field17;
		RefreshAccessTokenRequester var6 = this.field658;
		if (var6 != null) {
			this.field661 = var6.request(var5.method28(), var3, var4.method2121(), "");
		} else {
			class10 var7 = new class10(var3, var5, var4, this.field656);
			this.field655 = this.field652.method49(var7);
		}
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "-8429"
	)
	void method351(String var1) throws IOException {
		URL var2 = new URL(MusicPatchNode2.field2728 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
		class407 var3 = new class407();
		var3.method2126(var1);
		class9 var4 = class9.field16;
		OtlTokenRequester var5 = this.field657;
		if (var5 != null) {
			this.field660 = var5.request(var4.method28(), var2, var3.method2121(), "");
		} else {
			class10 var6 = new class10(var2, var4, var3, this.field656);
			this.field654 = this.field652.method49(var6);
		}
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1224122403"
	)
	void method352(String var1, String var2) throws IOException, JSONException {
		URL var3 = new URL(MusicPatchNode2.field2728 + "/game-session/v1/tokens");
		class10 var4 = new class10(var3, class9.field17, this.field656);
		var4.method34().method2126(var1);
		var4.method34().method2129(class448.field3839);
		JSONObject var5 = new JSONObject();
		var5.method2665("accountId", var2);
		var4.method35(new class450(var5));
		this.field654 = this.field652.method49(var4);
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1979643134"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			long var2 = BoundaryObject.clockNow();
			int var4 = (int)(var2 - class19.field56);
			class19.field56 = var2;
			if (var4 > 200) {
				var4 = 200;
			}

			NetCache.NetCache_loadTime += var4;
			boolean var1;
			if (NetCache.NetCache_pendingResponsesCount == 0 && NetCache.NetCache_pendingPriorityResponsesCount == 0 && NetCache.NetCache_pendingWritesCount == 0 && NetCache.NetCache_pendingPriorityWritesCount == 0) {
				var1 = true;
			} else if (NetCache.NetCache_socket == null) {
				var1 = false;
			} else {
				try {
					label209: {
						if (NetCache.NetCache_loadTime > 30000) {
							throw new IOException();
						}

						NetFileRequest var5;
						Buffer var6;
						while (NetCache.NetCache_pendingPriorityResponsesCount < 200 && NetCache.NetCache_pendingPriorityWritesCount > 0) {
							var5 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.first();
							var6 = new Buffer(4);
							var6.writeByte(1);
							var6.writeMedium((int)var5.key);
							NetCache.NetCache_socket.write(var6.array, 0, 4);
							NetCache.NetCache_pendingPriorityResponses.put(var5, var5.key);
							--NetCache.NetCache_pendingPriorityWritesCount;
							++NetCache.NetCache_pendingPriorityResponsesCount;
						}

						while (NetCache.NetCache_pendingResponsesCount < 200 && NetCache.NetCache_pendingWritesCount > 0) {
							var5 = (NetFileRequest)NetCache.NetCache_pendingWritesQueue.removeLast();
							var6 = new Buffer(4);
							var6.writeByte(0);
							var6.writeMedium((int)var5.key);
							NetCache.NetCache_socket.write(var6.array, 0, 4);
							var5.removeDual();
							NetCache.NetCache_pendingResponses.put(var5, var5.key);
							--NetCache.NetCache_pendingWritesCount;
							++NetCache.NetCache_pendingResponsesCount;
						}

						for (int var17 = 0; var17 < 100; ++var17) {
							int var18 = NetCache.NetCache_socket.available();
							if (var18 < 0) {
								throw new IOException();
							}

							if (var18 == 0) {
								break;
							}

							NetCache.NetCache_loadTime = 0;
							byte var7 = 0;
							if (ApproximateRouteStrategy.NetCache_currentResponse == null) {
								var7 = 8;
							} else if (NetCache.field3514 == 0) {
								var7 = 1;
							}

							int var8;
							int var9;
							int var10;
							byte[] var10000;
							int var10001;
							Buffer var24;
							if (var7 > 0) {
								var8 = var7 - NetCache.NetCache_responseHeaderBuffer.offset;
								if (var8 > var18) {
									var8 = var18;
								}

								NetCache.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array, NetCache.NetCache_responseHeaderBuffer.offset, var8);
								if (NetCache.field3507 != 0) {
									for (var9 = 0; var9 < var8; ++var9) {
										var10000 = NetCache.NetCache_responseHeaderBuffer.array;
										var10001 = var9 + NetCache.NetCache_responseHeaderBuffer.offset;
										var10000[var10001] ^= NetCache.field3507;
									}
								}

								var24 = NetCache.NetCache_responseHeaderBuffer;
								var24.offset += var8;
								if (NetCache.NetCache_responseHeaderBuffer.offset < var7) {
									break;
								}

								if (ApproximateRouteStrategy.NetCache_currentResponse == null) {
									NetCache.NetCache_responseHeaderBuffer.offset = 0;
									var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
									var10 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort();
									int var11 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
									int var12 = NetCache.NetCache_responseHeaderBuffer.readInt();
									long var13 = (long)(var10 + (var9 << 16));
									NetFileRequest var15 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var13);
									class464.field3893 = true;
									if (var15 == null) {
										var15 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var13);
										class464.field3893 = false;
									}

									if (var15 == null) {
										throw new IOException();
									}

									int var16 = var11 == 0 ? 5 : 9;
									ApproximateRouteStrategy.NetCache_currentResponse = var15;
									ModeWhere.NetCache_responseArchiveBuffer = new Buffer(var12 + var16 + ApproximateRouteStrategy.NetCache_currentResponse.padding);
									ModeWhere.NetCache_responseArchiveBuffer.writeByte(var11);
									ModeWhere.NetCache_responseArchiveBuffer.writeInt(var12);
									NetCache.field3514 = 8;
									NetCache.NetCache_responseHeaderBuffer.offset = 0;
								} else if (NetCache.field3514 == 0) {
									if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) {
										NetCache.field3514 = 1;
										NetCache.NetCache_responseHeaderBuffer.offset = 0;
									} else {
										ApproximateRouteStrategy.NetCache_currentResponse = null;
									}
								}
							} else {
								var8 = ModeWhere.NetCache_responseArchiveBuffer.array.length - ApproximateRouteStrategy.NetCache_currentResponse.padding;
								var9 = 512 - NetCache.field3514;
								if (var9 > var8 - ModeWhere.NetCache_responseArchiveBuffer.offset) {
									var9 = var8 - ModeWhere.NetCache_responseArchiveBuffer.offset;
								}

								if (var9 > var18) {
									var9 = var18;
								}

								NetCache.NetCache_socket.read(ModeWhere.NetCache_responseArchiveBuffer.array, ModeWhere.NetCache_responseArchiveBuffer.offset, var9);
								if (NetCache.field3507 != 0) {
									for (var10 = 0; var10 < var9; ++var10) {
										var10000 = ModeWhere.NetCache_responseArchiveBuffer.array;
										var10001 = ModeWhere.NetCache_responseArchiveBuffer.offset + var10;
										var10000[var10001] ^= NetCache.field3507;
									}
								}

								var24 = ModeWhere.NetCache_responseArchiveBuffer;
								var24.offset += var9;
								NetCache.field3514 += var9;
								if (var8 == ModeWhere.NetCache_responseArchiveBuffer.offset) {
									if (ApproximateRouteStrategy.NetCache_currentResponse.key == 16711935L) {
										class411.field3706 = ModeWhere.NetCache_responseArchiveBuffer;

										for (var10 = 0; var10 < 256; ++var10) {
											Archive var19 = NetCache.NetCache_archives[var10];
											if (var19 != null) {
												Fonts.method2397(var19, var10);
											}
										}
									} else {
										NetCache.NetCache_crc.reset();
										NetCache.NetCache_crc.update(ModeWhere.NetCache_responseArchiveBuffer.array, 0, var8);
										var10 = (int)NetCache.NetCache_crc.getValue();
										if (var10 != ApproximateRouteStrategy.NetCache_currentResponse.crc) {
											try {
												NetCache.NetCache_socket.close();
											} catch (Exception var22) {
											}

											++NetCache.NetCache_crcMismatches;
											NetCache.NetCache_socket = null;
											NetCache.field3507 = (byte)((int)(Math.random() * 255.0D + 1.0D));
											var1 = false;
											break label209;
										}

										NetCache.NetCache_crcMismatches = 0;
										NetCache.NetCache_ioExceptions = 0;
										ApproximateRouteStrategy.NetCache_currentResponse.archive.write((int)(ApproximateRouteStrategy.NetCache_currentResponse.key & 65535L), ModeWhere.NetCache_responseArchiveBuffer.array, 16711680L == (ApproximateRouteStrategy.NetCache_currentResponse.key & 16711680L), class464.field3893);
									}

									ApproximateRouteStrategy.NetCache_currentResponse.remove();
									if (class464.field3893) {
										--NetCache.NetCache_pendingPriorityResponsesCount;
									} else {
										--NetCache.NetCache_pendingResponsesCount;
									}

									NetCache.field3514 = 0;
									ApproximateRouteStrategy.NetCache_currentResponse = null;
									ModeWhere.NetCache_responseArchiveBuffer = null;
								} else {
									if (NetCache.field3514 != 512) {
										break;
									}

									NetCache.field3514 = 0;
								}
							}
						}

						var1 = true;
					}
				} catch (IOException var23) {
					try {
						NetCache.NetCache_socket.close();
					} catch (Exception var21) {
					}

					++NetCache.NetCache_ioExceptions;
					NetCache.NetCache_socket = null;
					var1 = false;
				}
			}

			if (!var1) {
				this.doCycleJs5Connect();
			}

		}
	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1830302081"
	)
	@Export("doCycleJs5Connect")
	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) {
			this.error("js5crc");
			UserComparator8.updateGameState(1000);
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) {
				if (gameState <= 5) {
					this.error("js5io");
					UserComparator8.updateGameState(1000);
					return;
				}

				js5Cycles = 3000;
				NetCache.NetCache_ioExceptions = 3;
			}

			if (--js5Cycles + 1 <= 0) {
				try {
					if (js5ConnectState == 0) {
						class19.js5SocketTask = GameEngine.taskHandler.newSocketTask(class17.worldHost, UserComparator8.currentPort);
						++js5ConnectState;
					}

					if (js5ConnectState == 1) {
						if (class19.js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}

						if (class19.js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) {
						class217.js5Socket = ItemLayer.method1150((Socket)class19.js5SocketTask.result, 40000, 5000);
						Buffer var1 = new Buffer(5);
						var1.writeByte(15);
						var1.writeInt(214);
						class217.js5Socket.write(var1.array, 0, 5);
						++js5ConnectState;
						class183.field1475 = BoundaryObject.clockNow();
					}

					if (js5ConnectState == 3) {
						if (class217.js5Socket.available() > 0) {
							int var2 = class217.js5Socket.readUnsignedByte();
							if (var2 != 0) {
								this.js5Error(var2);
								return;
							}

							++js5ConnectState;
						} else if (BoundaryObject.clockNow() - class183.field1475 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState == 4) {
						AbstractByteArrayCopier.method1857(class217.js5Socket, gameState > 20);
						class19.js5SocketTask = null;
						class217.js5Socket = null;
						js5ConnectState = 0;
						js5Errors = 0;
					}
				} catch (IOException var3) {
					this.js5Error(-3);
				}

			}
		}
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1709575519"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		class19.js5SocketTask = null;
		class217.js5Socket = null;
		js5ConnectState = 0;
		if (UserComparator8.currentPort == PcmPlayer.worldPort) {
			UserComparator8.currentPort = SecureRandomFuture.js5Port;
		} else {
			UserComparator8.currentPort = PcmPlayer.worldPort;
		}

		++js5Errors;
		if (js5Errors < 2 || var1 != 7 && var1 != 9) {
			if (js5Errors >= 2 && var1 == 6) {
				this.error("js5connect_outofdate");
				UserComparator8.updateGameState(1000);
			} else if (js5Errors >= 4) {
				if (gameState <= 5) {
					this.error("js5connect");
					UserComparator8.updateGameState(1000);
				} else {
					js5Cycles = 3000;
				}
			}
		} else if (gameState <= 5) {
			this.error("js5connect_full");
			UserComparator8.updateGameState(1000);
		} else {
			js5Cycles = 3000;
		}

	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1145642874"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		AbstractSocket var1 = packetWriter.getSocket();
		PacketBuffer var2 = packetWriter.packetBuffer;

		try {
			if (loginState == 0) {
				if (class137.field1287 == null && (secureRandomFuture.isDone() || field446 > 250)) {
					class137.field1287 = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (class137.field1287 != null) {
					if (var1 != null) {
						var1.close();
						var1 = null;
					}

					Interpreter.field699 = null;
					hadNetworkError = false;
					field446 = 0;
					if (field646.method2572()) {
						if (this.method347()) {
							try {
								this.method350(class4.field4);
								class347.method1874(21);
							} catch (Throwable var25) {
								class260.RunException_sendStackTrace((String)null, var25);
								WorldMapSprite.getLoginError(65);
								return;
							}
						} else {
							if (!this.method348()) {
								WorldMapSprite.getLoginError(65);
								return;
							}

							try {
								this.method352(WorldMapDecorationType.field3082, Ignored.field3748);
								class347.method1874(20);
							} catch (Exception var24) {
								class260.RunException_sendStackTrace((String)null, var24);
								WorldMapSprite.getLoginError(65);
								return;
							}
						}
					} else {
						class347.method1874(1);
					}
				}
			}

			class20 var27;
			if (loginState == 21) {
				if (this.field661 != null) {
					if (!this.field661.isDone()) {
						return;
					}

					if (this.field661.isCancelled()) {
						WorldMapSprite.getLoginError(65);
						this.field661 = null;
						return;
					}

					try {
						RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.field661.get();
						if (!var3.isSuccess()) {
							WorldMapSprite.getLoginError(65);
							this.field661 = null;
							return;
						}

						PcmPlayer.field182 = var3.getAccessToken();
						class4.field4 = var3.getRefreshToken();
						this.field661 = null;
					} catch (Exception var23) {
						class260.RunException_sendStackTrace((String)null, var23);
						WorldMapSprite.getLoginError(65);
						this.field661 = null;
						return;
					}
				} else {
					if (this.field655 == null) {
						WorldMapSprite.getLoginError(65);
						return;
					}

					if (!this.field655.method63()) {
						return;
					}

					if (this.field655.method62()) {
						class260.RunException_sendStackTrace(this.field655.method61(), (Throwable)null);
						WorldMapSprite.getLoginError(65);
						this.field655 = null;
						return;
					}

					var27 = this.field655.method64();
					if (var27.method66() != 200) {
						WorldMapSprite.getLoginError(65);
						this.field655 = null;
						return;
					}

					field446 = 0;
					class450 var4 = new class450(var27.method68());

					try {
						PcmPlayer.field182 = var4.method2301().getString("access_token");
						class4.field4 = var4.method2301().getString("refresh_token");
					} catch (Exception var22) {
						class260.RunException_sendStackTrace("Error parsing tokens", var22);
						WorldMapSprite.getLoginError(65);
						this.field655 = null;
						return;
					}
				}

				this.method351(PcmPlayer.field182);
				class347.method1874(20);
			}

			if (loginState == 20) {
				if (this.field660 != null) {
					if (!this.field660.isDone()) {
						return;
					}

					if (this.field660.isCancelled()) {
						WorldMapSprite.getLoginError(65);
						this.field660 = null;
						return;
					}

					try {
						OtlTokenResponse var28 = (OtlTokenResponse)this.field660.get();
						if (!var28.isSuccess()) {
							WorldMapSprite.getLoginError(65);
							this.field660 = null;
							return;
						}

						this.field659 = var28.getToken();
						this.field660 = null;
					} catch (Exception var21) {
						class260.RunException_sendStackTrace((String)null, var21);
						WorldMapSprite.getLoginError(65);
						this.field660 = null;
						return;
					}
				} else {
					if (this.field654 == null) {
						WorldMapSprite.getLoginError(65);
						return;
					}

					if (!this.field654.method63()) {
						return;
					}

					if (this.field654.method62()) {
						class260.RunException_sendStackTrace(this.field654.method61(), (Throwable)null);
						WorldMapSprite.getLoginError(65);
						this.field654 = null;
						return;
					}

					var27 = this.field654.method64();
					if (var27.method66() != 200) {
						class260.RunException_sendStackTrace("Response code: " + var27.method66() + "Response body: " + var27.method68(), (Throwable)null);
						WorldMapSprite.getLoginError(65);
						this.field654 = null;
						return;
					}

					List var30 = (List)var27.method67().get("Content-Type");
					if (var30 != null && var30.contains(class448.field3839.method2294())) {
						try {
							JSONObject var5 = new JSONObject(var27.method68());
							this.field659 = var5.getString("token");
						} catch (JSONException var20) {
							class260.RunException_sendStackTrace((String)null, var20);
							WorldMapSprite.getLoginError(65);
							this.field654 = null;
							return;
						}
					} else {
						this.field659 = var27.method68();
					}

					this.field654 = null;
				}

				field446 = 0;
				class347.method1874(1);
			}

			if (loginState == 1) {
				if (Interpreter.field699 == null) {
					Interpreter.field699 = GameEngine.taskHandler.newSocketTask(class17.worldHost, UserComparator8.currentPort);
				}

				if (Interpreter.field699.status == 2) {
					throw new IOException();
				}

				if (Interpreter.field699.status == 1) {
					var1 = ItemLayer.method1150((Socket)Interpreter.field699.result, 40000, 5000);
					packetWriter.setSocket(var1);
					Interpreter.field699 = null;
					class347.method1874(2);
				}
			}

			PacketBufferNode var29;
			if (loginState == 2) {
				packetWriter.clearBuffer();
				var29 = EnumComposition.method961();
				var29.packetBuffer.writeByte(LoginPacket.field2716.field_61);
				packetWriter.addNode(var29);
				packetWriter.flush();
				var2.offset = 0;
				class347.method1874(3);
			}

			int var13;
			if (loginState == 3) {
				if (MouseRecorder.pcmPlayer0 != null) {
					MouseRecorder.pcmPlayer0.method190();
				}

				if (class290.pcmPlayer1 != null) {
					class290.pcmPlayer1.method190();
				}

				if (var1.isAvailable(1)) {
					var13 = var1.readUnsignedByte();
					if (MouseRecorder.pcmPlayer0 != null) {
						MouseRecorder.pcmPlayer0.method190();
					}

					if (class290.pcmPlayer1 != null) {
						class290.pcmPlayer1.method190();
					}

					if (var13 != 0) {
						WorldMapSprite.getLoginError(var13);
						return;
					}

					var2.offset = 0;
					class347.method1874(4);
				}
			}

			if (loginState == 4) {
				if (var2.offset < 8) {
					var13 = var1.available();
					if (var13 > 8 - var2.offset) {
						var13 = 8 - var2.offset;
					}

					if (var13 > 0) {
						var1.read(var2.array, var2.offset, var13);
						var2.offset += var13;
					}
				}

				if (var2.offset == 8) {
					var2.offset = 0;
					MusicPatchNode.field2814 = var2.readLong();
					class347.method1874(5);
				}
			}

			int var6;
			if (loginState == 5) {
				packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var31 = new PacketBuffer(500);
				int[] var32 = new int[]{class137.field1287.nextInt(), class137.field1287.nextInt(), class137.field1287.nextInt(), class137.field1287.nextInt()};
				var31.offset = 0;
				var31.writeByte(1);
				var31.writeInt(var32[0]);
				var31.writeInt(var32[1]);
				var31.writeInt(var32[2]);
				var31.writeInt(var32[3]);
				var31.writeLong(MusicPatchNode.field2814);
				if (gameState == 40) {
					var31.writeInt(FloorOverlayDefinition.field1796[0]);
					var31.writeInt(FloorOverlayDefinition.field1796[1]);
					var31.writeInt(FloorOverlayDefinition.field1796[2]);
					var31.writeInt(FloorOverlayDefinition.field1796[3]);
				} else {
					if (gameState == 50) {
						var31.writeByte(class138.field1303.rsOrdinal());
						var31.writeInt(GameObject.field2281);
					} else {
						var31.writeByte(field416.rsOrdinal());
						switch(field416.field1305) {
						case 0:
						case 4:
							var31.writeMedium(class322.field2850);
							++var31.offset;
							break;
						case 1:
							var31.writeInt(class10.clientPreferences.method549(Login.Login_username));
							break;
						case 2:
							var31.offset += 4;
						case 3:
						}
					}

					if (field646.method2572()) {
						var31.writeByte(class505.field4110.rsOrdinal());
						var31.writeStringCp1252NullTerminated(this.field659);
					} else {
						var31.writeByte(class505.field4111.rsOrdinal());
						var31.writeStringCp1252NullTerminated(Login.Login_password);
					}
				}

				var31.encryptRsa(class74.field741, class74.field740);
				FloorOverlayDefinition.field1796 = var32;
				PacketBufferNode var35 = EnumComposition.method961();
				var35.packetBuffer.offset = 0;
				if (gameState == 40) {
					var35.packetBuffer.writeByte(LoginPacket.RECONNECT_LOGIN_CONNECTION.field_61);
				} else {
					var35.packetBuffer.writeByte(LoginPacket.NEW_LOGIN_CONNECTION.field_61);
				}

				var35.packetBuffer.writeShort(0);
				var6 = var35.packetBuffer.offset;
				var35.packetBuffer.writeInt(214);
				var35.packetBuffer.writeInt(1);
				var35.packetBuffer.writeByte(clientType);
				var35.packetBuffer.writeByte(field423);
				byte var7 = 0;
				var35.packetBuffer.writeByte(var7);
				var35.packetBuffer.writeBytes(var31.array, 0, var31.offset);
				int var8 = var35.packetBuffer.offset;
				var35.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var35.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var35.packetBuffer.writeShort(class448.canvasWidth);
				var35.packetBuffer.writeShort(class270.canvasHeight);
				PacketBuffer var9 = var35.packetBuffer;
				if (randomDatData != null) {
					var9.writeBytes(randomDatData, 0, randomDatData.length);
				} else {
					byte[] var10 = WorldMapCacheName.method1555();
					var9.writeBytes(var10, 0, var10.length);
				}

				var35.packetBuffer.writeStringCp1252NullTerminated(class443.param9);
				var35.packetBuffer.writeInt(class156.field1380);
				if (param25 > 213) {
					var35.packetBuffer.writeByte(0);
				}

				Buffer var43 = new Buffer(ChatChannel.platformInfo.size());
				ChatChannel.platformInfo.write(var43);
				var35.packetBuffer.writeBytes(var43.array, 0, var43.array.length);
				var35.packetBuffer.writeByte(clientType);
				var35.packetBuffer.writeInt(0);
				var35.packetBuffer.writeInt(Language.archive17.hash);
				var35.packetBuffer.writeShortAdd(class180.archive8.hash);
				var35.packetBuffer.method2552(0);
				var35.packetBuffer.writeInt(ViewportMouse.field2233.hash);
				var35.packetBuffer.writeIntLE(class291.archive20.hash);
				var35.packetBuffer.writeInt(class17.archive15.hash);
				var35.packetBuffer.writeInt(class53.archive10.hash);
				var35.packetBuffer.writeShortAdd(BuddyRankComparator.archive4.hash);
				var35.packetBuffer.method2552(Language.field3561.hash);
				var35.packetBuffer.writeShortAdd(class350.archive18.hash);
				var35.packetBuffer.writeInt(MouseRecorder.archive2.hash);
				var35.packetBuffer.writeInt(class466.field3907.hash);
				var35.packetBuffer.writeIntLE(class310.archive13.hash);
				var35.packetBuffer.writeShortAdd(Actor.archive7.hash);
				var35.packetBuffer.writeInt(ReflectionCheck.archive6.hash);
				var35.packetBuffer.writeShortAdd(class33.archive12.hash);
				var35.packetBuffer.writeIntLE(FontName.archive11.hash);
				var35.packetBuffer.writeInt(GrandExchangeOffer.archive14.hash);
				var35.packetBuffer.writeShortAdd(ChatChannel.archive19.hash);
				var35.packetBuffer.method2552(LoginScreenAnimation.field1022.hash);
				var35.packetBuffer.writeShortAdd(class305.archive9.hash);
				var35.packetBuffer.xteaEncrypt(var32, var8, var35.packetBuffer.offset);
				var35.packetBuffer.writeLengthShort(var35.packetBuffer.offset - var6);
				packetWriter.addNode(var35);
				packetWriter.flush();
				packetWriter.isaacCipher = new IsaacCipher(var32);
				int[] var11 = new int[4];

				for (int var12 = 0; var12 < 4; ++var12) {
					var11[var12] = var32[var12] + 50;
				}

				var2.newIsaacCipher(var11);
				class347.method1874(6);
			}

			int var14;
			if (loginState == 6 && var1.available() > 0) {
				var13 = var1.readUnsignedByte();
				if (var13 == 61) {
					var14 = var1.available();
					class112.field1150 = var14 == 1 && var1.readUnsignedByte() == 1;
					class347.method1874(5);
				}

				if (var13 == 21 && gameState == 20) {
					class347.method1874(12);
				} else if (var13 == 2) {
					class347.method1874(14);
				} else if (var13 == 15 && gameState == 40) {
					packetWriter.serverPacketLength = -1;
					class347.method1874(19);
				} else if (var13 == 64) {
					class347.method1874(10);
				} else if (var13 == 23 && field442 < 1) {
					++field442;
					class347.method1874(0);
				} else if (var13 == 29) {
					class347.method1874(17);
				} else {
					if (var13 != 69) {
						WorldMapSprite.getLoginError(var13);
						return;
					}

					class347.method1874(7);
				}
			}

			if (loginState == 7 && var1.available() >= 2) {
				var1.read(var2.array, 0, 2);
				var2.offset = 0;
				class134.field1272 = var2.readUnsignedShort();
				class347.method1874(8);
			}

			if (loginState == 8 && var1.available() >= class134.field1272) {
				var2.offset = 0;
				var1.read(var2.array, var2.offset, class134.field1272);
				class6[] var33 = new class6[]{class6.field6};
				class6 var34 = var33[var2.readUnsignedByte()];

				try {
					switch(var34.field8) {
					case 0:
						class0 var37 = new class0();
						this.field653 = new class7(var2, var37);
						class347.method1874(9);
						break;
					default:
						throw new IllegalArgumentException();
					}
				} catch (Exception var19) {
					WorldMapSprite.getLoginError(22);
					return;
				}
			}

			if (loginState == 9 && this.field653.method17()) {
				this.field663 = this.field653.method19();
				this.field653.method18();
				this.field653 = null;
				if (this.field663 == null) {
					WorldMapSprite.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				var29 = EnumComposition.method961();
				var29.packetBuffer.writeByte(LoginPacket.field2718.field_61);
				var29.packetBuffer.writeShort(this.field663.offset);
				var29.packetBuffer.method2493(this.field663);
				packetWriter.addNode(var29);
				packetWriter.flush();
				this.field663 = null;
				class347.method1874(6);
			}

			if (loginState == 10 && var1.available() > 0) {
				Varcs.field1119 = var1.readUnsignedByte();
				class347.method1874(11);
			}

			if (loginState == 11 && var1.available() >= Varcs.field1119) {
				var1.read(var2.array, 0, Varcs.field1119);
				var2.offset = 0;
				class347.method1874(6);
			}

			if (loginState == 12 && var1.available() > 0) {
				field445 = (var1.readUnsignedByte() + 3) * 60;
				class347.method1874(13);
			}

			if (loginState == 13) {
				field446 = 0;
				class478.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field445 / 60 + " seconds.");
				if (--field445 <= 0) {
					class347.method1874(0);
				}

			} else {
				if (loginState == 14 && var1.available() >= 1) {
					class323.field2854 = var1.readUnsignedByte();
					class347.method1874(15);
				}

				if (loginState == 15 && var1.available() >= class323.field2854) {
					boolean var45 = var1.readUnsignedByte() == 1;
					var1.read(var2.array, 0, 4);
					var2.offset = 0;
					boolean var44 = false;
					if (var45) {
						var14 = var2.readByteIsaac() << 24;
						var14 |= var2.readByteIsaac() << 16;
						var14 |= var2.readByteIsaac() << 8;
						var14 |= var2.readByteIsaac();
						class10.clientPreferences.method547(Login.Login_username, var14);
					}

					if (Login_isUsernameRemembered) {
						class10.clientPreferences.setUsernameToRemember(Login.Login_username);
					} else {
						class10.clientPreferences.setUsernameToRemember((String)null);
					}

					class100.savePreferences();
					staffModLevel = var1.readUnsignedByte();
					playerMod = var1.readUnsignedByte() == 1;
					localPlayerIndex = var1.readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += var1.readUnsignedByte();
					isMembers = var1.readUnsignedByte();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					this.field662 = var2.readLong();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					playerUUID = var2.readLong();
					if (param25 >= 214) {
						var1.read(var2.array, 0, 8);
						var2.offset = 0;
						var2.readLong();
					}

					var1.read(var2.array, 0, 1);
					var2.offset = 0;
					ServerPacket[] var40 = class260.ServerPacket_values();
					var6 = var2.readSmartByteShortIsaac();
					if (var6 < 0 || var6 >= var40.length) {
						throw new IOException(var6 + " " + var2.offset);
					}

					packetWriter.serverPacket = var40[var6];
					packetWriter.serverPacketLength = packetWriter.serverPacket.length;
					var1.read(var2.array, 0, 2);
					var2.offset = 0;
					packetWriter.serverPacketLength = var2.readUnsignedShort();

					try {
						class26.method93(class347.client, "zap");
					} catch (Throwable var18) {
					}

					class347.method1874(16);
				}

				if (loginState != 16) {
					if (loginState == 17 && var1.available() >= 2) {
						var2.offset = 0;
						var1.read(var2.array, 0, 2);
						var2.offset = 0;
						class394.field3634 = var2.readUnsignedShort();
						class347.method1874(18);
					}

					if (loginState == 18 && var1.available() >= class394.field3634) {
						var2.offset = 0;
						var1.read(var2.array, 0, class394.field3634);
						var2.offset = 0;
						String var42 = var2.readStringCp1252NullTerminated();
						String var38 = var2.readStringCp1252NullTerminated();
						String var41 = var2.readStringCp1252NullTerminated();
						class478.setLoginResponseString(var42, var38, var41);
						UserComparator8.updateGameState(10);
						if (field646.method2572()) {
							class390.method2013(9);
						}
					}

					if (loginState == 19) {
						if (packetWriter.serverPacketLength == -1) {
							if (var1.available() < 2) {
								return;
							}

							var1.read(var2.array, 0, 2);
							var2.offset = 0;
							packetWriter.serverPacketLength = var2.readUnsignedShort();
						}

						if (var1.available() >= packetWriter.serverPacketLength) {
							var1.read(var2.array, 0, packetWriter.serverPacketLength);
							var2.offset = 0;
							var13 = packetWriter.serverPacketLength;
							timer.method2114();
							PendingSpawn.method491();
							ClanSettings.updatePlayer(var2);
							if (var13 != var2.offset) {
								throw new RuntimeException();
							}
						}
					} else {
						++field446;
						if (field446 > 2000) {
							if (field442 < 1) {
								if (PcmPlayer.worldPort == UserComparator8.currentPort) {
									UserComparator8.currentPort = SecureRandomFuture.js5Port;
								} else {
									UserComparator8.currentPort = PcmPlayer.worldPort;
								}

								++field442;
								class347.method1874(0);
							} else {
								WorldMapSprite.getLoginError(-3);
							}
						}
					}
				} else {
					if (var1.available() >= packetWriter.serverPacketLength) {
						var2.offset = 0;
						var1.read(var2.array, 0, packetWriter.serverPacketLength);
						timer.method2112();
						mouseLastLastPressedTimeMillis = -1L;
						class85.mouseRecorder.index = 0;
						class31.hasFocus = true;
						hadFocus = true;
						field613 = -1L;
						class14.method48();
						packetWriter.clearBuffer();
						packetWriter.packetBuffer.offset = 0;
						packetWriter.serverPacket = null;
						packetWriter.field1136 = null;
						packetWriter.field1139 = null;
						packetWriter.field1138 = null;
						packetWriter.serverPacketLength = 0;
						packetWriter.field1132 = 0;
						rebootTimer = 0;
						logoutTimer = 0;
						hintArrowType = 0;
						Player.method482();
						MouseHandler.MouseHandler_idleCycles = 0;
						Messages.Messages_channels.clear();
						Messages.Messages_hashTable.clear();
						Messages.Messages_queue.clear();
						Messages.Messages_count = 0;
						isItemSelected = 0;
						isSpellSelected = false;
						soundEffectCount = 0;
						camAngleY = 0;
						oculusOrbState = 0;
						class30.field82 = null;
						minimapState = 0;
						field532 = -1;
						destinationX = 0;
						destinationY = 0;
						playerAttackOption = AttackOption.AttackOption_hidden;
						npcAttackOption = AttackOption.AttackOption_hidden;
						npcCount = 0;
						MouseRecorder.method460();

						for (var13 = 0; var13 < 2048; ++var13) {
							players[var13] = null;
						}

						for (var13 = 0; var13 < 65536; ++var13) {
							npcs[var13] = null;
						}

						combatTargetPlayerIndex = -1;
						projectiles.clear();
						graphicsObjects.clear();

						for (var13 = 0; var13 < 4; ++var13) {
							for (var14 = 0; var14 < 104; ++var14) {
								for (int var17 = 0; var17 < 104; ++var17) {
									groundItems[var13][var14][var17] = null;
								}
							}
						}

						pendingSpawns = new NodeDeque();
						ApproximateRouteStrategy.friendSystem.clear();

						for (var13 = 0; var13 < VarpDefinition.field1479; ++var13) {
							VarpDefinition var36 = class100.VarpDefinition_get(var13);
							if (var36 != null) {
								Varps.Varps_temp[var13] = 0;
								Varps.Varps_main[var13] = 0;
							}
						}

						MouseHandler.varcs.clearTransient();
						followerIndex = -1;
						if (rootInterface != -1) {
							ZoneOperation.method1607(rootInterface);
						}

						for (InterfaceParent var39 = (InterfaceParent)interfaceParents.first(); var39 != null; var39 = (InterfaceParent)interfaceParents.next()) {
							SoundCache.closeInterface(var39, true);
						}

						rootInterface = -1;
						interfaceParents = new NodeHashTable(8);
						meslayerContinueWidget = null;
						Player.method482();
						playerAppearance.method1718((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1);

						for (var13 = 0; var13 < 8; ++var13) {
							playerMenuActions[var13] = null;
							playerOptionsPriorities[var13] = false;
						}

						class6.method16();
						isLoading = true;

						for (var13 = 0; var13 < 100; ++var13) {
							field404[var13] = true;
						}

						var29 = ObjectComposition.getPacketBufferNode(ClientPacket.field2511, packetWriter.isaacCipher);
						var29.packetBuffer.writeByte(class237.getWindowedMode());
						var29.packetBuffer.writeShort(class448.canvasWidth);
						var29.packetBuffer.writeShort(class270.canvasHeight);
						packetWriter.addNode(var29);
						class406.friendsChat = null;
						class389.guestClanSettings = null;
						Arrays.fill(currentClanSettings, (Object)null);
						class195.guestClanChannel = null;
						Arrays.fill(currentClanChannels, (Object)null);

						for (var13 = 0; var13 < 8; ++var13) {
							grandExchangeOffers[var13] = new GrandExchangeOffer();
						}

						GrandExchangeOfferUnitPriceComparator.grandExchangeEvents = null;
						ClanSettings.updatePlayer(var2);
						class208.timeOfPreviousKeyPress = -1;
						class19.loadRegions(false, var2);
						packetWriter.serverPacket = null;
					}

				}
			}
		} catch (IOException var26) {
			if (field442 < 1) {
				if (PcmPlayer.worldPort == UserComparator8.currentPort) {
					UserComparator8.currentPort = SecureRandomFuture.js5Port;
				} else {
					UserComparator8.currentPort = PcmPlayer.worldPort;
				}

				++field442;
				class347.method1874(0);
			} else {
				WorldMapSprite.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-43"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) {
			--rebootTimer;
		}

		if (logoutTimer > 0) {
			--logoutTimer;
		}

		if (hadNetworkError) {
			hadNetworkError = false;
			Interpreter.method414();
		} else {
			if (!isMenuOpen) {
				class442.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method369(packetWriter); ++var1) {
			}

			if (gameState == 30) {
				while (true) {
					ReflectionCheck var2 = (ReflectionCheck)class36.reflectionChecks.last();
					boolean var29;
					if (var2 == null) {
						var29 = false;
					} else {
						var29 = true;
					}

					int var3;
					PacketBufferNode var30;
					if (!var29) {
						PacketBufferNode var14;
						int var15;
						if (timer.field3690) {
							var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field2501, packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(0);
							var15 = var14.packetBuffer.offset;
							timer.write(var14.packetBuffer);
							var14.packetBuffer.method2496(var14.packetBuffer.offset - var15);
							packetWriter.addNode(var14);
							timer.method2113();
						}

						int var4;
						int var5;
						int var6;
						int var7;
						int var8;
						int var9;
						int var10;
						int var11;
						PacketBuffer var10000;
						synchronized(class85.mouseRecorder.lock) {
							if (!lockMouseRecorder) {
								class85.mouseRecorder.index = 0;
							} else if (MouseHandler.MouseHandler_lastButton != 0 || class85.mouseRecorder.index >= 40) {
								var30 = null;
								var3 = 0;
								var4 = 0;
								var5 = 0;
								var6 = 0;

								for (var7 = 0; var7 < class85.mouseRecorder.index && (var30 == null || var30.packetBuffer.offset - var3 < 246); ++var7) {
									var4 = var7;
									var8 = class85.mouseRecorder.field_32[var7];
									if (var8 < -1) {
										var8 = -1;
									} else if (var8 > 65534) {
										var8 = 65534;
									}

									var9 = class85.mouseRecorder.field_31[var7];
									if (var9 < -1) {
										var9 = -1;
									} else if (var9 > 65534) {
										var9 = 65534;
									}

									if (var9 != lastMouseRecordX || var8 != lastMouseRecordY) {
										if (var30 == null) {
											var30 = ObjectComposition.getPacketBufferNode(ClientPacket.OPLOC3, packetWriter.isaacCipher);
											var30.packetBuffer.writeByte(0);
											var3 = var30.packetBuffer.offset;
											var10000 = var30.packetBuffer;
											var10000.offset += 2;
											var5 = 0;
											var6 = 0;
										}

										int var12;
										if (lastMouseRecordTime != -1L) {
											var10 = var9 - lastMouseRecordX;
											var11 = var8 - lastMouseRecordY;
											var12 = (int)((class85.mouseRecorder.millis[var7] - lastMouseRecordTime) / 20L);
											var5 = (int)((long)var5 + (class85.mouseRecorder.millis[var7] - lastMouseRecordTime) % 20L);
										} else {
											var10 = var9;
											var11 = var8;
											var12 = Integer.MAX_VALUE;
										}

										lastMouseRecordX = var9;
										lastMouseRecordY = var8;
										if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
											var10 += 32;
											var11 += 32;
											var30.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6));
										} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
											var10 += 128;
											var11 += 128;
											var30.packetBuffer.writeByte(var12 + 128);
											var30.packetBuffer.writeShort(var11 + (var10 << 8));
										} else if (var12 < 32) {
											var30.packetBuffer.writeByte(var12 + 192);
											if (var9 != -1 && var8 != -1) {
												var30.packetBuffer.writeInt(var9 | var8 << 16);
											} else {
												var30.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										} else {
											var30.packetBuffer.writeShort((var12 & 8191) + 57344);
											if (var9 != -1 && var8 != -1) {
												var30.packetBuffer.writeInt(var9 | var8 << 16);
											} else {
												var30.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										}

										++var6;
										lastMouseRecordTime = class85.mouseRecorder.millis[var7];
									}
								}

								if (var30 != null) {
									var30.packetBuffer.method2496(var30.packetBuffer.offset - var3);
									var7 = var30.packetBuffer.offset;
									var30.packetBuffer.offset = var3;
									var30.packetBuffer.writeByte(var5 / var6);
									var30.packetBuffer.writeByte(var5 % var6);
									var30.packetBuffer.offset = var7;
									packetWriter.addNode(var30);
								}

								if (var4 >= class85.mouseRecorder.index) {
									class85.mouseRecorder.index = 0;
								} else {
									MouseRecorder var52 = class85.mouseRecorder;
									var52.index -= var4;
									System.arraycopy(class85.mouseRecorder.field_31, var4, class85.mouseRecorder.field_31, 0, class85.mouseRecorder.index);
									System.arraycopy(class85.mouseRecorder.field_32, var4, class85.mouseRecorder.field_32, 0, class85.mouseRecorder.index);
									System.arraycopy(class85.mouseRecorder.millis, var4, class85.mouseRecorder.millis, 0, class85.mouseRecorder.index);
								}
							}
						}

						PacketBufferNode var18;
						if (MouseHandler.MouseHandler_lastButton == 1 || !class305.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
							long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis;
							if (var16 > 32767L) {
								var16 = 32767L;
							}

							mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis;
							var3 = MouseHandler.MouseHandler_lastPressedY;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > class270.canvasHeight) {
								var3 = class270.canvasHeight;
							}

							var4 = MouseHandler.MouseHandler_lastPressedX;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > class448.canvasWidth) {
								var4 = class448.canvasWidth;
							}

							var5 = (int)var16;
							var18 = ObjectComposition.getPacketBufferNode(ClientPacket.IF_BUTTON3, packetWriter.isaacCipher);
							var18.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1));
							var18.packetBuffer.writeShort(var4);
							var18.packetBuffer.writeShort(var3);
							packetWriter.addNode(var18);
						}

						if (keyHandlerInstance.pressedKeysCount > 0) {
							var14 = ObjectComposition.getPacketBufferNode(ClientPacket.OPOBJ1, packetWriter.isaacCipher);
							var14.packetBuffer.writeShort(0);
							var15 = var14.packetBuffer.offset;
							long var19 = BoundaryObject.clockNow();

							for (var5 = 0; var5 < keyHandlerInstance.pressedKeysCount; ++var5) {
								long var21 = var19 - field613;
								if (var21 > 16777215L) {
									var21 = 16777215L;
								}

								field613 = var19;
								var14.packetBuffer.method2529(keyHandlerInstance.field1873[var5]);
								var14.packetBuffer.method2545((int)var21);
							}

							var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var15);
							packetWriter.addNode(var14);
						}

						if (packetIndicator > 0) {
							--packetIndicator;
						}

						if (keyHandlerInstance.getKeyPressed(96) || keyHandlerInstance.getKeyPressed(97) || keyHandlerInstance.getKeyPressed(98) || keyHandlerInstance.getKeyPressed(99)) {
							emitPackets = true;
						}

						if (emitPackets && packetIndicator <= 0) {
							packetIndicator = 20;
							emitPackets = false;
							var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field2484, packetWriter.isaacCipher);
							var14.packetBuffer.method2539(camAngleX);
							var14.packetBuffer.writeIntME(camAngleY);
							packetWriter.addNode(var14);
						}

						if (class31.hasFocus && !hadFocus) {
							hadFocus = true;
							var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field2549, packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(1);
							packetWriter.addNode(var14);
						}

						if (!class31.hasFocus && hadFocus) {
							hadFocus = false;
							var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field2549, packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(0);
							packetWriter.addNode(var14);
						}

						if (ScriptFrame.worldMap != null) {
							ScriptFrame.worldMap.method2338();
						}

						class448.method2295();
						if (class155.field1375) {
							for (var1 = 0; var1 < Players.Players_count; ++var1) {
								Player var31 = players[Players.Players_indices[var1]];
								var31.method474();
							}

							class155.field1375 = false;
						}

						PlatformInfo.method2317();
						if (gameState != 30) {
							return;
						}

						for (PendingSpawn var36 = (PendingSpawn)pendingSpawns.last(); var36 != null; var36 = (PendingSpawn)pendingSpawns.previous()) {
							if (var36.endCycle > 0) {
								--var36.endCycle;
							}

							ObjectComposition var23;
							boolean var37;
							if (var36.endCycle == 0) {
								if (var36.objectId >= 0) {
									var3 = var36.objectId;
									var4 = var36.field924;
									var23 = class175.getObjectDefinition(var3);
									if (var4 == 11) {
										var4 = 10;
									}

									if (var4 >= 5 && var4 <= 8) {
										var4 = 4;
									}

									var37 = var23.method1032(var4);
									if (!var37) {
										continue;
									}
								}

								class251.addPendingSpawnToScene(var36.plane, var36.type, var36.field_3, var36.field_4, var36.objectId, var36.field933, var36.field924, var36.field932);
								var36.remove();
							} else {
								if (var36.startCycle > 0) {
									--var36.startCycle;
								}

								if (var36.startCycle == 0 && var36.field_3 >= 1 && var36.field_4 >= 1 && var36.field_3 <= 102 && var36.field_4 <= 102) {
									if (var36.field_5 >= 0) {
										var3 = var36.field_5;
										var4 = var36.objectType;
										var23 = class175.getObjectDefinition(var3);
										if (var4 == 11) {
											var4 = 10;
										}

										if (var4 >= 5 && var4 <= 8) {
											var4 = 4;
										}

										var37 = var23.method1032(var4);
										if (!var37) {
											continue;
										}
									}

									class251.addPendingSpawnToScene(var36.plane, var36.type, var36.field_3, var36.field_4, var36.field_5, var36.rotation, var36.objectType, var36.field932);
									var36.startCycle = -1;
									if (var36.field_5 == var36.objectId && var36.objectId == -1) {
										var36.remove();
									} else if (var36.field_5 == var36.objectId && var36.field933 == var36.rotation && var36.field924 == var36.objectType) {
										var36.remove();
									}
								}
							}
						}

						int var10002;
						for (var1 = 0; var1 < soundEffectCount; ++var1) {
							var10002 = queuedSoundEffectDelays[var1]--;
							if (queuedSoundEffectDelays[var1] >= -10) {
								SoundEffect var32 = soundEffects[var1];
								if (var32 == null) {
									var10000 = null;
									var32 = SoundEffect.readSoundEffect(LoginScreenAnimation.field1022, soundEffectIds[var1], 0);
									if (var32 == null) {
										continue;
									}

									int[] var53 = queuedSoundEffectDelays;
									var53[var1] += var32.calculateDelay();
									soundEffects[var1] = var32;
								}

								if (queuedSoundEffectDelays[var1] < 0) {
									if (soundLocations[var1] != 0) {
										var4 = (soundLocations[var1] & 255) * 128;
										var5 = soundLocations[var1] >> 16 & 255;
										var6 = var5 * 128 + 64 - Projectile.localPlayer.field_27;
										if (var6 < 0) {
											var6 = -var6;
										}

										var7 = soundLocations[var1] >> 8 & 255;
										var8 = var7 * 128 + 64 - Projectile.localPlayer.field_28;
										if (var8 < 0) {
											var8 = -var8;
										}

										var9 = var6 + var8 - 128;
										if (var9 > var4) {
											queuedSoundEffectDelays[var1] = -100;
											continue;
										}

										if (var9 < 0) {
											var9 = 0;
										}

										var3 = (var4 - var9) * class10.clientPreferences.getAreaSoundEffectsVolume() / var4;
									} else {
										var3 = class10.clientPreferences.getCurrentSoundEffectsVolume();
									}

									if (var3 > 0) {
										RawSound var24 = var32.toRawSound().resample(FloorOverlayDefinition.field1795);
										RawPcmStream var41 = RawPcmStream.createRawPcmStream(var24, 100, var3);
										var41.setNumLoops(queuedSoundEffectLoops[var1] - 1);
										KitDefinition.pcmStreamMixer.addSubStream(var41);
									}

									queuedSoundEffectDelays[var1] = -100;
								}
							} else {
								--soundEffectCount;

								for (var15 = var1; var15 < soundEffectCount; ++var15) {
									soundEffectIds[var15] = soundEffectIds[var15 + 1];
									soundEffects[var15] = soundEffects[var15 + 1];
									queuedSoundEffectLoops[var15] = queuedSoundEffectLoops[var15 + 1];
									queuedSoundEffectDelays[var15] = queuedSoundEffectDelays[var15 + 1];
									soundLocations[var15] = soundLocations[var15 + 1];
								}

								--var1;
							}
						}

						if (playingJingle) {
							if (class304.musicPlayerStatus != 0) {
								var29 = true;
							} else {
								var29 = class304.midiPcmStream.isReady();
							}

							if (!var29) {
								if (class10.clientPreferences.getCurrentMusicVolume() != 0 && currentTrackGroupId != -1) {
									class368.method1948(ReflectionCheck.archive6, currentTrackGroupId, 0, class10.clientPreferences.getCurrentMusicVolume(), false);
								}

								playingJingle = false;
							}
						}

						++packetWriter.field1132;
						if (packetWriter.field1132 > 750) {
							Interpreter.method414();
							return;
						}

						var1 = Players.Players_count;
						int[] var33 = Players.Players_indices;

						for (var3 = 0; var3 < var1; ++var3) {
							Player var43 = players[var33[var3]];
							if (var43 != null) {
								class298.updateActorSequence(var43, 1);
							}
						}

						for (var1 = 0; var1 < npcCount; ++var1) {
							var15 = npcIndices[var1];
							NPC var25 = npcs[var15];
							if (var25 != null) {
								class298.updateActorSequence(var25, var25.definition.size);
							}
						}

						class1.method3();
						++field452;
						if (mouseCrossColor != 0) {
							mouseCrossState += 20;
							if (mouseCrossState >= 400) {
								mouseCrossColor = 0;
							}
						}

						Widget var38 = ClanChannel.mousedOverWidgetIf1;
						Widget var34 = class19.field58;
						ClanChannel.mousedOverWidgetIf1 = null;
						class19.field58 = null;
						draggedOnWidget = null;
						field391 = false;
						field392 = false;
						field533 = 0;

						while (keyHandlerInstance.method1104() && field533 < 128) {
							if (staffModLevel >= 2 && keyHandlerInstance.getKeyPressed(82) && keyHandlerInstance.field1871 == 66) {
								StringBuilder var45 = new StringBuilder();

								Message var39;
								for (Iterator var42 = Messages.Messages_hashTable.iterator(); var42.hasNext(); var45.append(var39.text).append('\n')) {
									var39 = (Message)var42.next();
									if (var39.sender != null && !var39.sender.isEmpty()) {
										var45.append(var39.sender).append(':');
									}
								}

								String var47 = var45.toString();
								class347.client.method125(var47);
							} else if (oculusOrbState != 1 || keyHandlerInstance.field1870 <= 0) {
								field580[field533] = keyHandlerInstance.field1871;
								field578[field533] = keyHandlerInstance.field1870;
								++field533;
							}
						}

						if (RouteStrategy.method1131() && keyHandlerInstance.getKeyPressed(82) && keyHandlerInstance.getKeyPressed(81) && mouseWheelRotation != 0) {
							var3 = Projectile.localPlayer.plane - mouseWheelRotation;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > 3) {
								var3 = 3;
							}

							if (var3 != Projectile.localPlayer.plane) {
								var4 = Projectile.localPlayer.pathX[0] + class213.baseX;
								var5 = Projectile.localPlayer.pathY[0] + class101.baseY;
								var18 = ObjectComposition.getPacketBufferNode(ClientPacket.field2566, packetWriter.isaacCipher);
								var18.packetBuffer.method2537(var5);
								var18.packetBuffer.writeByte(var3);
								var18.packetBuffer.method2539(var4);
								var18.packetBuffer.writeShortAdd(0);
								packetWriter.addNode(var18);
							}

							mouseWheelRotation = 0;
						}

						if (MouseHandler.MouseHandler_lastButton == 1) {
							field419.method1088();
						}

						if (rootInterface != -1) {
							RouteStrategy.updateRootInterface(rootInterface, 0, 0, class448.canvasWidth, class270.canvasHeight, 0, 0);
						}

						++cycleCntr;

						while (true) {
							Widget var44;
							Widget var46;
							ScriptEvent var49;
							do {
								var49 = (ScriptEvent)field625.removeLast();
								if (var49 == null) {
									while (true) {
										do {
											var49 = (ScriptEvent)field626.removeLast();
											if (var49 == null) {
												while (true) {
													do {
														var49 = (ScriptEvent)scriptEvents.removeLast();
														if (var49 == null) {
															while (true) {
																while (true) {
																	class210 var51;
																	do {
																		do {
																			do {
																				var51 = (class210)field627.removeLast();
																				if (var51 == null) {
																					this.menu();
																					InterfaceParent.method454();
																					if (clickedWidget != null) {
																						this.method375();
																					}

																					if (Scene.shouldSendWalk()) {
																						var3 = Scene.Scene_selectedX;
																						var4 = Scene.Scene_selectedY;
																						PacketBufferNode var48 = ObjectComposition.getPacketBufferNode(ClientPacket.field2506, packetWriter.isaacCipher);
																						var48.packetBuffer.writeByte(5);
																						var48.packetBuffer.method2529(keyHandlerInstance.getKeyPressed(82) ? (keyHandlerInstance.getKeyPressed(81) ? 2 : 1) : 0);
																						var48.packetBuffer.writeShort(var3 + class213.baseX);
																						var48.packetBuffer.method2539(var4 + class101.baseY);
																						packetWriter.addNode(var48);
																						Scene.method1270();
																						mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																						mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																						mouseCrossColor = 1;
																						mouseCrossState = 0;
																						destinationX = var3;
																						destinationY = var4;
																					}

																					if (var38 != ClanChannel.mousedOverWidgetIf1) {
																						if (var38 != null) {
																							Messages.invalidateWidget(var38);
																						}

																						if (ClanChannel.mousedOverWidgetIf1 != null) {
																							Messages.invalidateWidget(ClanChannel.mousedOverWidgetIf1);
																						}
																					}

																					if (var34 != class19.field58 && field496 == field499) {
																						if (var34 != null) {
																							Messages.invalidateWidget(var34);
																						}

																						if (class19.field58 != null) {
																							Messages.invalidateWidget(class19.field58);
																						}
																					}

																					if (class19.field58 != null) {
																						if (field496 < field499) {
																							++field496;
																							if (field499 == field496) {
																								Messages.invalidateWidget(class19.field58);
																							}
																						}
																					} else if (field496 > 0) {
																						--field496;
																					}

																					HealthBar.method557();
																					if (field399) {
																						class408.method2134();
																					} else if (isCameraLocked) {
																						if (!field397) {
																							var3 = class126.field1188 * 128 + 64;
																							var4 = class217.field1907 * 128 + 64;
																							var5 = Renderable.getTileHeight(var3, var4, Clock.Client_plane) - class85.field854;
																							ApproximateRouteStrategy.method339(var3, var5, var4);
																						} else if (field631 != null) {
																							class208.cameraX = field631.vmethod2330();
																							ByteArrayPool.cameraZ = field631.vmethod2329();
																							if (field400) {
																								class152.cameraY = field631.vmethod2320();
																							} else {
																								class152.cameraY = Renderable.getTileHeight(class208.cameraX, ByteArrayPool.cameraZ, Clock.Client_plane) - field631.vmethod2320();
																							}

																							field631.method2331();
																						}

																						if (!field401) {
																							var3 = HealthBarUpdate.field1016 * 128 + 64;
																							var4 = class137.field1286 * 128 + 64;
																							var5 = Renderable.getTileHeight(var3, var4, Clock.Client_plane) - HitSplatDefinition.field1664;
																							var6 = var3 - class208.cameraX;
																							var7 = var5 - class152.cameraY;
																							var8 = var4 - ByteArrayPool.cameraZ;
																							var9 = (int)Math.sqrt((double)(var8 * var8 + var6 * var6));
																							var10 = (int)(Math.atan2((double)var7, (double)var9) * 325.9490051269531D) & 2047;
																							var11 = (int)(Math.atan2((double)var6, (double)var8) * -325.9490051269531D) & 2047;
																							InvDefinition.method930(var10, var11);
																						} else {
																							if (field633 != null) {
																								MusicPatchNode.cameraPitch = field633.method2327();
																								MusicPatchNode.cameraPitch = Math.min(Math.max(MusicPatchNode.cameraPitch, 128), 383);
																								field633.method2331();
																							}

																							if (field634 != null) {
																								class291.cameraYaw = field634.method2327() & 2047;
																								field634.method2331();
																							}
																						}
																					}

																					for (var3 = 0; var3 < 5; ++var3) {
																						var10002 = field587[var3]++;
																					}

																					MouseHandler.varcs.tryWrite();
																					var3 = MenuAction.method421();
																					var4 = GameEngine.keyHandler.getIdleCycles();
																					if (var3 > 15000 && var4 > 15000) {
																						logoutTimer = 250;
																						MouseHandler.MouseHandler_idleCycles = 14500;
																						var18 = ObjectComposition.getPacketBufferNode(ClientPacket.field2558, packetWriter.isaacCipher);
																						packetWriter.addNode(var18);
																					}

																					ApproximateRouteStrategy.friendSystem.processFriendUpdates();
																					WorldMapEvent.method1581();
																					++packetWriter.pendingWrites;
																					if (packetWriter.pendingWrites > 50) {
																						var18 = ObjectComposition.getPacketBufferNode(ClientPacket.field2519, packetWriter.isaacCipher);
																						packetWriter.addNode(var18);
																					}

																					try {
																						packetWriter.flush();
																					} catch (IOException var27) {
																						Interpreter.method414();
																					}

																					return;
																				}
																			} while(var51 == null);
																		} while(var51.field1859 == null);

																		if (var51.field1859.childIndex * 112312013 < 0) {
																			break;
																		}

																		var46 = FriendSystem.getWidget(var51.field1859.parentId);
																	} while(var46 == null || var46.children == null || var46.children.length == 0 || var51.field1859.childIndex * 112312013 >= var46.children.length || var51.field1859 != var46.children[var51.field1859.childIndex * 112312013]);

																	if (var51.field1859.type == 11 && var51.field1858 == 0) {
																		if (var51.field1859.method1836(var51.field1857, var51.field1856, 0, 0)) {
																			switch(var51.field1859.method1840()) {
																			case 0:
																				class27.openURL(var51.field1859.method1842(), true, false);
																				break;
																			case 1:
																				var5 = StudioGame.getWidgetFlags(var51.field1859);
																				boolean var35 = (var5 >> 22 & 1) != 0;
																				if (var35) {
																					int[] var40 = var51.field1859.method1843();
																					if (var40 != null) {
																						PacketBufferNode var26 = ObjectComposition.getPacketBufferNode(ClientPacket.OPNPC4, packetWriter.isaacCipher);
																						var26.packetBuffer.method2552(var40[2]);
																						var26.packetBuffer.method2552(var40[0]);
																						var26.packetBuffer.writeShortAdd(var40[1]);
																						var26.packetBuffer.writeInt(var51.field1859.method1841());
																						var26.packetBuffer.writeShort(var51.field1859.childIndex * 112312013);
																						var26.packetBuffer.writeIntLE(var51.field1859.field_9 * 1486786309);
																						packetWriter.addNode(var26);
																					}
																				}
																			}
																		}
																	} else if (var51.field1859.type == 12) {
																		class327 var50 = var51.field1859.method1847();
																		if (var50 != null && var50.method1783()) {
																			switch(var51.field1858) {
																			case 0:
																				field419.method1086(var51.field1859);
																				var50.method1731(true);
																				var50.method1770(var51.field1857, var51.field1856, keyHandlerInstance.getKeyPressed(82), keyHandlerInstance.getKeyPressed(81));
																				break;
																			case 1:
																				var50.method1771(var51.field1857, var51.field1856);
																			}
																		}
																	}
																}
															}
														}

														var46 = var49.widget;
														if (var46.childIndex * 112312013 < 0) {
															break;
														}

														var44 = FriendSystem.getWidget(var46.parentId);
													} while(var44 == null || var44.children == null || var46.childIndex * 112312013 >= var44.children.length || var46 != var44.children[var46.childIndex * 112312013]);

													Clock.runScriptEvent(var49);
												}
											}

											var46 = var49.widget;
											if (var46.childIndex * 112312013 < 0) {
												break;
											}

											var44 = FriendSystem.getWidget(var46.parentId);
										} while(var44 == null || var44.children == null || var46.childIndex * 112312013 >= var44.children.length || var46 != var44.children[var46.childIndex * 112312013]);

										Clock.runScriptEvent(var49);
									}
								}

								var46 = var49.widget;
								if (var46.childIndex * 112312013 < 0) {
									break;
								}

								var44 = FriendSystem.getWidget(var46.parentId);
							} while(var44 == null || var44.children == null || var46.childIndex * 112312013 >= var44.children.length || var46 != var44.children[var46.childIndex * 112312013]);

							Clock.runScriptEvent(var49);
						}
					}

					var30 = ObjectComposition.getPacketBufferNode(ClientPacket.OPPLAYER7, packetWriter.isaacCipher);
					var30.packetBuffer.writeByte(0);
					var3 = var30.packetBuffer.offset;
					World.performReflectionCheck(var30.packetBuffer);
					var30.packetBuffer.method2496(var30.packetBuffer.offset - var3);
					packetWriter.addNode(var30);
				}
			}
		}
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-327300033"
	)
	public void vmethod1680(int var1, int var2) {
		if (var1 > -1 && class10.clientPreferences.getCurrentMusicVolume() > 0 && !playingJingle) {
			PacketBufferNode var3 = ObjectComposition.getPacketBufferNode(ClientPacket.field2557, packetWriter.isaacCipher);
			var3.packetBuffer.writeInt(var1);
			packetWriter.addNode(var3);
		}

	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "597538053"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = class448.canvasWidth;
		int var2 = class270.canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}

		if (class10.clientPreferences != null) {
			try {
				Client var3 = class347.client;
				Object[] var4 = new Object[]{class237.getWindowedMode()};
				JSObject.getWindow(var3).call("resize", var4);
			} catch (Throwable var5) {
			}
		}

	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		int var1;
		if (rootInterface != -1) {
			var1 = rootInterface;
			if (loadInterface(var1)) {
				class213.drawModelComponents(class16.Widget_interfaceComponents[var1], -1);
			}
		}

		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (field404[var1]) {
				field405[var1] = true;
			}

			field406[var1] = field404[var1];
			field404[var1] = false;
		}

		field529 = cycle;
		viewportX = -1;
		viewportY = -1;
		if (rootInterface != -1) {
			rootWidgetCount = 0;
			Renderable.drawWidgets(rootInterface, 0, 0, class448.canvasWidth, class270.canvasHeight, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				class12.crossSprites[mouseCrossState / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}

			if (mouseCrossColor == 2) {
				class12.crossSprites[mouseCrossState / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
		}

		int var2;
		int var3;
		if (!isMenuOpen) {
			if (viewportX != -1) {
				var1 = viewportX;
				var2 = viewportY;
				if ((menuOptionsCount >= 2 || isItemSelected != 0 || isSpellSelected) && showMouseOverText) {
					var3 = class132.method710();
					String var4;
					if (isItemSelected == 1 && menuOptionsCount < 2) {
						var4 = "Use" + " " + field596 + " " + "->";
					} else if (isSpellSelected && menuOptionsCount < 2) {
						var4 = field597 + " " + field598 + " " + "->";
					} else {
						String var5;
						if (var3 < 0) {
							var5 = "";
						} else if (menuTargets[var3].length() > 0) {
							var5 = menuActions[var3] + " " + menuTargets[var3];
						} else {
							var5 = menuActions[var3];
						}

						var4 = var5;
					}

					if (menuOptionsCount > 2) {
						var4 = var4 + Strings.colorStartTag(16777215) + " " + '/' + " " + (menuOptionsCount - 2) + " more options";
					}

					class166.fontBold12.drawRandomAlphaAndSpacing(var4, var1 + 4, var2 + 15, 16777215, 0, cycle / 1000);
				}
			}
		} else {
			class7.method23();
		}

		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field406[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field405[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		var1 = Clock.Client_plane;
		var2 = Projectile.localPlayer.field_27;
		var3 = Projectile.localPlayer.field_28;
		int var12 = field452;

		for (ObjectSound var14 = (ObjectSound)ObjectSound.objectSounds.last(); var14 != null; var14 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var14.soundEffectId != -1 || var14.soundEffectIds != null) {
				int var6 = 0;
				if (var2 > var14.maxX) {
					var6 += var2 - var14.maxX;
				} else if (var2 < var14.field_6) {
					var6 += var14.field_6 - var2;
				}

				if (var3 > var14.maxY) {
					var6 += var3 - var14.maxY;
				} else if (var3 < var14.field_7) {
					var6 += var14.field_7 - var3;
				}

				if (var6 - 64 <= var14.field685 && class10.clientPreferences.getAreaSoundEffectsVolume() != 0 && var1 == var14.plane) {
					var6 -= 64;
					if (var6 < 0) {
						var6 = 0;
					}

					int var7 = (var14.field685 - var6) * class10.clientPreferences.getAreaSoundEffectsVolume() / var14.field685;
					Object var10000;
					if (var14.stream1 == null) {
						if (var14.soundEffectId >= 0) {
							var10000 = null;
							SoundEffect var8 = SoundEffect.readSoundEffect(LoginScreenAnimation.field1022, var14.soundEffectId, 0);
							if (var8 != null) {
								RawSound var9 = var8.toRawSound().resample(FloorOverlayDefinition.field1795);
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var7);
								var10.setNumLoops(-1);
								KitDefinition.pcmStreamMixer.addSubStream(var10);
								var14.stream1 = var10;
							}
						}
					} else {
						var14.stream1.method229(var7);
					}

					if (var14.stream2 == null) {
						if (var14.soundEffectIds != null && (var14.field687 -= var12) <= 0) {
							int var13 = (int)(Math.random() * (double)var14.soundEffectIds.length);
							var10000 = null;
							SoundEffect var15 = SoundEffect.readSoundEffect(LoginScreenAnimation.field1022, var14.soundEffectIds[var13], 0);
							if (var15 != null) {
								RawSound var16 = var15.toRawSound().resample(FloorOverlayDefinition.field1795);
								RawPcmStream var11 = RawPcmStream.createRawPcmStream(var16, 100, var7);
								var11.setNumLoops(0);
								KitDefinition.pcmStreamMixer.addSubStream(var11);
								var14.stream2 = var11;
								var14.field687 = var14.field686 + (int)(Math.random() * (double)(var14.field690 - var14.field686));
							}
						}
					} else {
						var14.stream2.method229(var7);
						if (!var14.stream2.hasNext()) {
							var14.stream2 = null;
						}
					}
				} else {
					if (var14.stream1 != null) {
						KitDefinition.pcmStreamMixer.removeSubStream(var14.stream1);
						var14.stream1 = null;
					}

					if (var14.stream2 != null) {
						KitDefinition.pcmStreamMixer.removeSubStream(var14.stream2);
						var14.stream2 = null;
					}
				}
			}
		}

		field452 = 0;
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(Lem;II)Z",
		garbageValue = "-1192650719"
	)
	boolean method367(PacketWriter var1, int var2) {
		if (var1.serverPacketLength == 0) {
			class406.friendsChat = null;
		} else {
			if (class406.friendsChat == null) {
				class406.friendsChat = new FriendsChat(WorldMapScaleHandler.loginType, class347.client);
			}

			class406.friendsChat.method2159(var1.packetBuffer, var2);
		}

		ClanChannel.method846();
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(Lem;I)Z",
		garbageValue = "82431150"
	)
	boolean method368(PacketWriter var1) {
		if (class406.friendsChat != null) {
			class406.friendsChat.method2160(var1.packetBuffer);
		}

		ClanChannel.method846();
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(Lem;S)Z",
		garbageValue = "12915"
	)
	final boolean method369(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket();
		PacketBuffer var3 = var1.packetBuffer;
		if (var2 == null) {
			return false;
		} else {
			String var21;
			int var25;
			try {
				int var5;
				if (var1.serverPacket == null) {
					if (var1.field1131) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1132 = 0;
						var1.field1131 = false;
					}

					var3.offset = 0;
					if (var3.method2473()) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1132 = 0;
					}

					var1.field1131 = true;
					ServerPacket[] var4 = class260.ServerPacket_values();
					var5 = var3.readSmartByteShortIsaac();
					if (var5 < 0 || var5 >= var4.length) {
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5];
					var1.serverPacketLength = var1.serverPacket.length;
				}

				if (var1.serverPacketLength == -1) {
					if (!var2.isAvailable(1)) {
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1);
					var1.serverPacketLength = var3.array[0] & 255;
				}

				if (var1.serverPacketLength == -2) {
					if (!var2.isAvailable(2)) {
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2);
					var3.offset = 0;
					var1.serverPacketLength = var3.readUnsignedShort();
				}

				if (!var2.isAvailable(var1.serverPacketLength)) {
					return false;
				}

				var3.offset = 0;
				var2.read(var3.array, 0, var1.serverPacketLength);
				var1.field1132 = 0;
				timer.method2109();
				var1.field1138 = var1.field1139;
				var1.field1139 = var1.field1136;
				var1.field1136 = var1.serverPacket;
				if (ServerPacket.field2616 == var1.serverPacket) {
					class149.updateNpcs(false, var3);
					var1.serverPacket = null;
					return true;
				}

				byte var20;
				if (ServerPacket.field2646 == var1.serverPacket) {
					FloorUnderlayDefinition.method1001();
					var20 = var3.readByte();
					class145 var73 = new class145(var3);
					ClanSettings var60;
					if (var20 >= 0) {
						var60 = currentClanSettings[var20];
					} else {
						var60 = class389.guestClanSettings;
					}

					var73.method763(var60);
					var1.serverPacket = null;
					return true;
				}

				int var64;
				if (ServerPacket.field2677 == var1.serverPacket) {
					var64 = var3.readUnsignedByte();
					if (var3.readUnsignedByte() == 0) {
						grandExchangeOffers[var64] = new GrandExchangeOffer();
						var3.offset += 18;
					} else {
						--var3.offset;
						grandExchangeOffers[var64] = new GrandExchangeOffer(var3, false);
					}

					field516 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				long var7;
				long var22;
				String var24;
				String var48;
				boolean var59;
				int var61;
				if (ServerPacket.field2605 == var1.serverPacket) {
					var48 = var3.readStringCp1252NullTerminated();
					var22 = (long)var3.readUnsignedShort();
					var7 = (long)var3.readMedium();
					PlayerType var9 = (PlayerType)GameObject.findEnumerated(HealthBarDefinition.PlayerType_values(), var3.readUnsignedByte());
					long var10 = var7 + (var22 << 32);
					var59 = false;

					for (var61 = 0; var61 < 100; ++var61) {
						if (field614[var61] == var10) {
							var59 = true;
							break;
						}
					}

					if (ApproximateRouteStrategy.friendSystem.isIgnored(new Username(var48, WorldMapScaleHandler.loginType))) {
						var59 = true;
					}

					if (!var59 && field488 == 0) {
						field614[field534] = var10;
						field534 = (field534 + 1) % 100;
						var24 = AbstractFont.escapeBrackets(class290.method1603(class16.readString(var3)));
						byte var63;
						if (var9.isPrivileged) {
							var63 = 7;
						} else {
							var63 = 3;
						}

						if (var9.modIcon != -1) {
							class59.addGameMessage(var63, class100.addImageTag(var9.modIcon) + var48, var24);
						} else {
							class59.addGameMessage(var63, var48, var24);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				int var8;
				long var27;
				int var74;
				if (ServerPacket.field2619 == var1.serverPacket) {
					var64 = var3.readUnsignedByteNeg();
					if (var64 == 65535) {
						var64 = -1;
					}

					var5 = var3.readInt();
					var25 = var3.method2553();
					var74 = var3.readUnsignedShort();
					if (var74 == 65535) {
						var74 = -1;
					}

					for (var8 = var74; var8 <= var64; ++var8) {
						var27 = (long)var8 + ((long)var25 << 32);
						Node var57 = widgetFlags.get(var27);
						if (var57 != null) {
							var57.remove();
						}

						widgetFlags.put(new IntegerNode(var5), var27);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2671 == var1.serverPacket) {
					class213.processZoneOperation(ZoneOperation.field2584);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2602 == var1.serverPacket) {
					for (var64 = 0; var64 < Varps.Varps_main.length; ++var64) {
						if (Varps.Varps_temp[var64] != Varps.Varps_main[var64]) {
							Varps.Varps_main[var64] = Varps.Varps_temp[var64];
							class393.changeGameOptions(var64);
							field572[++field514 - 1 & 31] = var64;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2629 == var1.serverPacket) {
					class213.processZoneOperation(ZoneOperation.field2586);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2656 == var1.serverPacket) {
					tradeChatMode = var3.readUnsignedByte();
					publicChatMode = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				int var29;
				if (ServerPacket.field2598 == var1.serverPacket) {
					isCameraLocked = true;
					field399 = false;
					field401 = true;
					var64 = var3.readShort();
					var5 = var3.readShort();
					var25 = class322.method1707(var5 + MusicPatchNode.cameraPitch & 2027);
					var74 = var64 + class291.cameraYaw;
					var8 = var3.readUnsignedShort();
					var29 = var3.readUnsignedByte();
					field633 = new class466(MusicPatchNode.cameraPitch, var25, var8, var29);
					field634 = new class466(class291.cameraYaw, var74, var8, var29);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2618 == var1.serverPacket) {
					var64 = var3.readUnsignedByte();
					WorldMapSection2.forceDisconnect(var64);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field2688 == var1.serverPacket) {
					FloorUnderlayDefinition.method1001();
					var20 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var20 >= 0) {
							currentClanSettings[var20] = null;
						} else {
							class389.guestClanSettings = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var20 >= 0) {
						currentClanSettings[var20] = new ClanSettings(var3);
					} else {
						class389.guestClanSettings = new ClanSettings(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2682 == var1.serverPacket) {
					PlatformInfo.process();
					weight = var3.readShort();
					field523 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				Widget var53;
				int var76;
				if (ServerPacket.field2674 == var1.serverPacket) {
					var64 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var64 < -70000) {
						var5 += 32768;
					}

					if (var64 >= 0) {
						var53 = FriendSystem.getWidget(var64);
					} else {
						var53 = null;
					}

					if (var53 != null) {
						for (var74 = 0; var74 < var53.itemIds.length; ++var74) {
							var53.itemIds[var74] = 0;
							var53.field3011[var74] = 0;
						}
					}

					ClientPacket.clearItemContainer(var5);
					var74 = var3.readUnsignedShort();

					for (var8 = 0; var8 < var74; ++var8) {
						var29 = var3.readUnsignedByteAdd();
						if (var29 == 255) {
							var29 = var3.readInt();
						}

						var76 = var3.readUnsignedShortLE();
						if (var53 != null && var8 < var53.itemIds.length) {
							var53.itemIds[var8] = var76;
							var53.field3011[var8] = var29;
						}

						class74.itemContainerSetItem(var5, var8, var76 - 1, var29);
					}

					if (var53 != null) {
						Messages.invalidateWidget(var53);
					}

					PlatformInfo.process();
					field573[++field525 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2614 == var1.serverPacket) {
					var5 = var3.readUnsignedShortAdd();
					var64 = var3.readUnsignedShortAdd();
					var25 = var3.readUnsignedByteAdd();
					if (var5 == 65535) {
						var5 = -1;
					}

					NPC var84 = npcs[var64];
					if (var84 != null) {
						if (var5 == var84.sequence && var5 != -1) {
							var8 = WorldMapLabelSize.SequenceDefinition_get(var5).replyMode;
							if (var8 == 1) {
								var84.sequenceFrame = 0;
								var84.sequenceFrameCycle = 0;
								var84.sequenceDelay = var25;
								var84.currentSequenceFrameIndex = 0;
							} else if (var8 == 2) {
								var84.currentSequenceFrameIndex = 0;
							}
						} else if (var5 == -1 || var84.sequence == -1 || WorldMapLabelSize.SequenceDefinition_get(var5).forcedPriority >= WorldMapLabelSize.SequenceDefinition_get(var84.sequence).forcedPriority) {
							var84.sequence = var5;
							var84.sequenceFrame = 0;
							var84.sequenceFrameCycle = 0;
							var84.sequenceDelay = var25;
							var84.currentSequenceFrameIndex = 0;
							var84.field1002 = var84.pathLength;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				boolean var65;
				if (ServerPacket.field2641 == var1.serverPacket) {
					var65 = var3.readUnsignedByte() == 1;
					if (var65) {
						ParamComposition.field1651 = BoundaryObject.clockNow() - var3.readLong();
						GrandExchangeOfferUnitPriceComparator.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						GrandExchangeOfferUnitPriceComparator.grandExchangeEvents = null;
					}

					field520 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2658 == var1.serverPacket) {
					var64 = var3.readUnsignedByteNeg();
					var5 = var3.readUnsignedShortAddLE();
					var53 = FriendSystem.getWidget(var5);
					if (var53.modelType != 2 || var64 != var53.modelId) {
						var53.modelType = 2;
						var53.modelId = var64;
						Messages.invalidateWidget(var53);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2595 == var1.serverPacket) {
					class350.method1878(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.GAMEFRAME_FULL == var1.serverPacket) {
					var65 = var3.readBoolean();
					if (var65) {
						if (class30.field82 == null) {
							class30.field82 = new class367();
						}
					} else {
						class30.field82 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2676 == var1.serverPacket) {
					var64 = var3.readUnsignedByteNeg();
					if (var64 == 65535) {
						var64 = -1;
					}

					MusicPatch.playSong(var64);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2611 == var1.serverPacket) {
					var64 = var3.readUnsignedShort();
					if (var64 == 65535) {
						var64 = -1;
					}

					var5 = var3.readMedium();
					HealthBarUpdate.playJingle(var64, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2704 == var1.serverPacket) {
					hintArrowType = var3.readUnsignedByte();
					if (hintArrowType == 1) {
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) {
						if (hintArrowType == 2) {
							hintArrowSubX = 64;
							hintArrowSubY = 64;
						}

						if (hintArrowType == 3) {
							hintArrowSubX = 0;
							hintArrowSubY = 64;
						}

						if (hintArrowType == 4) {
							hintArrowSubX = 128;
							hintArrowSubY = 64;
						}

						if (hintArrowType == 5) {
							hintArrowSubX = 64;
							hintArrowSubY = 0;
						}

						if (hintArrowType == 6) {
							hintArrowSubX = 64;
							hintArrowSubY = 128;
						}

						hintArrowType = 2;
						hintArrowX = var3.readUnsignedShort();
						hintArrowY = var3.readUnsignedShort();
						hintArrowHeight = var3.readUnsignedByte();
					}

					if (hintArrowType == 10) {
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2601 == var1.serverPacket) {
					PendingSpawn.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}

				int var12;
				int var15;
				int var32;
				if (ServerPacket.field2631 == var1.serverPacket) {
					var29 = var3.readUnsignedByte();
					var76 = var29 >> 2;
					var32 = var29 & 3;
					var12 = field649[var76];
					var61 = var3.readUnsignedShortAdd();
					var25 = var3.method2546();
					var64 = var25 >> 16;
					var5 = var25 >> 8 & 255;
					var74 = var64 + (var25 >> 4 & 7);
					var8 = var5 + (var25 & 7);
					if (var74 >= 0 && var8 >= 0 && var74 < 103 && var8 < 103) {
						if (var12 == 0) {
							BoundaryObject var88 = class36.scene.method1250(Clock.Client_plane, var74, var8);
							if (var88 != null) {
								var15 = class215.Entity_unpackID(var88.tag);
								if (var76 == 2) {
									var88.renderable1 = new DynamicObject(var15, 2, var32 + 4, Clock.Client_plane, var74, var8, var61, false, var88.renderable1);
									var88.renderable2 = new DynamicObject(var15, 2, var32 + 1 & 3, Clock.Client_plane, var74, var8, var61, false, var88.renderable2);
								} else {
									var88.renderable1 = new DynamicObject(var15, var76, var32, Clock.Client_plane, var74, var8, var61, false, var88.renderable1);
								}
							}
						} else if (var12 == 1) {
							WallDecoration var86 = class36.scene.method1251(Clock.Client_plane, var74, var8);
							if (var86 != null) {
								var15 = class215.Entity_unpackID(var86.tag);
								if (var76 != 4 && var76 != 5) {
									if (var76 == 6) {
										var86.renderable1 = new DynamicObject(var15, 4, var32 + 4, Clock.Client_plane, var74, var8, var61, false, var86.renderable1);
									} else if (var76 == 7) {
										var86.renderable1 = new DynamicObject(var15, 4, (var32 + 2 & 3) + 4, Clock.Client_plane, var74, var8, var61, false, var86.renderable1);
									} else if (var76 == 8) {
										var86.renderable1 = new DynamicObject(var15, 4, var32 + 4, Clock.Client_plane, var74, var8, var61, false, var86.renderable1);
										var86.renderable2 = new DynamicObject(var15, 4, (var32 + 2 & 3) + 4, Clock.Client_plane, var74, var8, var61, false, var86.renderable2);
									}
								} else {
									var86.renderable1 = new DynamicObject(var15, 4, var32, Clock.Client_plane, var74, var8, var61, false, var86.renderable1);
								}
							}
						} else if (var12 == 2) {
							GameObject var83 = class36.scene.getGameObject(Clock.Client_plane, var74, var8);
							if (var76 == 11) {
								var76 = 10;
							}

							if (var83 != null) {
								var83.renderable = new DynamicObject(class215.Entity_unpackID(var83.tag), var76, var32, Clock.Client_plane, var74, var8, var61, false, var83.renderable);
							}
						} else if (var12 == 3) {
							FloorDecoration var85 = class36.scene.getFloorDecoration(Clock.Client_plane, var74, var8);
							if (var85 != null) {
								var85.renderable = new DynamicObject(class215.Entity_unpackID(var85.tag), 22, var32, Clock.Client_plane, var74, var8, var61, false, var85.renderable);
							}
						}
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var31;
				if (ServerPacket.field2686 == var1.serverPacket) {
					var64 = var3.method2555();
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					var25 = var3.method2555();
					var31 = FriendSystem.getWidget(var64);
					ItemComposition var94;
					if (!var31.isIf3) {
						if (var5 == -1) {
							var31.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var94 = class300.ItemDefinition_get(var5);
						var31.modelType = 4;
						var31.modelId = var5;
						var31.modelAngleX = var94.xan2d;
						var31.modelAngleY = var94.yan2d;
						var31.modelZoom = var94.zoom2d * 100 / var25;
						Messages.invalidateWidget(var31);
					} else {
						var31.itemId = var5;
						var31.itemQuantity = var25;
						var94 = class300.ItemDefinition_get(var5);
						var31.modelAngleX = var94.xan2d;
						var31.modelAngleY = var94.yan2d;
						var31.modelAngleZ = var94.zan2d;
						var31.modelOffsetX = var94.offsetX2d;
						var31.modelOffsetY = var94.offsetY2d;
						var31.modelZoom = var94.zoom2d;
						if (var94.isStackable == 1) {
							var31.itemQuantityMode = 1;
						} else {
							var31.itemQuantityMode = 2;
						}

						if (var31.modelRotation > 0) {
							var31.modelZoom = var31.modelZoom * 32 / var31.modelRotation;
						} else if (var31.rawWidth > 0) {
							var31.modelZoom = var31.modelZoom * 32 / var31.rawWidth;
						}

						Messages.invalidateWidget(var31);
					}

					var1.serverPacket = null;
					return true;
				}

				long var36;
				InterfaceParent var77;
				if (ServerPacket.field2599 == var1.serverPacket) {
					var64 = var3.offset + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					var25 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.resizeRoot(false);
						class136.Widget_resetModelFrames(rootInterface);
						class149.runWidgetOnLoadListener(rootInterface);

						for (var74 = 0; var74 < 100; ++var74) {
							field404[var74] = true;
						}
					}

					InterfaceParent var91;
					for (; var25-- > 0; var91.field855 = true) {
						var74 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var29 = var3.readUnsignedByte();
						var91 = (InterfaceParent)interfaceParents.get((long)var74);
						if (var91 != null && var8 != var91.group) {
							SoundCache.closeInterface(var91, true);
							var91 = null;
						}

						if (var91 == null) {
							var91 = VarpDefinition.ifOpenSub(var74, var8, var29);
						}
					}

					for (var77 = (InterfaceParent)interfaceParents.first(); var77 != null; var77 = (InterfaceParent)interfaceParents.next()) {
						if (var77.field855) {
							var77.field855 = false;
						} else {
							SoundCache.closeInterface(var77, true);
						}
					}

					widgetFlags = new NodeHashTable(512);

					while (var3.offset < var64) {
						var74 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var29 = var3.readUnsignedShort();
						var76 = var3.readInt();

						for (var32 = var8; var32 <= var29; ++var32) {
							var36 = (long)var32 + ((long)var74 << 32);
							widgetFlags.put(new IntegerNode(var76), var36);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2655 == var1.serverPacket) {
					var48 = var3.readStringCp1252NullTerminated();
					var5 = var3.readUnsignedShortAddLE();
					var53 = FriendSystem.getWidget(var5);
					if (!var48.equals(var53.text)) {
						var53.text = var48;
						Messages.invalidateWidget(var53);
					}

					var1.serverPacket = null;
					return true;
				}

				int var62;
				boolean var79;
				if (ServerPacket.field2699 == var1.serverPacket) {
					var20 = var3.readByte();
					var22 = (long)var3.readUnsignedShort();
					var7 = (long)var3.readMedium();
					var27 = (var22 << 32) + var7;
					var79 = false;
					ClanChannel var95 = var20 >= 0 ? currentClanChannels[var20] : class195.guestClanChannel;
					if (var95 == null) {
						var79 = true;
					} else {
						for (var61 = 0; var61 < 100; ++var61) {
							if (var27 == field614[var61]) {
								var79 = true;
								break;
							}
						}
					}

					if (!var79) {
						field614[field534] = var27;
						field534 = (field534 + 1) % 100;
						var24 = class16.readString(var3);
						var62 = var20 >= 0 ? 43 : 46;
						ApproximateRouteStrategy.addChatMessage(var62, "", var24, var95.name);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2632 == var1.serverPacket) {
					var64 = var3.readUnsignedShort();
					if (var64 == 65535) {
						var64 = -1;
					}

					rootInterface = var64;
					this.resizeRoot(false);
					class136.Widget_resetModelFrames(var64);
					class149.runWidgetOnLoadListener(rootInterface);

					for (var5 = 0; var5 < 100; ++var5) {
						field404[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2680 == var1.serverPacket) {
					class213.processZoneOperation(ZoneOperation.field2585);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2707 == var1.serverPacket) {
					destinationX = var3.readUnsignedByte();
					if (destinationX == 255) {
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte();
					if (destinationY == 255) {
						destinationY = 0;
					}

					var1.serverPacket = null;
					return true;
				}

				boolean var55;
				if (ServerPacket.field2651 == var1.serverPacket) {
					var64 = var3.readInt();
					var55 = var3._readUnsignedByteSub() == 1;
					var53 = FriendSystem.getWidget(var64);
					if (var55 != var53.isHidden) {
						var53.isHidden = var55;
						Messages.invalidateWidget(var53);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2689 == var1.serverPacket) {
					var64 = var3.readInt();
					var5 = var3.readInt();
					var25 = class132.getGcDuration();
					PacketBufferNode var80 = ObjectComposition.getPacketBufferNode(ClientPacket.field2527, packetWriter.isaacCipher);
					var80.packetBuffer.writeByteAdd(GameEngine.fps);
					var80.packetBuffer.writeByteAdd(var25);
					var80.packetBuffer.writeShortAdd(var64);
					var80.packetBuffer.writeIntLE(var5);
					packetWriter.addNode(var80);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2622 == var1.serverPacket) {
					ApproximateRouteStrategy.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					Player.FriendSystem_invalidateIgnoreds();
					field522 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2668 == var1.serverPacket) {
					FriendSystem.logOut();
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field2710 == var1.serverPacket) {
					var64 = var3.readUnsignedShortAdd();
					var5 = var3.method2553();
					var53 = FriendSystem.getWidget(var5);
					if (var53.modelType != 1 || var64 != var53.modelId) {
						var53.modelType = 1;
						var53.modelId = var64;
						Messages.invalidateWidget(var53);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2635 == var1.serverPacket) {
					ApproximateRouteStrategy.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field522 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				NPC var89;
				if (ServerPacket.field2600 == var1.serverPacket) {
					var64 = var3.readUnsignedShortLE();
					var5 = var3.method2531();
					short var81 = (short)var3.method2543();
					var74 = var3.readInt();
					var89 = npcs[var64];
					if (var89 != null) {
						var89.method569(var5, var74, var81);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOGOUT_TRANSFER == var1.serverPacket) {
					class213.processZoneOperation(ZoneOperation.field2583);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_UID192 == var1.serverPacket) {
					WorldMapIcon_0.field2374 = var3.readUnsignedByteAdd();
					Archive.field3475 = var3._readUnsignedByteSub();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2657 == var1.serverPacket) {
					class149.updateNpcs(true, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2617 == var1.serverPacket) {
					rebootTimer = var3.readUnsignedByteNeg() * 30;
					field523 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2679 == var1.serverPacket) {
					var64 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var25 = var3.readUnsignedShort();
					SpriteMask.queueSoundEffect(var64, var5, var25);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2684 == var1.serverPacket) {
					class74.updatePlayers(var3, var1.serverPacketLength);
					PendingSpawn.method492();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2700 == var1.serverPacket) {
					var64 = var3.readUnsignedByteNeg();
					var5 = var3.method2531();
					if (var64 == 65535) {
						var64 = -1;
					}

					ServerPacket.performPlayerAnimation(Projectile.localPlayer, var64, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CHAT_FILTER_SETTINGS == var1.serverPacket) {
					Archive.field3475 = var3.readUnsignedByteAdd();
					WorldMapIcon_0.field2374 = var3.method2531();

					while (var3.offset < var1.serverPacketLength) {
						var64 = var3.readUnsignedByte();
						ZoneOperation var72 = class135.method715()[var64];
						class213.processZoneOperation(var72);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2662 == var1.serverPacket) {
					var64 = var3.readInt();
					if (var64 != field365) {
						field365 = var64;
						class327.method1812();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2642 == var1.serverPacket) {
					for (var64 = 0; var64 < players.length; ++var64) {
						if (players[var64] != null) {
							players[var64].sequence = -1;
						}
					}

					for (var64 = 0; var64 < npcs.length; ++var64) {
						if (npcs[var64] != null) {
							npcs[var64].sequence = -1;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				String var54;
				if (ServerPacket.field2661 == var1.serverPacket) {
					byte[] var52 = new byte[var1.serverPacketLength];
					var3.method2475(var52, 0, var52.length);
					Buffer var71 = new Buffer(var52);
					var54 = var71.readStringCp1252NullTerminated();
					class27.openURL(var54, true, false);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2636 == var1.serverPacket) {
					ApproximateRouteStrategy.friendSystem.method392();
					field522 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2660 == var1.serverPacket) {
					class213.processZoneOperation(ZoneOperation.field2579);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2604 == var1.serverPacket) {
					return this.method368(var1);
				}

				Widget var68;
				if (ServerPacket.REBUILD_REGION_NORMAL == var1.serverPacket) {
					var64 = var3.method2553();
					var68 = FriendSystem.getWidget(var64);

					for (var25 = 0; var25 < var68.itemIds.length; ++var25) {
						var68.itemIds[var25] = -1;
						var68.itemIds[var25] = 0;
					}

					Messages.invalidateWidget(var68);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2708 == var1.serverPacket) {
					class213.processZoneOperation(ZoneOperation.field2578);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2687 == var1.serverPacket) {
					return this.method367(var1, 2);
				}

				if (ServerPacket.field2702 == var1.serverPacket) {
					isCameraLocked = true;
					field399 = false;
					field397 = true;
					class126.field1188 = var3.readUnsignedByte();
					class217.field1907 = var3.readUnsignedByte();
					var64 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShort();
					field400 = var3.readBoolean();
					var25 = var3.readUnsignedByte();
					var74 = class126.field1188 * 128 + 64;
					var8 = class217.field1907 * 128 + 64;
					boolean var82 = false;
					boolean var78 = false;
					if (field400) {
						var29 = class152.cameraY;
						var76 = Renderable.getTileHeight(var74, var8, Clock.Client_plane) - var64;
					} else {
						var29 = Renderable.getTileHeight(class208.cameraX, ByteArrayPool.cameraZ, Clock.Client_plane) - class152.cameraY;
						var76 = var64;
					}

					field631 = new class465(class208.cameraX, ByteArrayPool.cameraZ, var29, var74, var8, var76, var5, var25);
					var1.serverPacket = null;
					return true;
				}

				Widget var92;
				if (ServerPacket.field2639 == var1.serverPacket) {
					var64 = var3.readUnsignedShortAddLE();
					var5 = var3.method2553();
					InterfaceParent var58 = (InterfaceParent)interfaceParents.get((long)var64);
					var77 = (InterfaceParent)interfaceParents.get((long)var5);
					if (var77 != null) {
						SoundCache.closeInterface(var77, var58 == null || var77.group != var58.group);
					}

					if (var58 != null) {
						var58.remove();
						interfaceParents.put(var58, (long)var5);
					}

					var92 = FriendSystem.getWidget(var64);
					if (var92 != null) {
						Messages.invalidateWidget(var92);
					}

					var92 = FriendSystem.getWidget(var5);
					if (var92 != null) {
						Messages.invalidateWidget(var92);
						Projectile.revalidateWidgetScroll(class16.Widget_interfaceComponents[var92.field_9 * 1486786309 >>> 16], var92, true);
					}

					if (rootInterface != -1) {
						class453.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2659 == var1.serverPacket) {
					var64 = var3.readUnsignedShortAddLE();
					var5 = var3.method2555();
					var53 = FriendSystem.getWidget(var64);
					ItemComposition.method1064(var53, var5);
					Messages.invalidateWidget(var53);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2692 == var1.serverPacket) {
					class127.varclan = null;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2663 == var1.serverPacket) {
					field399 = false;
					isCameraLocked = false;
					field397 = false;
					field401 = false;
					HealthBarUpdate.field1016 = 0;
					class137.field1286 = 0;
					HitSplatDefinition.field1664 = 0;
					field400 = false;
					BufferedSource.field3762 = 0;
					class209.field1851 = 0;
					LoginScreenAnimation.field1021 = 0;
					UserComparator4.field1158 = 0;
					class126.field1188 = 0;
					class217.field1907 = 0;
					class85.field854 = 0;
					field631 = null;
					field633 = null;
					field634 = null;

					for (var64 = 0; var64 < 5; ++var64) {
						field407[var64] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2685 == var1.serverPacket) {
					isCameraLocked = true;
					field399 = false;
					field401 = false;
					HealthBarUpdate.field1016 = var3.readUnsignedByte();
					class137.field1286 = var3.readUnsignedByte();
					HitSplatDefinition.field1664 = var3.readUnsignedShort();
					BufferedSource.field3762 = var3.readUnsignedByte();
					class209.field1851 = var3.readUnsignedByte();
					if (class209.field1851 >= 100) {
						var64 = HealthBarUpdate.field1016 * 128 + 64;
						var5 = class137.field1286 * 128 + 64;
						var25 = Renderable.getTileHeight(var64, var5, Clock.Client_plane) - HitSplatDefinition.field1664;
						var74 = var64 - class208.cameraX;
						var8 = var25 - class152.cameraY;
						var29 = var5 - ByteArrayPool.cameraZ;
						var76 = (int)Math.sqrt((double)(var29 * var29 + var74 * var74));
						MusicPatchNode.cameraPitch = (int)(Math.atan2((double)var8, (double)var76) * 325.9490051269531D) & 2047;
						class291.cameraYaw = (int)(Math.atan2((double)var74, (double)var29) * -325.9490051269531D) & 2047;
						if (MusicPatchNode.cameraPitch < 128) {
							MusicPatchNode.cameraPitch = 128;
						}

						if (MusicPatchNode.cameraPitch > 383) {
							MusicPatchNode.cameraPitch = 383;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2597 == var1.serverPacket) {
					World var51 = new World();
					var51.host = var3.readStringCp1252NullTerminated();
					var51.field_72 = var3.readUnsignedShort();
					var5 = var3.readInt();
					var51.properties = var5;
					UserComparator8.updateGameState(45);
					var2.close();
					var2 = null;
					class14.changeWorld(var51);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field2703 == var1.serverPacket) {
					Archive.field3475 = var3.readUnsignedByte();
					WorldMapIcon_0.field2374 = var3.readUnsignedByte();

					for (var64 = WorldMapIcon_0.field2374; var64 < WorldMapIcon_0.field2374 + 8; ++var64) {
						for (var5 = Archive.field3475; var5 < Archive.field3475 + 8; ++var5) {
							if (groundItems[Clock.Client_plane][var64][var5] != null) {
								groundItems[Clock.Client_plane][var64][var5] = null;
								class128.updateItemPile(var64, var5);
							}
						}
					}

					for (PendingSpawn var50 = (PendingSpawn)pendingSpawns.last(); var50 != null; var50 = (PendingSpawn)pendingSpawns.previous()) {
						if (var50.field_3 >= WorldMapIcon_0.field2374 && var50.field_3 < WorldMapIcon_0.field2374 + 8 && var50.field_4 >= Archive.field3475 && var50.field_4 < Archive.field3475 + 8 && var50.plane == Clock.Client_plane) {
							var50.endCycle = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2637 == var1.serverPacket) {
					isCameraLocked = true;
					field399 = false;
					field401 = true;
					var64 = GrandExchangeOfferTotalQuantityComparator.method1928(var3.readShort() & 2027);
					var5 = class322.method1707(var3.readShort() & 2027);
					var25 = var3.readUnsignedShort();
					var74 = var3.readUnsignedByte();
					field633 = new class466(MusicPatchNode.cameraPitch, var5, var25, var74);
					field634 = new class466(class291.cameraYaw, var64, var25, var74);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2638 == var1.serverPacket) {
					var20 = var3.method2534();
					var5 = var3.readUnsignedShortLE();
					Varps.Varps_temp[var5] = var20;
					if (Varps.Varps_main[var5] != var20) {
						Varps.Varps_main[var5] = var20;
					}

					class393.changeGameOptions(var5);
					field572[++field514 - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2669 == var1.serverPacket) {
					var64 = var3.readUnsignedByteAdd();
					var21 = var3.readStringCp1252NullTerminated();
					var25 = var3.readUnsignedByte();
					if (var25 >= 1 && var25 <= 8) {
						if (var21.equalsIgnoreCase("null")) {
							var21 = null;
						}

						playerMenuActions[var25 - 1] = var21;
						playerOptionsPriorities[var25 - 1] = var64 == 0;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_PARTIAL_FOLLOWS == var1.serverPacket) {
					var64 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var64 < -70000) {
						var5 += 32768;
					}

					if (var64 >= 0) {
						var53 = FriendSystem.getWidget(var64);
					} else {
						var53 = null;
					}

					for (; var3.offset < var1.serverPacketLength; class74.itemContainerSetItem(var5, var74, var8 - 1, var29)) {
						var74 = var3.readUShortSmart();
						var8 = var3.readUnsignedShort();
						var29 = 0;
						if (var8 != 0) {
							var29 = var3.readUnsignedByte();
							if (var29 == 255) {
								var29 = var3.readInt();
							}
						}

						if (var53 != null && var74 >= 0 && var74 < var53.itemIds.length) {
							var53.itemIds[var74] = var8;
							var53.field3011[var74] = var29;
						}
					}

					if (var53 != null) {
						Messages.invalidateWidget(var53);
					}

					PlatformInfo.process();
					field573[++field525 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2681 == var1.serverPacket) {
					var64 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var25 = var3.readUnsignedByte();
					var74 = var3.readUnsignedByte();
					field407[var64] = true;
					field588[var64] = var5;
					field590[var64] = var25;
					field589[var64] = var74;
					field587[var64] = 0;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.TRIGGER_ONDIALOGABORT == var1.serverPacket) {
					var64 = var3.method2543();
					var5 = var3.readInt();
					var53 = FriendSystem.getWidget(var5);
					if (var64 != var53.sequenceId || var64 == -1) {
						var53.sequenceId = var64;
						var53.modelFrame = 0;
						var53.modelFrameCycle = 0;
						Messages.invalidateWidget(var53);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2603 == var1.serverPacket) {
					var29 = var3.readUnsignedShort();
					var32 = var3.readUnsignedShortLE();
					var25 = var3.method2546();
					var64 = var25 >> 16;
					var5 = var25 >> 8 & 255;
					var74 = var64 + (var25 >> 4 & 7);
					var8 = var5 + (var25 & 7);
					var76 = var3.readUnsignedByteAdd();
					if (var74 >= 0 && var8 >= 0 && var74 < 104 && var8 < 104) {
						var74 = var74 * 128 + 64;
						var8 = var8 * 128 + 64;
						GraphicsObject var38 = new GraphicsObject(var29, Clock.Client_plane, var74, var8, Renderable.getTileHeight(var74, var8, Clock.Client_plane) - var76, var32, cycle);
						graphicsObjects.addFirst(var38);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2683 == var1.serverPacket) {
					isCameraLocked = true;
					field399 = false;
					field401 = true;
					HealthBarUpdate.field1016 = var3.readUnsignedByte();
					class137.field1286 = var3.readUnsignedByte();
					HitSplatDefinition.field1664 = var3.readUnsignedShort();
					var64 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var25 = HealthBarUpdate.field1016 * 128 + 64;
					var74 = class137.field1286 * 128 + 64;
					var8 = Renderable.getTileHeight(var25, var74, Clock.Client_plane) - HitSplatDefinition.field1664;
					var29 = var25 - class208.cameraX;
					var76 = var8 - class152.cameraY;
					var32 = var74 - ByteArrayPool.cameraZ;
					double var93 = Math.sqrt((double)(var29 * var29 + var32 * var32));
					var62 = class322.method1707((int)(Math.atan2((double)var76, var93) * 325.9490051269531D) & 2047);
					var15 = GrandExchangeOfferTotalQuantityComparator.method1928((int)(Math.atan2((double)var29, (double)var32) * -325.9490051269531D) & 2047);
					field633 = new class466(MusicPatchNode.cameraPitch, var62, var64, var5);
					field634 = new class466(class291.cameraYaw, var15, var64, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_CLANCHANNEL_SYSTEM == var1.serverPacket) {
					var64 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShortAdd();
					var25 = var3.method2555();
					var31 = FriendSystem.getWidget(var25);
					var31.rotationKey = var64 + (var5 << 16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2606 == var1.serverPacket) {
					var64 = var3.readInt();
					var5 = var3.readUnsignedByteNeg();
					Varps.Varps_temp[var5] = var64;
					if (Varps.Varps_main[var5] != var64) {
						Varps.Varps_main[var5] = var64;
					}

					class393.changeGameOptions(var5);
					field572[++field514 - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CLANCHANNEL_DELTA == var1.serverPacket) {
					class213.processZoneOperation(ZoneOperation.field2587);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2609 == var1.serverPacket) {
					isCameraLocked = true;
					field399 = false;
					field397 = true;
					class126.field1188 = var3.readUnsignedByte();
					class217.field1907 = var3.readUnsignedByte();
					var64 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte() * 128 + 64;
					var25 = var3.readUnsignedByte() * 128 + 64;
					var74 = var3.readUnsignedShort();
					field400 = var3.readBoolean();
					var8 = var3.readUnsignedByte();
					var29 = class126.field1188 * 128 + 64;
					var76 = class217.field1907 * 128 + 64;
					var79 = false;
					var59 = false;
					if (field400) {
						var32 = class152.cameraY;
						var12 = Renderable.getTileHeight(var29, var76, Clock.Client_plane) - var64;
					} else {
						var32 = Renderable.getTileHeight(class208.cameraX, ByteArrayPool.cameraZ, Clock.Client_plane) - class152.cameraY;
						var12 = var64;
					}

					field631 = new class464(class208.cameraX, ByteArrayPool.cameraZ, var32, var29, var76, var12, var5, var25, var74, var8);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2623 == var1.serverPacket) {
					PlatformInfo.process();
					var64 = var3.method2531();
					var5 = var3.method2553();
					var25 = var3._readUnsignedByteSub();
					experience[var64] = var5;
					currentLevels[var64] = var25;
					levels[var64] = 1;

					for (var74 = 0; var74 < 98; ++var74) {
						if (var5 >= Skills.Skills_experienceTable[var74]) {
							levels[var64] = var74 + 2;
						}
					}

					field570[++field519 - 1 & 31] = var64;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2610 == var1.serverPacket) {
					var64 = var3.readUnsignedByte();
					WorldMapSection0.method1515(var64);
					var1.serverPacket = null;
					return true;
				}

				int var16;
				if (ServerPacket.RESET_ANIMS == var1.serverPacket) {
					int var18 = var3.readUnsignedByte();
					var12 = var3.readUnsignedByteNeg();
					var15 = var3.readUnsignedShortLE();
					int var17 = var3.readUnsignedByteAdd();
					byte var75 = var3.method2536();
					var25 = var3.method2547();
					var64 = var25 >> 16;
					var5 = var25 >> 8 & 255;
					var74 = var64 + (var25 >> 4 & 7);
					var8 = var5 + (var25 & 7);
					byte var30 = var3.method2534();
					var32 = var3.method2548();
					var16 = var3.readUnsignedShortLE();
					var61 = var3.readUnsignedByteAdd() * 4;
					var62 = var3.method2531() * 4;
					var29 = var75 + var74;
					var76 = var30 + var8;
					if (var74 >= 0 && var8 >= 0 && var74 < 104 && var8 < 104 && var29 >= 0 && var76 >= 0 && var29 < 104 && var76 < 104 && var12 != 65535) {
						var74 = var74 * 128 + 64;
						var8 = var8 * 128 + 64;
						var29 = var29 * 128 + 64;
						var76 = var76 * 128 + 64;
						Projectile var19 = new Projectile(var12, Clock.Client_plane, var74, var8, Renderable.getTileHeight(var74, var8, Clock.Client_plane) - var61, var15 + cycle, var16 + cycle, var17, var18, var32, var62);
						var19.setDestination(var29, var76, Renderable.getTileHeight(var29, var76, Clock.Client_plane) - var62, var15 + cycle);
						projectiles.addFirst(var19);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.TRADING_POST_RESULTS == var1.serverPacket) {
					var64 = var3.readInt();
					InterfaceParent var70 = (InterfaceParent)interfaceParents.get((long)var64);
					if (var70 != null) {
						SoundCache.closeInterface(var70, true);
					}

					if (meslayerContinueWidget != null) {
						Messages.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2698 == var1.serverPacket) {
					var64 = var3.method2553();
					var5 = var3.readUnsignedShortLE();
					var53 = FriendSystem.getWidget(var64);
					if (var53.modelType != 6 || var5 != var53.modelId) {
						var53.modelType = 6;
						var53.modelId = var5;
						Messages.invalidateWidget(var53);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2644 == var1.serverPacket) {
					var64 = var3.readUnsignedShortLE();
					var5 = var3.readUnsignedShortLE();
					var25 = var3.method2553();
					var74 = var3.readUnsignedShortAdd();
					var92 = FriendSystem.getWidget(var25);
					if (var64 != var92.modelAngleX || var5 != var92.modelAngleY || var74 != var92.modelZoom) {
						var92.modelAngleX = var64;
						var92.modelAngleY = var5;
						var92.modelZoom = var74;
						Messages.invalidateWidget(var92);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2627 == var1.serverPacket) {
					var3.offset += 28;
					if (var3.checkCrc()) {
						class60.method321(var3, var3.offset - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REFLECTION_CHECK == var1.serverPacket) {
					class127.varclan = new class442(HealthBar.HitSplatDefinition_cached);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2650 == var1.serverPacket) {
					class19.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2673 == var1.serverPacket) {
					if (class127.varclan == null) {
						class127.varclan = new class442(HealthBar.HitSplatDefinition_cached);
					}

					class509 var49 = HealthBar.HitSplatDefinition_cached.method2286(var3);
					class127.varclan.field3835.vmethod8143(var49.field4121, var49.field4120);
					field571[++field513 - 1 & 31] = var49.field4121;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2645 == var1.serverPacket) {
					field524 = cycleCntr;
					var20 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var20 >= 0) {
							currentClanChannels[var20] = null;
						} else {
							class195.guestClanChannel = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var20 >= 0) {
						currentClanChannels[var20] = new ClanChannel(var3);
					} else {
						class195.guestClanChannel = new ClanChannel(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2643 == var1.serverPacket) {
					var74 = var3.readUnsignedByteAdd();
					var5 = var3.readInt();
					var64 = var3.readUnsignedByteNeg();
					var89 = npcs[var64];
					var25 = var3.readUnsignedShortLE();
					if (var89 != null) {
						var89.method498(var74, var25, var5 >> 16, var5 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2690 == var1.serverPacket) {
					var64 = var3.readUnsignedShortAdd();
					ParamComposition.method1009(var64);
					field573[++field525 - 1 & 31] = var64 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2705 == var1.serverPacket) {
					for (var64 = 0; var64 < VarpDefinition.field1479; ++var64) {
						VarpDefinition var69 = class100.VarpDefinition_get(var64);
						if (var69 != null) {
							Varps.Varps_temp[var64] = 0;
							Varps.Varps_main[var64] = 0;
						}
					}

					PlatformInfo.process();
					field514 += 32;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_PRIVATE == var1.serverPacket) {
					var64 = var3.readUnsignedShortAddLE();
					var68 = FriendSystem.getWidget(var64);
					var68.modelType = 3;
					var68.modelId = Projectile.localPlayer.appearance.getChatHeadId();
					Messages.invalidateWidget(var68);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_FULL == var1.serverPacket) {
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETOBJECT == var1.serverPacket) {
					class213.processZoneOperation(ZoneOperation.field2580);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2664 == var1.serverPacket) {
					var48 = var3.readStringCp1252NullTerminated();
					Object[] var67 = new Object[var48.length() + 1];

					for (var25 = var48.length() - 1; var25 >= 0; --var25) {
						if (var48.charAt(var25) == 's') {
							var67[var25 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var67[var25 + 1] = new Integer(var3.readInt());
						}
					}

					var67[0] = new Integer(var3.readInt());
					ScriptEvent var56 = new ScriptEvent();
					var56.args = var67;
					Clock.runScriptEvent(var56);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2672 == var1.serverPacket) {
					var74 = var3.readUnsignedByte();
					var25 = var3.method2553();
					var64 = var3.readUnsignedByteNeg();
					Player var87;
					if (var64 == localPlayerIndex) {
						var87 = Projectile.localPlayer;
					} else {
						var87 = players[var64];
					}

					var5 = var3.readUnsignedShortLE();
					if (var87 != null) {
						var87.method498(var74, var5, var25 >> 16, var25 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.HEAT_MAP == var1.serverPacket) {
					class213.processZoneOperation(ZoneOperation.field2582);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_RUNENERGY == var1.serverPacket) {
					var64 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShortAddLE();
					var25 = var64 >> 10 & 31;
					var74 = var64 >> 5 & 31;
					var8 = var64 & 31;
					var29 = (var74 << 11) + (var25 << 19) + (var8 << 3);
					Widget var90 = FriendSystem.getWidget(var5);
					if (var29 != var90.color) {
						var90.color = var29;
						Messages.invalidateWidget(var90);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETTEXT == var1.serverPacket) {
					var64 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var25 = var3.readUnsignedShortAddLE();
					var77 = (InterfaceParent)interfaceParents.get((long)var25);
					if (var77 != null) {
						SoundCache.closeInterface(var77, var64 != var77.group);
					}

					VarpDefinition.ifOpenSub(var25, var64, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2697 == var1.serverPacket) {
					isCameraLocked = true;
					field399 = false;
					field397 = false;
					class126.field1188 = var3.readUnsignedByte();
					class217.field1907 = var3.readUnsignedByte();
					class85.field854 = var3.readUnsignedShort();
					UserComparator4.field1158 = var3.readUnsignedByte();
					LoginScreenAnimation.field1021 = var3.readUnsignedByte();
					if (LoginScreenAnimation.field1021 >= 100) {
						class208.cameraX = class126.field1188 * 128 + 64;
						ByteArrayPool.cameraZ = class217.field1907 * 128 + 64;
						class152.cameraY = Renderable.getTileHeight(class208.cameraX, ByteArrayPool.cameraZ, Clock.Client_plane) - class85.field854;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2596 == var1.serverPacket) {
					var64 = var3.readUShortSmart();
					var55 = var3.readUnsignedByte() == 1;
					var54 = "";
					boolean var26 = false;
					if (var55) {
						var54 = var3.readStringCp1252NullTerminated();
						if (ApproximateRouteStrategy.friendSystem.isIgnored(new Username(var54, WorldMapScaleHandler.loginType))) {
							var26 = true;
						}
					}

					String var34 = var3.readStringCp1252NullTerminated();
					if (!var26) {
						class59.addGameMessage(var64, var54, var34);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETPOSITION == var1.serverPacket) {
					minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2640 == var1.serverPacket) {
					PlatformInfo.process();
					runEnergy = var3.readUnsignedShort();
					field523 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2634 == var1.serverPacket) {
					var64 = var3.method2531();
					var5 = var3.readUnsignedShortAddLE();
					var53 = FriendSystem.getWidget(var5);
					MusicPatchPcmStream.method1691(var53, Projectile.localPlayer.appearance.field2875, var64);
					Messages.invalidateWidget(var53);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_PARTIAL == var1.serverPacket) {
					if (rootInterface != -1) {
						class453.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2613 == var1.serverPacket) {
					var64 = var3.method2553();
					var5 = var3.readUnsignedByte();
					var25 = var3._readUnsignedByteSub();
					var31 = FriendSystem.getWidget(var64);
					class199.method1002(var31, var5, var25);
					Messages.invalidateWidget(var31);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2620 == var1.serverPacket) {
					class19.loadRegions(true, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_PRIVATE_ECHO == var1.serverPacket) {
					var64 = var3.method2553();
					var5 = var3.readUnsignedShort();
					var53 = FriendSystem.getWidget(var64);
					if (var53 != null && var53.type == 0) {
						if (var5 > var53.scrollHeight * 2136913233 - var53.height * -175088023) {
							var5 = var53.scrollHeight * 2136913233 - var53.height * -175088023;
						}

						if (var5 < 0) {
							var5 = 0;
						}

						if (var5 != var53.scrollY) {
							var53.scrollY = var5;
							Messages.invalidateWidget(var53);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2625 == var1.serverPacket) {
					var64 = var3.readSignedShortAdd();
					var5 = var3.method2553();
					var25 = var3.readShort();
					var31 = FriendSystem.getWidget(var5);
					if (var64 != var31.rawX || var25 != var31.rawY || var31.xAlignment != 0 || var31.yAlignment != 0) {
						var31.rawX = var64;
						var31.rawY = var25;
						var31.xAlignment = 0;
						var31.yAlignment = 0;
						Messages.invalidateWidget(var31);
						this.alignWidget(var31);
						if (var31.type == 0) {
							Projectile.revalidateWidgetScroll(class16.Widget_interfaceComponents[var5 >> 16], var31, false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2621 == var1.serverPacket) {
					return this.method367(var1, 1);
				}

				if (ServerPacket.CAM_LOOKAT == var1.serverPacket) {
					var65 = var3.method2531() == 1;
					var5 = var3.readInt();
					var53 = FriendSystem.getWidget(var5);
					GraphicsObject.method417(var53, Projectile.localPlayer.appearance, var65);
					Messages.invalidateWidget(var53);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2615 == var1.serverPacket) {
					class213.processZoneOperation(ZoneOperation.field2581);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2607 == var1.serverPacket) {
					var48 = var3.readStringCp1252NullTerminated();
					var21 = AbstractFont.escapeBrackets(class290.method1603(class16.readString(var3)));
					class59.addGameMessage(6, var48, var21);
					var1.serverPacket = null;
					return true;
				}

				String var39;
				if (ServerPacket.field2652 == var1.serverPacket) {
					var48 = var3.readStringCp1252NullTerminated();
					var22 = var3.readLong();
					var7 = (long)var3.readUnsignedShort();
					var27 = (long)var3.readMedium();
					PlayerType var11 = (PlayerType)GameObject.findEnumerated(HealthBarDefinition.PlayerType_values(), var3.readUnsignedByte());
					var36 = var27 + (var7 << 32);
					boolean var14 = false;

					for (var15 = 0; var15 < 100; ++var15) {
						if (field614[var15] == var36) {
							var14 = true;
							break;
						}
					}

					if (var11.isUser && ApproximateRouteStrategy.friendSystem.isIgnored(new Username(var48, WorldMapScaleHandler.loginType))) {
						var14 = true;
					}

					if (!var14 && field488 == 0) {
						field614[field534] = var36;
						field534 = (field534 + 1) % 100;
						var39 = AbstractFont.escapeBrackets(class290.method1603(class16.readString(var3)));
						if (var11.modIcon != -1) {
							ApproximateRouteStrategy.addChatMessage(9, class100.addImageTag(var11.modIcon) + var48, var39, MusicPatchPcmStream.base37DecodeLong(var22));
						} else {
							ApproximateRouteStrategy.addChatMessage(9, var48, var39, MusicPatchPcmStream.base37DecodeLong(var22));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VARCLAN == var1.serverPacket) {
					field524 = cycleCntr;
					var20 = var3.readByte();
					class159 var66 = new class159(var3);
					ClanChannel var6;
					if (var20 >= 0) {
						var6 = currentClanChannels[var20];
					} else {
						var6 = class195.guestClanChannel;
					}

					var66.method828(var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2666 == var1.serverPacket) {
					class213.processZoneOperation(ZoneOperation.field2588);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2691 == var1.serverPacket && isCameraLocked) {
					field399 = true;
					field401 = false;
					field397 = false;

					for (var64 = 0; var64 < 5; ++var64) {
						field407[var64] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2630 == var1.serverPacket) {
					SpotAnimationDefinition.privateChatMode = class404.method2116(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2633 == var1.serverPacket) {
					var20 = var3.readByte();
					var21 = var3.readStringCp1252NullTerminated();
					long var40 = (long)var3.readUnsignedShort();
					long var42 = (long)var3.readMedium();
					PlayerType var35 = (PlayerType)GameObject.findEnumerated(HealthBarDefinition.PlayerType_values(), var3.readUnsignedByte());
					long var44 = (var40 << 32) + var42;
					boolean var13 = false;
					ClanChannel var33 = null;
					var33 = var20 >= 0 ? currentClanChannels[var20] : class195.guestClanChannel;
					if (var33 == null) {
						var13 = true;
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var35.isUser && ApproximateRouteStrategy.friendSystem.isIgnored(new Username(var21, WorldMapScaleHandler.loginType))) {
									var13 = true;
								}
								break;
							}

							if (field614[var15] == var44) {
								var13 = true;
								break;
							}

							++var15;
						}
					}

					if (!var13) {
						field614[field534] = var44;
						field534 = (field534 + 1) % 100;
						var39 = AbstractFont.escapeBrackets(class16.readString(var3));
						var16 = var20 >= 0 ? 41 : 44;
						if (var35.modIcon != -1) {
							ApproximateRouteStrategy.addChatMessage(var16, class100.addImageTag(var35.modIcon) + var21, var39, var33.name);
						} else {
							ApproximateRouteStrategy.addChatMessage(var16, var21, var39, var33.name);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				class260.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.field_36 * 1692527301 : -1) + "," + (var1.field1139 != null ? var1.field1139.field_36 * 1692527301 : -1) + "," + (var1.field1138 != null ? var1.field1138.field_36 * 1692527301 : -1) + "," + var1.serverPacketLength, (Throwable)null);
				FriendSystem.logOut();
			} catch (IOException var46) {
				Interpreter.method414();
			} catch (Exception var47) {
				var21 = "" + (var1.serverPacket != null ? var1.serverPacket.field_36 * 1692527301 : -1) + "," + (var1.field1139 != null ? var1.field1139.field_36 * 1692527301 : -1) + "," + (var1.field1138 != null ? var1.field1138.field_36 * 1692527301 : -1) + "," + var1.serverPacketLength + "," + (Projectile.localPlayer.pathX[0] + class213.baseX) + "," + (Projectile.localPlayer.pathY[0] + class101.baseY) + ",";

				for (var25 = 0; var25 < var1.serverPacketLength && var25 < 50; ++var25) {
					var21 = var21 + var3.array[var25] + ",";
				}

				class260.RunException_sendStackTrace(var21, var47);
				FriendSystem.logOut();
			}

			return true;
		}
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-319683254"
	)
	@Export("menu")
	final void menu() {
		MouseRecorder.method461();
		if (clickedWidget == null) {
			int var1 = MouseHandler.MouseHandler_lastButton;
			int var2;
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			if (isMenuOpen) {
				if (var1 != 1 && (class305.mouseCam || var1 != 4)) {
					var2 = MouseHandler.MouseHandler_x * -1367600295;
					var3 = MouseHandler.MouseHandler_y * -808246845;
					if (var2 < class180.menuX - 10 || var2 > class237.field2151 + class180.menuX + 10 || var3 < NewShit.menuY - 10 || var3 > class60.field313 + NewShit.menuY + 10) {
						isMenuOpen = false;
						class20.method69(class180.menuX, NewShit.menuY, class237.field2151, class60.field313);
					}
				}

				if (var1 == 1 || !class305.mouseCam && var1 == 4) {
					var2 = class180.menuX;
					var3 = NewShit.menuY;
					var4 = class237.field2151;
					var5 = MouseHandler.MouseHandler_lastPressedX;
					var6 = MouseHandler.MouseHandler_lastPressedY;
					var7 = -1;

					int var15;
					int var16;
					for (var15 = 0; var15 < menuOptionsCount; ++var15) {
						var16 = (menuOptionsCount - 1 - var15) * 15 + var3 + 31;
						if (var5 > var2 && var5 < var2 + var4 && var6 > var16 - 13 && var6 < var16 + 3) {
							var7 = var15;
						}
					}

					if (var7 != -1 && var7 >= 0) {
						var15 = menuArguments1[var7];
						var16 = menuArguments2[var7];
						int var10 = menuOpcodes[var7];
						int var11 = menuIdentifiers[var7];
						int var12 = menuItemIds[var7];
						String var13 = menuActions[var7];
						String var14 = menuTargets[var7];
						WorldMapIcon_0.menuAction(var15, var16, var10, var11, var12, var13, var14, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					}

					isMenuOpen = false;
					class20.method69(class180.menuX, NewShit.menuY, class237.field2151, class60.field313);
				}
			} else {
				var2 = class132.method710();
				if ((var1 == 1 || !class305.mouseCam && var1 == 4) && this.shouldLeftClickOpenMenu()) {
					var1 = 2;
				}

				if ((var1 == 1 || !class305.mouseCam && var1 == 4) && menuOptionsCount > 0 && var2 >= 0) {
					var3 = menuArguments1[var2];
					var4 = menuArguments2[var2];
					var5 = menuOpcodes[var2];
					var6 = menuIdentifiers[var2];
					var7 = menuItemIds[var2];
					String var8 = menuActions[var2];
					String var9 = menuTargets[var2];
					WorldMapIcon_0.menuAction(var3, var4, var5, var6, var7, var8, var9, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}

				if (var1 == 2 && menuOptionsCount > 0) {
					this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}
			}

		}
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "94"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = class132.method710();
		boolean var2 = leftClickOpensMenu && menuOptionsCount > 2;
		if (!var2) {
			boolean var3;
			if (var1 < 0) {
				var3 = false;
			} else {
				int var4 = menuOpcodes[var1];
				if (var4 >= 2000) {
					var4 -= 2000;
				}

				if (var4 == 1007) {
					var3 = true;
				} else {
					var3 = false;
				}
			}

			var2 = var3;
		}

		return var2 && !menuShiftClick[var1];
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1710226579"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		int var3 = class166.fontBold12.stringWidth("Choose Option");

		int var4;
		for (var4 = 0; var4 < menuOptionsCount; ++var4) {
			Font var5 = class166.fontBold12;
			String var6;
			if (var4 < 0) {
				var6 = "";
			} else if (menuTargets[var4].length() > 0) {
				var6 = menuActions[var4] + " " + menuTargets[var4];
			} else {
				var6 = menuActions[var4];
			}

			int var7 = var5.stringWidth(var6);
			if (var7 > var3) {
				var3 = var7;
			}
		}

		var3 += 8;
		var4 = menuOptionsCount * 15 + 22;
		int var8 = var1 - var3 / 2;
		if (var8 + var3 > class448.canvasWidth) {
			var8 = class448.canvasWidth - var3;
		}

		if (var8 < 0) {
			var8 = 0;
		}

		int var9 = var2;
		if (var2 + var4 > class270.canvasHeight) {
			var9 = class270.canvasHeight - var4;
		}

		if (var9 < 0) {
			var9 = 0;
		}

		class180.menuX = var8;
		NewShit.menuY = var9;
		class237.field2151 = var3;
		class60.field313 = menuOptionsCount * 15 + 22;
		var1 -= viewportOffsetX;
		var2 -= viewportOffsetY;
		class36.scene.menuOpen(Clock.Client_plane, var1, var2, false);
		isMenuOpen = true;
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "53"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		class13.method46(rootInterface, class448.canvasWidth, class270.canvasHeight, var1);
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(Lmb;B)V",
		garbageValue = "36"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : FriendSystem.getWidget(var1.parentId);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = class448.canvasWidth;
			var4 = class270.canvasHeight;
		} else {
			var3 = var2.width * 1387970291;
			var4 = var2.height * -175088023;
		}

		SoundSystem.alignWidgetSize(var1, var3, var4, false);
		class140.alignWidgetPosition(var1, var3, var4);
	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "42"
	)
	final void method375() {
		Messages.invalidateWidget(clickedWidget);
		++class348.widgetDragDuration;
		if (field391 && field392) {
			int var1 = MouseHandler.MouseHandler_x * -1367600295;
			int var2 = MouseHandler.MouseHandler_y * -808246845;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field500) {
				var1 = field500;
			}

			if (var1 + clickedWidget.width * 1387970291 > field500 + clickedWidgetParent.width * 1387970291) {
				var1 = field500 + clickedWidgetParent.width * 1387970291 - clickedWidget.width * 1387970291;
			}

			if (var2 < field504) {
				var2 = field504;
			}

			if (clickedWidget.height * -175088023 + var2 > clickedWidgetParent.height * -175088023 + field504) {
				var2 = clickedWidgetParent.height * -175088023 + field504 - clickedWidget.height * -175088023;
			}

			int var3 = var1 - field502;
			int var4 = var2 - field507;
			int var5 = clickedWidget.dragZoneSize;
			if (class348.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}

			int var6 = var1 - field500 + clickedWidgetParent.scrollX;
			int var7 = var2 - field504 + clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = clickedWidget.onDrag;
				Clock.runScriptEvent(var8);
			}

			if (MouseHandler.MouseHandler_currentButton == 0) {
				if (isDraggingWidget) {
					if (clickedWidget.onDragComplete != null) {
						var8 = new ScriptEvent();
						var8.widget = clickedWidget;
						var8.mouseX = var6;
						var8.mouseY = var7;
						var8.dragTarget = draggedOnWidget;
						var8.args = clickedWidget.onDragComplete;
						Clock.runScriptEvent(var8);
					}

					if (draggedOnWidget != null) {
						Widget var9 = clickedWidget;
						int var10 = Interpreter.method413(StudioGame.getWidgetFlags(var9));
						Widget var13;
						if (var10 == 0) {
							var13 = null;
						} else {
							int var11 = 0;

							while (true) {
								if (var11 >= var10) {
									var13 = var9;
									break;
								}

								var9 = FriendSystem.getWidget(var9.parentId);
								if (var9 == null) {
									var13 = null;
									break;
								}

								++var11;
							}
						}

						if (var13 != null) {
							PacketBufferNode var12 = ObjectComposition.getPacketBufferNode(ClientPacket.field2547, packetWriter.isaacCipher);
							var12.packetBuffer.writeIntME(clickedWidget.itemId);
							var12.packetBuffer.writeIntME(draggedOnWidget.childIndex * 112312013);
							var12.packetBuffer.writeInt(draggedOnWidget.field_9 * 1486786309);
							var12.packetBuffer.writeShortAdd(clickedWidget.field_9 * 1486786309);
							var12.packetBuffer.method2539(clickedWidget.childIndex * 112312013);
							var12.packetBuffer.method2537(draggedOnWidget.itemId);
							packetWriter.addNode(var12);
						}
					}
				} else if (this.shouldLeftClickOpenMenu()) {
					this.openMenu(field502 + widgetClickX, widgetClickY + field507);
				} else if (menuOptionsCount > 0) {
					class382.method2003(widgetClickX + field502, widgetClickY + field507);
				}

				clickedWidget = null;
			}

		} else {
			if (class348.widgetDragDuration > 1) {
				if (!isDraggingWidget && menuOptionsCount > 0) {
					class382.method2003(field502 + widgetClickX, widgetClickY + field507);
				}

				clickedWidget = null;
			}

		}
	}

	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "(I)Lun;",
		garbageValue = "-1538198940"
	)
	@Export("username")
	public Username username() {
		return Projectile.localPlayer != null ? Projectile.localPlayer.username : null;
	}

	@Export("init")
	@ObfuscatedName("init")
	public final void init() {
		if (this.checkHost()) {
			for (int var1 = 0; var1 <= 28; ++var1) {
				String var2 = this.getParameter(Integer.toString(var1));
				if (var2 != null) {
					switch(var1) {
					case 3:
						if (var2.equalsIgnoreCase("true")) {
							isMembersWorld = true;
						} else {
							isMembersWorld = false;
						}
						break;
					case 4:
						if (clientType == -1) {
							clientType = Integer.parseInt(var2);
						}
						break;
					case 5:
						worldProperties = Integer.parseInt(var2);
						break;
					case 6:
						int var4 = Integer.parseInt(var2);
						Language var9;
						if (var4 >= 0 && var4 < Language.field3560.length) {
							var9 = Language.field3560[var4];
						} else {
							var9 = null;
						}

						TriBool.clientLanguage = var9;
						break;
					case 7:
						KeyHandler.field73 = class177.method907(Integer.parseInt(var2));
						break;
					case 8:
						if (var2.equalsIgnoreCase("true")) {
						}
						break;
					case 9:
						class443.param9 = var2;
						break;
					case 10:
						StudioGame[] var5 = new StudioGame[]{StudioGame.game3, StudioGame.game5, StudioGame.game4, StudioGame.stellardawn, StudioGame.oldscape, StudioGame.runescape};
						GameBuild.field3110 = (StudioGame)GameObject.findEnumerated(var5, Integer.parseInt(var2));
						if (GameBuild.field3110 == StudioGame.oldscape) {
							WorldMapScaleHandler.loginType = LoginType.oldscape;
						} else {
							WorldMapScaleHandler.loginType = LoginType.field4004;
						}
						break;
					case 11:
						MusicPatchNode2.field2728 = var2;
						break;
					case 12:
						worldId = Integer.parseInt(var2);
					case 13:
					case 16:
					case 18:
					case 19:
					case 20:
					case 22:
					case 23:
					case 24:
					default:
						break;
					case 14:
						class156.field1380 = Integer.parseInt(var2);
						break;
					case 15:
						gameBuild = Integer.parseInt(var2);
						break;
					case 17:
						class512.field4135 = var2;
						break;
					case 21:
						param21 = Integer.parseInt(var2);
						break;
					case 25:
						int var3 = var2.indexOf(".");
						if (var3 == -1) {
							param25 = Integer.parseInt(var2);
						} else {
							param25 = Integer.parseInt(var2.substring(0, var3));
							Integer.parseInt(var2.substring(var3 + 1));
						}
					}
				}
			}

			Scene.Scene_isLowDetail = false;
			isLowDetail = false;
			class17.worldHost = this.getCodeBase().getHost();
			String var6 = KeyHandler.field73.name;
			byte var7 = 0;

			try {
				ItemComposition.method1043("oldschool", var6, var7, 22);
			} catch (Exception var8) {
				class260.RunException_sendStackTrace((String)null, var8);
			}

			class347.client = this;
			class451.field3843 = clientType;
			class490.method2453();
			if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
				this.field656 = true;
			}

			if (field423 == -1) {
				if (!this.method347() && !this.method348()) {
					field423 = 0;
				} else {
					field423 = 5;
				}
			}

			this.startThread(765, 503, 214, 1);
		}
	}

	protected void finalize() throws Throwable {
		ObjectComposition.method1027(this);
		super.finalize();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-488867315"
	)
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (class143.Widget_loadedInterfaces[var0]) {
			return true;
		} else if (!Widget.Widget_archive.tryLoadGroup(var0)) {
			return false;
		} else {
			int var1 = Widget.Widget_archive.getGroupFileCount(var0);
			if (var1 == 0) {
				class143.Widget_loadedInterfaces[var0] = true;
				return true;
			} else {
				if (class16.Widget_interfaceComponents[var0] == null) {
					class16.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) {
					if (class16.Widget_interfaceComponents[var0][var2] == null) {
						byte[] var3 = Widget.Widget_archive.takeFile(var0, var2);
						if (var3 != null) {
							class16.Widget_interfaceComponents[var0][var2] = new Widget();
							class16.Widget_interfaceComponents[var0][var2].field_9 = (var2 + (var0 << 16)) * 1647896013;
							if (var3[0] == -1) {
								class16.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								class16.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3));
							}
						}
					}
				}

				class143.Widget_loadedInterfaces[var0] = true;
				return true;
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1332135425"
	)
	public static boolean method344(int var0) {
		return var0 >= WorldMapDecorationType.field3091.field_66 && var0 <= WorldMapDecorationType.field3097.field_66;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "-1301142302"
	)
	static int method363(int var0, Script var1, boolean var2) {
		if (var0 == 5630) {
			logoutTimer = 250;
			return 1;
		} else {
			return 2;
		}
	}
}
