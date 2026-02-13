package arrays;

public class Burbuja {

	public static void main(String[] args) {
		
		int[] arr = {1,3,4,2,6,5,7,8,10,9};
		
		int aux;
		boolean cambiado;
		for (int i = 0; i < arr.length; i++) {
			cambiado= false;
			for (int j = 0; j < arr.length -1 - i; j++) {
				if (arr[j] > arr[j+1]) {
					aux =arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=aux;
					cambiado=true;
				}
			}
			if (!cambiado)
				break;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
