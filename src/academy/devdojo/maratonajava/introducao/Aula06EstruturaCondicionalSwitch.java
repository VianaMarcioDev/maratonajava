package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaCondicionalSwitch {
    public static void main(String[] args) {

        String diaDaSemana = "5";
        switch (diaDaSemana) { // olha cada case até que um corresponda, senão executa código da opção default
            case "1":
                System.out.println("Domingo");
                break; // break impede que todo o código subsequente também seja executado, mesmo não correspondendo
            case "2":
                System.out.println("Segunda");
                break; // break também faz com que saia do switch
            case "3":
                System.out.println("Terça");
                break;
            case "4":
                System.out.println("Quarta");
                break;
            case "5":
                System.out.println("Quinta");
                break;
            case "6":
                System.out.println("Sexta");
                break;
            case "7":
                System.out.println("Sabado");
                break;
            default: // código que será executado caso nenhum case corresponda
                System.out.println("Erro");
        }
    }
}
