/**
 * 将一个正整数N用二进制表示并转换为一个String类型的值s。
 */
public class Solution {
    public static String process(int n) {
        String s = "";
        while (n > 0) {
            s = n % 2 + s;
            n = n / 2;
        }
        return s;
    }

}