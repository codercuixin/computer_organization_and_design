package chapter1;

/**
 * * @Author: cuixin
 * * @Date: 2019/12/13 19:14
 */
public class ex_1_9 {
    public static void main(String[] arg) {
        int arithmetic = 2;

        double tSingle = (2.56 * Math.pow(10, 9) * arithmetic* 1 + 1.28 * Math.pow(10, 9) * 12 + 2.56 * Math.pow(10, 8) * 5) / (2 * Math.pow(10, 9));
        System.out.println(tSingle);
        for (int p = 1; p <= 8; p = p << 1) {
            double tp = (2.56 * Math.pow(10, 9) / (0.7 * p) * 1*arithmetic + 1.28 * Math.pow(10, 9) / (0.7 * p) * 12 + 2.56 * Math.pow(10, 8) * 5) / (2 * Math.pow(10, 9));
            System.out.println(String.format("t(%d) = %f", p, tp));
            double delta = (tSingle - tp)/tSingle;
            System.out.println(String.format("t(%d) increased %.2f", p, delta));
        }
    }
    public static void func3(){
        int loadStoreCPI = -1;
        double tSingle = (2.56 * Math.pow(10, 9) * loadStoreCPI + 1.28 * Math.pow(10, 9) * 12 + 2.56 * Math.pow(10, 8) * 5) / (2 * Math.pow(10, 9));
        double tp = (2.56 * Math.pow(10, 9) / (0.7 * 4) * loadStoreCPI + 1.28 * Math.pow(10, 9) / (0.7 * 4) * 12 + 2.56 * Math.pow(10, 8) * 5) / (2 * Math.pow(10, 9));
        double res = 2.56 * Math.pow(10, 9) * loadStoreCPI + 1.28 * Math.pow(10, 9) * 12 + - 2.56 * Math.pow(10, 9) / (0.7 * 4) * loadStoreCPI + 1.28 * Math.pow(10, 9) / (0.7 * 4) * 12 ;

    }
}
