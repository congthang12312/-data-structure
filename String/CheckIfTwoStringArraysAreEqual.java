package String;
//Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
//A string is represented by an array if the array elements concatenated in order forms the string.
//Example 1:
//Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
//Output: true
//Explanation:
//word1 represents string "ab" + "c" -> "abc"
//word2 represents string "a" + "bc" -> "abc"
//The strings are the same, so return true.
//Example 2:
//Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
//Output: false
public class CheckIfTwoStringArraysAreEqual {
	 public boolean arrayStringsAreEqual(String[] arr1, String[] arr2) {
		 StringBuilder result =new StringBuilder();
		 StringBuilder result2 = new StringBuilder();
		 for (String string : arr1) {
			 // noi stringg
			 result.append(string);
		}
		 
		 for (String string : arr2) {
			 result2.append(string);
		}
		 // convert sang string de so sanh
		return result.toString().equals(result2.toString());
	}
}
