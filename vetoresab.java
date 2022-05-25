import java.util.Scanner;

public class vetoresab { //inicia classe
    public static void main(String[] args) { //inicia metodo main
        int[] A = new int[6]; //define o array A
        int[] B= new int[6]; //define o array B
        Scanner sc = new Scanner(System.in); //inicia um scanner
        int X = 0; //inicia a variavel X e define o valor como zero
        while (true) { //inicia um loop infinito
            X++; //adiciona 1 ao valor de X
            System.out.println("Digite o " + X + " elemento de A:"); //exibe na tela o texto
            A[X] = sc.nextInt(); //define a entrada do usuario como o X-esimo item do array A
            System.out.println("Digite o " + X + " elemento de B:"); //exibe na tela o texto
            B[X] = sc.nextInt(); //define a entrada do usuario como o X-esimo item do array B
            if (X > 4) break; //enrerra o looop infinito se a condição for cumprida, no caso X maior que 4
        }
         X = 1; //define o valor de X como 1
        int C = 0; //Inicia a variavel C com valor zero
        while (X <=5){ //inicia um loop enquanto a condicao for verdaira, no caso x menor ou igual a 5
            C = C + A[X]*B[X]; //C recebe o valor da formula
            X++; //adiciona 1 ao valor de X
        }
        System.out.println("Valor de C: "+ C); //exibe o texto com o valor de C
        }
        }

