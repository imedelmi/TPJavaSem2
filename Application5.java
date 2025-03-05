
    import java.util.Scanner;

public class Application5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Entrez une chaîne de caractères : ");
        String ch = scanner.nextLine();

        
        StringBuilder resultat = new StringBuilder();
        for (int i = 0; i < ch.length(); i++) {
            resultat.append(ch.charAt(i));
            if (i != ch.length() - 1) { 
                resultat.append('*'); 
        }

        
        System.out.println("La chaîne avec des astérisques est : \"" + resultat.toString() + "\"");

        
        scanner.close();
    }
}
