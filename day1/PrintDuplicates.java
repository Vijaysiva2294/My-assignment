package week2.day1;

import java.util.Arrays;
import java.util.Iterator;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[] = {2, 5, 7, 7, 5, 9, 2, 3};
		
		Arrays.sort(num);
		
		System.out.println("Sorted values are" +Arrays.toString(num));
		
		System.out.println("Duplicate values are ");
	
		for (int i = 0; i < num.length-1; i++) {
			if(num[i]==num[i+1])
			{
				System.out.println(num[i]);
			}
		}
	}

}
