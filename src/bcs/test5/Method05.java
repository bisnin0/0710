package bcs.test5;

import java.util.Arrays;

public class Method05 {

	static void updateArray(int[] B){
		for(int i=0;i<B.length;i++)
			B[i] += 10;
	}
	
	public static void main(String[] args) {
		int[] A = {3,4,2,9,8,1};
		System.out.println(Arrays.toString(A));
		updateArray(A);
		System.out.println(Arrays.toString(A));
		updateArray(A);
		System.out.println(Arrays.toString(A));
	}

}
