package hamburgueria;

public class NoForno implements ModoCozimento {

    @Override
    public String cozinhar() {
        return "Assado no forno";
    }
}
