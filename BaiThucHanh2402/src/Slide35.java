import java.util.Scanner;

public class Slide35 {
    public static void main(String[] args) {
        int a, b;
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Nhap so thu nhat:");
        a = Scanner.nextInt();
        System.out.println("Nhap so thu hai:");
        b = Scanner.nextInt();

        if(a>b){
            System.out.println("So nho nhat trong hai so la : " +b);}
        else{
            System.out.println("So nho nhat trong hai so la : " +a);            

        }


        
    }
}
