// Returns duplicate with the minimal
// index in the second occurance

/**********************************************
 * Runtime Complexity						  *
 *--------------------------------------------*
 Hash Set  			ArrayList
 -------			---------
 Addition: O(1)			Addition: O(1)
 Contains: O(1)			Contains: O(n)
**********************************************/


import java.util.*;
public class firstDuplicate{

	 
	static int val = -1;
	static int firstDup(int[] valArray){
		List<Integer> binaryList = new ArrayList<Integer>();
		HashSet<Integer> dupSet = new HashSet<Integer>();
		for (int i=0;i<valArray.length;i++)
  		{
    			if (dupSet.contains(valArray[i])){ 
        		binaryList.add(valArray[i]);
    	}
    	dupSet.add(valArray[i]);
 	}

 	for(int k=0;k<binaryList.size();k++){
 	if(!(binaryList.isEmpty())){
 		if(binaryList.size() > 1){
 			val = binaryList.get(0);
 			return val;
 		}
 		val = binaryList.get(1);
 		return val;
 	}

 		val = -1;

 }
 return val;

}


}
