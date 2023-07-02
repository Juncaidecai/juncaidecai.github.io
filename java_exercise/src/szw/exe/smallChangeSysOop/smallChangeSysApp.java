package szw.exe.smallChangeSysOop;

import java.util.Scanner;

public class smallChangeSysApp {
    
    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        smallChangeSysOop sys = new smallChangeSysOop();

        do{
            System.out.println("\n请输入1-4选项");
            System.out.println("1:明细");
            System.out.println("2:收入");
            System.out.println("3:消费");
            System.out.println("4:退出");
            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();

            switch (input){
                case 1 :
                    sys.show();
                    break;
                case 2 :
                    System.out.print("请输入收入：");
                    int money_in = scanner.nextInt();
                    sys.income(money_in);
                    break;
                case 3 :
                    System.out.print("请输入消费：");
                    int money_out = scanner.nextInt();
                    sys.pay(money_out);
                    break;
                case 4 :
                    sys.exit();
                    loop = false;
                    break;
            }

        }while(loop);
    }
}
