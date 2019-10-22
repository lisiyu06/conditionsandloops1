package package1;

/**
 * Author: lisiyu
 * Created: 2019/10/22
 */

// 计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值。
public class Sum1 {
    public static void main(String[] args) {
        int i = 1;
        int a = 1;
        double sum = 0.0;
        for (i = 1; i <= 100; i++) {
            sum = sum + (1.0 / i) * a;
            a = -a;
        }
        System.out.println(sum);
    }
}