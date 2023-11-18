public class Sach {
    private String tieuDe;
    private String tacGia;
    private String theLoai;
    private String namXuatban;
    private String nhaXuatBan;
    private String giaBan;
    private String ngonNgu;

    Sach(String tieuDe, String giaBan, String tacGia, String theLoai, String nhaXuatBan, String namXuatban, String ngonNgu) {
        this.tieuDe = tieuDe;
        this.giaBan = giaBan;
        this.tacGia = tacGia;
        this.theLoai = theLoai;
        this.nhaXuatBan = nhaXuatBan;
        this.namXuatban = namXuatban;
        this.ngonNgu = ngonNgu;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public void setGiaBan(String giaBan) {
        this.giaBan = giaBan;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public void setNamXuatban(String namXuatban) {
        this.namXuatban = namXuatban;
    }

    public void setNgonNgu(String ngonNgu) {
        this.ngonNgu = ngonNgu;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public String getGiaBan() {
        return giaBan;
    }

    public String getTacGia() {
        return tacGia;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public String getNamXuatban() {
        return namXuatban;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public String getNgonNgu() {
        return ngonNgu;
    }
}