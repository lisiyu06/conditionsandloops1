package package1;

/**
 * Author: lisiyu
 * Created: 2019/10/22
 */

// 输出 1000 - 2000 之间所有的闰年

public class LeapYear {
    public static void main(String[] args) {
        int year;
        for (year = 1000; year <= 2000; year++) {
            if (((year % 100 != 0) && (year % 4 == 0)) || (year % 400 == 0)) {
                System.out.println(year);
            }
        }
    }
}
