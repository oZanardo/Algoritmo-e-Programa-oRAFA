import java.util.ArrayList;
import java.util.List;

public class Exercicios {

    private String Enunciado;
    private List<Integer> Numbers = new ArrayList<>();

    //Construtores
    Exercicios(String enunciado){
        Enunciado = enunciado;
    }

    //get and Setters
    String getEnunciado(){
        return Enunciado;
    }
    void setNumbers(int input){
        Numbers.add(input);
    }

    Integer getInputs(int i){
        return Numbers.get(i);
    }

    //Métodos
    String parImpar(int input){
        if (input % 2 == 0){
            return "O Valor é par";
        }
        else return "Valor é Impar";
    }

    String maiorDois(int a, int b){
        if(a>b) return a + " é maior que " + b;
          else if(b<a) return b + " é maior que " + a;
              else return "os dois valores são esquivalentes";
}




}
