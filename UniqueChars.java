/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */

    public static boolean isItInTheString(String one, String two, int i){
        if (two.indexOf(one.charAt(i)) != -1){
            return true;
        }else {return false;}
}
    public static String uniqueChars(String s) {
        String finalWord = "";

        for (int i = 0; i < s.length(); i++){
            if (isItInTheString(s, finalWord, i) && s.charAt(i) != ' '){
            } else if (s.charAt(i) == ' '){
                finalWord = finalWord + s.charAt(i);
            } else{
                finalWord = finalWord + s.charAt(i);
            }
        }
        return finalWord;
    }
}



//s.length(): Returns the length of a string “s”
//s.charAt(i): Returns the character at index “i” in string “s”
//input.indexOf(“s”): Returns the first index in “input” of “s”
