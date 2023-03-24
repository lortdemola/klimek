// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaParser#prule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrule(JavaParser.PruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#creators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreators(JavaParser.CreatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#seq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeq(JavaParser.SeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#branch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranch(JavaParser.BranchContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#branchRe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranchRe(JavaParser.BranchReContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#concur}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcur(JavaParser.ConcurContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#concurRe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcurRe(JavaParser.ConcurReContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(JavaParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara(JavaParser.ParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(JavaParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#choice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoice(JavaParser.ChoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#seqSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqSeq(JavaParser.SeqSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(JavaParser.RepeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(JavaParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#arg_java}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_java(JavaParser.Arg_javaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(JavaParser.StringContext ctx);
}