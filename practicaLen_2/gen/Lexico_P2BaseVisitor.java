// Generated from C:/Users/aserr/OneDrive/Documentos/UNI/year_3/Procesaror de lenguajes/practicaLen_2/src/Lexico_P2.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link Lexico_P2Visitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
@SuppressWarnings("CheckReturnValue")
public class Lexico_P2BaseVisitor<T> extends AbstractParseTreeVisitor<T> implements Lexico_P2Visitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitR(Lexico_P2Parser.RContext ctx) { return visitChildren(ctx); }
}