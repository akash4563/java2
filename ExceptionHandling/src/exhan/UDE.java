package exhan;

public class UDE{
	public static void main(String args[]) {
		int res,a,b;
		try {
			a=4;
			b=0;
			res=a+b;
			if(res<10) {
				throw new MyException("Value should be greater than 10");
			}		
		}
		catch(MyException e) {
			System.out.println(e.getMessage());
		}
	}
}
