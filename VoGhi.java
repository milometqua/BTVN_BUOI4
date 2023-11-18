public class VoGhi {
    private String tenSanPham;
    private String giaBan;
    private String thuongHieu;
    private String soTrang;
    private String loaiVo;
    private String mauBia;
    private String chatLieu;
    private String kichThuoc;

    VoGhi(String tenSanPham, String giaBan, String thuongHieu, String soTrang, String loaiVo, String mauBia, String chatLieu, String kichThuoc) {
        this.tenSanPham = tenSanPham;
        this.giaBan = giaBan;
        this.thuongHieu = thuongHieu;
        this.soTrang = soTrang;
        this.loaiVo = loaiVo;
        this.mauBia = mauBia;
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

    public void setSoTrang(String soTrang) {
        this.soTrang = soTrang;
    }

    public void setLoaiVo(String loaiVo) {
        this.loaiVo = loaiVo;
    }

    public  void setMauBia(String mauBia) {
        this.mauBia = mauBia;
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

    public String getSoTrang() {
        return soTrang;
    }

    public String getLoaiVo() {
        return loaiVo;
    }

    public String getMauBia() {
        return mauBia;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public String getKichThuoc() {
        return kichThuoc;
    }
}
