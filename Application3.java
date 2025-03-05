public import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        // Créer un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir une chaîne de caractères
        System.out.print("Entrez une chaîne de caractères : ");
        String ch = scanner.nextLine();

        // Supprimer les espaces et convertir en minuscules
        ch = ch.replace(" ", "").toLowerCase();

        // Vérifier si la chaîne est un palindrome
        String inverse = new StringBuilder(ch).reverse().toString(); // Inverser la chaîne

        // Afficher le résultat
        if (ch.equals(inverse)) {
            System.out.println("\"" + ch + "\" est un palindrome.");
        } else {
            System.out.println("\"" + ch + "\" n'est pas un palindrome.");
        }

        // Fermer le scanner
        scanner.close();
    }
}
