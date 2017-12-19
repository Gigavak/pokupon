package someTests;

public class TestClass {
    public static void main(String[] args) {
        String Str1 = "first";
        String Str2 = Str1;
        String Str3 = new String("test");
        boolean retVal;

        retVal = Str1.equals(Str2);
        System.out.println(retVal);

        retVal = Str2.equals(Str3);
        System.out.println(retVal);
    }
}
