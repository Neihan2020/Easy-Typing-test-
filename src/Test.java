import java.util.Random;

/**
 * @auther LiuWeirui
 * @date 2022/2/16 16:18
 */
public class Test {
    public static void main(String[] args) {
        Player p1 = new Player(1,0,0,0);
        p1.player();
    }
}


/*
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Test {
    public static void main(String[] args) {
//获得系统的时间，单位为毫秒,转换为妙
        long totalMilliSeconds = System.currentTimeMillis();
        long totalSeconds = totalMilliSeconds / 1000;
        System.out.println(totalSeconds);

//求出现在的秒
        long currentSecond = totalSeconds % 60;

//求出现在的分
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;

//求出现在的小时
        long totalHour = totalMinutes / 60;
        long currentHour = totalHour % 24;

//显示时间
        System.out.println("总毫秒为： " + totalMilliSeconds);
        System.out.println(currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
    }
}*/
