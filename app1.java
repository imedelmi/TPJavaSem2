import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Entrez une chaîne de caractères (max 50 caractères) : ");
        String ch = scanner.nextLine();

    
        if (ch.length() > 50) {
            System.out.println("Erreur : La chaîne dépasse 50 caractères.");
            return;
        }

       
        System.out.print("Entrez le mot à rechercher (max 10 caractères) : ");
        String mot1 = scanner.nextLine();

       
        if (mot1.length() > 10) {
            System.out.println("Erreur : Le mot à rechercher dépasse 10 caractères.");
            return;
        }

        
        System.out.print("Entrez le mot de remplacement (max 10 caractères) : ");
        String mot2 = scanner.nextLine();

        
        if (mot2.length() > 10) {
            System.out.println("Erreur : Le mot de remplacement dépasse 10 caractères.");
            return;
        }

        
        String resultat = ch.replace(mot1, mot2);

        
        System.out.println("Résultat après remplacement : \"" + resultat + "\"");

        
        scanner.close();
    }
}