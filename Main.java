import java.util.Scanner;

public class Main {
    static Sach[] sach = new Sach[100];
    static VoGhi[] noteBook = new VoGhi[100];
    static ButChi[] penCil = new ButChi[100];
    static ButMuc[] pen = new ButMuc[100];
    static int demsach=0, demvo=0, dempencil=0, dempen=0;
    public static void main(String[] args) {
        System.out.println("1. Dang nhap");
        System.out.println("2. Thoat");
        int nhap = new Scanner(System.in).nextInt();
        while (true) {
            if(nhap==1)
                DangNhap.Signin();
            else
                break;
        }
    }
}
