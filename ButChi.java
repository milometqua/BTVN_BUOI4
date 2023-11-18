public class ButChi {
    private String tenSanPham;
    private String giaBan;
    private String thuongHieu;
    private String mauSac;
    private String chatLieu;
    private String kichThuoc;

    ButChi(String tenSanPham, String giaBan, String thuongHieu, String mauSac, String chatLieu, String kichThuoc) {
        this.tenSanPham = tenSanPham;
        this.giaBan = giaBan;
        this.thuongHieu = thuongHieu;
        this.mauSac = mauSac;
        this.chatLieu = chatLieu;
        this.kichThuoc = kichThuoc;
    }
    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public void setGiaBan(String giaBan) {
        this.giaBan = giaBan;
    }

    public void setThuongHieu(String thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public void setKichThuoc(String kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public String getGiaBan() {
        return giaBan;
    }

    public String getThuongHieu() {
        return thuongHieu;
    }

    public String getMauSac() {
        return mauSac;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public String getKichThuoc() {
        return kichThuoc;
    }
}
