// Generated from ArduinoDSL.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ArduinoDSLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ArduinoDSLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ArduinoDSLParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ArduinoDSLParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArduinoDSLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ArduinoDSLParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArduinoDSLParser#pinDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPinDecl(ArduinoDSLParser.PinDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArduinoDSLParser#pinSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPinSpec(ArduinoDSLParser.PinSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArduinoDSLParser#pinModeConfig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPinModeConfig(ArduinoDSLParser.PinModeConfigContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArduinoDSLParser#digitalWriteCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigitalWriteCmd(ArduinoDSLParser.DigitalWriteCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArduinoDSLParser#digitalReadCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigitalReadCmd(ArduinoDSLParser.DigitalReadCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArduinoDSLParser#delayCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelayCmd(ArduinoDSLParser.DelayCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArduinoDSLParser#pinRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPinRef(ArduinoDSLParser.PinRefContext ctx);
}