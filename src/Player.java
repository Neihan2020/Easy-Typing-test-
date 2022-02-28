import java.util.Scanner;

/**
 * @auther LiuWeirui
 * @date 2022/2/16 14:45
 * 玩家类
 */
public class Player {

    //玩家当前级别ID
    private int levelNo;
    //玩家当前积分
    private int currScore;
    //当前级别开始时间
    private long startTime;
    //当前级别已用时间
    private int clapsedTime;

    public Player() {
        super();
    }

    //创建对象时传入初始值
    public Player(int levelNo, int currScore, long startTime, int clapsedTime) {
        this.levelNo = levelNo;
        this.currScore = currScore;
        this.startTime = startTime;
        this.clapsedTime = clapsedTime;
    }

    //玩家玩游戏行为
    public void player() {
        Scanner scanner = new Scanner(System.in);
        //创建游戏对象并且初始化一个玩家对象传入
        Game g1 = new Game(this);
        //判断用户等级获取其游戏相应难度
        Level l = LevelParam.LEVELS[(this.getLevelNo() - 1)];
        //升一级消耗的总时间
        int zongTime = 0;
        for (int i = 0; i < l.getStrTimes(); i++) {
            //获取随机生成的字符串
            String str = g1.printStr();
            System.out.println(str);
            System.out.print("请输入:");
            //获取开始输入时间
            this.setStartTime(System.currentTimeMillis());
            if (g1.printResult(str, scanner.next())) {
                //输入正确
                //像玩家添加积分
                this.setCurrScore((this.getCurrScore() + l.getPerScore()));
                System.out.println("输出正确,您的积分:" + this.getCurrScore() + ",您的级别:" + this.getLevelNo() + ",已用时"+this.getClapsedTime());
            } else {
                //输入错误
                System.out.println("输入错误,退出!");
                System.exit(0);
            }
            zongTime+=this.getClapsedTime();
        }
        shengji(zongTime);
        player();
    }

    //升级操作
    public void shengji(int zongTime) {
        System.out.println("恭喜你升级啦!");
        System.out.println("您当前的积分:" + this.getCurrScore() + ",您的级别:" + this.getLevelNo() + ",升级已用时"+zongTime);
        //升级
        this.setLevelNo(this.getLevelNo() + 1);
        //积分和计时清零
        this.setCurrScore(0);
        this.setClapsedTime(0);
        this.setStartTime(0);
        System.out.println("升级成功,积分和用时清零!");
        System.out.println("您当前的积分:" + this.getCurrScore() + ",您的级别:" + this.getLevelNo() + ",已用时"+this.getClapsedTime());
    }

    public int getLevelNo() {
        return levelNo;
    }

    public void setLevelNo(int levelNo) {
        this.levelNo = levelNo;
    }

    public int getCurrScore() {
        return currScore;
    }

    public void setCurrScore(int currScore) {
        this.currScore = currScore;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public int getClapsedTime() {
        return clapsedTime;
    }

    public void setClapsedTime(int clapsedTime) {
        this.clapsedTime = clapsedTime;
    }
}
