package Lists;

import java.util.ArrayList;
import java.util.Scanner;

import ObjLists.personlist;

public class ArrayListDemops {
    public static void main(String[] args) {
        ArrayList<personlist> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu : ");
        int sophantu = sc.nextInt(); 
        personlist.Add(arrayList, sophantu);
        personlist.Hienthi(arrayList);
        personlist.Update(arrayList);
        personlist.Delete(arrayList);
    }
}
