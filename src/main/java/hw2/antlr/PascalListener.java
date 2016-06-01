// Generated from /home/eugene/university/3course/parsing/src/main/java/hw2/antlr/Pascal.g4 by ANTLR 4.5.1
package hw2.antlr;

    import hw2.pascal.parser.Tree;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PascalParser}.
 */
public interface PascalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PascalParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(PascalParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(PascalParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(PascalParser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(PascalParser.VarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#vars_in}.
	 * @param ctx the parse tree
	 */
	void enterVars_in(PascalParser.Vars_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#vars_in}.
	 * @param ctx the parse tree
	 */
	void exitVars_in(PascalParser.Vars_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#vars2}.
	 * @param ctx the parse tree
	 */
	void enterVars2(PascalParser.Vars2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#vars2}.
	 * @param ctx the parse tree
	 */
	void exitVars2(PascalParser.Vars2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#vars2_in}.
	 * @param ctx the parse tree
	 */
	void enterVars2_in(PascalParser.Vars2_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#vars2_in}.
	 * @param ctx the parse tree
	 */
	void exitVars2_in(PascalParser.Vars2_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#vars2_in2}.
	 * @param ctx the parse tree
	 */
	void enterVars2_in2(PascalParser.Vars2_in2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#vars2_in2}.
	 * @param ctx the parse tree
	 */
	void exitVars2_in2(PascalParser.Vars2_in2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#vars3}.
	 * @param ctx the parse tree
	 */
	void enterVars3(PascalParser.Vars3Context ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#vars3}.
	 * @param ctx the parse tree
	 */
	void exitVars3(PascalParser.Vars3Context ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(PascalParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(PascalParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#names}.
	 * @param ctx the parse tree
	 */
	void enterNames(PascalParser.NamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#names}.
	 * @param ctx the parse tree
	 */
	void exitNames(PascalParser.NamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#names2}.
	 * @param ctx the parse tree
	 */
	void enterNames2(PascalParser.Names2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#names2}.
	 * @param ctx the parse tree
	 */
	void exitNames2(PascalParser.Names2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#names2_in}.
	 * @param ctx the parse tree
	 */
	void enterNames2_in(PascalParser.Names2_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#names2_in}.
	 * @param ctx the parse tree
	 */
	void exitNames2_in(PascalParser.Names2_inContext ctx);
}