package java_8.Lambda;

import java.util.function.Predicate;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2024;
        Predicate<Integer> isLeapYear = y->(y%4==0 && y%100 !=0)|| (y%400 ==0) ;
        if(isLeapYear.test(year)){
            System.out.println("Is leap a year");
        }
        else {
            System.out.println("Is not a leap year");
        }
    }
}
