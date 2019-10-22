package package1;

import java.util.Scanner;

/**
 * Author: lisiyu
 * Created: 2019/10/22
 */

// 求两个正整数的最大公约数
public class CommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个数：");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int ret = 0;
        int min = a;

        if (a > b) {
            min = b;
        }
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                ret = i;
            }
        }
        System.out.println(ret);
    }
}
