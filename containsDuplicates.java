
// Returns true or false
// based on whether there exists
// duplicates in that given array
// uses Hash Set and ArrayList

/**********************************************
 * Runtime Complexity             *
 *--------------------------------------------*
 Hash Set           ArrayList
 -------          ---------
 Addition: O(1)       Addition: O(1)
 Contains: O(1)       Contains: O(n)
**********************************************/

import java.util.*;

public class containsDuplicates{

	static boolean duplicates = false;
	static boolean hasDuplicates(int[] valArray)
{
 	 HashSet<Integer> dubSet = new HashSet<Integer>();
 	 List<Integer> binaryList = new ArrayList<Integer>();
  	for (int i=0;i<valArray.length;i++)
  {
    if (dubSet.contains(valArray[i])){ 
        binaryList.add(1);
    }
    dubSet.add(valArray[i]);
  }
  binaryList.add(0);

  //Checks if ArrayList has at least 1
  // where 1 = duplicate detected
  for(int k:binaryList){
  	if(binaryList.contains(1)){
  		duplicates = true;
  		return duplicates;
  	}
  	duplicates = false;
  	return duplicates;
  }
  return duplicates;

}
// public static void main(String[] args){
//   int[] a = {1,2,3,1};
//   int[] b = {3,1};

//   System.out.println(hasDuplicates(a));
//   System.out.println(hasDuplicates(b));
// }
}