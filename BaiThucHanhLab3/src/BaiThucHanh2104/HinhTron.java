package BaiThucHanh2104;

public class HinhTron extends HinhHoc {
    private float r;

    public HinhTron(float r) {
        this.r = r;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    @Override
    public void ten() {
        System.out.println("HINH TRON");
    }

    @Override
    public double tinhchuvi() {
        return 2 * getPI() * r;
    }

    @Override
    public double tinhdientich() {
        return getPI() * r * r;
    }
}
