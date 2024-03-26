package thuyetrinh;
import java.util.Scanner;
class controlroom extends nhanvien {
    private int songaychamcong;
    private double bacluong;

    public controlroom() {
        super();
        this.songaychamcong = 0;
        this.bacluong = 0d;
    }

    public controlroom(String name, int datebirth, String license, String position, int songaychamcong, double bacluong) {
        super(name, datebirth, license, position);
        this.songaychamcong = songaychamcong;
        this.bacluong = bacluong;
    }

    public int getSongaychamcong() {
        return songaychamcong;
    }

    public void setSongaychamcong(int songaychamcong) {
        this.songaychamcong = songaychamcong;
    }

    public double getBacluong() {
        return bacluong;
    }

    public void setBacluong(double bacluong) {
        this.bacluong = bacluong;
    }

    public controlroom(String name, int datebirth, String license, String position, int article, int songaychamcong, double bacluong) {
        super(name, datebirth, license, position);
        this.songaychamcong = songaychamcong;
        this.bacluong = bacluong;
    }

    @Override
    public double luong() {
        return songaychamcong * bacluong;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập năm sinh: ");
        int daybirth = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập bằng cấp: ");
        String license = sc.nextLine();
        System.out.println("Nhập chức vụ: ");
        String position = sc.nextLine();
        System.out.println("Nhập số ngày công trong tháng: ");
        int songaychamCong = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập bậc lương: ");
        int bacluong = sc.nextInt();
        sc.nextLine();
    }

    public  void xuat()
    {
        System.out.println("H? tên: " + this.getName());
        System.out.println("Năm sinh: " + this.getDatebirth());
        System.out.println("B?ng c?p: " + this.getLicense());
        System.out.println("Ch?c v?: " + this.getPosition());
        System.out.println("S? ngày công trong tháng: " +this.getSongaychamcong());
        System.out.println("B?c lương: " + this.getBacluong());
    }

}
