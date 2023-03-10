import java.util.Scanner;

public class Slide74 {
    public static void main(String[] args) {
    // Khai bao va nhap mang 1 chieu
    int n;
    Scanner sc = new Scanner(System.in);
    do{
        System.out.print("Nhap vao mang ");
        n = sc.nextInt();
    }while(n<0);

    int arrA[]= new int[n];
    for(int i=0; i<arrA.length; i++)
    {
        System.out.printf("A[%d]=",i);
        arrA[i]=sc.nextInt();
    }
    // Cong cac so chan va in ra ket qua
    int tong=0;
    for(int i=0; i<n; i++)
    {
        if (arrA[i]%2==0);
        { 
            tong=tong + arrA[i];
        }
    }
    System.out.println("Tong cac so chan trong mang =" +tong);
    }
}
