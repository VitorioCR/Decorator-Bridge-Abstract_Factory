package hamburgueria;

public class FabricaGourmet implements FabricaIngredientes {

    @Override
    public String criarPao() {
        return "Pao Brioche";
    }

    @Override
    public String criarCarne() {
        return "Carne Wagyu";
    }

    @Override
    public String criarMolho() {
        return "Molho Trufado";
    }
}
