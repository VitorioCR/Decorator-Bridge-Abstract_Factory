package hamburgueria;

public class ExtraBacon extends PedidoDecorator {

    public ExtraBacon(Pedido pedido) {
        super(pedido);
    }

    @Override
    public float getPrecoAdicional() {
        return 4.0f;
    }

    @Override
    public String getIngrediente() {
        return "Bacon Crocante";
    }
}
