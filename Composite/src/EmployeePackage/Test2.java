package EmployeePackage;
import java.util.*;
public class Test2 {
	public static void main(String args[]) {
		String name,dept,head;
		Scanner sc=new Scanner(System.in);
		ArrayList<Employee> employeeList=new ArrayList<Employee>();
		Employee employee=null;
		Employee CEO=new Employee("Rahul","CEO");
		employeeList.add(CEO);
		int i=0;
		while(i<5) {
			System.out.println("Enter name and designation");
			name=sc.nextLine();
			dept=sc.nextLine();
			System.out.println("Enter head");
			head=sc.nextLine();
			employee=new Employee(name,dept);
			for(Employee e: employeeList) {
				if(e.dept.equals(head)==true) {
					e.add(employee);
					break;
				}
			}
			i++;
			employeeList.add(employee);
		}
		
		for(Employee e: employeeList) {
			System.out.println(e);
		}
		
		for(Employee e: CEO.getSubordinates();) {
			System.out.println(e);
		}
	}
}

