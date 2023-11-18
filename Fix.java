import java.util.Scanner;

public class Fix {
    public static void dsLuachon() {
        System.out.println("Moi ban chon san pham muon sua: ");
        System.out.println("1. Sach");
        System.out.println("2. Vo Ghi");
        System.out.println("3. But Chi");
        System.out.println("4. But muc");
        System.out.println("5. Thoat tinh nang them san pham");
    }
    public static void chon(){
        byte press;
        Scanner sc = new Scanner(System.in);
        while(true){
            dsLuachon();
            press = sc.nextByte();
            if(press==5) break;
            else{
                if(press==1){
                    ThucHienSach.fix();
                } else if (press==2) {
                    ThucHienVo.fix();
                } else if (press==3) {
                    ThucHienButChi.fix();
                } else if (press==4) {
                    ThucHienBut.fix();
                }
            }
        }
    }
}
