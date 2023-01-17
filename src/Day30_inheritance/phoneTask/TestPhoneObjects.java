package Day30_inheritance.phoneTask;

public class TestPhoneObjects {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 12", "Large", "Black", 1000.5);

        Samsung samsung = new Samsung("Galaxy S22", "Medium", "White", 1100);

        Nokia nokia = new Nokia("Brick", "Small", "Pink", 50);

        iphone.call(911);
        samsung.call(911);
        nokia.call(911);

        iphone.text(123456789);
        samsung.text(1234567890);
        nokia.text(123456789);

        iphone.faceTime(123456789);

        samsung.freeze();

        nokia.selfDefense();

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);
    }
}
