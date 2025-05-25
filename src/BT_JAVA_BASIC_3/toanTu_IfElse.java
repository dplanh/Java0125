package BT_JAVA_BASIC_3;

import BT_JAVA_BASIC_2.calculator;

import java.util.Scanner;

public class toanTu_IfElse {
    public static void soSanh(int n){
        int number = 100;
        if (n > number){
            System.out.println("So ban vua nhap lơn hon 100");
        }
        else if (n < number){
            System.out.println("So ban vua nhap nho hon 100");
        }
        else {
            System.out.println("So ban vua nhap bang 100");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        toanTu_IfElse toanTu = new toanTu_IfElse();
        int n;
        System.out.println("Nhap so nguyen n");
        n = input.nextInt();
        soSanh(n);
    }
}
