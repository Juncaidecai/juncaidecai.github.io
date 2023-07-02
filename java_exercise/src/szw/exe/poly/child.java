package szw.exe.poly;

class child extends father{

    String edu ;

    public child(int age, String name, String car, String edu) {
        super(age, name, car);
        this.edu = edu;
    }

    public String info(){
        return "child's edu is " + edu;
    }

    public int show_age(){
        return age;
    }

    public void child_say(){
        System.out.println("this is child method call()");
    }
}
