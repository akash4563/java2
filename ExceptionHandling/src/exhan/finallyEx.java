package exhan;

public class finallyEx {
	public static void main(String args[]){
		int res,a,b,arr[]= {1,2,3,4,5};
		try {
			a=4;
			b=0;
			res=a/b;
			
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Unkown exception");
		}
		finally {
			try {
				for(int i=0;i<=5;i++) {
					System.out.println(arr[i]);
				}
				
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
			finally {
				System.out.println("CIAO");
			}
		}
		
		
	}

}
