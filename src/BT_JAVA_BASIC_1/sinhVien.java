package BT_JAVA_BASIC_1;

import java.security.PublicKey;

public class sinhVien {
    static String sv_name = "Anh Dang";
    String sv_address = "HCM city";

    public void getSv_bYear() {
        int sv_bYear = 1995;
        System.out.println(sv_bYear);
    }

    public static void main(String[] args) {
        System.out.print(sv_name + " - ");
        sinhVien sinhvien = new sinhVien();
        sinhvien.getSv_bYear();
        System.out.println("Address: " + sinhvien.sv_address);
        System.out.println("School year: " + thongTin.tt_noOfYear);
        System.out.println("Class: " + thongTin.tt_class);
        System.out.println("Major: " + thongTin.tt_major);

    }
}
