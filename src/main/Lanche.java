package hamburgueria;

public abstract class Lanche implements Pedido {

    private ModoCozimento modoCozimento;
    private FabricaIngredientes fabrica;

    public Lanche(ModoCozimento modoCozimento, FabricaIngredientes fabrica) {
        this.modoCozimento = modoCozimento;
        this.fabrica = fabrica;
    }

    public ModoCozimento getModoCozimento() {
        return modoCozimento;
    }

    public FabricaIngredientes getFabrica() {
        return fabrica;
    }

    @Override
    public abstract float getPreco();

    @Override
    public abstract String getDescricao();
}
