// Subclasse Carro
class Carro extends Veiculo {
    public Carro(String marca, String modelo, int anoFabricacao) {
        super(marca, modelo, anoFabricacao);
    }

    public void ligarArCondicionado() {
        System.out.println("O ar condicionado do carro está ligado.");
    }
}
