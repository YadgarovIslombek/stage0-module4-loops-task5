package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){

        int krug = 0;
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++){
                if (krug == 1 || krug == 2 || krug ==3) {
                    if (j == 1 || j == 2 || j == 3) {
                        System.out.print(" ");
                    } else {
                        System.out.print("8");

                    }
                }else {
                        System.out.print("8");

                }
            }
            System.out.println(" ");
            krug++;

        }
    }
}
