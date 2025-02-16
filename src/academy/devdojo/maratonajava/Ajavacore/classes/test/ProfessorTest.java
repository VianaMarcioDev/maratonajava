package academy.devdojo.maratonajava.Ajavacore.classes.test;

import academy.devdojo.maratonajava.Ajavacore.classes.domain.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor profGeografia = new Professor();
        profGeografia.nome = "Luiz";
        profGeografia.idade = 40;
        profGeografia.sexo = 'M';

        System.out.println(profGeografia.nome);
        System.out.println(profGeografia.idade);
        System.out.println(profGeografia.sexo);

        System.out.println("Nome do professor: " + profGeografia.nome
                + "\nIdade do professor: " + profGeografia.idade
                + "\nSexo: " + profGeografia.sexo);
    }
}
