package services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TaxEmpServiceTest {

	//Superclasses will be run before those of the current class,
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	//executed only once after all the unit tests written in Junit have been executed.
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	//used to signal that the annotated method should be executed before each @Test method in the current test class.
	@BeforeEach
	void setUp() throws Exception {
	}

	//used to signal that the annotated method should be executed after each @Test method in the current test class.
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSoftTechTaxServiceValue() {
		TaxEmpService taxEmpService = new TaxEmpService();
		double monthlyIncome  = 30000;
		double taxPercentage = 0.025;
		
		double actual = taxEmpService.taxServiceValue(monthlyIncome, taxPercentage);
		double expected = 750;
		
		//Protect constructor since it is a static only class
		assertEquals(expected,actual);
	}

}
