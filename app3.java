
    import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Entrez une chaîne de caractères (max 20 caractères) : ");
        String ch = scanner.nextLine();

        
        if (ch.length() > 20) {
            System.out.println("Erreur : La chaîne dépasse 20 caractères.");
            return;
        }

        
        StringBuilder resultat = new StringBuilder();
        boolean nouveauMot = true; 

        for (int i = 0; i < ch.length(); i++) {
            char caractere = ch.charAt(i);

            if (nouveauMot && Character.isLetter(caractere)) {
                
                resultat.append(Character.toUpperCase(caractere));
                nouveauMot = false;
            } else {
                
                resultat.append(caractere);
            }

            
            if (caractere == ' ') {
                nouveauMot = true;
            }
        }

        
        System.out.println("La chaîne transformée est : \"" + resultat.toString() + "\"");

        
        scanner.close();
    }
}
}
