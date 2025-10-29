package baseEx6Operation;

public class Operation {

    public static void main(String[] args) {
        // --- PARTIE 1 : Affichage du triangle ---
        int base = 13;
        int hauteur = div(add(base, 1), 2);

        for (int i = 1; i <= hauteur; i++) {

            int espaces = sub(hauteur, i);

            for (int j = 0; j < espaces; j++) {
                System.out.print(" ");
            }

            int etoiles = sub(mul(2, i), 1);

            for (int k = 0; k < etoiles; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // --- PARTIE 2 : Somme des deux plus grands nombres ---
        int[] tableau = {78, 6, -250, 2, 12, 9};

        // On suppose que le tableau a au moins 2 éléments
        int max1 = 0;
        int max2 = 0;


        // Boucle pour parcourir le reste du tableau
        for (int i = 0; i < tableau.length; i++) {
            int n = tableau[i];

            if (n > max1) {
                max2 = max1;
                max1 = n;
            } else if (n > max2) {
                max2 = n;
            }
        }

        int somme = add(max1, max2);

        System.out.println("\nLes deux plus grands nombres sont : " + max1 + " et " + max2);
        System.out.println("La somme des deux plus grands nombres est : " + somme);
    }

    // --- Méthodes d’opérations de base ---
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
