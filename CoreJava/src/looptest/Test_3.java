package looptest;
/*
 *             *
 *            ***
 *           *****
 *          *******
 *         *********
 *          *******
 *           *****
 *            ***
 *             *       
 * 
 */
public class Test_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ⲿѭ����ӡ�ϰ벿������
		for(int i=1;i<5;i++){
			//�ڲ�ѭ����ӡ�ո�
			for(int j=1;j<5-i;j++){
				System.out.print(" ");
			}
			//�ڲ�ѭ����ӡ*
			for(int k=1;k<=2*i-1;k++){
				System.out.print("*");
			}
			//���һ������
			System.out.println();
		}
		//�ⲿѭ����ӡ�°벿������
		for(int l=1;l<=4;l++){
			//�ڲ�ѭ����ӡ�ո� 
			for(int m=1;m<=l;m++){
				System.out.print(" ");
			}
			//�ڲ�ѭ����ӡ*
			for(int n=1;n<=2*(4-l)-1;n++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
