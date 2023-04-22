package main;


import java.util.Scanner;

import DanhBaSDT.Sulidanhba;

public class testdbsdt {
    public static void main(String[] args) {
        Sulidanhba pb = new Sulidanhba();
        Scanner sc = new Scanner(System.in);
        boolean tmp = true;
        while(tmp){
            System.out.println("1.Them lien he");
            System.out.println("2.Xoa lien he");
            System.out.println("3.Tim kiem so dien thoai");
            System.out.println("4.Cap nhat");
            System.out.println("5.Thoat");
            int select = sc.nextInt();
            switch (select) {
                case 1:
                    System.out.print(" Nhap ten :"); String name = sc.nextLine();
                    System.out.print(" Nhap sdt :"); String sdt = sc.nextLine();
                    pb.themsdt(name, sdt);
                    break;
                case 2:
                    System.out.print(" Nhap ten can tim :"); String namef = sc.nextLine();
                    pb.timkiemsdt(namef);
                    break;
                case 3:
                    System.out.print(" Ten can cap nhat :"); String nameud = sc.nextLine();
                    System.out.print(" Sdt moi :"); String NewPhoneNumber = sc.nextLine();
                    pb.capnhatsdt(nameud, NewPhoneNumber);
                    break;
                case 4:
                    tmp = false;
                    break;
                default:
                    System.out.println("wrong data input !!!");
                    break;
               }
          }
     }
}
