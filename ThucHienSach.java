import java.util.Scanner;

public class ThucHienSach {
    public static void add(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Tieu de sach: ");
        String tieuDe = sc.nextLine();
        System.out.print("Gia ban: ");
        String giaBan = sc.nextLine();
        System.out.print("Ten tac gia: ");
        String tacGia = sc.nextLine();
        System.out.print("The loai: ");
        String theLoai = sc.nextLine();
        System.out.print("Nha xuat ban: ");
        String nhaXuatBan = sc.nextLine();
        System.out.print("Nam xuat ban: ");
        String namXuatBan = sc.nextLine();
        System.out.print("Ngon ngu: ");
        String ngonNgu = sc.nextLine();
        Sach sach1 = new Sach(tieuDe, giaBan, tacGia, theLoai, nhaXuatBan, namXuatBan, ngonNgu);
        Main.sach[++Main.demsach]= sach1;
        System.out.println("Hoan thanh them sach!");
        System.out.println("Moi ban chon chuc nang tiep theo");
    }
    public static void xoa(){
        xem();
        Scanner sc = new Scanner(System.in);
        System.out.print("Chon so thu tu sach muon xoa: ");
        int so = sc.nextInt();
        if(so > Main.demsach || so <= 0){
            System.out.println("Sach nay khong ton tai!");
            System.out.println("Moi ban chon chuc nang tiep theo");
        }
        else{
            for(int i=so-1;i<Main.demsach;i++){
                Main.sach[i]=Main.sach[i+1];
            }
            Main.demsach--;
            System.out.println("Da xoa sach!");
            System.out.println("Moi ban chon chuc nang tiep theo");
        }
    }
    public static void fix(){
        xem();
        System.out.print("Chon so thu tu sach muon sua: ");
        int so = new Scanner(System.in).nextInt();
        if(so > Main.demsach || so <= 0){
            System.out.println("Sach nay khong ton tai!");
            System.out.println("Moi ban chon chuc nang tiep theo");
        }
        else{
            Scanner sc = new Scanner(System.in);
            System.out.print("Tieu de sach: ");
            String tieuDe = sc.nextLine();
            System.out.print("Gia ban: ");
            String giaBan = sc.nextLine();
            System.out.print("Ten tac gia: ");
            String tacGia = sc.nextLine();
            System.out.print("The loai: ");
            String theLoai = sc.nextLine();
            System.out.print("Nha xuat ban: ");
            String nhaXuatBan = sc.nextLine();
            System.out.print("Nam xuat ban: ");
            String namXuatBan = sc.nextLine();
            System.out.print("Ngon ngu: ");
            String ngonNgu = sc.nextLine();
            Main.sach[so].setTieuDe(tieuDe);
            Main.sach[so].setTacGia(tacGia);
            Main.sach[so].setTheLoai(theLoai);
            Main.sach[so].setGiaBan(giaBan);
            Main.sach[so].setNamXuatban(namXuatBan);
            Main.sach[so].setNhaXuatBan(nhaXuatBan);
            Main.sach[so].setNgonNgu(ngonNgu);
            System.out.println("Sach da duoc cap nhat!");
            System.out.println("Moi ban chon chuc nang tiep theo");
        }
    }
    public static void xem(){
        for(int i=1;i<=Main.demsach;i++){
            System.out.printf("%d.\n", i);
            System.out.println("Tieu de sach: " + Main.sach[i].getTieuDe());
            System.out.println("Gia ban: " + Main.sach[i].getGiaBan());
            System.out.println("Ten tac gia: " + Main.sach[i].getTacGia());
            System.out.println("The loai: " + Main.sach[i].getTheLoai());
            System.out.println("Nha xuat ban: " + Main.sach[i].getNhaXuatBan());
            System.out.println("Nam xuat ban: " + Main.sach[i].getNamXuatban());
            System.out.println("Ngon ngu: " + Main.sach[i].getNgonNgu());
        }
    }
}
