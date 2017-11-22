package someTests;

public class Average {
    public static void main(String[] args) {
//        int nums[] = {6,2,3,4,5,2,7,8};
//        int val = 5;
//        boolean found = false;
//        for(int x: nums) {
//            if(x == val){
//                found = true;
//                break;
//            }
//
//        }
//        System.out.println("summa");

//        int i,j;
//
//        for(i=0;i<10;i++){
//            for(j=1;j<10;j++)
//                System.out.print(".");
//            System.out.println();}
//        outer: for(int i =0;i<3;i++){
//            System.out.print("proxod" + i + ": ");
//            for (int j =0;j<100;j++){
//                if(j==10)break outer;
//                System.out.print(j+ " ");
//            }
//            System.out.print("no string");
//        }System.out.println("done");
        outer: for(int i =0;i<10;i++){
            for(int j=0;j<10;j++){
                if(j>i){
                    System.out.println();
                    continue outer;
                }System.out.print(" " + (i *j));
            }
        }System.out.println();
    }

}
