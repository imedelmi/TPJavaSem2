import java.util.Scanner;

public class Application1 {

    public static int compterOccurrences(String ch, char car) {
        int count = 0; 
        for (int i = 0; i < ch.length(); i++) {
            if (ch.charAt(i) == car) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une chaîne de caractères : ");
        String ch = scanner.nextLine();
        System.out.print("Entrez un caractère : ");
        char car = scanner.next().charAt(0);
        int nombreOccurrences = compterOccurrences(ch, car);
        System.out.println("Le nombre d'occurrences de '" + car + "' dans \"" + ch + "\" est : " + nombreOccurrences);

        
        scanner.close();
    }
}