package Sets;

import java.util.HashSet;
import java.util.Scanner;
import ObjSets.StudentSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<StudentSet> hastList = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu : ");
        int sophantu = sc.nextInt(); 
        StudentSet.Add(hastList, sophantu);
        StudentSet.Hienthi(hastList);
        StudentSet.Update(hastList);
        StudentSet.Delete(hastList);
    }
}

