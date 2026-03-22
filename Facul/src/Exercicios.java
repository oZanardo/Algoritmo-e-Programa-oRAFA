import java.util.ArrayList;
import java.util.List;

public class Exercicios {

    private String Enunciado;
    List<Integer> Numbers = new ArrayList<>();

    String parImpar(int input){
        if (input % 2 == 0){
            return "O Valor é par";
        }
        else return "Valor é Impar";
    }


}
