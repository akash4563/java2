package EmployeePackage;
import java.util.*;

public class Employee {
	List<Employee> subordinates;
	String name, dept;
	public Employee(String name, String dept) {
		this.name=name;
		this.dept=dept;
		subordinates=new ArrayList<Employee>();
	}
	public void add(Employee employee) {
		subordinates.add(employee);
	}
	
	public List<Employee> getSubordinates(){
		return subordinates;
	}
	
	public String toString() {
		return ("Employee: [ Name : "+name+",Dept: "+ dept+"]");
	}
}
