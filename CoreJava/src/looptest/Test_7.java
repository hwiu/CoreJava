package looptest;

public class Test_7 {
	public static void main(String []args){
		double s=0;//��·��
		double high = 100;//�߶ȣ���ʼ��Ϊ100��
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