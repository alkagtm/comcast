package com.comcast.csv.meme;

import java.util.Comparator;

public class YearComparator implements Comparator<Meme>{
	
	public int compare(Meme meme1, Meme meme2){
		
		int year1 = meme1.getYear();
		int year2 = meme2.getYear();
		
		if(year1==year2){
			return 0;
		}else if(year1 > year2){
			return 1;
		}else{
		  return -1;
		}
		
		
	}

}
