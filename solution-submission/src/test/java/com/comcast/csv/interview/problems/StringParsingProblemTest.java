package com.comcast.csv.interview.problems;

import static org.junit.Assert.*;

import org.junit.Test;

import com.comcast.csv.interview.problems.StringParsingProblem;

public class StringParsingProblemTest {

	@Test
	public void testAddressValid() {
		StringParsingProblem s1 = new StringParsingProblem();
		assertTrue(s1.isAddressValid("25w873 Apple St."));
	}
	
	@Test
	public void testDistanceValid() {
		StringParsingProblem s1 = new StringParsingProblem();
		int dist = s1.getDistanceFromCityCenter("25w873 Apple St.");
		assertTrue(dist==25);
	}
	
	@Test
	public void testAddressNotValid() {
		StringParsingProblem s1 = new StringParsingProblem();
		assertFalse(s1.isAddressValid(" "));
	}
	
	@Test
	public void testDistanceNotValid() {
		StringParsingProblem s1 = new StringParsingProblem();
		int dist = s1.getDistanceFromCityCenter(" ");
		assertTrue(dist==0);
	}
	
	@Test
	public void testAddressNull() {
		StringParsingProblem s1 = new StringParsingProblem();
		String s0 = null;
		assertFalse(s1.isAddressValid(s0));
	}
	
	@Test
	public void testDistanceNull() {
		StringParsingProblem s1 = new StringParsingProblem();
		String s0 = null;
		int dist = s1.getDistanceFromCityCenter(s0);
		assertTrue(dist==0);
	}
	
	@Test
	public void testAddressValid2() {
		StringParsingProblem s1 = new StringParsingProblem();
		assertTrue(s1.isAddressValid("3n17 Special Ave."));
	}
	
	@Test
	public void testDistanceValid2() {
		StringParsingProblem s1 = new StringParsingProblem();
		int dist = s1.getDistanceFromCityCenter("3n17 Special Ave.");
		assertTrue(dist==3);
	}
	
	@Test
	public void testAddressValid3() {
		StringParsingProblem s1 = new StringParsingProblem();
		assertTrue(s1.isAddressValid("0e34800 Main St."));
	}
	
	@Test
	public void testDistanceValid3() {
		StringParsingProblem s1 = new StringParsingProblem();
		int dist = s1.getDistanceFromCityCenter("0e34800 Main St.");
		assertTrue(dist==0);
	}
	
	@Test
	public void testAddressValid4() {
		StringParsingProblem s1 = new StringParsingProblem();
		assertTrue(s1.isAddressValid("1200e34800 Main St."));
	}
	
	@Test
	public void testDistanceValid4() {
		StringParsingProblem s1 = new StringParsingProblem();
		int dist = s1.getDistanceFromCityCenter("1200e34800 Main St.");
		assertTrue(dist==1200);
	}
	
	@Test
	public void testStreetNameNotValid() {
		StringParsingProblem s1 = new StringParsingProblem();
		assertFalse(s1.isAddressValid("1200e34800 Main1233 St."));
	}



	

}
