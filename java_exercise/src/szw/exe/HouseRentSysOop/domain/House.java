package szw.exe.HouseRentSysOop.domain;

/**
 * 一个House对象表示一个房子
 */


public class House {
    public int id;
    public String name;
    public String phone;
    public String address;
    public double rent;
    public String state;

    public House(int id, String name, String phone, String address, double rent, String state) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.rent = rent;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    //输出单行房屋信息
    public String toString() {
        return  id +
                "\t\t" + name  +
                "\t\t" + phone +
                "\t" + address+
                "\t" + rent +
                "\t" + state;
    }
}
