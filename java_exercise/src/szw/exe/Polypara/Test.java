package szw.exe.Polypara;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Manager william = new Manager("William", 19000, 80000);
        Manager kevin = new Manager("Kevin", 100000, 600000);
        Test test = new Test();

        System.out.println("Show annual");
        test.showEmpAnnual(william);
        test.showEmpAnnual(kevin);

        System.out.println("Working");
        test.testWork(william);
        test.testWork(kevin);

        int[] a = {10,-1,-2,-20,100};
        Arrays.sort(a);

    }

    public void showEmpAnnual(Employee e){
        System.out.println(e.getName() + "的年薪为" + e.getAnnual());
    }

    public void testWork(Employee e){

        if(e instanceof Worker){
            ((Worker) e).work();
        } else if (e instanceof Manager) {
            ((Manager) e).manage();
        }else{
            System.out.println("Wrong input");
        }
    }
}
