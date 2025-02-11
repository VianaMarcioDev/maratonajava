package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {

//        if(condicao){
//            código que será executado caso condição seja true;
//        }else if (condicao 2){
//            código que será executado caso condição2 seja true;
//        }else{
//            código que será executado caso todas as condições sejam false;
//        }


        // operador ternário

        int idade = 20;
        String condutorHabilitado = idade >= 18 ? "Sim" : "Não";
        System.out.println(condutorHabilitado);
    }
}
