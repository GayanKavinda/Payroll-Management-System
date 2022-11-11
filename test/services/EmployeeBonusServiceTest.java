package services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeBonusServiceTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testEmployeeBonusServiceValue() {
		EmployeeBonusService employeeBonusService = new EmployeeBonusService();
		double monthlyIncome  = 30000;
		int noOfWorkingYears = 2;
		double bonusPercentage = 0.03;
		
		double actual = employeeBonusService.employeeBonusServiceValue(monthlyIncome, noOfWorkingYears, bonusPercentage);
		double expected = 1800;
		
		assertEquals(expected,actual);
	}

}
