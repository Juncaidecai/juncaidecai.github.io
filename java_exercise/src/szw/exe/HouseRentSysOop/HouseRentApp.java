package szw.exe.HouseRentSysOop;

import szw.exe.HouseRentSysOop.view.HouseView;

public class HouseRentApp {
    public static void main(String[] args) {
        // 创建HouseView类，整个系统入口
        //new HouseView().listHouses();
        new HouseView().mainMenu(); //匿名对象，无接受对象，直接调用方法
        System.out.println("HouseRentApp退出");

    }
}
