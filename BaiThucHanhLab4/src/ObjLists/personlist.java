package ObjLists;

import java.util.List;
import java.util.Scanner;
    
public class personlist {    
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
        System.out.println("Nhap que quan : ");
        QueQuan = sc.nextLine();
        System.out.println("Nhap so dien thoai : ");
        SoDienThoai = sc.nextLine();
    }

    public static void Hienthi(List<personlist> listPerson){
        for(int i = 0 ; i<listPerson.size(); i++)
        {
            
            String ht = listPerson.get(i).HoTen;
            String mnv = listPerson.get(i).MaNhanVien;
            int tuoi = listPerson.get(i).Tuoi;
            String qq = listPerson.get(i).QueQuan;
            String sdt = listPerson.get(i).SoDienThoai;


            System.out.printf("Nhan vien %s - Ma NV %s - %d Tuoi - Que Quan %s - So Dien Thoai %s \n", ht, mnv, tuoi, qq, sdt);
        }
    }

    public static void Add(List<personlist> listPerson, int n){
        for(int i = 0; i<n; i++)
        {
            personlist std = new personlist();
            std.NhapThongTin();
            listPerson.add(std);
        }
    }

    public static void Update(List<personlist> listPerson){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao thong tin muon cap nhat :");
        String ten= sc.nextLine();
        for(int i=0; i<listPerson.size(); i++){
            if(listPerson.get(i).HoTen.equals(ten)){
                personlist ps = new personlist();
                ps.NhapThongTin();
                listPerson.set(i, ps);
            }
        }
    }
    
    public static void Delete(List<personlist> listPerson){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao thong tin muon xoa :");
        String ten= sc.nextLine();
        for(int i=0; i<listPerson.size(); i++){
            if(listPerson.get(i).HoTen.equals(ten)){
                personlist ps = new personlist();
                ps.NhapThongTin();
                listPerson.remove(i);
            }
        }
    }
}