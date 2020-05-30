package EmployeePackage;

public class test {
	public static void main(String args[]) {
		Employee CEO=new Employee("Rahul","CEO");
		
		Employee headSales=new Employee("headyo","head Sales");
		Employee salesExec1=new Employee("Sales1yo","Sales Executive");
		Employee salesExec2=new Employee("Sales2yo","Sales Executive");
		Employee headMarketing=new Employee("headMarkyo","head Marketing");
		Employee clerk1=new Employee("clerk1yo","clerk");
		Employee clerk2=new Employee("clerk2yo","clerk");
		
		CEO.add(headSales);
		CEO.add(headMarketing);
		
		headSales.add(salesExec1);
		headSales.add(salesExec2);
		
		headMarketing.add(clerk1);
		headMarketing.add(clerk2);
		
		System.out.println(CEO);
		
		for(Employee headEmployee: CEO.getSubordinates()) {
			System.out.println(headEmployee);
		}
				
	}
}
