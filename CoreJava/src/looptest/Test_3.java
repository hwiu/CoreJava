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
		//外部循环打印上半部分三角
		for(int i=1;i<5;i++){
			//内部循环打印空格
			for(int j=1;j<5-i;j++){
				System.out.print(" ");
			}
			//内部循环打印*
			for(int k=1;k<=2*i-1;k++){
				System.out.print("*");
			}
			//输出一个换行
			System.out.println();
		}
		//外部循环打印下半部分三角
		for(int l=1;l<=4;l++){
			//内部循环打印空格 
			for(int m=1;m<=l;m++){
				System.out.print(" ");
			}
			//内部循环打印*
			for(int n=1;n<=2*(4-l)-1;n++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
