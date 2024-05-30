import java.util.Scanner;
import java.util.ArrayList;

public class App9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<String>();
       
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome " + (i+1) + ":" );
            nomes.add(scanner.nextLine());
        }

        System.out.println("Digite outro nome: ");
        String outroNome = scanner.nextLine();
        
        if (nomes.contains(outroNome)) {
            System.out.println("O nome " + outroNome + " está na lista!");
        } else{ 
            System.out.println("O nome " + outroNome + " não está na lista.");
        }
    }
}
