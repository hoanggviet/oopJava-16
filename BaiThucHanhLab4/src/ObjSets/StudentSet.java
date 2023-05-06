package ObjSets;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentSet {
    public String FullName;
    public int Age;

     public void NhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten : ");
        FullName= sc.nextLine();
        System.out.println("Nhap tuoi : ");
        Age = sc.nextInt();
    }

     public static void Hienthi(Set<StudentSet> SetStudent){
        for(StudentSet std : SetStudent)
        {
            String fName = std.FullName;
            int tuoi = std.Age;
            System.out.printf("Sinh vien %s, %d tuoi\n", fName,tuoi);
        }
    }

     public static void Add(Set<StudentSet> SetStudent, int n){
        for(int i = 0; i<n; i++)
        {
            StudentSet std = new StudentSet();
            std.NhapThongTin();
            SetStudent.add(std);
        }
    }

     public static void Update(Set<StudentSet> SetStudent){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao thong tin muon cap nhat :");
        String ten= sc.nextLine();
        for(StudentSet std : SetStudent){
            if(std.FullName.equals(ten)){
                std.NhapThongTin();
            }
        }
    }
    
    public static void Delete(Set<StudentSet> SetStudent){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao thong tin muon xoa :");
        String ten= sc.nextLine();
        Set<StudentSet> temp = new HashSet<StudentSet>();
        for(StudentSet std : SetStudent){
            if(!std.FullName.equals(ten)){
                temp.add(std);
            }
        }
        SetStudent.clear();
        SetStudent.addAll(temp);
    }

}
