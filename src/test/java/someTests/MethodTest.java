package someTests;

public class MethodTest {
    public static void main(String[] args) {



        int sumOne = calculateSum(1,3,4,5,5,5);
        System.out.println(sumOne);
    }
    static int calculateSum(int...a){
        int sum = 0;
        for (int i : a){
            sum += i;
        }
        return sum;
    }
}
