// Subclasse Bicicleta
class Bicicleta extends Veiculo {
    public Bicicleta(String marca, String modelo, int anoFabricacao) {
        super(marca, modelo, anoFabricacao);
    }

    public void pedalar() {
        System.out.println("A bicicleta está sendo pedalada.");
    }
}
