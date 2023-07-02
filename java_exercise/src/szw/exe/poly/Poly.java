package szw.exe.poly;

public class Poly {
    public static void main(String[] args) {

        child child1 = new child(20,"erzi","28156","HUST");
        //System.out.println(child1.age);


        father father1 = new father(50,"die","Aodia6");
        //System.out.println(father1.age);

        father father2 = new child(49,"ma","0377","yizhong");
        System.out.println(father2.age);    //调用了父属性
        System.out.println(father2.info()); //调用被复写子方法 或 父方法
        System.out.println(father2.show_age()); //动态绑定，子方法->子属性
        father2.father_say();


        System.out.println("==========");

        child child2 = (child) father2;
        System.out.println(child2.age);
        System.out.println(child2.show_age());

    }
}
