package models;

public class Employee {
	public UserLoginDetails userLoginDetails;
	public String firstName;
	public String lastName;
	public int age;
	public String nic;
	public double dailySalary;
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	public UserLoginDetails getUserLoginDetails() {
		return userLoginDetails;
	}
	public void setUserLoginDetails(UserLoginDetails userLoginDetails) {
		this.userLoginDetails = userLoginDetails;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
		
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNic() {
		return nic;
	}
	public void setNic(String nic) {
		this.nic = nic;
	}
	public double getDailySalary() {
		return dailySalary;
	}
	public void setDailySalary(double dailySalary) {
		this.dailySalary = dailySalary;
	}
	
}
