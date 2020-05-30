package employee;
import java.util.*;
import javax.swing.*;
public class Employee 
{
	public class EmpStruct 
	{
			String name, designation, id, salary, p_id;
			public EmpStruct(String id, String name, String designation, String salary, String p_id)
			{
				this.id = id;
				this.name = name;
				this.designation = designation;
				this.salary = salary;
				this.p_id = p_id;
			}
			public EmpStruct()
			{
				this.id = "";
				this.name = "";
				this.designation = "";
				this.salary = "";
				this.p_id = "";
			}
	}
	
	static ArrayList<EmpStruct> emp = new ArrayList<EmpStruct>(100);
	
	public void add(String id, String name, String designation, String salary, String p_id)
	{
		EmpStruct temp = new EmpStruct(id, name, designation, salary, p_id);
		emp.add(temp);
	}
	
	public void show(String id)
	{
		for(EmpStruct eachemp: emp)
		{
			if(eachemp.id.equals(id))
			{
				JOptionPane.showMessageDialog(null, "Id: "+ eachemp.id + "\nName: " + eachemp.name + "\nDesignation: " + eachemp.designation 
						+ "\nSalary: " + eachemp.salary + "\nParent: " + eachemp.p_id);
			}
		}
	}
	
	public void displayStructure(String id)
	{
		for(EmpStruct eachemp: emp)
		{
			if(eachemp.p_id.equals(id))
			{
				System.out.println("\t" + eachemp.name + "--" + eachemp.designation);
				displayStructure(eachemp.id);
			}
		}
	}
	
	public int getSalary(String id)
	{
		for(EmpStruct eachemp: emp)
		{
			if(eachemp.id.equals(id))
			{
				return(Integer.parseInt(eachemp.salary));
			}
		}
		return 0;
	}
	
	public int totalSalary(String id)
	{
		int total_salary = 0;
		total_salary = total_salary + getSalary(id);
		for(EmpStruct eachemp: emp)
		{
			if(eachemp.p_id.equals(id))
			{	
				total_salary = total_salary + totalSalary(eachemp.id);
			}
		}
		return total_salary;
	}
	
	public static void main(String[] args) {
		Employee empl = new Employee();
		while(true)
		{
			String choice = JOptionPane.showInputDialog(
					"1: Add Employee \n"
					+ "2: Display Employee Information \n"
					+ "3: Display Employee Structure \n"
					+ "4: Display Total Salary \n"
					+ "5: Exit \n"
					+ "Enter choice:");
			switch(choice)
			{
			case "1":
				String id = JOptionPane.showInputDialog("Enter ID:");
				String name = JOptionPane.showInputDialog("Enter NAME:");
				String designation = JOptionPane.showInputDialog("Enter DESIGNATION:");
				String salary = JOptionPane.showInputDialog("Enter SALARY:");
				String p_id = JOptionPane.showInputDialog("Enter PARENT ID:");
				empl.add(id, name, designation, salary, p_id);
				JOptionPane.showMessageDialog(null, "Employee Added");
				break;
			case "2":
				id = JOptionPane.showInputDialog("Enter Employee ID:");
				empl.show(id);
				break;
			case "3":
				id = JOptionPane.showInputDialog("Enter Employee ID:");
				for(EmpStruct eachemp: emp)
				{
					if(eachemp.id.equals(id))
					{
						System.out.println("Id: "+ eachemp.id + " Name: " + eachemp.name + " Designation: " + eachemp.designation 
								+ " Salary: " + eachemp.salary + " Parent: " + eachemp.p_id + "\n");
						break;
					}
				}
				empl.displayStructure(id);
				break;
			case "4":
				id = JOptionPane.showInputDialog("Enter Employee ID:");
				int total_salary = empl.totalSalary(id);
				JOptionPane.showMessageDialog(null, "Total Salary is: " + total_salary);
				break;
			case "5":
				System.exit(0);
			default:
				JOptionPane.showMessageDialog(null, "Please Enter a Valid Input");
			}
		}		
	}
}