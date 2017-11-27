package someTests;

public class newClass {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
    class BoxDemo1{
        public static void main(String[] args) {
            newClass newBox = new newClass();
            newClass newBox2 = new newClass();
            double vol;

            newBox.setDim(10,20,15);
            newBox2.setDim(3,6,9);

            vol = newBox.volume();
            System.out.println("vol "+ vol);

            vol = newBox2.volume();
            System.out.println("vol" + vol);
        }
    }

