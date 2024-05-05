// Generated from //10.97.0.20/Home_VDI$/t.elshami.2021/Desktop/C-to-Pascal-Translator-main/src/Practica2.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Practica2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Practica2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Practica2Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Practica2Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link Practica2Parser#defines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefines(Practica2Parser.DefinesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Practica2Parser#ctes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtes(Practica2Parser.CtesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Practica2Parser#partes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartes(Practica2Parser.PartesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Practica2Parser#partes2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartes2(Practica2Parser.Partes2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Practica2Parser#part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPart(Practica2Parser.PartContext ctx);
	/**
	 * Visit a parse tree produced by {@link Practica2Parser#blq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlq(Practica2Parser.BlqContext ctx);
	/**
	 * Visit a parse tree produced by {@link Practica2Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(Practica2Parser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Practica2Parser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(Practica2Parser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Practica2Parser#listparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListparam(Practica2Parser.ListparamContext ctx);
	/**
	 * Visit a parse tree produced by {@link Practica2Parser#listparam2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListparam2(Practica2Parser.Listparam2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Practica2Parser#sentlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentlist(Practica2Parser.SentlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link Practica2Parser#sentlist2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentlist2(Practica2Parser.Sentlist2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Practica2Parser#lid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLid(Practica2Parser.LidContext ctx);
	/**
	 * Visit a parse tree produced by {@link Practica2Parser#lid2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLid2(Practica2Parser.Lid2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Practica2Parser#lexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexp(Practica2Parser.LexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Practica2Parser#lexp2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexp2(Practica2Parser.Lexp2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Practica2Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(Practica2Parser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Practica2Parser#exp2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp2(Practica2Parser.Exp2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Practica2Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(Practica2Parser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Practica2Parser#factor2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor2(Practica2Parser.Factor2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Practica2Parser#factor3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor3(Practica2Parser.Factor3Context ctx);
	/**
	 * Visit a parse tree produced by {@link Practica2Parser#restpart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestpart(Practica2Parser.RestpartContext ctx);
	/**
	 * Visit a parse tree produced by {@link Practica2Parser#restpart2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestpart2(Practica2Parser.Restpart2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Practica2Parser#sent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent(Practica2Parser.SentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Practica2Parser#sent2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent2(Practica2Parser.Sent2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Practica2Parser#sent3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent3(Practica2Parser.Sent3Context ctx);
	/**
	 * Visit a parse tree produced by {@link Practica2Parser#lcond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLcond(Practica2Parser.LcondContext ctx);
	/**
	 * Visit a parse tree produced by {@link Practica2Parser#lcond2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLcond2(Practica2Parser.Lcond2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Practica2Parser#opl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpl(Practica2Parser.OplContext ctx);
	/**
	 * Visit a parse tree produced by {@link Practica2Parser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(Practica2Parser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link Practica2Parser#opr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpr(Practica2Parser.OprContext ctx);
}