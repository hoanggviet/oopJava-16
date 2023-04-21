package shapes;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {

    public float dai;
    public float rong;

    public void tinhChuVi() {
        chuVi = 2 * (dai + rong);
    } 

    public void tinhDienTich() {
        dienTich = dai * rong;
    }

}
