package services;

public class TaxEmpService {
	//used to represent float numbers
	public double taxServiceValue(double monthlyIncome, double taxPercentage)
	{
		return monthlyIncome * taxPercentage;
	}

}
