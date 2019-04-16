package doublepoint.solution345;

import java.util.Arrays;
import java.util.HashSet;

public class ReverseVowels {
    public String reverseVowels(String s) {
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
      //  char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
        int point1 = 0;
        int point2 = s.length() - 1;

        char[] result = new char[s.length()];
        while (point1 <= point2){
            char cpoint1 = s.charAt(point1);
            char cpoint2 = s.charAt(point2);

            if(!vowels.contains(cpoint1)){
                result[point1 ++] = cpoint1;

            }
            else if(!vowels.contains(cpoint2)){
                result[point2 --] = cpoint2;

            }
            else {
                result[point1 ++] = cpoint2;
                result[point2 --] = cpoint1;
            }
        }
      //  return result.toString();
        return new String(result); //注意数组转成字符串分方式！！！
    }
}
