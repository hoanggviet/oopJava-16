import java.util.LinkedHashSet;
import java.util.Scanner;

public class nhv913student {
    public String hoten;
    public int tuoi;
    public Float diem;

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public Float getDiem() {
        return diem;
    }

    public void setDiem(Float diem) {
        this.diem = diem;
    }

    public void NhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten");
        hoten = sc.nextLine();
        System.out.println("Nhap tuoi");
        tuoi = sc.nextInt();
        System.out.println("Nhap diem");
        diem = sc.nextFloat();

    }

    public static void ThemThongTin(LinkedHashSet <nhv913student> lkhs) {
        Scanner sc = new Scanner(System.in);
          while(true){
            nhv913student sv = new nhv913student();
               System.out.print("Nhap ho ten :"); sv.hoten = sc.nextLine();
               if(sv.hoten.isEmpty()){
                    break;
               }
               System.out.print("Nhap tuoi :"); sv.tuoi = sc.nextInt();
               System.out.print("Nhap diem :"); sv.diem = sc.nextFloat();
               sc.nextLine();
               lkhs.add(sv);
            }
    }
    
    public static void SuaThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin muon sua");

    }

    public static void XoaThongTin() {

    }

    public static void HienThi() {
        
    }

}





