package academy.devdojo.maratonajava.introducao;

public class Aula08Arrays {
    public static void main(String[] args) {

        int [] idades = new int[3]; // objeto array instanciado com 5 posições
    idades[0] = 31;
    idades[1] = 32;
    idades[2] = 33;

        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
       //    System.out.println(idades[3]); gera excção pois a posição excede tamanho declarado do array

    }
}
