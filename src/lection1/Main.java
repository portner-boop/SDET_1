package lection1;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone("Iphone6", "m1", 64, 20);
        Samsung samsung = new Samsung("Pixel11", "Snapdragon", 256, 0);
        Iphone.Info0();
        Samsung.Info2();
        iphone.assist();
        samsung.assist();
    }
}
