package services;

public class EmployeeBonusService {
	
	public double employeeBonusServiceValue(double monthlyIncome, int noOfWorkingYears, double bonusPercentage)
	{
		double bonus = monthlyIncome*noOfWorkingYears*bonusPercentage;
		return bonus;
	}

}
