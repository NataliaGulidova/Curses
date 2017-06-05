package Courses2;

/**
 * Created by Admin on 27.05.2017.
 */
//куб 3*3 найти 4 диагонали
public class ClassWork5 {
    public static void main(String[] args) {
        int[][][] cub = {
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                },
                {
                        {10, 11, 12},
                        {13, 14, 15},
                        {16, 17, 18}
                },
                {
                        {19, 20, 21},
                        {22, 23, 24},
                        {25, 26, 27}

                }
        };
        int d1 = cub[0] [0] [0];
        int d2 = cub [0][0] [2];
        int d3 = cub [0] [2] [0];
        int d4 = cub [0] [2] [2];
        int shiftD1X = 1;
        int shiftD1Y = 1;
        int shiftD2X = cub.length-1-1;
        int shiftD2Y = 1;
        int shiftD3X = cub.length-1-1;
        int shiftD3Y = 1;
        int shiftD4X = cub.length-1-1;
        int shiftD4Y = cub.length-1-1;


        for (int i = 1; i < cub.length; i++) {
            d1 = cub [i] [shiftD1Y] [shiftD1X];
            shiftD1X ++;
            shiftD1Y ++;
            d2 *= cub [i][shiftD2Y][shiftD2X];
            shiftD2X --;
            shiftD2Y ++;
           d3 *= cub [i] [shiftD3Y] [shiftD3X];
           shiftD3X ++;
           shiftD3Y --;
           d4 *= cub [i] [shiftD4Y] [shiftD4X];
           shiftD4X  --;
           shiftD4Y --;
        }
        System.out.println(d4);
    }
}

