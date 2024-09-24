package lection1;

public abstract class SmartPhone {
    private String brand;
    private String color;
    static String twocam = "twocam";
    static String smartphone = "smartphone";

    public SmartPhone() {
    }

    public SmartPhone(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public void Info() {
        System.out.println("Brand: " + this.brand + " Color: " + this.color);
    }

    public boolean On() {
        return false;
    }

    static void Info0() {
        System.out.println(" I am: " + smartphone);
    }

    static void Info2() {
        System.out.println("I have: " + twocam);
    }

    public String getBrand() {
        return this.brand;
    }

    public String getColor() {
        return this.color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
