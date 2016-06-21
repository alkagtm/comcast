package com.comcast.csv.interview.problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;



import com.comcast.csv.meme.Meme;
import com.comcast.csv.meme.YoureDoingItWrongException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Read a list of {@link Meme}s from a JSON source file that might be on the classpath or file system.
 */
public class FileJsonResourceProblem {
	/**
	 * Read a list of memes from a JSON file stored on the filesystem
	 * 
	 * @param file the file to read
	 * @return the list of memes read
	 */
	public List<Meme> readFromFile(File file) throws YoureDoingItWrongException {
		try{
			if(file != null){
				ObjectMapper mapper = new ObjectMapper();
				List<Meme> memes = mapper.readValue(file, new TypeReference<List<Meme>>(){});
				if(memes==null || memes.isEmpty()){
					throw new YoureDoingItWrongException("no data found");
				}
				return memes;
			}
			return null;

		}catch (FileNotFoundException e) {
			throw new YoureDoingItWrongException(e.getMessage());
		} catch (IOException e) {
			throw new YoureDoingItWrongException(e.getMessage());
		} catch(YoureDoingItWrongException e){
			throw e;
		}


	}

	/**
	 * Read a list of memes from a JSON file stored on the classpath
	 * 
	 * @param path the path to the resource
	 * @return the list of memes read
	 */
	public List<Meme> readFromClasspath(String path) throws YoureDoingItWrongException {
		//Get file from resources folder
		try{
			ClassLoader classLoader = getClass().getClassLoader();
			File file = new File(classLoader.getResource(path).getFile());
			if(file != null){
				ObjectMapper mapper = new ObjectMapper();
				List<Meme> memes = mapper.readValue(file, new TypeReference<List<Meme>>(){});
				if(memes==null || memes.isEmpty()){
					throw new YoureDoingItWrongException("no data found");
				}
				return memes;
			}
			return null;
		}catch (NullPointerException e) {
			throw new YoureDoingItWrongException(e.getMessage());
		}   	
		catch (FileNotFoundException e) {
			throw new YoureDoingItWrongException(e.getMessage());
		} catch (IOException e) {
			throw new YoureDoingItWrongException(e.getMessage());
		} catch(YoureDoingItWrongException e){
			throw e;
		}
	}

	



}
