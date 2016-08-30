package looptest;
/*
 * Ë®ÏÉ»¨Êý
 * 100~999
 * 
 */
public class Test_6 {
	public static void main(String []args){
		for(int i=100;i<=999;i++){
			int one = i%10;
			int hundred = i/10%10;
			int thousand = i/100;
			if(one*one*one+hundred*hundred*hundred+thousand*thousand*thousand == i){
				System.out.println(i);
			}
		}
	}
}
