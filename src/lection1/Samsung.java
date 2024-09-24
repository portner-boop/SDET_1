package lection1;

import java.io.PrintStream;

public class Samsung extends SmartPhone implements Assistent {
    String model;
    String CPU;
    int memory;
    int charge;

    public Samsung(String model, String CPU, int memory, int charge) {
        this.setBrand("samsung");
        this.setColor("wight");
        this.charge = charge;
        this.model = model;
        this.CPU = CPU;
        this.memory = memory;
    }

    public void Info() {
        PrintStream var10000 = System.out;
        String var10001 = this.getBrand();
        var10000.println("Brand: " + var10001 + "\nColor: " + this.getColor() + " \nMemory: " + this.memory);
    }

    public boolean On() {
        boolean on = false;
        if (this.charge < 1) {
            System.out.println("Charge must be greater than 0");
        } else if (this.charge <= 100) {
            System.out.println("The smartphone turns on");
            on = true;
        }

        return on;
    }

    public void assist() {
        if (this.On()) {
            System.out.println("Google assistent");
        } else {
            System.out.println("Silence");
        }

    }
}
