import java.util.Scanner;

public class Nhanvien {
    // Cac thuoc tinh
    public String hotennv;
    public int tuoi;
    public int hesoluong;
    final int luongcoban = 1490000;

    // Phuong thuc 
    public void nhapthongtin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten nv : ");
        hotennv = sc.nextLine();
        System.out.println("Nhap tuoi nv : ");
        tuoi = sc.nextInt();
        System.out.println("Nhap he so luong : ");
        hesoluong = sc.nextInt();
    }

    public int tinhluong()
    {
        int luong;
        return luong = hesoluong * luongcoban;
    }

    public void hienthithongtinnv()
    {
        System.out.printf("Ten nv %s - tuoi %d",hotennv,tuoi);
        System.out.println("\nMuc luong la : " +tinhluong());
    }
}