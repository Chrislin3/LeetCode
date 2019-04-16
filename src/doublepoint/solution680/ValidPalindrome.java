package doublepoint.solution680;

public class ValidPalindrome {
    public boolean validPalindrome(String s) {
        int point1 = 0;
        int point2 = s.length() - 1;
        int num = 0;
        while (point1 < point2){
            char cpoint1 = s.charAt(point1);
            char cpoint2 = s.charAt(point2);

            if(cpoint1 == cpoint2){
                point1 ++ ;
                point2 --;
            }
            else if(s.charAt(point1 + 1) == cpoint2){
                point1 ++ ;
                num ++;
                if(num > 1){
                    return false;
                }
            }
            else if(cpoint1 == s.charAt(point2 - 1)){
                point2 --;
                num ++;
                if(num > 1){
                    return false;
                }
            }
            else {
                return false;
            }
        }
        return true;
    }
}
