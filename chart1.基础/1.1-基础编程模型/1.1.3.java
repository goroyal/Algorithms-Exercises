import java.util.Scanner;

/**
 * 编写一个程序，从命令行得到三个整数参数。如果它们都相等则打印equal，否则打印not equal。
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int integer1 = scanner.nextInt();
        int integer2 = scanner.nextInt();
        int integer3 = scanner.nextInt();
        if (integer1 == integer2 && integer1 == integer3) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}