package com.comcast.csv.meme;

import java.util.Comparator;

/**
 * Simple class used by various tests.
 */
public class Meme implements Comparable<Meme>{

    private String name;
    private int year;
    private String[] tags;
    
    
    public Meme(){};
    
    
    public Meme(String name,int year,String[] tags){
    	this.name = name;
    	this.year = year;
    	this.tags = tags;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the tags
     */
    public String[] getTags() {
        return tags;
    }

    /**
     * @param tags the tags to set
     */
    public void setTags(String[] tags) {
        this.tags = tags;
    }
    
    @Override 
    public boolean equals(Object other){
    	if(this == other) return true; 
    	if(other == null || (this.getClass() != other.getClass())){ return false; } 
    	Meme guest = (Meme) other;
    	return (year == guest.year); 
    	} 
    
    @Override
    public int hashCode(){ 
    	int result = 0; 
    	result = 31*result + year; 
        return result;
     }

	public int compareTo(Meme arg0) {
	   	return Integer.compare(year,arg0.year);

	} 
	
	@Override
	public String toString(){
		StringBuffer s1 = new StringBuffer();
		if(tags != null & tags.length > 0){
			
			for(String s :tags){
				s1=s1.append(s);
			}
		}
		
		return (year + name + s1.toString());
	}
	
	
	public static class YearComparator implements Comparator<Meme>{
		
		public int compare(Meme meme1, Meme meme2){
			
			return meme1.compareTo(meme2);
			
			
		}
    
	}
   

   

}
