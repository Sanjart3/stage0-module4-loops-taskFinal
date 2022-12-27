package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        for (int i=1;i<=cathetusLength;i++){
            for (int a=1;a<=cathetusLength-i;a++){
                System.out.print(" ");
            }
            for (int s=1;s<=i;s++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
