public class ButMuc {
    private String tenSanPham;
    private String giaBan;
    private String thuongHieu;
    private String mauSac;
    private String chatLieu;
    private String loaiMuc;
    private String doMin;

    ButMuc(String tenSanPham, String giaBan, String thuongHieu, String mauSac, String chatLieu, String loaiMuc, String doMin) {
        this.tenSanPham = tenSanPham;
        this.giaBan = giaBan;
        this.thuongHieu = thuongHieu;
        this.mauSac = mauSac;
        this.chatLieu = chatLieu;
        this.loaiMuc = loaiMuc;
        this.doMin = doMin;
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

    public void setLoaiMuc(String loaiMuc) {
        this.loaiMuc = loaiMuc;
    }

    public void setDoMin(String doMin) {
        this.doMin = doMin;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public String getGiaBan() {
        return giaBan;
    }

    public String getMauSac() {
        return mauSac;
    }

    public String getThuongHieu() {
        return thuongHieu;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public String getDoMin() {
        return doMin;
    }

    public String getLoaiMuc() {
        return loaiMuc;
    }
}
