package looptest;
/*
 * 打印1~100之间的偶数
 * 
 */
public class Test_4 {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++){
			if(i%2==0){
				System.out.print(i+"、");
			}
		}
		System.out.print("是偶数");
	}

}
