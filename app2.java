
    import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Entrez une chaîne de caractères (max 30 caractères) : ");
        String ch = scanner.nextLine();

      
        if (ch.length() > 30) {
            System.out.println("Erreur : La chaîne dépasse 30 caractères.");
            return;
        }

        StringBuilder resultat = new StringBuilder();
        for (int i = 0; i < ch.length(); i++) {
            char caractere = ch.charAt(i);

            
            if (caractere >= 'a' && caractere <= 'z') {
        
                char nouveauCaractere = (char) (caractere + 3);
                if (nouveauCaractere > 'z') {
                    nouveauCaractere = (char) (nouveauCaractere - 26);
                }
                resultat.append(nouveauCaractere);
            } else if (caractere >= 'A' && caractere <= 'Z') {
                
                char nouveauCaractere = (char) (caractere + 3);
                if (nouveauCaractere > 'Z') {
                    nouveauCaractere = (char) (nouveauCaractere - 26); 
                }
                resultat.append(nouveauCaractere);
            } else {
            
                resultat.append(caractere);
            }
        }

    
        System.out.println("La chaîne codée est : \"" + resultat.toString() + "\"");

        
        scanner.close();
    }
}
}
