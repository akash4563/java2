package exhan;

public class ThrowEx {
	public static void main(String args[]){
		int res,a,b;
		try {
			a=4;
			b=0;
			res=a+b;
			if(res<10) {
				throw new ArithmeticException("Value should be greater than 10");
			}
				
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("ss");
		}
	}
}

