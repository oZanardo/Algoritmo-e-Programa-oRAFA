import java.util.*;

public class Main {
    public static void main(String[] args){

        //var
        Scanner sc = new Scanner(System.in);
        int temp;
        int input,inputB;
        double valor, valorFinal;
        input = -1;

        //lista exercicios

            List<Exercicios> listExercicios = new ArrayList<>();
            listExercicios.add(new Exercicios("Leia um número inteiro e mostre PAR ou ÍMPAR."));
            listExercicios.add(new Exercicios("Leia dois inteiros e mostre o maior (ou “Iguais”)"));
            listExercicios.add(new Exercicios("Mostre: \n" + "\n" + "1- Somar\n" + "2- Subtrair\n" + "3- Multiplicar\n" + "4- Dividir\n" + "Digite a opcao"));
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
                System.out.println(listExercicios.get(temp-1).parImpar(input));
                break;
            case 2:
                System.out.println(listExercicios.get(temp-1).getEnunciado());
                input = sc.nextInt();
                inputB = sc.nextInt();
                System.out.println(listExercicios.get(temp-1).maiorDois(input,inputB));
            break;
            case 3:
                System.out.println(listExercicios.get(temp-1).getEnunciado());
                temp = sc.nextInt();
                System.out.print("Digite o primeiro numero da conta : ");
                input =  sc.nextInt();
                System.out.print("Digite o segundo numero da conta : ");
                inputB = sc.nextInt();
                System.out.println(listExercicios.get(temp-1).grossCalculator(input,inputB,temp));
                break;
            case 4:
                System.out.println(listExercicios.get(temp-1).getEnunciado());
                while(input<0||input>100){
                    System.out.print("Digite um numero valido: ");
                    input = sc.nextInt();
                }
                System.out.println("O numero valido foi : "+input);
                break;
            case 5:
                System.out.println(listExercicios.get(temp-1).getEnunciado());
                input = sc.nextInt();
                while (input != 0){
                    System.out.println("Digite um numero : ");
                    input = sc.nextInt();
                    if(input > 0)System.out.println("Numero maior que 0");
                    else System.out.println("Numero menor que 0");
                }
                break;
            case 6:
                System.out.println(listExercicios.get(temp-1).getEnunciado());
                    while (temp != 4){
                System.out.print("Menu:\n1.Depositar\n2.Sacar\n3.Ver Saldo\n4.Sair");
                temp = sc.nextInt();
                switch (temp) {
                    case 1:
                        System.out.print("Valor do deposito: ");
                        input = sc.nextInt();
                        listExercicios.get(temp-1).deposito(input);
                        break;
                    case 2:
                        System.out.print("Valor do saque: ");
                        input = sc.nextInt();
                        if (input < listExercicios.get(temp-1).getSaldo()) {
                            System.out.println("Valor indisponivel para saque");
                        } else {listExercicios.get(temp-1).saque(input);}
                        break;
                    case 3:
                        System.out.println("Seu saldo atual : "+listExercicios.get(temp-1).getSaldo());
                        break;
                    case 4: break;
                    default:
                        System.out.println("Opcao invalida");
                    break;
                }//Ia mostrar sempre o saldo dps que o cliente fizesse uma operacao, porem nao era o que estava no exercicio
                }
                break;
            case 7:
                System.out.println(listExercicios.get(temp-1).getEnunciado());
                System.out.print("Valor da compra : ");
                valor = sc.nextDouble();
                System.out.println("Categoria do cliente : ");
                temp = sc.nextInt();
                switch (temp) {
                    case 1: input = 5;
                    valorFinal = listExercicios.get(temp-1).valorCompra(valor,input);
                        System.out.println("O valor final sera R$"+(valorFinal-valor)+"\n e o desconto foi de R$"+ valorFinal);
                        break;
                    case 2: input = 10;
                        valorFinal = listExercicios.get(temp-1).valorCompra(valor,input);
                        System.out.println("O valor final sera R$"+(valorFinal-valor)+"\n e o desconto foi de R$"+ valorFinal);
                        break;
                    case 3: input = 15;
                        valorFinal = listExercicios.get(temp-1).valorCompra(valor,input);
                        System.out.println("O valor final sera R$"+(valorFinal-valor)+"\n e o desconto foi de R$"+ valorFinal);
                        break;
                    default: System.out.println("Categoria invalida, reinicie o programa");
                }
                break;
            case 8:
                System.out.println(listExercicios.get(temp-1).getEnunciado());
                int zeros=0;
                int positivos=0;
                int negativos=0;
                for (int i = 0; i<10; i++) {
                    System.out.print("Digite um numero : ");
                    input = sc.nextInt();
                    if (input == 0) zeros++;
                    else if (input > 0) positivos++;
                    else negativos++;
                }
                System.out.printf("No total foram % positivos, %d negativos, %d zeros\n ", positivos, negativos, zeros);
                break;
            case 9:
                System.out.println(listExercicios.get(temp-1).getEnunciado());
                input = sc.nextInt();
                for (int i = 1; i < input; i++) {
                    System.out.println("Contando " + i);
                }
                break;
            case 10:
                System.out.println(listExercicios.get(temp-1).getEnunciado());
                int soma = 0;
                input = sc.nextInt();
                for(int i = input; i > 0; i--){
                    soma =+ i;
                }
                break;
    default:
        System.out.println("Opção não disponivel!");
                break;
        }
    }
}

