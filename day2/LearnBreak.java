package week1.day2;

public class LearnBreak {

	
	//To print the number from 1 to 5
	//If i find the number 3, Loop should be stopped
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=1; i<=5;i++) {
			if(i==3) {
				continue;
			}
			System.out.println(i);
		}
	}

}
