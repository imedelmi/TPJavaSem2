
    import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une chaîne de caractères : ");
        String ch = scanner.nextLine();

        String[] mots = ch.split(" "); 
        String premierMot = mots[0]; 

        System.out.println("Le premier mot de la chaîne \"" + ch + "\" est : \"" + premierMot + "\"");

        scanner.close();
    }
}

