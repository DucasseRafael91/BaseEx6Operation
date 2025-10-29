package baseEx6Operation;

public class Matrix {
	
	public static void main(String[] args) {
        // Création de deux matrices 2x3 (2 lignes, 3 colonnes)
        int[][] matrix1 = new int[2][3];
        int[][] matrix2 = new int[2][3];

        // Exemple d'initialisation des matrices
        matrix1[0][0] = 1; matrix1[0][1] = 2; matrix1[0][2] = 0;
        matrix1[1][0] = 4; matrix1[1][1] = 3; matrix1[1][2] = -1;

        matrix2[0][0] = 5; matrix2[0][1] = 2; matrix2[0][2] = 3;
        matrix2[1][0] = 1; matrix2[1][1] = 3; matrix2[1][2] = 4;

        // Affichage des deux matrices
        System.out.println("Matrice 1 :");
        displayMatrix(matrix1);

        System.out.println("\nMatrice 2 :");
        displayMatrix(matrix2);
    }

    // Méthode pour afficher une matrice
    public static void displayMatrix(int[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
