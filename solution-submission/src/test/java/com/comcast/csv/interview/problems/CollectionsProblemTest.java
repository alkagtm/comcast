package com.comcast.csv.interview.problems;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.List;

import org.junit.Test;

import com.comcast.csv.interview.problems.CollectionsProblem;
import com.comcast.csv.interview.problems.CollectionsProblemImpl;
import com.comcast.csv.interview.problems.FileJsonResourceProblem;
import com.comcast.csv.meme.Meme;
import com.comcast.csv.meme.YoureDoingItWrongException;

public class CollectionsProblemTest {
	FileJsonResourceProblem f1 = new FileJsonResourceProblem();

	@Test
	public void checkAscending() throws YoureDoingItWrongException {
		
    	List<Meme> memes  = f1.readFromClasspath("json/Meme.json");
    	CollectionsProblem c1 = new CollectionsProblemImpl();
    	c1.sort(memes, true);
    	assertTrue(memes.get(0).getYear()==12);
		
		
	}
	
	@Test
	public void checkDescending() throws YoureDoingItWrongException {
		
    	List<Meme> memes  = f1.readFromClasspath("json/Meme.json");
    	CollectionsProblem c1 = new CollectionsProblemImpl();
    	c1.sort(memes, false);
		assertTrue(memes.get(0).getYear()==78);
		
	}
	
	@Test
	public void checkListNull() throws YoureDoingItWrongException {
		List<Meme> memes  = null;
		CollectionsProblem c1 = new CollectionsProblemImpl();
		c1.sort(memes, false);
		
		
	}

	
	
	
}
