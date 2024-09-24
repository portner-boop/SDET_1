package lection1;

import java.io.PrintStream;

public class Iphone extends SmartPhone implements Assistent {
    String model;
    String CPU;
    int memory;
    int charge;

    public Iphone(String model, String CPU, int memory, int charge) {
        this.setBrand("Iphone");
        this.setColor("black");
        this.charge = charge;
        this.model = model;
        this.CPU = CPU;
        this.memory = memory;
    }

    public void Info() {
        PrintStream var10000 = System.out;
        String var10001 = this.getBrand();
        var10000.println("Brand: " + var10001 + "\nColor: " + this.getColor() + " \nMemory: " + this.memory);
        System.out.println("CPU: " + this.CPU);
        System.out.println("This is Iphone");
    }

    public boolean On() {
        boolean on = false;
        if (this.charge < 1) {
            System.out.println("Charge must be greater than 0 ");
        } else if (this.charge <= 100) {
            System.out.println("The smartphone turns on but you should be alert");
            on = true;
        }

        return on;
    }

    public void assist() {
        if (this.On()) {
            System.out.println("siri");
        } else {
            System.out.println("Silence");
        }

    }
}
