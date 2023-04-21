package BaiThucHanh2104;

public class HinhChuNhat extends HinhHoc {
    public float dai;
    public float rong;

    public HinhChuNhat(float dai, float rong) {
        this.dai = dai;
        this.rong = rong;
    }
    public float getDai() {
        return dai;
    }
    public void setDai(float dai) {
        this.dai = dai;
    }
    public float getRong() {
        return rong;
    }
    public void setRong(float rong) {
        this.rong = rong;
    }
    @Override
    public void ten() {
        System.out.println("HINH CHU NHAT");
    }

    @Override
    public double tinhchuvi() {
        return 2* (dai + rong);
    }
    @Override
    double tinhdientich() {
        return dai * rong;
    }
}
