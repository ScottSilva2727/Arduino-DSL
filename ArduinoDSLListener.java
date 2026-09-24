// Generated from ArduinoDSL.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArduinoDSLParser}.
 */
public interface ArduinoDSLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArduinoDSLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ArduinoDSLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinoDSLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ArduinoDSLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArduinoDSLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ArduinoDSLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinoDSLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ArduinoDSLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArduinoDSLParser#pinDecl}.
	 * @param ctx the parse tree
	 */
	void enterPinDecl(ArduinoDSLParser.PinDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinoDSLParser#pinDecl}.
	 * @param ctx the parse tree
	 */
	void exitPinDecl(ArduinoDSLParser.PinDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArduinoDSLParser#pinSpec}.
	 * @param ctx the parse tree
	 */
	void enterPinSpec(ArduinoDSLParser.PinSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinoDSLParser#pinSpec}.
	 * @param ctx the parse tree
	 */
	void exitPinSpec(ArduinoDSLParser.PinSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArduinoDSLParser#pinModeConfig}.
	 * @param ctx the parse tree
	 */
	void enterPinModeConfig(ArduinoDSLParser.PinModeConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinoDSLParser#pinModeConfig}.
	 * @param ctx the parse tree
	 */
	void exitPinModeConfig(ArduinoDSLParser.PinModeConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArduinoDSLParser#digitalWriteCmd}.
	 * @param ctx the parse tree
	 */
	void enterDigitalWriteCmd(ArduinoDSLParser.DigitalWriteCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinoDSLParser#digitalWriteCmd}.
	 * @param ctx the parse tree
	 */
	void exitDigitalWriteCmd(ArduinoDSLParser.DigitalWriteCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArduinoDSLParser#digitalReadCmd}.
	 * @param ctx the parse tree
	 */
	void enterDigitalReadCmd(ArduinoDSLParser.DigitalReadCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinoDSLParser#digitalReadCmd}.
	 * @param ctx the parse tree
	 */
	void exitDigitalReadCmd(ArduinoDSLParser.DigitalReadCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArduinoDSLParser#delayCmd}.
	 * @param ctx the parse tree
	 */
	void enterDelayCmd(ArduinoDSLParser.DelayCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinoDSLParser#delayCmd}.
	 * @param ctx the parse tree
	 */
	void exitDelayCmd(ArduinoDSLParser.DelayCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArduinoDSLParser#pinRef}.
	 * @param ctx the parse tree
	 */
	void enterPinRef(ArduinoDSLParser.PinRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinoDSLParser#pinRef}.
	 * @param ctx the parse tree
	 */
	void exitPinRef(ArduinoDSLParser.PinRefContext ctx);
}