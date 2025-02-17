package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

import org.w3c.dom.ls.LSOutput;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10 + 20);
    }

    public void multiplicaDoisNumeros(int x, int y) { //nesse exemplo , int x e int y são os parâmetros

        System.out.println(x * y);
    }

    public double divideDoisNumeros(int z, int w) {
        return z / w;
    }
}
