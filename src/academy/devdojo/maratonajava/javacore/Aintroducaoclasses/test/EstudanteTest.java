package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

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
