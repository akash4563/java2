package exhan;

public class TryCatch {
	public static void main(String args[]){
		int res,a,b;

		a=4;
		b=0;
		try {
			res=a/b;   //critical statement
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
