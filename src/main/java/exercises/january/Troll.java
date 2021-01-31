package exercises.january;

/**
 * @author Dorim
 * codewars:kata 5 (level 7)
 * @Date: 31.01.2021
 * <p>
 * Trolls are attacking your comment section!
 * <p>
 * A common way to deal with this situation is to remove
 * all of the vowels from the trolls' comments, neutralizing the threat.
 * <p>
 * Your task is to write a function that takes a string
 * and return a new string with all vowels removed.
 * <p>
 * For example, the string "This website is for losers LOL!"
 * would become "Ths wbst s fr lsrs LL!".
 * <p>
 * Note: for this kata y isn't considered a vowel.
 * <p>
 * original:
 * public class Troll {
 * public static String disemvowel(String str) {
 * // Code away...
 * }
 * }
 */

public class Troll {

    public static void main(String[] args) {
        String test = "This website is for losers LOL!";
        Troll troll= new Troll();
        disemvowel(test);
    }

    public static void disemvowel(String str) {
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o' || charArray[i] == 'u') {
                charArray[i] = charArray[i + 1];
            }
        }

        System.out.println(charArray);
    }
//        String disemvoweledStr = String.valueOf(charArray);
//            return disemvoweledStr;

//        char[] charArray = str.toCharArray();
//        String emptyChar = "";
//        String newString;

//        for (char ch : charArray) {
//            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                StringBuilder sb =new StringBuilder();
//                sb.append(str);
//                sb.delete(ch);
//            }
        }


