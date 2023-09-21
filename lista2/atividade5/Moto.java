// Subclasse Moto
class Moto extends Veiculo {
    public Moto(String marca, String modelo, int anoFabricacao) {
        super(marca, modelo, anoFabricacao);
    }

    public void empinar() {
        System.out.println("A moto está empinando.");
    }
}
