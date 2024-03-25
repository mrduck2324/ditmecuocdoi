package thuyetrinh;
import java.util.Scanner;
public abstract class nhanvien{
    public String name;//ho ten
    public int datebirth;// ngay sinh
    public String license;// bang cap
    public String position;// chuc vu

    public nhanvien(){
        this.name= " ";
        this.datebirth = 1;
        this.license = " ";
        this.position = " ";
    }

    public nhanvien(String name , int datebirth, String license, String position){
        this.name = name;
        this.datebirth = datebirth ;
        this.license = license ;
        this.position = position ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDatebirth() {
        return datebirth;
    }

    public void setDatebirth(int datebirth) {
        this.datebirth = datebirth;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public abstract double Luong();

    public abstract double luong();

    public abstract void nhap();
    public abstract void xuat ();
}