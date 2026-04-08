package hamburgueria;

public class Wrap extends Lanche {

    public Wrap(ModoCozimento modoCozimento, FabricaIngredientes fabrica) {
        super(modoCozimento, fabrica);
    }

    @Override
    public float getPreco() {
        return 15.0f;
    }

    @Override
    public String getDescricao() {
        return "Wrap"
                + " | " + getFabrica().criarPao()
                + " | " + getFabrica().criarCarne()
                + " | " + getFabrica().criarMolho()
                + " | " + getModoCozimento().cozinhar();
    }
}
