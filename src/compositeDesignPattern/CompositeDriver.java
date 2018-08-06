package compositeDesignPattern;


/*
 * 	It compose the objects into tree structures to represent whole-part hierarchies. Composite lets clients treat individual 
 * objects and compositions of objects uniformly.
 
 * In an organization, It have general managers and under general managers, there can be managers and under managers there can 
  be developers. Now you can set a tree structure and ask each node to perform common operation like getSalary().
Composite design pattern treats each node in two ways:
1) Composite – Composite means it can have other objects below it.
2) leaf – leaf means it has no objects below it.

reference 
https://www.geeksforgeeks.org/composite-design-pattern/
 */
public class CompositeDriver {

	public static void main(String[] args) {
		    Developer dev1 = new Developer("Lokesh Sharma", 100, "Pro Developer");
	        Developer dev2 = new Developer("Vinay Sharma", 101, "Developer");
	        CompanyDirectory engDirectory = new CompanyDirectory();
	        engDirectory.addEmployee(dev1);
	        engDirectory.addEmployee(dev2);
	          
	        Manager man1 = new Manager("Kushagra Garg", 200, "SEO Manager");
	        Manager man2 = new Manager("Vikram Sharma ", 201, "Kushagra's Manager");
	          
	        CompanyDirectory accDirectory = new CompanyDirectory();
	        accDirectory.addEmployee(man1);
	        accDirectory.addEmployee(man2);
	      
	        CompanyDirectory directory = new CompanyDirectory();
	        directory.addEmployee(engDirectory);
	        directory.addEmployee(accDirectory);
	        directory.showEmployeeInformation();

	}

}
