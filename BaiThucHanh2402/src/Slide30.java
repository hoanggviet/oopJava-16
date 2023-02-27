import java.util.Scanner;

public class Slide30 {
    public static void main(String[] args) {
        int n, du, tong = 0;
        Scanner Scanner = new Scanner(System.in);
        System.out.println( "Nhap vao 1 so : " );
        n = Scanner.nextInt();
    
        while(n != 0){
            du = n % 10;
            n = n / 10;
            tong+= du;
        }
    System.out.println( "Tong cac chu so  = " +tong);
        
    }
    
    
}