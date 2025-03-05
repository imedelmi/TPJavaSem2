
    import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {
        // Créer un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir une chaîne de caractères
        System.out.print("Entrez une chaîne de caractères : ");
        String ch = scanner.nextLine();

        // Inverser la chaîne
        String chInverse = new StringBuilder(ch).reverse().toString();

        // Afficher la chaîne inversée
        System.out.println("La chaîne inversée est : \"" + chInverse + "\"");

        // Fermer le scanner
        scanner.close();
    }
}
    

