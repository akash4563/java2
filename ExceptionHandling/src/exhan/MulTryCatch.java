package exhan;

public class MulTryCatch {
	public static void main(String args[]){
		int res,a,b,arr[]= {1,2,3,4,5};
		try {
			a=4;
			b=0;
			res=a/b;
			for(int i=0;i<=5;i++) {
				System.out.println(arr[i]);
			}
			
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Unkown exception");
		}
	}
}
