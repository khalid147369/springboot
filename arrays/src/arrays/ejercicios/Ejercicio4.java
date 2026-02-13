package arrays.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {
	final static int FILA =3;
	final static int COLUM =3;
	/**
	 * Funcíon que toma una una matriz y la muestra por pantalla
	 * @param matriz array bidimensional de números enteros
	 */
	public static void mostrarMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		int[][] A = new int[FILA][COLUM];
		int[][] B = new int[FILA][COLUM];
		int[][] AB = new int[FILA][COLUM];
		// declarar variables que recebiran las sumas de las filas
		
		// Crear un objeto de Scanner
		Scanner sc = new Scanner(System.in);
		try {
			//Matriz 1
			System.out.println("Matriz A 3x3");
			for (int i = 0; i < A.length; i++) {
				for (int j = 0; j < A[i].length; j++) {
					System.out.print("A["+i+"]["+j+"]: ");
					A[i][j] = sc.nextInt();
				}
			}
			
			//Matriz 2
			System.out.println("Matriz B 3x3");
			for (int i = 0; i < B.length; i++) {
				for (int j = 0; j < B[i].length; j++) {
					System.out.print("B["+i+"]["+j+"]: ");
					B[i][j] = sc.nextInt();
				}
			}
		} catch (InputMismatchException e) {
			// TODO: handle exception
		}
	
		
		
		
		for (int i = 0; i < FILA; i++) {
			for (int j = 0; j < COLUM; j++) {
				
				AB[i][j]=A[i][j] +B[i][j];
			}
			
		}
		
		//Mostrar los resultados
		
		System.out.println("Matriz A");
		mostrarMatriz(A);
		
		System.out.println("Matriz B");
		mostrarMatriz(B);
		
		System.out.println("Suma");
		mostrarMatriz(AB);
		

	}

}
