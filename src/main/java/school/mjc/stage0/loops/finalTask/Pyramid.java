package school.mjc.stage0.loops.finalTask;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        String word="";
        for (int i=1;i<=cathetusLength;i++){
            for (int k=1;k<=cathetusLength-i;k++){
                word+=" ";
            }
            for (int s=1;s<=2*i-1;s++){
                word+=Math.abs(i-s)+1;
            }
            System.out.println(word);
            word = "";
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
