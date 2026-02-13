package arrays;

import java.util.Scanner;

public class Ejercicio4 {

	final static int MAX =4;
	
	
	
	public static boolean esCreciente(int[] array) {
		
		for (int i = 0; i < array.length-1; i++) {
			if(array[i]>array[i+1])
				return false;
		}
		return true;
	}
	
	public static boolean esDescreciente(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			if(array[i]<array[i+1])
				return false;
		}
		return true;
	}
	

	
	public static void main(String[] args) {
		
		//Declarar el lector
		Scanner sc = new Scanner(System.in);
		
		//Declarar el array
		int[] A = new int[MAX];

		
		try {
			for (int i = 0; i < A.length; i++) {
				System.out.print("valor de A ["+i+"]: ");
				A[i]=sc.nextInt();
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			sc.close();
		}
		
		
		for (int i = 0; i < MAX; i++) {
			System.out.print(A[i]+" - ");
			
		}
		
		if (esCreciente(A)) {
			System.out.println("Es creciente");
		}else if(esDescreciente(A)){
			System.out.println("Es descreciente");
			
		}else {
			System.out.println("Es desordinado");
		}
		
	}

}
