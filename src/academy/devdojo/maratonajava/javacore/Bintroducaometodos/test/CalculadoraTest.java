package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();

        calculadora.multiplicaDoisNumeros(3, 7); //NESSE CASO, 3 e 7 são os argumentos que atendem
                                                 // à exigência desse métod de informar dois inteiros x e y

        System.out.println(calculadora.divideDoisNumeros(15, 5));
    }

}
