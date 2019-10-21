package package1;

import java.util.Scanner;

/**
 * Author: lisiyu
 * Created: 2019/10/21
 */

// 根据年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
public class WithAge {
    public static void main(String[] args) {
        System.out.println("请输入年龄");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age >= 0 && age <= 18) {
            System.out.println("少年");
        } else if (age > 19 && age <= 28) {
            System.out.println("青年");
        } else if (age > 29 && age <= 55) {
            System.out.println("中年");
        } else if (age > 56) {
            System.out.println("老年");
        } else {
            System.out.println("输入的年龄有误");
        }
    }
}
