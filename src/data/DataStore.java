package data;
import java.util.ArrayList;
import java.util.List;

import models.*;
public class DataStore {

	public static List<UserLoginDetails> USER_LOGIN_DATA = new ArrayList<UserLoginDetails>();
	public static List<Employee> EMPLOYEE_DETAILS = new ArrayList<Employee>();
	public static List<EmployeeOT> EMPLOYEE_OTS = new ArrayList<EmployeeOT>();
	public static List<Leave> LEAVES = new ArrayList<Leave>();
	public static List<AdvancedPayment> ADVANCED_PAYMENT = new ArrayList<AdvancedPayment>();
    
	
	public List<UserLoginDetails> initiateLoginDetails() {
    	
    	
    	UserLoginDetails userLoginDetails1 = new UserLoginDetails();
    	userLoginDetails1.setEmail("admin@softech.com");
    	userLoginDetails1.setPassword("admin");
    	
    	UserLoginDetails userLoginDetails2 = new UserLoginDetails();
    	userLoginDetails2.setEmail("devin@softtech.com");
    	userLoginDetails2.setPassword("devin");
    	
    	UserLoginDetails userLoginDetails3 = new UserLoginDetails();
    	userLoginDetails3.setEmail("ramith@softtech.com");
    	userLoginDetails3.setPassword("ramith");
    
		USER_LOGIN_DATA.add(userLoginDetails1);
		USER_LOGIN_DATA.add(userLoginDetails2);
		USER_LOGIN_DATA.add(userLoginDetails3);
		return USER_LOGIN_DATA;
	}
    
    public List<Employee> initiatEmployees() {
    	
    	
    	
    	Employee emp1 = new Employee();
    	emp1.setFirstName("Admin");
    	emp1.setLastName("Admin");
    	emp1.setNic("993100430V");
    	emp1.setAge(20);
    	emp1.setDailySalary(2000.00);
    	emp1.setUserLoginDetails(DataStore.USER_LOGIN_DATA.get(0));
    	
    	Employee emp2 = new Employee();
    	emp2.setFirstName("Devin");
    	emp2.setLastName("Fernando");
    	emp2.setNic("960890655V");
    	emp2.setAge(20);
    	emp2.setDailySalary(2000.00);
    	emp2.setUserLoginDetails(DataStore.USER_LOGIN_DATA.get(1));
    	
    	Employee emp3 = new Employee();
    	emp3.setFirstName("Ramith");
    	emp3.setLastName("Jasinghe");
    	emp3.setNic("993100430V");
    	emp3.setAge(20);
    	emp3.setDailySalary(5000.00);
    	emp3.setUserLoginDetails(DataStore.USER_LOGIN_DATA.get(2));

    	EMPLOYEE_DETAILS.add(emp1);
    	EMPLOYEE_DETAILS.add(emp2);
    	EMPLOYEE_DETAILS.add(emp3);
    	
    	return EMPLOYEE_DETAILS;
    	
	}
    
    public List<EmployeeOT> initOt() {
    	
    	
    	
    	EmployeeOT emp1 = new EmployeeOT();
    	emp1.setId(1);
    	emp1.setEmail(DataStore.USER_LOGIN_DATA.get(0).getEmail());
    	emp1.setAmount(1200.00);
    	
      	EmployeeOT emp2 = new EmployeeOT();
      	emp2.setId(2);
      	emp2.setEmail(DataStore.USER_LOGIN_DATA.get(1).getEmail());
      	emp2.setAmount(1500.00);
    	
      	EmployeeOT emp3 = new EmployeeOT();
      	emp3.setId(3);
      	emp3.setEmail(DataStore.USER_LOGIN_DATA.get(2).getEmail());
      	emp3.setAmount(1000.00);

    	EMPLOYEE_OTS.add(emp1);
    	EMPLOYEE_OTS.add(emp2);
    	EMPLOYEE_OTS.add(emp3);   	
    	
    	return EMPLOYEE_OTS;
    	
	}
    
    public List<Leave> iniLeaves() {
    	

    	
    	Leave emp1 = new Leave();
    	emp1.setId(1);
    	emp1.setEmail(DataStore.USER_LOGIN_DATA.get(1).getEmail());
    	emp1.setLeaveDate("2021-03-20");
    	emp1.setStatus(true);
    	
    	Leave emp2 = new Leave();
    	emp2.setId(2);
    	emp2.setEmail(DataStore.USER_LOGIN_DATA.get(1).getEmail());
    	emp2.setLeaveDate("2021-04-20");
    	emp2.setStatus(true);
    	
    	Leave emp3 = new Leave();
    	emp3.setId(2);
    	emp3.setEmail(DataStore.USER_LOGIN_DATA.get(2).getEmail());
    	emp3.setLeaveDate("2021-03-20");
    	emp3.setStatus(true);

    	LEAVES.add(emp1);
    	LEAVES.add(emp2);
    	LEAVES.add(emp3);   	
    	
    	return LEAVES;
    	
	}
    
     public List<AdvancedPayment> initAdvancedPayments() {
    	
    	
    	
    	AdvancedPayment emp1 = new AdvancedPayment();
    	emp1.setId(1);
    	emp1.setEmail(DataStore.USER_LOGIN_DATA.get(1).getEmail());
    	emp1.setAmount(2000.00);
    	emp1.setStatus(true);
    	
    	AdvancedPayment emp2 = new AdvancedPayment();
    	emp2.setId(2);
    	emp2.setEmail(DataStore.USER_LOGIN_DATA.get(1).getEmail());
    	emp2.setAmount(1000.00);
    	emp2.setStatus(true);
    	
    	AdvancedPayment emp3 = new AdvancedPayment();
    	emp3.setId(2);
    	emp3.setEmail(DataStore.USER_LOGIN_DATA.get(2).getEmail());
    	emp3.setAmount(5000.00);
    	emp3.setStatus(true);

    	ADVANCED_PAYMENT.add(emp1);
    	ADVANCED_PAYMENT.add(emp2);
    	ADVANCED_PAYMENT.add(emp3);   	
    	
    	return ADVANCED_PAYMENT;
    	
	}  
    
}
