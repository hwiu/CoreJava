package looptest;

import java.util.Scanner;

public class Test_2 {
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.println("1:语文"+"\n"+"2:数学"+"\n"+"3:英语"+"\n"+"4:外语");
		if(input.next().equals("1")){
			System.out.println("you choosed 语文");
		}else if (input.next().equals("2")) {
			System.out.println("you choosed 数学");
		}
		input.close();
	}
}
