package hexlet.code.controllers;

import java.util.Scanner;
//получение информации от пользователя
// реализованно два метода для String или int

public class ScannerIn {
    //работа со строками
    public static String scannerInStr() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
    //работа исключительно с целыми числами
    public static int scannerInInt() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Please enter the number and press Enter");
            return scannerInInt();
        }
    }
}
