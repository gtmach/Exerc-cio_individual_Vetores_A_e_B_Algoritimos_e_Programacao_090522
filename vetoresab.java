import java.util.Scanner;

public class vetoresab { //inicia classe
    public static void main(String[] args) { //inicia metodo main
        int[] A = new int[6]; //define o array A
        int[] B= new int[6]; //define o array B
        Scanner sc = new Scanner(System.in); //inicia um scanner
        int X = 0;
        while (true) {
            X++;
            System.out.println("Digite o " + X + " elemento de A:");
            A[X] = sc.nextInt();
            System.out.println("Digite o " + X + " elemento de B:");
            B[X] = sc.nextInt();
            if (X > 4) break;
        }
         X = 1;
        int C = 0;
        while (X <=5){
            C = C + A[X]*B[X];
            X++;
        }
        System.out.println("Valor de C: "+ C);
        }
        }

