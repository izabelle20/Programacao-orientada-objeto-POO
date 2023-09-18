/*------------------------------------------Atividade 5 ---------------------------------------------------------------------------------------------------------------------------------------
Crie uma pasta atividade5 no seu repositório de atividade. 

Desenvolva uma hierarquia de classes para representar diferentes tipos de veículos, como carros, motos e bicicletas. Crie uma classe base chamada Veiculo que contenha atributos compartilhados, como marca, modelo e ano de fabricação, bem como métodos comuns, como acelerar e frear. Em seguida, crie subclasses para veículos específicos, como Carro, Moto e Bicicleta, que herdem da classe Veiculo e forneçam implementações personalizadas para esses métodos. Crie uma classe Executavel que implemente instâncias desses objetos e apresente os seus diferentes comportamentos.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
// Classe base Veiculo
class Veiculo {
    private String marca;
    private String modelo;
    private int anoFabricacao;

    public Veiculo(String marca, String modelo, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    public void acelerar() {
        System.out.println("O veículo está acelerando.");
    }

    public void frear() {
        System.out.println("O veículo está freando.");
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }
}

// Subclasse Carro
class Carro extends Veiculo {
    public Carro(String marca, String modelo, int anoFabricacao) {
        super(marca, modelo, anoFabricacao);
    }

    public void ligarArCondicionado() {
        System.out.println("O ar condicionado do carro está ligado.");
    }
}

// Subclasse Moto
class Moto extends Veiculo {
    public Moto(String marca, String modelo, int anoFabricacao) {
        super(marca, modelo, anoFabricacao);
    }

    public void empinar() {
        System.out.println("A moto está empinando.");
    }
}

// Subclasse Bicicleta
class Bicicleta extends Veiculo {
    public Bicicleta(String marca, String modelo, int anoFabricacao) {
        super(marca, modelo, anoFabricacao);
    }

    public void pedalar() {
        System.out.println("A bicicleta está sendo pedalada.");
    }
}

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
