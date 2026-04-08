package hamburgueria;

public class ExtraHamburguer extends PedidoDecorator {

    public ExtraHamburguer(Pedido pedido) {
        super(pedido);
    }

    @Override
    public float getPrecoAdicional() {
        return 6.0f;
    }

    @Override
    public String getIngrediente() {
        return "Hamburguer Extra";
    }
}
