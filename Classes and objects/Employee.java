package employee;



class Employee1{
	int id;
	int salary;
	String firstName;
	String lastName;

	public Employee1(int id,String firstName,String lastName,int salary) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.salary=salary;	
	}
	
	public int getId() {
		return id;
	}
	public int getSalary() {
		return salary;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	
	public void setSalary(int salary) {
		this.salary=salary;
	}
	
	public int getAnnualSalary() {
		return salary*12;
	}
	
	public String getName() {
		return firstName+" "+lastName;
	}
	
	public int raiseSalary(int percent) {
		this.salary= salary+salary*percent/100;
		return salary;
	}
	
	public String toString() {
		return "Employee[id="+id+","+"name="+firstName+" "+lastName+","+"salary="+salary+"]";
	}
	
}
	class Employee {
	   public static void main(String[] args) {
	      // Test constructor and toString()
	      Employee1 e1 = new Employee1(8, "Peter", "Tan", 2500);
	      System.out.println(e1);  // toString();

	      // Test Setters and Getters
	      e1.setSalary(999);
	      System.out.println(e1);  // toString();
	      System.out.println("id is: " + e1.getId());
	      System.out.println("firstname is: " + e1.getFirstName());
	      System.out.println("lastname is: " + e1.getLastName());
	      System.out.println("salary is: " + e1.getSalary());

	      System.out.println("name is: " + e1.getName());
	      System.out.println("annual salary is: " + e1.getAnnualSalary()); // Test method

	      // Test raiseSalary()
	      System.out.println(e1.raiseSalary(10));
	      System.out.println(e1);
	   }
	}

