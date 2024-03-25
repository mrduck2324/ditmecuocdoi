package thuyetrinh;

public abstract class Scientist extends nhanvien {
    public int article; //so bai bao cua nha khoa hoc
    public int songaychamcong;
    public double bacluong;//bac luong la so thap phan dung double
    public Scientist(String name, int datebirth, String license, String position, int article, int songaychamcong, double bacluong) {
        super(name,datebirth,license,position);
        this.article = article;
        this.songaychamcong = songaychamcong;
        this.bacluong = bacluong;
    }
    public double luong() {
        return songaychamcong * bacluong;
    }
}