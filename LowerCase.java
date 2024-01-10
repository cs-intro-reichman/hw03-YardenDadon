/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */

  

    public static String lowerCase(String s) {
        String finalWord = "";
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                finalWord = finalWord + s.charAt(i);
            } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                char Upper = s.charAt(i);
                Upper = Character.toLowerCase(Upper);
                finalWord = finalWord + Upper;
            }else {finalWord = finalWord + s.charAt(i);}
            }
            return finalWord;
        }
    }
