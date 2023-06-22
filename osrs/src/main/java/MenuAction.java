import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("Widget_spritesArchive")
	public static AbstractArchive Widget_spritesArchive;
	@ObfuscatedName("at")
	@Export("param0")
	int param0;
	@ObfuscatedName("an")
	@Export("param1")
	int param1;
	@ObfuscatedName("av")
	@Export("opcode")
	int opcode;
	@ObfuscatedName("as")
	@Export("identifier")
	int identifier;
	@ObfuscatedName("ax")
	@Export("itemId")
	int itemId;
	@ObfuscatedName("ap")
	@Export("action")
	String action;
	@ObfuscatedName("ab")
	@Export("target")
	String target;

	MenuAction() {
		super();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1739019735"
	)
	public static int method421() {
		return ++MouseHandler.MouseHandler_idleCycles - 1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lmb;I)I",
		garbageValue = "-282518364"
	)
	static int method422(Widget var0) {
		if (var0.type != 11) {
			--class149.Interpreter_stringStackSize;
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var0.method1838(var1);
			return 1;
		}
	}
}
