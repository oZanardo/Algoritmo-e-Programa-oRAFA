import java.util.*;

public class Main {
    public static void main(String[] args){

        //var
        Scanner sc = new Scanner(System.in);
        int temp;
        int input;

        //lista exercicios

            List<Exercicios> listExercicios = new ArrayList<>();
            listExercicios.add(new Exercicios("Leia um número inteiro e mostre PAR ou ÍMPAR."));
            listExercicios.add(new Exercicios("Leia dois inteiros e mostre o maior (ou “Iguais”)"));
            listExercicios.add(new Exercicios("Mostre: \n" + "\n" + "1- Somar\n" + "2- Subtrair\n" + "3- Multiplicar\n" + "4- Dividir\n" + "Leia a opção e dois números.\n" + "⚠\uFE0F Trate divisão por zero."));
            listExercicios.add(new Exercicios("Leia uma nota entre 0 e 100. Enquanto inválida, pedir novamente"));
            listExercicios.add(new Exercicios("Leia números até digitar 0 (0 não entra na conta).\n" + "Mostre maior e menor digitado"));
            listExercicios.add(new Exercicios("Saldo inicial: R$ 1000,00\n" + "Menu: 1- Depositar \n" + "2- Sacar \n" + "3- Ver saldo \n" + "4- Sair "));
            listExercicios.add(new Exercicios("o valor da compra (real)\n" + "\n" + "a categoria do cliente (inteiro: 1 = comum, 2 = premium, 3 = funcionário)"));
            listExercicios.add(new Exercicios("Leia 10 números inteiros e conte: positivos | negativos | zero"));
            listExercicios.add(new Exercicios("Leia um número inteiro N (N > 0).\n" + "Imprima a contagem regressiva de N até 1 e, ao final, mostre a soma total desses números"));



        //Menu de exercicios
        System.out.print("Selecione o exercicio desejado : \n1. Par ou impar\n2.Maior de dois\n3.Calculadora com menu\n" +
                "4. Validação de Dados\n5. Sentinela(parada no 0)\n6.Simulador de caixa\n7. Desconto por categoria\n8.Contagem de valores \n" +
                "9. Soma de 1 até N\n10.Contagem regressiva e soma\n");

        temp = sc.nextInt();


//switch case com o enunciado de cada exercicio e os métodos

        switch (temp) {
            case 1:
                System.out.println(listExercicios.get(temp-1).getEnunciado());
                input = sc.nextInt();
                listExercicios.get(temp-1).setNumbers(input);
                System.out.println(listExercicios.get(temp-1).parImpar(listExercicios.get(temp-1).getInputs(0)));
                break;
            case 2:
                System.out.println(listExercicios.get(temp-1).getEnunciado());
            break;
            case 3:
                System.out.println(listExercicios.get(temp-1).getEnunciado());
                break;
            case 4:
                System.out.println(listExercicios.get(temp-1).getEnunciado());
                break;
            case 5:
                System.out.println(listExercicios.get(temp-1).getEnunciado());
                break;
            case 6:
                System.out.println(listExercicios.get(temp-1).getEnunciado());
                break;
            case 7:
                System.out.println(listExercicios.get(temp-1).getEnunciado());
                break;
            case 8:
                System.out.println(listExercicios.get(temp-1).getEnunciado());
                break;
            case 9:
                System.out.println(listExercicios.get(temp-1).getEnunciado());
                break;
            case 10:
                System.out.println(listExercicios.get(temp-1).getEnunciado());
                break;
    default:
        System.out.println("Opção não disponivel!");
                break;
        }





    }


}

