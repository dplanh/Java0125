package BT_JAVA_BASIC_2;

import java.util.Scanner;

public class calculator {
    // Khai bao bien toan cuc cho Cach 1 và 2
    int isoNguyen1st, isoNguyen2nd;
    float fsothuc1st, fsothu2nd;

    //Diem chung: Su dung tham so duoc nhap tu keyboard
    //Cach 1:  Tinh tong/tich va print trong phuong thuc cuc bo
    public void Tong2SoNguyen(int isoNguyen1st, int isoNguyen2nd) {
        int itong2SoNguyen = isoNguyen1st + isoNguyen2nd;
        System.out.println("Tong 2 so nguyen: " + isoNguyen1st + " + " + isoNguyen2nd + " = " + itong2SoNguyen);
    }

    public void Tich2SoThuc(float fsothuc1st, float fsothu2nd) {
        float ftich2SoThuc = fsothuc1st * fsothu2nd;
        System.out.println("Tich 2 so nguyen: " + fsothuc1st + " * " + fsothu2nd + " = " + ftich2SoThuc);
    }

    //--------------------------------------------------------------
    //Cach 2: Su dung bien local tu ham main()
    // Only tinh tong/tich và tra ra gia tri tong trong local method
    public int tinhTongC2(int isoNguyen1st, int isoNguyen2nd) {
        int itong = isoNguyen1st + isoNguyen2nd;
        return itong;
    }

    public float tinhTichC2(float f1, float f2) {
        float fTich = f1 * f2;
        return fTich;
    }

    //--------------------------------------------------------------
    //Cach 3: Tinh tong và tra ra gia tri tong trong local method
    //Gia tri ia,ib tu ham mainn() duoc gan vao tham so truyen vao ab
    //Tham so truyen vao ab co the khac voi bien local o ham main()
    public int tinhTongC3(int a, int b) {
        int iTong = a + b;
        return iTong;
    }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            calculator cal = new calculator();
            //Enter 2 so nguyen tu keyboard
            // Gia tri so nguyen duoc nhap tu keyboard gan truc tiep vào bien toan cuc
            //Su dung chung bien toan cuc
            System.out.println("1. Tong 2 so nguyen");
            System.out.println("- Nhap so nguyen thu 1: ");
            cal.isoNguyen1st = input.nextInt();
            System.out.println("- Nhap so nguyen thu 2: ");
            cal.isoNguyen2nd = input.nextInt();

            //Enter 2 so thuc tu keyboard
            System.out.println("2. Tich 2 so thuc");
            System.out.println("- Nhap so thuc thu 1: ");
            cal.fsothuc1st = input.nextFloat();
            System.out.println("- Nhap so thuc thu 2");
            cal.fsothu2nd = input.nextFloat();

            System.out.println("------C1-----");
            //Cach 1: Chi can call ham mà khong can print (void method)
            //Tinh tong 2 so nguyen
            cal.Tong2SoNguyen(cal.isoNguyen1st, cal.isoNguyen2nd);
            //Tinh tich 2 so thuc
            cal.Tich2SoThuc(cal.fsothuc1st, cal.fsothu2nd);


            //--------------------------------------------------------------
            System.out.println("------C2-----");
            int iTongC2 = cal.tinhTongC2(cal.isoNguyen1st, cal.isoNguyen2nd);
            float fTichC2 = cal.tinhTichC2(cal.fsothuc1st, cal.fsothu2nd);
            //Cach 2: Call ham va can print (int method)
            System.out.println("Tong: " + iTongC2);
            System.out.println("Tich: " + fTichC2);


            //--------------------------------------------------------------
            System.out.println("------C3-----");
            //Cach 3: Khai bao và Gan truc tiep bien local tu keyboard
            //Khai bao va su dung bien local o main
            int ia, ib;
            float fc, fd;
            //Enter 2 so nguyen tu keyboard
            System.out.println("1. Tong 2 so nguyen");
            System.out.println("- Nhap so nguyen thu 1: ");
            ia = input.nextInt();
            System.out.println("- Nhap so nguyen thu 2: ");
            ib = input.nextInt();
            //Truyen gia tri bien local ia,ib duoc nhap tu keyboard vao ham tinhTong va print
            int itongC3 = cal.tinhTongC3(ia, ib);
            System.out.println("Tong: " + itongC3);

            //Enter 2 so thuc tu keyboard
            System.out.println("2. Tich 2 so thuc");
            System.out.println("- Nhap so thuc thu 1: ");
            fc = input.nextFloat();
            System.out.println("- Nhap so thuc thu 2");
            fd = input.nextFloat();
            float fTichC3 = cal.tinhTichC2(fc, fd);
            System.out.println("Tich: " + fTichC3);

            //Close Scanner
            input.close();
        } catch (Exception e) {
            System.out.println("Vui long nhap dung kieu du lieu");
        }
    }
}
