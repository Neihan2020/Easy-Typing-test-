/**
 * @auther LiuWeirui
 * @date 2022/2/16 15:05
 * 等级水平参数类
 */
public class LevelParam {
    //因为有六个等级，所以数组空间为6
    public final static Level[] LEVELS;

    static {
        //类被加载时就实例化数组空间
        LEVELS = new Level[6];
        //                     级别号     随机字符串长度 输入次数      时间限制      正确得分
        LEVELS[0] = new Level(1, 2, 10, 5, 1);
        LEVELS[1] = new Level(2, 3, 9, 26, 2);
        LEVELS[2] = new Level(3, 4, 8, 22, 5);
        LEVELS[3] = new Level(4, 5, 7, 18, 8);
        LEVELS[4] = new Level(5, 6, 6, 15, 10);
        LEVELS[5] = new Level(6, 7, 5, 12, 15);
    }
}
