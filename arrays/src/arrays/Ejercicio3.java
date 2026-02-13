package arrays;

import java.util.Scanner;

public class Ejercicio3 {

	final static int MAX =4;
	
	
	public static void main(String[] args) {
		
		//Declarar el lector
		Scanner sc = new Scanner(System.in);
		
		//Declarar el array
		int[] A = new int[MAX];
		int[] B = new int[MAX];
		
		try {
			for (int i = 0; i < A.length; i++) {
				System.out.print("valor de A ["+i+"]: ");
				A[i]=sc.nextInt();
				
			}
			for (int i = 0; i < B.length; i++) {
				System.out.print("valor de B ["+i+"]: ");
				B[i]=sc.nextInt();
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			sc.close();
		}
		
		
		for (int i = 0; i < MAX; i++) {
			System.out.print(A[i]+" - ");
			System.out.print(B[i]+" - ");
		}
		
	}

}
