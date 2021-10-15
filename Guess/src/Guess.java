import java.util.*;
import java.io.*;

public class Guess {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int playtimes = 0;
        try {
            if (args.length == 1)
                playtimes = Integer.parseInt(args[0]);
            else playtimes = 1;
        } catch (NumberFormatException e) {
            // TODO: handle exception
            System.out.println(e);
        }
        while (playtimes > 0) {
            int choice = init();
            switch (choice) {
                case 1:
                    int[] numbers_1 = new int[5];
                    input_1(numbers_1);
                    check_1(numbers_1);
                    break;
                case 2:
                    int[] numbers_2 = new int[7];
                    input_2(numbers_2);
                    check_2(numbers_2);
                    break;
                case 3:
                    guess3();
                    break;
            }
            playtimes--;
        }
    }

    public static void guess3() {
        System.out.println("3+2 游戏，规则：");
        System.out.println("前三个是普通数字，这三个数字不一样，后两个是数字可能一样，也可能不一样");
        System.out.println("前三个数字的范围是：1 ~ 16  后两个数字的范围是：1 ~ 9");
        System.out.println("当 5 个数字全猜中的时候，是特等奖。");
        System.out.println("除了特等奖，其余还有三个奖项：一等奖，二等奖，三等奖");
        System.out.println("这三个奖项的设立是：");
        System.out.println("前三个数字猜中三个，是一等奖");
        System.out.println("前三个数字猜中两个，是二等奖");
        System.out.println("前三个数字猜中一个，是一等奖");
        System.out.println("前三个数字一个都没有猜中，就是未中奖");
        Scanner scanner = new Scanner(System.in);
        int[] award = new int[5];
        Random ran = new Random();
        int[] guess = new int[5];
        for (int i = 0; i < 3; i++) {
            award[i] = ran.nextInt(15) + 1;
            for (int j = 0; j < i; j++)
                if (award[j] == award[i]) {
                    i--;
                    continue;
                }
        }
        for (int i = 3; i < 5; i++) {
            award[i] = ran.nextInt(8) + 1;
        }
//        System.out.println(Arrays.toString(award));//展示得到的随机数
        System.out.println("请输入你要猜的数字，一共输入五个数，前三个数不能重复，后两个数可以重复");
        for (int i = 0; i < 5; i++) {
            guess[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if (guess[i] == award[j]) {
                    count++;
                }
            }
        }
        int count1 = 0;
        for (int i = 3; i < 5; i++) {
            for(int j = 3; j < 5; j++) {
                if (guess[i] == award[j]) {
                    count1++;
                }
            }
        }
        int num = count + count1;
        if (num == 5) {
            System.out.println("特等奖");
        } else {
            switch (count) {
                case 1:
                    System.out.println("三等奖");
                    break;
                case 2:
                    System.out.println("二等奖");
                    break;
                case 3:
                    System.out.println("一等奖");
                    break;
                case 0:
                    System.out.println("未中奖，因为前三个数字没一个一样");
                    break;
            }
        }
        System.out.println("随机产生的号码是:");
        for (int j : award) System.out.print(j + " ");
        System.out.println();
        System.out.println("你选的号码是:");
        for (int j : guess) System.out.print(j + " ");
        System.out.println();
    }

    static int init() {
        boolean InputLoopflag = true;
        int n = 0;
        System.out.println("请按数字键 1 或 2 或 3选择一种玩法:21选5，或者6+1，或者3+2");
        InputStreamReader ir;
        BufferedReader in;
        String s = new String();
        try {
            ir = new InputStreamReader(System.in);
            in = new BufferedReader(ir);
            while (InputLoopflag) {
                s = in.readLine();
                try {
                    n = Integer.parseInt(s);
                    if (n != 1 && n != 2 && n != 3) {
                        System.out.println("输入错误！请重试：");
                        continue;
                    }
                    InputLoopflag = false;
                } catch (NumberFormatException e) {
                    // TODO: handle exception
                    System.out.println("非数字！请重试:");
                    continue;
                }
            }
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println(e);
        }
        return n;

    }

    static void input_1(int[] numbers_1) {
        System.out.println("请输入" + numbers_1.length + "个数(这" + numbers_1.length + "个数必须互不相同，且在1-21之间):");
        boolean InputLoopflag = true;
        StringTokenizer st;
        InputStreamReader ir;
        BufferedReader in;
        String s = new String();
        try {
            ir = new InputStreamReader(System.in);
            in = new BufferedReader(ir);
            L1:
            while (InputLoopflag) {
                s = in.readLine();
                st = new StringTokenizer(s);
                int count = st.countTokens();
                if (count != numbers_1.length) {
                    System.out.println("只能输" + numbers_1.length + "个！请重试:");
                    continue;
                }
                try {
                    for (int i = 0; i < numbers_1.length; i++) {
                        numbers_1[i] = Integer.parseInt(st.nextToken());
                        for (int j = 0; j < i; j++)
                            if (numbers_1[i] == numbers_1[j]) {
                                System.out.println(numbers_1.length + "个数必须互不相同！请重试:");
                                continue L1;

                            }
                    }
                    for (int i = 0; i < numbers_1.length; i++)
                        if (numbers_1[i] < 1 || numbers_1[i] > 21) {
                            System.out.println(numbers_1.length + "个数必须在1-21之间！请重试");
                            continue L1;
                        }
                } catch (NumberFormatException e) {
                    // TODO: handle exception
                    System.out.println("非数字！请重试:");
                    continue;
                }
                InputLoopflag = false;
            }
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }

    static void input_2(int[] numbers_2) {
        System.out.println("请连续输入" + numbers_2.length + "个位数(代表购买彩票的号码，最后一位为特等号):");
        boolean b = true;
        InputStreamReader ir;
        BufferedReader in;
        String s = new String();
        try {
            ir = new InputStreamReader(System.in);
            in = new BufferedReader(ir);
            L2:
            while (b) {
                s = in.readLine();
                if (s.length() != numbers_2.length) {
                    System.out.println("只能输" + numbers_2.length + "位!请重试:");
                    continue;
                }
                for (int i = 0; i < numbers_2.length; i++)
                    numbers_2[i] = s.charAt(i) - 48;
                for (int i = 0; i < numbers_2.length; i++)
                    if (numbers_2[i] < 0 || numbers_2[i] > 9) {
                        System.out.println("只能输入数字!请重试:");
                        continue L2;
                    }
                b = false;
            }
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }

    static void check_1(int[] numbers) {
        System.out.println("\n21选5的规则是:\n一等奖:5个号码相同;\n二等奖:四个号码相同;\n三等奖:三个号码相同。\n");
        int[] award = new int[5];
        Random ran = new Random();
        L3:
        for (int i = 0; i < award.length; i++) {
            award[i] = Math.abs(ran.nextInt()) % 21 + 1;
            for (int j = 0; j < i; j++)
                if (award[j] == award[i]) {
                    i--;
                    continue L3;
                }
        }
        int same = 0;
        L4:
        for (int i = 0; i < numbers.length; i++)
            for (int j = 0; j < award.length; j++)
                if (numbers[i] == award[j]) {
                    same++;
                    continue L4;
                }
        switch (same) {
            case 5:
                System.out.println("恭喜你！你中了一等奖500000元！");
                break;
            case 4:
                System.out.println("恭喜你!你中了二等奖4000");
                break;
            case 3:
                System.out.println("恭喜你！你中了三等奖3000");
                break;
            default:
                System.out.println("很遗憾，你没有中奖，祝你下次好运.");
        }
        System.out.println("随机产生的号码是:");
        for (int i = 0; i < award.length; i++)
            System.out.print(award[i] + " ");
        System.out.print("\n你选的号码是      :");
        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + "  ");
        System.out.println();
    }

    static void check_2(int[] numbers) {
        System.out.println("\n6+1的规则是:");
        System.out.println("特等奖:6+1位数都相同;\n" + "一等奖：6位数都相同;\n" + "二等奖:连续6位数相同;\n" + "三等奖:连续4位数相同;\n" + "四等奖:连续3位数相同.\n");
        int[] award = new int[7];
        int i;
        Random ran = new Random();
        for (i = 0; i < award.length; i++) award[i] = Math.abs(ran.nextInt()) % 10;

        for (i = 0; i < award.length - 1; i++)
            if (award[i] != numbers[i]) break;

        if (i == 6) {
            if (award[i] == numbers[i])
                System.out.println("恭喜你!你中了特等奖，奖金5000000!!!!");
            else System.out.println("恭喜你!你中了一等奖,奖金500000!!!");
            System.out.print("随机产生的号码是:");
            for (i = 0; i < award.length; i++)
                System.out.print(award[i]);
            System.out.print("\n 你选的号码是:");
            for (i = 0; i < numbers.length; i++)
                System.out.print(numbers[i]);
            return;
        }
        int same1 = 0, same2 = 0;
        for (i = 0; i < award.length - 1; i++) {
            if (award[i] == numbers[i])
                same1++;
            else {
                if (same1 > same2)
                    same2 = same1;
                same1 = 0;
            }
        }

        int same = same1 > same2 ? same1 : same2;
        switch (same) {
            case 5:
                System.out.println("恭喜你！你中了二等奖50000元！");
                break;
            case 4:
                System.out.println("恭喜你!你中了三等奖5000");
                break;
            case 3:
                System.out.println("恭喜你！你中了三等奖500");
                break;
            default:
                System.out.println("很遗憾，你没有中奖，祝你下次好运.");
        }
        System.out.println("随机产生的中奖号码是:");
        for (i = 0; i < award.length; i++) System.out.print(award[i]);
        System.out.print("\n你选的号码是          :");
        for (i = 0; i < award.length; i++) System.out.print(numbers[i]);
        System.out.println("\n");
    }
}
