import java.util.Scanner;

public class Hinhtrutron {
    // khai bao cac thuoc tinh
    public float bankinh = 0;
    public float chieucao = 0;
    public float chuvi = 0;
    public float dientich = 0;
    public float thetich = 0;
    final float PI = 3.14f;

    // Khai bao cac phuong thuc
    // Nhap ban kinh 
    public void nhapbankinhhtt()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh : ");
        bankinh = sc.nextFloat();
    }
    // Nhap chieu cao
    public void nhapchieucao()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu cao : ");
        chieucao = sc.nextFloat();
    }
    
    // Tinh chu vi 
    public float tinhchuvihtt()
    {   
       return chuvi= 2*PI*bankinh;  
    }

    // Tinh dien tich
    public float tinhdientichhtt()
    {   
        return dientich= 2*PI*bankinh*(bankinh+chieucao);  
    }

    
    // Tinh the tich
    public float tinhthetichhtt()
    {   
        return thetich= PI*bankinh*bankinh*chieucao;  
    }
    
    // Hien thi chu vi hinh tron 
    public void thongtinhinhtrutron()
    {
        System.out.println(" Chieu cao = " +chieucao);
        System.out.println(" Chu vi = " +tinhchuvihtt());
        System.out.println(" Dien tich = " +tinhdientichhtt());
        System.out.println(" The tich = " +tinhthetichhtt());
    }
}