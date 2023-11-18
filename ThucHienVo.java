import java.util.Scanner;

public class ThucHienVo {
    public static void add(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ten san pham: ");
        String tenSanPham = sc.nextLine();
        System.out.print("Gia ban: ");
        String giaBan = sc.nextLine();
        System.out.print("Thuong hieu: ");
        String thuongHieu = sc.nextLine();
        System.out.print("So trang: ");
        String soTrang = sc.nextLine();
        System.out.print("Loai vo: ");
        String loaiVo = sc.nextLine();
        System.out.print("Mau bia: ");
        String mauBia = sc.nextLine();
        System.out.print("Chat lieu: ");
        String chatLieu = sc.nextLine();
        System.out.print("Kich thuoc: ");
        String kichThuoc = sc.nextLine();
        VoGhi voghi1 = new VoGhi(tenSanPham, giaBan, thuongHieu, soTrang, loaiVo, mauBia, chatLieu, kichThuoc);
        Main.noteBook[++Main.demvo]= voghi1;
        System.out.println("Hoan thanh them vo ghi!");
        System.out.println("Moi ban chon chuc nang tiep theo");
    }
    public static void xoa(){
        xem();
        Scanner sc = new Scanner(System.in);
        System.out.print("Chon so thu tu vo ghi muon xoa: ");
        int so = sc.nextInt();
        if(so > Main.demvo || so <= 0){
            System.out.println("Vo ghi nay khong ton tai!");
            System.out.println("Moi ban chon chuc nang tiep theo");
        }
        else{
            for(int i=so-1;i<Main.demvo;i++){
                Main.noteBook[i]=Main.noteBook[i+1];
            }
            Main.demvo--;
            System.out.println("Da xoa vo ghi!");
            System.out.println("Moi ban chon chuc nang tiep theo");
        }
    }
    public static void fix(){
        xem();
        System.out.print("Chon so thu tu vo ghi muon sua: ");
        int so = new Scanner(System.in).nextInt();
        if(so > Main.demvo || so <= 0){
            System.out.println("Vo ghi nay khong ton tai!");
            System.out.println("Moi ban chon chuc nang tiep theo");
        }
        else{
            Scanner sc = new Scanner(System.in);
            System.out.print("Ten san pham: ");
            String tenSanPham = sc.nextLine();
            System.out.print("Gia ban: ");
            String giaBan = sc.nextLine();
            System.out.print("Thuong hieu: ");
            String thuongHieu = sc.nextLine();
            System.out.print("So trang: ");
            String soTrang = sc.nextLine();
            System.out.print("Loai vo: ");
            String loaiVo = sc.nextLine();
            System.out.print("Mau bia: ");
            String mauBia = sc.nextLine();
            System.out.print("Chat lieu: ");
            String chatLieu = sc.nextLine();
            System.out.print("Kich thuoc: ");
            String kichThuoc = sc.nextLine();
            Main.noteBook[so].setTenSanPham(tenSanPham);
            Main.noteBook[so].setGiaBan(giaBan);
            Main.noteBook[so].setThuongHieu(thuongHieu);
            Main.noteBook[so].setSoTrang(soTrang);
            Main.noteBook[so].setLoaiVo(loaiVo);
            Main.noteBook[so].setMauBia(mauBia);
            Main.noteBook[so].setChatLieu(chatLieu);
            Main.noteBook[so].setKichThuoc(kichThuoc);
            System.out.println("Vo ghi da duoc cap nhat!");
            System.out.println("Moi ban chon chuc nang tiep theo");
        }
    }
    public static void xem(){
        for(int i=1;i<=Main.demvo;i++){
            System.out.printf("%d.\n", i);
            System.out.println("Ten san pham: " + Main.noteBook[i].getTenSanPham());
            System.out.println("Gia ban: " + Main.noteBook[i].getGiaBan());
            System.out.println("Thuong hieu: " + Main.noteBook[i].getThuongHieu());
            System.out.println("So trang: " + Main.noteBook[i].getSoTrang());
            System.out.println("Loai vo: " + Main.noteBook[i].getLoaiVo());
            System.out.println("Mau bia: " + Main.noteBook[i].getLoaiVo());
            System.out.println("Chat lieu: " + Main.noteBook[i].getChatLieu());
        }
    }
}
