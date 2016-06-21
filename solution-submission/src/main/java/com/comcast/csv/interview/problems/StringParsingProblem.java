package com.comcast.csv.interview.problems;

import org.apache.commons.lang3.StringUtils;

/**
 * The following methods operate on street addresses in a particular format. The format contains the following components:
 * 
 *  1. Number of miles from the center of the city
 *  2. Primary direction from the city as a single lower-case letter
 *  3. Street number
 *  4. Street name (always a single word)
 *  5. An abbreviation for either a Street or Avenue with a period
 * 
 * </h2>Example Valid Addresses</h2>
 * 25w873 Apple St.
 * 3n17 Special Ave.
 * 0e34800 Main St.
 */
public class StringParsingProblem {

    /**
     * Returns true if the address is valid, otherwise false.
     * 
     * @param address the address to validate
     * @return true if the address is valid
     */
    public boolean isAddressValid(String address) {
    	if(address == null || address.trim().isEmpty()){
    		return false;
    	}else{
    		String[] addArray = address.split(" ");
    		if(addArray.length ==3){
    			String part1 = addArray[0];
    			//check if direction exist
    			String[] streetNumbers = null;
    			if(part1.trim().toLowerCase().contains("n")){
    				streetNumbers = part1.split("n");
    			}else if(part1.trim().toLowerCase().contains("e")){
    				streetNumbers = part1.split("e");
    			}else if(part1.trim().toLowerCase().contains("w")){
    				streetNumbers = part1.split("w");
    			}else if(part1.trim().toLowerCase().contains("s")){
    				streetNumbers = part1.split("s");
    		    }else{
    		    	return false;
    		    }
    			if(streetNumbers.length==2){
    				if(!StringUtils.isNumeric(streetNumbers[0].toLowerCase())){
    					return false;
    				}
    				if(!StringUtils.isNumeric(streetNumbers[1].toLowerCase())){
    					return false;
    				}
    				
    			}
    			//check if streetName is valid
    			if(addArray[1]==null || StringUtils.isEmpty(addArray[1])){
    				return false;
    			}
    			if(!StringUtils.isAlpha(addArray[1])){
					return false;
				}
    			//check if Streetor Avenue
    			if(addArray[2]==null || StringUtils.isEmpty(addArray[2])){
    				return false;
    			}
    			if(!StringUtils.contains(addArray[2], "St.")){
    				if(!StringUtils.contains(addArray[2], "Ave.")){
    					return false;
    				}
				}
    			return true;
    			
    		}else{
    			return false;
    		}
    	}
    	
      }
    
    /**
     * Get the distance in miles from the center of the city from the given address.
     * 
     * @param address the address
     * @return the distance
     */
    public int getDistanceFromCityCenter(String address) {
    	if(address == null || address.trim().isEmpty()){
    		return 0;
    	}else{
    		String[] addArray = address.split(" ");
    		if(addArray.length > 0){
    			String part1 = addArray[0];
    			//check if direction exist
    			String[] streetNumbers = null;
    			if(part1.trim().toLowerCase().contains("n")){
    				streetNumbers = part1.split("n");
    			}else if(part1.trim().toLowerCase().contains("e")){
    				streetNumbers = part1.split("e");
    			}else if(part1.trim().toLowerCase().contains("w")){
    				streetNumbers = part1.split("w");
    			}else if(part1.trim().toLowerCase().contains("s")){
    				streetNumbers = part1.split("s");
    		    }else{
    		    	return 0;
    		    }
    			if(streetNumbers.length > 0){
    				if(!StringUtils.isNumeric(streetNumbers[0].toLowerCase())){
    					return 0;
    				}else{
    					return new Integer(streetNumbers[0]).intValue();
    				}
    				
    			}else{
    			return 0;
    		    }
    		}
    	}
		return 0;
    }
}
