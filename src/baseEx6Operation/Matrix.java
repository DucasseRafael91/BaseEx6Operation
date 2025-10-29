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

        // Addition des deux matrices
        System.out.println("Addition des matrices :");
        int[][] add_matrix_result = addMatrix(matrix1, matrix2);
        displayMatrix(add_matrix_result);
        
        // Soustraction des deux matrices
        System.out.println("Soustraction des matrices :");
        int[][] sub_matrix_result = subMatrix(matrix1, matrix2);
        displayMatrix(sub_matrix_result);
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

    // Méthode pour additionner deux matrices
    public static int[][] addMatrix(int[][] matrix1, int[][] matrix2) {

        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            System.out.println("Erreur : les matrices doivent avoir les mêmes dimensions !");
            return null;
        }

        int[][] result = new int[matrix1.length][matrix1[0].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }
    
    // Méthode pour soustraire deux matrices
    public static int[][] subMatrix(int[][] matrix1, int[][] matrix2) {

        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            System.out.println("Erreur : les matrices doivent avoir les mêmes dimensions !");
            return null;
        }

        int[][] result = new int[matrix1.length][matrix1[0].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return result;
    }
}
