package employeeComposite;
import java.util.*;
public class Employee {
	public class EmpStruct{
		String name, designation, id, pId, salary;
		public EmpStruct(){
			this.name="";
			this.designation="";
			this.id="";
			this.pId="";
			this.salary="";
		}
		public EmpStruct(String name, String designation, String id, String pId, String salary) {
			this.name=name;
			this.designation=designation;
			this.id=id;
			this.pId=pId;
			this.salary=salary;
		}
	}
	
	static ArrayList<EmpStruct> empList=new ArrayList<EmpStruct>();
	
	public void addEmployee(String name, String designation, String id, String pId, String salary) {
		EmpStruct temp=new EmpStruct(name, designation, id, pId, salary);	
		empList.add(temp);
	}
	
	public void showEmployeeDetails(String id) {
		for(EmpStruct eachEmp: empList) {
			if(eachEmp.id.equals(id)) {
				System.out.println("ID:"+eachEmp.id+"\nName:"+eachEmp.name+"\nDesignation:"+eachEmp.designation+"\nPID"+eachEmp.pId+"\nSalary"+eachEmp.salary);
			}
		}
	}
	public void displayStructure(String id) {
		for(EmpStruct eachEmp: empList) {
			if(eachEmp.pId.equals(id)==true) {
				System.out.println("ID:"+eachEmp.id+"\nName:"+eachEmp.name+"\nDesignation:"+eachEmp.designation+"\nPID"+eachEmp.pId+"\nSalary"+eachEmp.salary);
				displayStructure(eachEmp.id);
			}
		}
	}
	public static void main(String args[]) {
		String name, designation, id, pId, salary;
		Employee employee = new Employee();
		employee.addEmployee("rahul", "CEO", "1", "-1", "100");
		employee.addEmployee("rupam", "CTO", "2", "1", "90");
		employee.addEmployee("soumyo", "MBA", "3", "1", "80");
		employee.addEmployee("sourish", "HBO", "4", "2", "200");
		employee.addEmployee("tirtho", "WRN", "5", "3", "70");
		
		employee.displayStructure("1");
	}
}
