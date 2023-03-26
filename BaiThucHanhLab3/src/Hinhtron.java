import java.util.Scanner;

public class Hinhtron {
    // khai bao cac thuoc tinh
    public float bankinh = 0;
    public float chuvi = 0;
    public float dientich = 0;
    final float PI = 3.14f;

    // Khai bao cac phuong thuc
    // Nhap ban kinh 
    public void nhapbankinh()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh : ");
        bankinh = sc.nextFloat();
    }
    
    // Tinh chu vi 
    public float tinhchuvi()
    {   
       return chuvi= 2*PI*bankinh;  
    }

    // Tinh dien tich
    public float tinhdientich()
    {   
        return dientich= PI*bankinh*bankinh;    
    }

    // Hien thi thong tin hinh tron 
    public void hienthithongtin()
    {
        System.out.println("Ban kinh = " +bankinh);
        System.out.println("Chu vi = " +tinhchuvi());
        System.out.println("Dien tich = " +tinhdientich());
    }
}