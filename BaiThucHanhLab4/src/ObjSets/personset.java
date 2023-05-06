package ObjSets;

import java.util.Scanner;
import java.util.Set;



public class personset {
    public String HoTen;
    public String MaNhanVien;
    public int Tuoi;
    public String QueQuan;
    public String SoDienThoai;

    public void NhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten : ");
        HoTen = sc.nextLine();
        System.out.println("Nhap ma nhan vien : ");
        MaNhanVien = sc.nextLine();
        System.out.println("Nhap tuoi : ");
        Tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap que quan : ");
        QueQuan = sc.nextLine();
        System.out.println("Nhap so dien thoai : ");
        SoDienThoai = sc.nextLine();
    }

    public static void Hienthi(Set<personset> listPerson){
        for(personset person : listPerson) {
            String ht = person.HoTen;
            String mnv = person.MaNhanVien;
            int tuoi = person.Tuoi;
            String qq = person.QueQuan;
            String sdt = person.SoDienThoai;

            System.out.printf("Nhan vien %s - Ma NV %s - %d Tuoi - Que Quan %s - So Dien Thoai %s \n", ht, mnv, tuoi, qq, sdt);
        }
    }

    public static void Add(Set<personset> listPerson, int n){
        for(int i = 0; i<n; i++)
        {
            personset ps = new personset();
            ps.NhapThongTin();
            listPerson.add(ps);
        }
    }

    public static void Update(Set<personset> listPerson){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ten nhan vien muon cap nhat :");
        String ten= sc.nextLine();
        for(personset person : listPerson) {
            if(person.HoTen.equals(ten)){
                person.NhapThongTin();
            }
        }
    }
    
    public static void Delete(Set<personset> listPerson){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ten nhan vien muon xoa :");
        String ten= sc.nextLine();
        for(personset person : listPerson) {
            if(person.HoTen.equals(ten)){
                listPerson.remove(person);
                break;
            }
        }
    }
}