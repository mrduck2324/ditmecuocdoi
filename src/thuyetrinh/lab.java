package thuyetrinh;
import java.util.Scanner;

 class lab extends nhanvien {
private double luongthang;
    public lab(){
        super();
    }
    public lab (String name, int datebirth, String license,String position){
        super(name,datebirth,license,position);
        this.luongthang = luongthang;
    }

     @Override
     public double Luong() {
         return 0;
     }

     @Override
    public double luong(){
        return luongthang;
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
    }

    public void xuat()
    {
        System.out.println("H? tên: " + this.getName());
        System.out.println("Năm sinh: " + this.getDatebirth());
        System.out.println("B?ng c?p: " + this.getLicense());
        System.out.println("luong thang duoc tra: " + this.luongthang);
    }


}
