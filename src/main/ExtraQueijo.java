package hamburgueria;

public class ExtraQueijo extends PedidoDecorator {

    public ExtraQueijo(Pedido pedido) {
        super(pedido);
    }

    @Override
    public float getPrecoAdicional() {
        return 3.0f;
    }

    @Override
    public String getIngrediente() {
        return "Queijo Cheddar";
    }
}
