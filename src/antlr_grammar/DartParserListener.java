// Generated from java-escape by ANTLR 4.11.1
package antlr_grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DartParser}.
 */
public interface DartParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DartParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DartParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DartParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(DartParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(DartParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#classMain}.
	 * @param ctx the parse tree
	 */
	void enterClassMain(DartParser.ClassMainContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#classMain}.
	 * @param ctx the parse tree
	 */
	void exitClassMain(DartParser.ClassMainContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#classHeader}.
	 * @param ctx the parse tree
	 */
	void enterClassHeader(DartParser.ClassHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#classHeader}.
	 * @param ctx the parse tree
	 */
	void exitClassHeader(DartParser.ClassHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(DartParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(DartParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#parameterClass}.
	 * @param ctx the parse tree
	 */
	void enterParameterClass(DartParser.ParameterClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#parameterClass}.
	 * @param ctx the parse tree
	 */
	void exitParameterClass(DartParser.ParameterClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(DartParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(DartParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#listbody}.
	 * @param ctx the parse tree
	 */
	void enterListbody(DartParser.ListbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#listbody}.
	 * @param ctx the parse tree
	 */
	void exitListbody(DartParser.ListbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#parameterInt}.
	 * @param ctx the parse tree
	 */
	void enterParameterInt(DartParser.ParameterIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#parameterInt}.
	 * @param ctx the parse tree
	 */
	void exitParameterInt(DartParser.ParameterIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(DartParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(DartParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#functionHeader}.
	 * @param ctx the parse tree
	 */
	void enterFunctionHeader(DartParser.FunctionHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#functionHeader}.
	 * @param ctx the parse tree
	 */
	void exitFunctionHeader(DartParser.FunctionHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(DartParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(DartParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#conditionFor}.
	 * @param ctx the parse tree
	 */
	void enterConditionFor(DartParser.ConditionForContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#conditionFor}.
	 * @param ctx the parse tree
	 */
	void exitConditionFor(DartParser.ConditionForContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#forBody}.
	 * @param ctx the parse tree
	 */
	void enterForBody(DartParser.ForBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#forBody}.
	 * @param ctx the parse tree
	 */
	void exitForBody(DartParser.ForBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(DartParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(DartParser.PrintContext ctx);
}