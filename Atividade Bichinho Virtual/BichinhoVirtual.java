import java.util.Scanner;

public class BichinhoVirtual {
    
    public static void main(String[] args) {
        Animais a = new Animais("leleco", "cioba", "cyprinidae");
        System.out.println(a);
        Scanner scanner = new Scanner(System.in);

        System.out.println("O que o pet vai fazer agora?");
        System.out.println("1 - Comer");
        System.out.println("2 - Correr");
        System.out.println("3 - Dormir");
        System.out.println("4 - Sair do progama");
        int resp = scanner.nextInt();

        while (resp != 4) {
            if(resp == 1){
                a.comer();
            }
            if(resp == 2){
                a.correr();
            }
            if(resp == 3){
                a.dormir();
            }
            if(a.forca <= 0){
                System.out.println("O pet ficou sem força e morreu!");
                break;
            }
            System.out.println("---");
            System.out.println(a);
            System.out.println("O que o pet vai fazer agora?");
            System.out.println("1 - Comer");
            System.out.println("2 - Correr");
            System.out.println("3 - Dormir");
            System.out.println("4 - Sair do progama");
            resp = scanner.nextInt();

        }
        
        scanner.close();
    }
}
