import java.util.Scanner;

public class ThucHienButChi {
    public static void add(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ten san pham: ");
        String tenSanPham = sc.nextLine();
        System.out.print("Gia ban: ");
        String giaBan = sc.nextLine();
        System.out.print("Thuong hieu: ");
        String thuongHieu = sc.nextLine();
        System.out.print("Mau sac: ");
        String mauSac = sc.nextLine();
        System.out.print("Chat lieu: ");
        String chatLieu = sc.nextLine();
        System.out.print("Kich thuoc: ");
        String kichThuoc = sc.nextLine();
        ButChi pencil1 = new ButChi(tenSanPham, giaBan, thuongHieu, mauSac, chatLieu, kichThuoc);
        Main.penCil[++Main.dempencil]= pencil1;
        System.out.println("Hoan thanh them but chi!");
        System.out.println("Moi ban chon chuc nang tiep theo");
    }
    public static void xoa(){
        xem();
        Scanner sc = new Scanner(System.in);
        System.out.print("Chon so thu tu but chi muon xoa: ");
        int so = sc.nextInt();
        if(so > Main.dempencil || so <= 0){
            System.out.println("But chi nay khong ton tai!");
            System.out.println("Moi ban chon chuc nang tiep theo");
        }
        else{
            for(int i=so-1;i<Main.dempencil;i++){
                Main.penCil[i]=Main.penCil[i+1];
            }
            Main.dempencil--;
            System.out.println("Da xoa but chi!");
            System.out.println("Moi ban chon chuc nang tiep theo");
        }
    }
    public static void fix(){
        xem();
        System.out.print("Chon so thu tu but chi muon sua: ");
        int so = new Scanner(System.in).nextInt();
        if(so > Main.dempencil || so <= 0){
            System.out.println("But chi nay khong ton tai!");
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
            System.out.print("Mau sac: ");
            String mauSac = sc.nextLine();
            System.out.print("Chat lieu: ");
            String chatLieu = sc.nextLine();
            System.out.print("Kich thuoc: ");
            String kichThuoc = sc.nextLine();
            Main.penCil[so].setTenSanPham(tenSanPham);
            Main.penCil[so].setGiaBan(giaBan);
            Main.penCil[so].setThuongHieu(thuongHieu);
            Main.penCil[so].setMauSac(mauSac);
            Main.penCil[so].setChatLieu(chatLieu);
            Main.noteBook[so].setKichThuoc(kichThuoc);
            System.out.println("But chi da duoc cap nhat!");
            System.out.println("Moi ban chon chuc nang tiep theo");
        }
    }
    public static void xem(){
        for(int i=1;i<=Main.dempencil;i++){
            System.out.printf("%d.\n", i);
            System.out.println("Ten san pham: " + Main.penCil[i].getTenSanPham());
            System.out.println("Gia ban: " + Main.penCil[i].getGiaBan());
            System.out.println("Thuong hieu: " + Main.penCil[i].getThuongHieu());
            System.out.println("Mau sac: " + Main.penCil[i].getMauSac());
            System.out.println("Chat lieu: " + Main.penCil[i].getChatLieu());
            System.out.println("Kich thuoc: " + Main.penCil[i].getKichThuoc());
        }
    }
}
