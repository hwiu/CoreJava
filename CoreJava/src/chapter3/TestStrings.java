package chapter3;
/*
 * create by hwin in 2016.8.30
 * first sample of java 
 */
public class TestStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String greeting = "Hello";
		System.out.println(greeting.substring(0,3));
		
		String expletive = "expletive";
		String PG13 = "deleted";
		System.out.println(expletive+PG13);
		
/*		String allString = String.join("/","S","M","L","XL");
		System.out.println(allString);*/
		
		System.out.println("hello".equals(greeting));
		System.out.println("hello".equalsIgnoreCase(greeting));
		
		if(greeting.equals("")){
			
		}
		if (greeting.length()==0) {
			
		}
		if((greeting.length()!=0)&&greeting!=null){
			
		}
		System.out.println(greeting.codePointBefore(2));
	}

}
