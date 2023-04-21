package BaiThucHanh2104;

public class test {
    public static void main(String[] args) {
        HinhHoc ht = new HinhTron(5);
        ht.ten();
        System.out.println("Chu vi = " +ht.tinhchuvi());
        System.out.println("Dien tich = " +ht.tinhdientich());
    

        HinhHoc hcn = new HinhChuNhat(5, 6);
        hcn.ten();
        System.out.println("Chu vi = " +hcn.tinhchuvi());
        System.out.println("Dien tich = " +hcn.tinhdientich());
    
        HinhHoc hv = new HinhVuong(8);
        hv.ten();
        System.out.println("Chu vi = " +hv.tinhchuvi());
        System.out.println("Dien tich = " +hv.tinhdientich());
    
        HinhHoc htru = new HinhTru(6, 9);
        htru.ten();
        System.out.println("Chu vi = " +htru.tinhchuvi());
        System.out.println("Dien tich = " +htru.tinhdientich());
        System.out.println("The tich = " +htru.tinhthetich());
    }
}
