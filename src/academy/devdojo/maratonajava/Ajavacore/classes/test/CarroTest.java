package academy.devdojo.maratonajava.Ajavacore.classes.test;

import academy.devdojo.maratonajava.Ajavacore.classes.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {

        Carro vectra = new Carro();
        Carro sentra = new Carro();

        vectra.modelo = "Elegance";
        vectra.anoFabricacao = 2007;
        vectra.nome = "Vectra";

        sentra.nome = "Sentra";
        sentra.anoFabricacao = 2016;
        sentra.modelo = "SV";

        System.out.println("Nome do veículo: " + vectra.nome + "\nModelo do veículo: " + vectra.modelo + "\nAno de fabricação: " + vectra.anoFabricacao);
        System.out.println("--------------------------------");
        System.out.println("Nome do veículo: " + sentra.nome + "\nModelo do veículo: " + sentra.modelo + "\nAno de fabricação: " + sentra.anoFabricacao);
    }
}
