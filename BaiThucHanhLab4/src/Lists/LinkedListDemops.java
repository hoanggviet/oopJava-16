package Lists;

import java.util.LinkedList;
import java.util.Scanner;

import ObjLists.personlist;

public class LinkedListDemops {
    public static void main(String[] args) {
        LinkedList<personlist> arrayList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu : ");
        int sophantu = sc.nextInt(); 
        personlist.Add(arrayList, sophantu);
        personlist.Hienthi(arrayList);
        personlist.Update(arrayList);
        personlist.Delete(arrayList);
    }
}