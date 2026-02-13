package arrays.ejercicios;

public class Ejercicio1 {
	final static int MAX =5;
	
	public static void mostrarMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		int[][] matriz = new int[MAX][MAX];
		
		for (int i = 0; i < matriz.length; i++) {
			matriz[i][i]++;
		}
		
		mostrarMatriz(matriz);
		

	}

}
