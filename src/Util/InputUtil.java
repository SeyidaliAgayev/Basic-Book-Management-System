package Util;

import java.util.Scanner;

public class InputUtil {
    static int id = 0;
    public static int InputRequiredInt(String title) {
        id++;
        Scanner sc = new Scanner(System.in);
        System.out.println(title);
        return sc.nextInt();
    }

    public static String InputRequiredString(String title) {
        Scanner sc = new Scanner(System.in);
        System.out.println(title);
        return sc.nextLine();
    }
}
