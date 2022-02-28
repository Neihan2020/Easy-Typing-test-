package 计时器;

/**
 * @auther LiuWeirui
 * @date 2022/2/17 13:04
 */
public class TimeTest {
    public static void main(String[] args) {
        long now = System.currentTimeMillis() / 1000;
//        int i = 0;
//        while (true) {


        int l1 = 0;
        for (int i = 0; i < i + 1; ) {
            int re = (int) ((System.currentTimeMillis() / 1000) - now);
            double j1 = re % 1;
            int i2 = i;
            if (j1 == 0) {
                i++;
            }
            if (i2 != i) {
                System.out.println(re + "秒");
            }
        }

/*            if (j1 == 0) {
                l1 = re;

                if (l1 == re) {
                    if (i >= 1) {
                        continue;
                    }
                    System.out.println(re + "秒");
                    i++;
                } else {
                    i = 0;
                }
            }*/
//        }
    }
}
