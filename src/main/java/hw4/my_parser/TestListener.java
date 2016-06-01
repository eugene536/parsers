// Generated from /home/eugene/university/3course/parsing/src/main/java/hw4/fake_antlr/Test.g4 by ANTLR 4.5.1
package hw4.my_parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TestParser}.
 */
public interface TestListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TestParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(TestParser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(TestParser.EContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#e2}.
	 * @param ctx the parse tree
	 */
	void enterE2(TestParser.E2Context ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#e2}.
	 * @param ctx the parse tree
	 */
	void exitE2(TestParser.E2Context ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(TestParser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(TestParser.TContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#t2}.
	 * @param ctx the parse tree
	 */
	void enterT2(TestParser.T2Context ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#t2}.
	 * @param ctx the parse tree
	 */
	void exitT2(TestParser.T2Context ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(TestParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(TestParser.FContext ctx);
}