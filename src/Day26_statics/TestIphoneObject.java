package Day26_statics;

public class TestIphoneObject {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("iphone12", "Black",1000);
        System.out.println(iphone.model);
        System.out.println(iphone.color);
        System.out.println(iphone.price);

        iphone.printPhoneInfo();

        System.out.println(Iphone.brand);
        System.out.println(Iphone.OS);
        Iphone.printOperatingSystem();







    }
}
