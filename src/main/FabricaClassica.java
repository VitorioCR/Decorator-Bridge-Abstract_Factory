package hamburgueria;

public class FabricaClassica implements FabricaIngredientes {

    @Override
    public String criarPao() {
        return "Pao de gergelim";
    }

    @Override
    public String criarCarne() {
        return "Carne Angus";
    }

    @Override
    public String criarMolho() {
        return "Ketchup";
    }
}
