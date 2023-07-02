package szw.exe.poly;

class father {
    int age;

    private String name;

    private String car ;

    public father(int age, String name, String car) {
        this.age = age;
        this.name = name;
        this.car = car;
    }

    public String info(){
        return "father's car is " + car;
    }
    public int show_age(){
        return age;
    }

    public void father_say(){
        System.out.println("this is father method call()");
    }
}

