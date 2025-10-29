package baseEx6Operation;

public class Operation {

    public static void main(String[] args) {
        // Définition de la base du triangle (nombre d'étoiles sur la dernière ligne)
        int base = 13;

        // Calcul de la hauteur du triangle
        // Formule : hauteur = (base + 1) / 2
        int hauteur = div(add(base, 1), 2);

        // Boucle pour chaque ligne du triangle
        for (int i = 1; i <= hauteur; i++) {

            // Calcul du nombre d'espaces avant les étoiles
            int espaces = sub(hauteur, i);

            // Affichage des espaces
            for (int j = 0; j < espaces; j++) {
                System.out.print(" ");
            }

            // Calcul du nombre d'étoiles à afficher sur cette ligne
            int etoiles = sub(mul(2, i), 1);

            // Affichage des étoiles
            for (int k = 0; k < etoiles; k++) {
                System.out.print("*");
            }

            // Passage à la ligne suivante
            System.out.println();
        }
    }

    public static int add(int operand_1, int operand_2) {
        return operand_1 + operand_2;
    }

    public static int sub(int operand_1, int operand_2) {
        return operand_1 - operand_2;
    }

    public static int mul(int operand_1, int operand_2) {
        return operand_1 * operand_2;
    }

    public static int div(int operand_1, int operand_2) {
        if (operand_2 == 0) {
            return 0; 
        } else {
            return operand_1 / operand_2;
        }
    }
}
