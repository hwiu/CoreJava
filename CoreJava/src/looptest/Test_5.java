package looptest;

public class Test_5 {
	public static void main(String []args){
		int sum=0;
		for(int i=101;i<=200;i++){
			boolean flag = false;
			for(int j=2;j<Math.sqrt(i);j++){
				if(i%j==0){
					flag = true;
					break;
				}else {
					sum ++;
				}
			}
			if (!flag) {
				System.out.print(i+"ÊÇÅ¼Êý");

			}
		}
		System.out.println();
		System.out.println(sum);
	}
}
