public class App {
    public static void main(String[] args) throws Exception {
        // Hinh tron 
        Hinhtron ht = new Hinhtron();
        ht.nhapbankinh();
        ht.hienthithongtin();

        // Hinh tru tron
        Hinhtrutron htt = new Hinhtrutron();
        htt.nhapbankinhhtt();
        htt.nhapchieucao();
        htt.thongtinhinhtrutron();

        // Nhanvien
        Nhanvien nv = new Nhanvien();
        nv.nhapthongtin();
        nv.tinhluong();
        nv.hienthithongtinnv();
    }
}
