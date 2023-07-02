package szw.exe.HouseRentSysOop.view;

import szw.exe.HouseRentSysOop.domain.House;
import szw.exe.HouseRentSysOop.service.HouseService;
import szw.exe.Utility;

/**
 * ### HouseView.java   =>界面
 *
 * * 1.显示
 * * 2.交互
 * * 3.调用各项HouseService功能(CRUD,增删改查)
 * */
public class HouseView {

    private HouseService houseService = new HouseService(10);

    //1.添加房源
    public void addHouse(){
        System.out.println("===============添加房源信息===============");
        System.out.println("姓名：");
        String name = Utility.readString(10);
        System.out.println("电话：");
        String phone = Utility.readString(10);
        System.out.println("地址：");
        String address = Utility.readString(10);
        System.out.println("月租：");
        int rent =  Utility.readInt();
        System.out.println("状态：");
        String state = Utility.readString(10);
        House addHouse = new House(0,name, phone, address, rent, state);
        houseService.add(addHouse);

    }

    //2.查找房源
    public void searchHouse(){
        System.out.println("请输入你想要查找的房源序号");
        int searchId = Utility.readInt();
        houseService.search(searchId);
    }


    //3.删除房源
    public void delHouse(){
        System.out.println("请输入你想要删除的房源序号");
        int delId = Utility.readInt();
        houseService.delete(delId);
    }


    //5.显示房源信息
    public void listHouses(){
        System.out.println("===============房源信息列表===============");
        System.out.println("编号\t\t房主\t\t\t电话\t\t地址\t\t月租\t\t状态");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if(houses[i] == null){
                break;
            }
            System.out.println(houses[i]);
        }
    }

    private boolean loop = true;
    public void mainMenu(){
        do{
            System.out.println("\n===============房屋出租系统===============");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 源");
            System.out.println("\t\t\t3 删 除 房 源");
            System.out.println("\t\t\t4 修 改 房 源");
            System.out.println("\t\t\t5 房 源 列 表");
            System.out.println("\t\t\t6 退 出 系 统");
            System.out.println("请输入你的选择：");
            int key = Utility.readInt();
            switch(key){
                case 1:
                    addHouse();
                    //System.out.println("新 增 房 源");
                    break;
                case 2:
                    searchHouse();
                    //System.out.println("查 找 房 源");
                    break;
                case 3:
                    System.out.println("删 除 房 源");
                    break;
                case 4:
                    System.out.println("修 改 房 源");
                    break;
                case 5:
                    listHouses();
                    break;
                case 6:
                    System.out.println("退 出 系 统");
                    loop = false;
                    break;
                        }

        }while(loop);
    }

}
