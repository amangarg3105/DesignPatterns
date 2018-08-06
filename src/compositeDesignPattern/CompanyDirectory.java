package compositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Employee {

	List<Employee> empList = new ArrayList<>();
	
	@Override
	public void showEmployeeInformation() {
		//loop in empList
		
		//this function will get called two times
	     for(Employee e : empList) {
	    	 e.showEmployeeInformation();
	     }
	}
	
	public void addEmployee(Employee e) {
		empList.add(e);
	}
	
	public void removeEmployee(Employee emp) {
		empList.remove(emp);
	}
	
}
