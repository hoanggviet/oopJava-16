package Sets;

import java.util.HashSet;
import java.util.Scanner;

import ObjSets.personset;

public class HashSetDemops {
    public static void main(String[] args) {
        HashSet<personset> arrayList = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu : ");
        int sophantu = sc.nextInt(); 
        personset.Add(arrayList, sophantu);
        personset.Hienthi(arrayList);
        personset.Update(arrayList);
        personset.Delete(arrayList);
    }
}
