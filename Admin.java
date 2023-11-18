import java.util.Scanner;

public class Admin {
    public static void dsLuachon() {
        System.out.println("1. Them san pham");
        System.out.println("2. Xoa san pham");
        System.out.println("3. Sua san pham");
        System.out.println("4. Chon cac chuc nang cua khach de test");
        System.out.println("5. Thoat tai khoan");
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
                    Add.chon();
                } else if (press==2) {
                    Xoa.chon();
                } else if (press==3) {
                    Fix.chon();
                } else if (press==4) {
                    Khach.chon1();
                }
            }
        }
    }

}
