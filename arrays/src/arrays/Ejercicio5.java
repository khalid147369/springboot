package arrays;

import java.util.Scanner;

public class Ejercicio5 {

	final static int MAX =10;
	
	
	
	public static void mostrar(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]+" ");
		}
		
	}
	

	

	
	public static void main(String[] args) {
		
		//Declarar el lector
		Scanner sc = new Scanner(System.in);
		int pos ,num;
		//Declarar el array
		int[] A = new int[MAX];

		
		try {
			for (int i = 0; i < A.length -2; i++) {
				System.out.print("valor de A ["+(i+1)+"]: ");
				A[i]=sc.nextInt();
				
			}
			System.out.print("Dime una posición: ");
			pos=sc.nextInt();
			System.out.print("Dime un valor para poner en dicha posición: ");
			num=sc.nextInt();
			A[pos]=num;
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			sc.close();
		}
		
		System.out.println("tabla final: ");
		mostrar(A);
		
		
		
	}

}
