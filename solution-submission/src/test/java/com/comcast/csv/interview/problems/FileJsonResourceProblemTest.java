package com.comcast.csv.interview.problems;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

import com.comcast.csv.interview.problems.FileJsonResourceProblem;
import com.comcast.csv.meme.YoureDoingItWrongException;

public class FileJsonResourceProblemTest {
	
	FileJsonResourceProblem f1 = new FileJsonResourceProblem();
//
//	@Test
//	public void testFileNotNull() throws YoureDoingItWrongException {
//		File file = new File("../../../../json/Meme.json");
//    	FileJsonResourceProblem f1 = new FileJsonResourceProblem();
//    	assertNotNull(f1.readFromFile(file));
//		
//		
//	}
	
	@Test(expected =YoureDoingItWrongException.class)
	public void testFileNull() throws YoureDoingItWrongException {
		File file = new File("");
    	FileJsonResourceProblem f1 = new FileJsonResourceProblem();
    	assertNull(f1.readFromFile(file));
		
		
	}
	
	@Test(expected =YoureDoingItWrongException.class)
	public void testFileNotExist() throws YoureDoingItWrongException {
		File file = new File("C:\\Users\\Test.json");
    	FileJsonResourceProblem f1 = new FileJsonResourceProblem();
    	assertNull(f1.readFromFile(file));
		
		
	}
	
	@Test(expected =YoureDoingItWrongException.class)
	public void testWrongPath() throws YoureDoingItWrongException {
		File file = new File("C:\\PQR\\Test.json");
    	FileJsonResourceProblem f1 = new FileJsonResourceProblem();
    	assertNull(f1.readFromFile(file));
		
		
	}
	
	
	
	@Test
	public void testClassPathNotNull() throws YoureDoingItWrongException {
		FileJsonResourceProblem f1 = new FileJsonResourceProblem();
    	assertNotNull(f1.readFromClasspath("json/Meme.json"));
		
		
	}
	
	@Test(expected =YoureDoingItWrongException.class)
	public void testClassPathNotFound() throws YoureDoingItWrongException {
		FileJsonResourceProblem f1 = new FileJsonResourceProblem();
    	assertNotNull(f1.readFromClasspath("test/Meme.json"));
		
		
	}
	
	@Test(expected =YoureDoingItWrongException.class)
	public void testClassPathNull() throws YoureDoingItWrongException {
		FileJsonResourceProblem f1 = new FileJsonResourceProblem();
    	assertNotNull(f1.readFromClasspath(""));
		
		
	}

}
