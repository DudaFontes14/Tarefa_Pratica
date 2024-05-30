import java.util.Scanner;

public class App8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int n = scanner.nextInt();
        int soma = 0;
        int numero = 1;

        for (int i = 0; i < n; i++) {
            soma += numero;
            numero += 2;
        }

        System.out.println("A soma dos primeiros " + n + " números ímpares é: " + soma);
    }
}
