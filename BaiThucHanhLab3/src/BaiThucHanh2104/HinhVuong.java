package BaiThucHanh2104;

public class HinhVuong extends HinhHoc {
    public float canh;
    
    public HinhVuong(float canh) {
        this.canh = canh;
    }

    public float getCanh() {
        return canh;
    }

    public void setCanh(float canh) {
        this.canh = canh;
    }

    @Override
    public void ten() {
        System.out.println(" * HINH VUONG * ");
    }

    @Override
    public double tinhchuvi() {
        return 2 * (canh + canh);
    }

    @Override
    double tinhdientich() {
        return canh * canh;
    }
}

