package looptest;

import java.util.Scanner;

public class Test_2 {
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.println("1:����"+"\n"+"2:��ѧ"+"\n"+"3:Ӣ��"+"\n"+"4:����");
		if(input.next().equals("1")){
			System.out.println("you choosed ����");
		}else if (input.next().equals("2")) {
			System.out.println("you choosed ��ѧ");
		}
		input.close();
	}
}
