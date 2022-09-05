import java.util.Arrays;
import java.util.HashMap;

class Solution {

    public static void main (String[] args) {
        Solution solution = new Solution();
        //System.out.println(solution.isAnagram("baaa", "acaa"));
        System.out.println(solution.isAnagramV2("baaa", "acaa"));
    }

    public boolean isAnagram(String s, String t) {
        if ( s.length() != t.length() ) {
            return false;
        }
        //build a hashmap of string s
        //build a hashmap of string t
        //compare hashmaps
        //if equal
        //return true
        //else
        //false

        HashMap<Character, Integer> hmS = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hmT = new HashMap<Character, Integer>();

        for ( int i = 0; i < s.length(); i++ ) {
            hmS.put(s.charAt(i), hmS.getOrDefault(s.charAt(i), 0) + 1);
            hmT.put(t.charAt(i), hmT.getOrDefault(t.charAt(i), 0) + 1);
        }
        return hmS.equals(hmT);
    }

    public boolean isAnagramV2 (String s, String t) {
        if ( s.length() != t.length() ) {
            return false;
        }

        char [] sCharArray = s.toCharArray();
        Arrays.sort(sCharArray);
        char [] tCharArray = t.toCharArray();
        Arrays.sort(tCharArray);

        return Arrays.equals(sCharArray, tCharArray);
    }
}