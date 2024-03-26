package thuyetrinh;

// ! Lớp con của abstract của lớp nhân viên m ghi thêm abstract vô chi v ông cố nội,
    //!! {ABSTRACT CLASS KHÔNG THỂ KHƠI TẠOOO!!}
    // * má ngồi sửa cho ông cố ổng ghi abstract class mới ghê chứ
public class Scientist extends nhanvien {
    public int article; //so bai bao cua nha khoa hoc
    public int songaychamcong;
    public double bacluong;//bac luong la so thap phan dung double

    // ! Constructor
    // /**
    //  * có 7 tham số thì bên kia cũng phải có 7 tham số, hiểu không em ??
    //  * @param name
    //  * @param datebirth
    //  * @param license
    //  * @param position
    //  * @param article
    //  * @param songaychamcong
    //  * @param bacluong
    //  */
    public Scientist(String name, int datebirth, String license, String position, int article, int songaychamcong, double bacluong) {
        super(name,datebirth,license,position);
        this.article = article;
        this.songaychamcong = songaychamcong;
        this.bacluong = bacluong;
    }

    @Override
    public void nhap() {}

    @Override
    public void xuat() {}

    @Override
    public double luong() {
        return songaychamcong * bacluong;
    }
}