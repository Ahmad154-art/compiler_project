// Generated from java-escape by ANTLR 4.11.1
package antlr_grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DartParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DartParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DartParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DartParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(DartParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#classMain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMain(DartParser.ClassMainContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#classHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassHeader(DartParser.ClassHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(DartParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#parameterClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterClass(DartParser.ParameterClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(DartParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#listbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListbody(DartParser.ListbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#parameterInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterInt(DartParser.ParameterIntContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(DartParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#functionHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionHeader(DartParser.FunctionHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(DartParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#conditionFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionFor(DartParser.ConditionForContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#forBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForBody(DartParser.ForBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(DartParser.PrintContext ctx);
}