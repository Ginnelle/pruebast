package prueba1;

import java.util.Arrays;

public class prueba2 {
	public static void eliminarceros(int []arr) {
	 int izq = 0;
	 int der = arr.length - 1;
	 while (izq < der) {
		 if( arr[izq] == 0) {
			 izq ++;
		 }else {
			 int aux = arr[izq];
			 arr[izq]=  arr[der];
			 arr[der]= aux;
			 der --;
		 }
			 
	 }
	 Arrays.sort(arr, izq, arr.length);
	}
	
	public static void main(String[] args) {
        int[] arr = {1, 10, 20, 0,59,63,0,88,0};
        int digitostotales =8;
        eliminarceros(arr);

        // Imprimir el arreglo resultante
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
