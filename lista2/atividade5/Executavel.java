// Classe Executavel
public class Executavel {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota", "Corolla", 2020);
        Moto minhaMoto = new Moto("Honda", "CBR600RR", 2021);
        Bicicleta minhaBicicleta = new Bicicleta("Caloi", "10", 2019);

        meuCarro.acelerar();
        meuCarro.ligarArCondicionado();

        minhaMoto.acelerar();
        minhaMoto.empinar();

        minhaBicicleta.pedalar();
    }
}
