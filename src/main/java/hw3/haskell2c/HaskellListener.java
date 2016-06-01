// Generated from /home/eugene/university/3course/parsing/src/main/java/hw3/haskell2c/Haskell.g4 by ANTLR 4.5.1
package hw3.haskell2c;

    import java.util.HashMap;
    import java.lang.StringBuilder;
    import hw3.haskell2c.Func;
    import hw3.haskell2c.Arg;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HaskellParser}.
 */
public interface HaskellListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HaskellParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(HaskellParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(HaskellParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(HaskellParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(HaskellParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunc_decl(HaskellParser.Func_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunc_decl(HaskellParser.Func_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#func_def}.
	 * @param ctx the parse tree
	 */
	void enterFunc_def(HaskellParser.Func_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#func_def}.
	 * @param ctx the parse tree
	 */
	void exitFunc_def(HaskellParser.Func_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(HaskellParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(HaskellParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(HaskellParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(HaskellParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(HaskellParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(HaskellParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFact(HaskellParser.FactContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFact(HaskellParser.FactContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#unit}.
	 * @param ctx the parse tree
	 */
	void enterUnit(HaskellParser.UnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#unit}.
	 * @param ctx the parse tree
	 */
	void exitUnit(HaskellParser.UnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#argsi}.
	 * @param ctx the parse tree
	 */
	void enterArgsi(HaskellParser.ArgsiContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#argsi}.
	 * @param ctx the parse tree
	 */
	void exitArgsi(HaskellParser.ArgsiContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(HaskellParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(HaskellParser.Func_callContext ctx);
}