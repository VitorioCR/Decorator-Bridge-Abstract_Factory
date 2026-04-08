package hamburgueria;

public class Hamburguer extends Lanche {

    public Hamburguer(ModoCozimento modoCozimento, FabricaIngredientes fabrica) {
        super(modoCozimento, fabrica);
    }

    @Override
    public float getPreco() {
        return 18.0f;
    }

    @Override
    public String getDescricao() {
        return "Hamburguer"
                + " | " + getFabrica().criarPao()
                + " | " + getFabrica().criarCarne()
                + " | " + getFabrica().criarMolho()
                + " | " + getModoCozimento().cozinhar();
    }
}
