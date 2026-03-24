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

    double grossCalculator(int a, int b, int temp){
        int x;
        switch (temp){
            case 1: x = a + b; break;
            case 2: x = a - b; break;
            case 3: x = a * b; break;
            case 4: x = a / b; break;
            default: x = 0; break;
        }
        return x;
    }

    //Banco!!!
    private double Saldo = 1000.00;
    double deposito(int add){
        return Saldo + add;
    }
    double saque(int sub){
        return Saldo - sub;
    }

    double getSaldo() {
        return Saldo;
    }

    double valorCompra(double valor, int input){
        return (valor*input)/100;
    }

    double descontoCompra(double valor, int input){
        return ((valor*input)/100)- valor;
    }



}
