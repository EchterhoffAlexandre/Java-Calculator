import java.util.Scanner;




public class Calculator {
    public static void main (String[] args) {

        // Créer un objet Scanner afin de lire les entrées utilisateurs 
        Scanner scanner = new Scanner(System.in);

        // Déclaration des variables pour les deux nombres saisis et le résultat avec le type 'Double'
        double num1, num2, result;

        // Déclaration de la variable 'opérateur' en type 'char'
        char operator;



        // Demander à l'utilisateur de saisir un premier nombre : 
        System.out.print("Entrez le premier nombre : ");
        // Lecture de l'entrée utilisateur : 
        num1 = scanner.nextDouble();

        // Demander à l'utilisateur de saisir un opérateur : 
        System.out.print("Entrez l'opérateur souhaité parmis (+, -, *, /) : ");
        // Lecture de l'entrée utilisateur : 
        operator = scanner.next().charAt(0);

        // Demander à l'utilisateur de saisir un deuxième nombre : 
        System.out.print("Entrez le deuxième nombre : ");
        // Lecture de l'entrée utilisateur : 
        num2 = scanner.nextDouble();

        

        // Switch permettant le calcul du résultat en fonction de l'opérateur : 
        switch(operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // Vérification de la division par 0
                if (num2 != 0) {
                    result = num1 / num2;
                    break;
                } else if (num1 == 0) {
                    System.out.println("Erreur : la division par 0 n'est pas autorisée.");
                    return; 
                }
                // Gérer la division par 0 pour d'autres cas
                System.out.println("Erreur : la division par 0 n'est pas autorisée.");
                return; 
            default:
                // Dans le cas où l'opérateur n'est pas valide
                System.out.println("Erreur : Opérateur non valide.");
                return;
        }
        
        // Affichage du résultat : 
        System.out.println("Le résultat est : " + result);
    }
}