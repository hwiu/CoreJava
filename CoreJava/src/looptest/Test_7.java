package looptest;

public class Test_7 {
	public static void main(String []args){
		double s=0;//总路程
		double high = 100;//高度，初始化为100；
		for(int i=1;i<=10;i++){
			s=s+high+high/2;
			high = high/2;
		}
		System.out.println(s);
		System.out.println(high);
	}
}
/*299.70703125
0.09765625
*/