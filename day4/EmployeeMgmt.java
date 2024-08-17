package assignmentEmployeeManagement;

class EmployeeMgmtFunct{
	Employee[] emp;
	int cindex=0;
	
	EmployeeMgmtFunct(){
		emp=new Employee[3];
	}
	
	//add employee
	Employee addEmp(Employee nEmp) {
		emp[cindex]=nEmp;
		cindex++;
		System.out.println("Employee "+cindex+" added");
		return nEmp;
	}
	
	//list employee
	void listEmp() {
		System.out.println("-----List of Employee------");
		for(int i=0;i<cindex;i++) {
			emp[i].display();
		}
	}
	
	//delete employee
	void delEmp() {
		emp=new Employee[3];
		cindex=0;
		System.out.println("Deleted all employee");
	}
}

class Employee{
	int id;
	String name;
	
	Employee(int eid,String ename){
		id=eid;
		name=ename;
	}
	
	void display() {
		System.out.println("ID : "+id+" Name : "+name);
	}
}

public class EmployeeMgmt {

	public static void main(String[] args) {
		EmployeeMgmtFunct eFun = new EmployeeMgmtFunct();
		
		Employee e1= new Employee(1,"Sree");
		Employee e2=new Employee(2,"Jaya");
		eFun.addEmp(e1);
		eFun.addEmp(e2);
		eFun.listEmp();
		eFun.delEmp();
		eFun.listEmp();
	}

}
