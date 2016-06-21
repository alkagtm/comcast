package com.comcast.csv.interview.problems;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.comcast.csv.meme.Meme;
import com.comcast.csv.meme.YearComparator;
import com.comcast.csv.meme.YoureDoingItWrongException;

/**
 * Implement the specified interface.
 */
public class CollectionsProblemImpl implements CollectionsProblem {

	/**
	 * Sorts a Collection of Memes by year
	 * 
	 * @param memes
	 *            The Collection to sort
	 * @param ascending
	 *            true if the collection should be sorting in ascending order,
	 *            otherwise false.
	 * @throws YoureDoingItWrongException 
	 */
	public void sort(Collection<Meme> memes, boolean ascending) {
		try{
			List<Meme> memeList = (List<Meme>) memes;
			if (memes == null || memes.isEmpty()) {
				throw new YoureDoingItWrongException("Collection is Empty");
			}

			if (!ascending) {
				Collections.sort(memeList,Collections.reverseOrder());
				System.out.println("Sort by Reverse order");
				System.out.println("\t" + memeList);
			} else {
				// natural order
				Collections.sort(memeList);
				System.out.println("Sort by Natural order");
				System.out.println("\t" + memeList);
			}
		} catch (YoureDoingItWrongException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
	}

	/**
	 * Adds a tag to all meme's that contain another tag @param memes The
	 * collection of memes to mutate @param tag The tag that is to be
	 * added @throws
	 */
	public void addTag(Collection<Meme> memes, String tag) {
		try {
			if (memes == null || memes.isEmpty()) {
				throw new YoureDoingItWrongException("Collection is Empty");
			}
			if (tag == null || tag.isEmpty()) {
				throw new YoureDoingItWrongException("tag is empty");
			}
			for (Meme m1 : memes) {
				String[] tagArray = m1.getTags();
				if (tagArray != null && tagArray.length > 0) {
					Arrays.copyOf(tagArray, tagArray.length + 1);
					tagArray[tagArray.length - 1] = tag;
				}
				m1.setTags(tagArray);
			}
		} catch (YoureDoingItWrongException ex) {
			System.out.println(ex.getMessage());

		} catch (Exception ex1) {
			System.out.println(ex1.getMessage());

		}
	}

}
