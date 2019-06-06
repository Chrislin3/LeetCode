package doublepoint.solution633;

/**
 * 题目：
 * 判断一个数是否为两个数的平方和。
 */
public class JudgeSquareSum {
    public boolean judgeSquareSum(int c) {
        int a = 0;
        //       int b = c;
        //对于b的取值要注意下，我之前的方法会让b从c开始计算平方和，如果我们的数字很大，那么会做很多的无用功，
        //正确的方法应该是这样：
        int b = (int) Math.sqrt(c);
        while (a <= b) {
            int powSum = (int) Math.pow(a, 2) + (int) Math.pow(b, 2);
            if (powSum == c) {
                return true;
            } else if (powSum > c) {
                b--;
            } else {
                a++;
            }

        }
        return false;
    }
}
