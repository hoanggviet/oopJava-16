package BaiThucHanh2104;

public class HinhTru extends HinhHoc {
    public float chieuCao;
    private float r;
    public HinhTru(float chieuCao, float r) {
        this.chieuCao = chieuCao;
        this.r = r;
    }
    public float getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(float chieuCao) {
        this.chieuCao = chieuCao;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    @Override
    public void ten() {
        System.out.println(" * HINH TRU * ");
    }

    @Override
    public double tinhchuvi() {
        return 2 * getPI() * r;
    }
    @Override
    public double tinhdientich() {
        return getPI() * r * 2;
    }
    
    @Override
    public double tinhthetich() {
        return (getPI() * r * 2 ) * chieuCao;
    }
}