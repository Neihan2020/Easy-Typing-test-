import java.util.Random;

/**
 * @auther LiuWeirui
 * @date 2022/2/16 14:45
 * 游戏类
 */
public class Game {
    //玩家属性
    private Player p1;

    //创建游戏对象时传入玩家对象,用于对当前用户信息进行判断操作
    public Game(Player p1) {
        this.p1 = p1;
    }

    //输出字符串，返回字符串用于和玩家输入比较
    public String printStr() {
        //判断用户等级获取其游戏相应难度
        Level l = LevelParam.LEVELS[(p1.getLevelNo() - 1)];
        //随机生成的字符串
        StringBuilder str = new StringBuilder();
        //玩家输入的内容
        String[] strs = new String[]{"<", "*", ">"};
        for (int i = 0; i < l.getStrLength(); i++) {
            //产生随机数
            Random ran = new Random();
            int sjNum = ran.nextInt(3);
            //拼接
            str.append(strs[sjNum]);
        }
        return str.toString();
    }

    //比较游戏输出out和玩家输入in，根据比较结果输出响应信息
    public boolean printResult(String out, String in) {
        boolean pd = false;
        if (out.equals(in)) {
            //判断是否超时
            long currentTime = System.currentTimeMillis();
            //获取开始输入到现在的秒数
            long l1 = (currentTime - p1.getStartTime())/1000;
            //获取闯关时间限制秒数
            long l2 = LevelParam.LEVELS[p1.getLevelNo() - 1].getTimeLimit();
            if (l1 > l2) { // 如果超时
                System.out.println("你输入太慢了，已经超时，退出！");
                System.exit(1);
            }
            //记录玩家时间
            p1.setClapsedTime((int)l1);
            pd = true;
        }
        return pd;
    }
}
