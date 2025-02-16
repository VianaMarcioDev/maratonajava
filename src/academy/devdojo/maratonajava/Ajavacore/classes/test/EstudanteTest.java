package academy.devdojo.maratonajava.Ajavacore.classes.test;

import academy.devdojo.maratonajava.Ajavacore.classes.domain.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        estudante.nome = "Joao";
        estudante.sexo = 'M';
        estudante.idade = 18;

        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
    }
}
