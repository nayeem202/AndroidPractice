/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Arrays;

/**
 *
 * @author PC MELA
 */
public class JavaApplication1 {

	public static void main(String[] args) {
		int[] arr = {15,10,4,7,23};
		int target =30 ;
		
		int[] sumarr = sumArray(arr, target);
		System.out.print(Arrays.toString(sumarr));
	}

	private static int[] sumArray(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
                    //15
			for (int j = 0; j < arr.length; j++) {
                            //15,10,4,7,23
				int sum = arr[i] + arr[j];
				
				if (sum == target) {
					return new int[] {i , j};
				}
			}
		}
		
		return new int[] {-1};
		 
}
}

 
