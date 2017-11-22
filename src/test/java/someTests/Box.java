package someTests;

public class Box {
    double width;
    double height;
    double depth;

    double volume(){
        return width * height * depth;
    }
}
class BoxDemo{
    public static void main(String[] args) {
        Box mybox = new Box();
        Box mybox1 = new Box();
        double vol;

        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        mybox1.width = 3;
        mybox1.height = 6;
        mybox1.depth = 9;

        vol = mybox.volume();
        System.out.println("Обьем равен " + vol);
        vol = mybox1.volume();
        System.out.println("Обьем равен " + vol);
        System.out.println("первый коммит");
    }
}
