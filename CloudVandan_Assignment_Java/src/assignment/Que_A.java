package assignment;

import java.util.Random;

public class Que_A {
	
	public static void shuffleArray(int[] arr) {
        int n = arr.length;
        Random rand = new Random();

        for (int i = n - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            
            // Swap array[i] and array[j]
            
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,2,3,4,5,6,7};
		
		shuffleArray(arr);
		
		for(int a : arr)
			System.out.print(a+" ");
		
	}
}
