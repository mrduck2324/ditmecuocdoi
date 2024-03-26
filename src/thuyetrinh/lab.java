package thuyetrinh;
import java.util.Scanner;

public class lab extends nhanvien {
    private double luongthang;

    

    public lab() {
        super();
        this.luongthang = 0d;
    }

    public lab(String name, int datebirth, String license, String position, double luongthang) {
        super(name, datebirth, license, position);
        this.luongthang = luongthang;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        String name = sc.nextLine();
        System.out.println("Nhap nam sinh: ");
        int daybirth = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap bang cap: ");
        String license = sc.nextLine();
    }

    @Override
    public void xuat()
    {
        System.out.println("Ho tên: " + this.getName());
        System.out.println("Nam sinh: " + this.getDatebirth());
        System.out.println("Bang cap: " + this.getLicense());
        System.out.println("luong thang duoc tra: " + this.luongthang);
    }

    @Override
    public double luong() {
        throw new UnsupportedOperationException("Unimplemented method 'luong'");
        // tu lam cho nay
    }


}
