package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        double bb =  sideLength / 2;
        int aa = (int)bb;
        for (int i = 0; i < sideLength; i++) {
            System.out.println();
            for (int j = 0; j < sideLength; j++) {
                if (j == aa && i != aa) {
                    System.out.print('8');

                }

                if (i == aa){
                    System.out.print('8');

                }else {
                    System.out.print(' ');
                }
            }
        }
    }
}
