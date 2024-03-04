// Generated from C:/Users/aserr/OneDrive/Documentos/UNI/year_3/Procesaror de lenguajes/practicaLen_2/src/Lexico_P2.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Lexico_P2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Lexico_P2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Lexico_P2Parser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(Lexico_P2Parser.RContext ctx);
}