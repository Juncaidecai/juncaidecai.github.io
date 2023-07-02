package szw.exe.HouseRentSysOop.service;

import szw.exe.HouseRentSysOop.domain.House;

/**
 * * 定义House[]以及对齐进行以下调用功能
 * * 响应HouseView的调用
 * * 1. 新增
 *   2. 查找
 *   3. 删除
 *   4. 修改
 *   5. 列表
 *   6. 退出
 * */
public class HouseService {

    private House[] houses;
    //通过方法指定houses大小
    //这是个构造器
    public HouseService(int size){
        houses = new House[size];
        houses[0] = new House(0,"William","0700","崇法寺",1000,"未出租");
    }

    public House[] list(){
        return houses;
    }

    public void add(House addHouse){
        House[] houses = this.list();
        boolean in = false;
        for (int i = 0; i < houses.length; i++) {
            if(houses[i] == null){
                addHouse.setId(i);
                houses[i] = addHouse;
                in = true;
                break;
            }
        }
        if(in == true){
            System.out.println("房子添加完成");
        }else {
            System.out.println("房子添加失败");
        }
    }

    public void search(int searchId){
        House[] houses = this.list();
        if(houses[searchId] == null){
            System.out.println("对应序号无房源");
            return ;
        }
        System.out.println("对应序号有房源");
        System.out.println(houses[searchId]);
    }

    public void delete(int delId){
        House[] houses = this.list();
        houses[delId] = null;
    }
}
