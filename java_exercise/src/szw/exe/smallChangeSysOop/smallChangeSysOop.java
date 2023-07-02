package szw.exe.smallChangeSysOop;

import java.text.SimpleDateFormat;
import java.util.Date;

public class smallChangeSysOop {

        double balance = 0  ;

        //时间模板 年.月.日 时：分；
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy.MM.dd HH:mm");
        String details = "开户时间\t\t" + sdf.format(new Date()) + "\t余额：" + balance + " RMB";


    public void show(){//显示零钱通明细
        System.out.println("--------------------零钱通明细--------------------");
        System.out.println(details);
    }

    public void income(double money){//收益入帐
        if(money < 0){
            System.out.println("收入不能小于零");
            return;
        }
        balance += money;
        System.out.println("\n收入\t" + money +"\t"  + sdf.format(new Date())  + "\t余额：" + balance + "\tRMB");
        details += "\n收入\t" + money  + "\t" + sdf.format(new Date())  + "\t余额：" + balance + "\tRMB";
    }

    public void pay(double money){//消费
        if(money > balance){
            System.out.println("消费不能大于余额");
            return;
        }
        balance -= money;
        System.out.println("\n消费\t" + money +"\t"  + sdf.format(new Date())  + "\t余额：" + balance + "\tRMB");
        details += "\n消费\t" + money  + "\t" + sdf.format(new Date())  + "\t余额：" + balance + "\tRMB";
    }

    public void exit(){//退出零钱通
        System.out.println("--------------------退出零钱通--------------------");
    }
}
