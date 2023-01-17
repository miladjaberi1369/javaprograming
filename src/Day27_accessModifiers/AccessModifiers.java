package Day27_accessModifiers;

public class AccessModifiers {

    public static int publicData = 200;
    protected static int protectedData = 300;
    static int defaultData = 400;
    private static int privateData = 500;

    public AccessModifiers(){

    }

    public static void main(String[] args) {
        System.out.println(publicData); // public is accessible within same class
        System.out.println(protectedData); // protected is accessible within same class
        System.out.println(defaultData); // default is accessible within same class
        System.out.println(privateData); // // private is accessible ONLY within same class

        new AccessModifiers();

    }

}
