import java.util.Scanner;

public class Find {
    public static void chon(){
        int press;
        String tukhoa;
        System.out.print("Nhap tu khoa: ");
        tukhoa = new Scanner(System.in).nextLine();
        System.out.println("1. Xem theo danh sach");
        System.out.println("2. Xem theo dang bang");
        press = new Scanner(System.in).nextInt();
        if(press==1)
            ds(tukhoa);
        else if(press==2)
            bang(tukhoa);
    }
    public static void ds(String tukhoa){
        System.out.println("Danh sach tim kiem: ");
        for(int i=1;i<=Main.demsach;i++){
            if(samesach(Main.sach[i], tukhoa)){
                System.out.println("Tieu de sach: " + Main.sach[i].getTieuDe());
                System.out.println("Gia ban: " + Main.sach[i].getGiaBan());
                System.out.println("Ten tac gia: " + Main.sach[i].getTacGia());
                System.out.println("The loai: " + Main.sach[i].getTheLoai());
                System.out.println("Nha xuat ban: " + Main.sach[i].getNhaXuatBan());
                System.out.println("Nam xuat ban: " + Main.sach[i].getNamXuatban());
                System.out.println("Ngon ngu: " + Main.sach[i].getNgonNgu());
            }
        }
        for (int i=1;i<=Main.demvo;i++){
            if(samevo(Main.noteBook[i], tukhoa)){
                System.out.println("Ten san pham: " + Main.noteBook[i].getTenSanPham());
                System.out.println("Gia ban: " + Main.noteBook[i].getGiaBan());
                System.out.println("Thuong hieu: " + Main.noteBook[i].getThuongHieu());
                System.out.println("So trang: " + Main.noteBook[i].getSoTrang());
                System.out.println("Loai vo: " + Main.noteBook[i].getLoaiVo());
                System.out.println("Mau bia: " + Main.noteBook[i].getLoaiVo());
                System.out.println("Chat lieu: " + Main.noteBook[i].getChatLieu());
            }
        }
        for (int i=1;i<=Main.dempencil;i++){
            if(samepencil(Main.penCil[i], tukhoa)){
                System.out.println("Ten san pham: " + Main.penCil[i].getTenSanPham());
                System.out.println("Gia ban: " + Main.penCil[i].getGiaBan());
                System.out.println("Thuong hieu: " + Main.penCil[i].getThuongHieu());
                System.out.println("Mau sac: " + Main.penCil[i].getMauSac());
                System.out.println("Chat lieu: " + Main.penCil[i].getChatLieu());
                System.out.println("Kich thuoc: " + Main.penCil[i].getKichThuoc());
            }
        }
        for (int i=1;i<=Main.dempen;i++){
            if(samepen(Main.pen[i], tukhoa)){
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
    public static void bang(String tukhoa){
        System.out.println("                                       Danh sach tim kiem                                       ");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("|      Ten san pham      |  Gia ban  |     Thuong hieu     |        Thong tin them        |");
        System.out.println("-------------------------------------------------------------------------------------------");
        for(int i=1;i<=Main.demsach;i++){
            if(samesach(Main.sach[i], tukhoa)){
                System.out.printf("|%-24s|%-11s|%-21s|%-30s|\n",Main.sach[i].getTieuDe(), Main.sach[i].getGiaBan(), "", "The loai: " + Main.sach[i].getTheLoai());
                System.out.printf("|%-24s|%-11s|%-21s|%-30s|\n", "", "", "", "Tac gia: " + Main.sach[i].getTacGia());
                System.out.printf("|%-24s|%-11s|%-21s|%-30s|\n", "", "", "", "Nam xuat ban: " + Main.sach[i].getNamXuatban());
                System.out.printf("|%-24s|%-11s|%-21s|%-30s|\n", "", "", "", "Nha xuat ban: " + Main.sach[i].getNhaXuatBan());
                System.out.printf("|%-24s|%-11s|%-21s|%-30s|\n", "", "", "", "Ngon ngu: " + Main.sach[i].getNgonNgu());
                System.out.println("-------------------------------------------------------------------------------------------");
            }
        }
        for (int i=1;i<=Main.demvo;i++){
            if(samevo(Main.noteBook[i], tukhoa)){
                System.out.printf("|%-24s|%-11s|%-21s|%-30s|\n",Main.noteBook[i].getTenSanPham(), Main.noteBook[i].getGiaBan(), Main.noteBook[i].getThuongHieu(), "So trang: " + Main.noteBook[i].getSoTrang());
                System.out.printf("|%-24s|%-11s|%-21s|%-30s|\n", "", "", "", "Loai vo: " + Main.noteBook[i].getLoaiVo());
                System.out.printf("|%-24s|%-11s|%-21s|%-30s|\n", "", "", "", "Mau bia: " + Main.noteBook[i].getMauBia());
                System.out.printf("|%-24s|%-11s|%-21s|%-30s|\n", "", "", "", "Chat lieu: " + Main.noteBook[i].getChatLieu());
                System.out.println("-------------------------------------------------------------------------------------------");
            }
        }
        for (int i=1;i<=Main.dempencil;i++){
            if(samepencil(Main.penCil[i], tukhoa)){
                System.out.printf("|%-24s|%-11s|%-21s|%-30s|\n",Main.penCil[i].getTenSanPham(), Main.penCil[i].getGiaBan(), Main.penCil[i].getThuongHieu(), "Mau sac: " + Main.penCil[i].getMauSac());
                System.out.printf("|%-24s|%-11s|%-21s|%-30s|\n", "", "", "", "Chat lieu: " + Main.penCil[i].getChatLieu());
                System.out.printf("|%-24s|%-11s|%-21s|%-30s|\n", "", "", "", "Kich thuoc: " + Main.penCil[i].getKichThuoc());
                System.out.println("-------------------------------------------------------------------------------------------");
            }
        }
        for (int i=1;i<=Main.dempen;i++){
            if(samepen(Main.pen[i], tukhoa)){
                System.out.printf("|%-24s|%-11s|%-21s|%-30s|\n",Main.pen[i].getTenSanPham(), Main.pen[i].getGiaBan(), Main.pen[i].getThuongHieu(), "Mau sac: " + Main.pen[i].getMauSac());
                System.out.printf("|%-24s|%-11s|%-21s|%-30s|\n", "", "", "", "Chat lieu: " + Main.pen[i].getChatLieu());
                System.out.printf("|%-24s|%-11s|%-21s|%-30s|\n", "", "", "", "Loai muc: " + Main.pen[i].getLoaiMuc());
                System.out.printf("|%-24s|%-11s|%-21s|%-30s|\n", "", "", "", "Do min: " + Main.pen[i].getDoMin());
                System.out.println("-------------------------------------------------------------------------------------------");
            }
        }
    }
    public static boolean samesach(Sach sach1, String tukhoa){
        if(tukhoa.equals(sach1.getTieuDe())) return true;
        else if(tukhoa.equals(sach1.getTacGia())) return true;
        else if(tukhoa.equals(sach1.getGiaBan())) return true;
        else if(tukhoa.equals(sach1.getTheLoai())) return true;
        else if(tukhoa.equals(sach1.getNgonNgu())) return true;
        else if(tukhoa.equals(sach1.getNamXuatban())) return true;
        else if(tukhoa.equals(sach1.getNhaXuatBan())) return true;
        return false;
    }
    public static boolean samevo(VoGhi notebook1, String tukhoa){
        if(tukhoa.equals(notebook1.getTenSanPham())) return true;
        else if(tukhoa.equals(notebook1.getGiaBan())) return true;
        else if(tukhoa.equals(notebook1.getChatLieu())) return true;
        else if(tukhoa.equals(notebook1.getLoaiVo())) return true;
        else if(tukhoa.equals(notebook1.getThuongHieu())) return true;
        else if(tukhoa.equals(notebook1.getKichThuoc())) return true;
        else if(tukhoa.equals(notebook1.getMauBia())) return true;
        else if(tukhoa.equals(notebook1.getSoTrang())) return true;
        return false;
    }
    public static boolean samepencil(ButChi pencil1, String tukhoa){
        if(tukhoa.equals(pencil1.getTenSanPham())) return true;
        else if(tukhoa.equals(pencil1.getGiaBan())) return true;
        else if(tukhoa.equals(pencil1.getChatLieu())) return true;
        else if(tukhoa.equals(pencil1.getMauSac())) return true;
        else if(tukhoa.equals(pencil1.getThuongHieu())) return true;
        else if(tukhoa.equals(pencil1.getKichThuoc())) return true;
        return false;
    }
    public static boolean samepen(ButMuc pen1, String tukhoa){
        if(tukhoa.equals(pen1.getTenSanPham())) return true;
        else if(tukhoa.equals(pen1.getGiaBan())) return true;
        else if(tukhoa.equals(pen1.getChatLieu())) return true;
        else if(tukhoa.equals(pen1.getMauSac())) return true;
        else if(tukhoa.equals(pen1.getThuongHieu())) return true;
        else if(tukhoa.equals(pen1.getLoaiMuc())) return true;
        else if(tukhoa.equals(pen1.getDoMin())) return true;
        return false;
    }
}
