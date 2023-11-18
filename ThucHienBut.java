import java.util.Scanner;

public class ThucHienBut {
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
        System.out.print("Loai muc: ");
        String loaiMuc = sc.nextLine();
        System.out.print("Do min: ");
        float doMin = sc.nextFloat();
        ButMuc pen1 = new ButMuc(tenSanPham, giaBan, thuongHieu, mauSac, chatLieu, loaiMuc, doMin);
        Main.pen[++Main.dempen]= pen1;
        System.out.println("Hoan thanh them but muc!");
        System.out.println("Moi ban chon chuc nang tiep theo");
    }
    public static void xoa(){
        xem();
        Scanner sc = new Scanner(System.in);
        System.out.print("Chon so thu tu but muc muon xoa: ");
        int so = sc.nextInt();
        if(so > Main.dempen || so <= 0){
            System.out.println("But muc nay khong ton tai!");
            System.out.println("Moi ban chon chuc nang tiep theo");
        }
        else{
            for(int i=so-1;i<Main.dempen;i++){
                Main.pen[i]=Main.pen[i+1];
            }
            Main.dempen--;
            System.out.println("Da xoa but muc!");
            System.out.println("Moi ban chon chuc nang tiep theo");
        }
    }
    public static void fix(){
        xem();
        System.out.print("Chon so thu tu but muc muon sua: ");
        int so = new Scanner(System.in).nextInt();
        if(so > Main.dempen || so <= 0){
            System.out.println("But muc nay khong ton tai!");
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
            System.out.print("Loai muc: ");
            String loaiMuc = sc.nextLine();
            System.out.print("Do min: ");
            float doMin = sc.nextFloat();
            Main.pen[so].setTenSanPham(tenSanPham);
            Main.pen[so].setGiaBan(giaBan);
            Main.pen[so].setThuongHieu(thuongHieu);
            Main.pen[so].setMauSac(mauSac);
            Main.pen[so].setChatLieu(chatLieu);
            Main.pen[so].setLoaiMuc(loaiMuc);
            Main.pen[so].setDoMin(doMin);
            System.out.println("But muc da duoc cap nhat!");
            System.out.println("Moi ban chon chuc nang tiep theo");
        }
    }
    public static void xem(){
        for(int i=1;i<=Main.dempen;i++){
            System.out.printf("%d.\n", i);
            System.out.println("Ten san pham: " + Main.pen[i].getTenSanPham());
            System.out.println("Gia ban: " + Main.pen[i].getGiaBan());
            System.out.println("Thuong hieu: " + Main.pen[i].getThuongHieu());
            System.out.println("Mau sac: " + Main.pen[i].getMauSac());
            System.out.println("Chat lieu: " + Main.pen[i].getChatLieu());
            System.out.println("Loai muc: " + Main.pen[i].getLoaiMuc());
            System.out.println("Do min: " + Main.pen[i].getDoMin());
        }
    }
}
