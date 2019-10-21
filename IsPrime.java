package package1;

import java.util.Scanner;

/**
 * Author: lisiyu
 * Created: 2019/10/21
 */

// 判定一个数字是否是素数
public class IsPrime {
    public static void main(String[] args) {
        System.out.println("请输入一个数：");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num < 2) {
            System.out.println("不是素数");
        } else if (num == 2){
            System.out.println("是素数");
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println("不是素数");
                    break;
                } else {
                    System.out.println("是素数");
                    break;
                }
            }
        }
    }
}
