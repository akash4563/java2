package employeeComposite;

import java.util.ArrayList;

public class Employeel {
	String name, designation, id;;
	ArrayList<Employeel> subordinates;
	public Employeel(){
		this.name="";
		this.designation="";
		this.id="";
		subordinates=new ArrayList<Employeel>();
	
	}
	public Employeel(String name, String designation, String id, String pId, String salary) {
		this.name=name;
		this.designation=designation;
		this.id=id;
	}
	
	public void add(Employeel e) {
		subordinates.add(e);
	}
	
	public ArrayList<Employeel> get() {
		return subordinates;
	}
	
	public void toString() {
		System.out.println("Name = "+name+"\nDesignation ="+designation+"\nid ="+id);
	}
	public static void main() {
		
	}
}
