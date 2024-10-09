public class Matrices {
// Para aprendizaje de las caracteristicas de Arreglos Bidimencionales.
    public static void main(String[] args) {
        //Matriz cuadrada
        int[][] matriz = new int[3][3];
        int numero =0;

        //Introducir valores a la matriz cuadrada
        System.out.println();
        for(int i=0;i<3;i++){
            for(int j = 0; j<3; j++){
                matriz[i][j] = numero;
                numero ++;
                System.out.print(matriz[i][j] + "     ");
            }
            System.out.println();
        }
        System.out.println("==============================================================");

        //Matriz no cuadrada
        int [][] matriz1 = new int[3][5];
        numero= 0;
        for(int i =0; i<matriz1.length;i++){
            for(int j =0;j<matriz1[i].length;j++){
                matriz1[i][j] = numero;
                numero++;
                System.out.print(matriz1[i][j] + "   ");
            }
            System.out.println();
        }

    }
}