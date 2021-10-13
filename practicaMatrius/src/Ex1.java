public class Ex1 {
    public static void main(String[] args) {
        // Matrix
        int matrix[][]={
                {3,		4,		5},
                {6,	    7,		8},
                {9,	    10,	    11}
        };
        // Mostrar la diagonal inversa de la matriu
        for(int y = matrix.length-1; y >= 0; y--){
            System.out.println(matrix[matrix.length-1-y][y]);
        }

        // Mostrar cada fila per pantalla
        for(int y = 0; y < matrix.length; y++){
            for (int x = 0; x < matrix.length; x++){
                System.out.print(matrix[y][x]+" ");
            }
            System.out.println();
        }

        // Mostrar per columnes
        for(int y = 0; y < matrix.length; y++){
            for (int x = 0; x < matrix.length; x++){
                System.out.print(matrix[x][y]+" ");
            }
            System.out.println();
        }

        // Mostrar la diagonal
        for(int y = 0; y < matrix.length; y++){
            System.out.print(matrix[y][y]+" ");
        }
    }
}
