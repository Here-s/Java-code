public class Operatorcontrol {
    public static void main(String[] args) {
        //位操作符  & | ^ 分别是按位与 按位或 按位异或  是指二进制位
        //& 按位与 两个二进制位 都是1 那么结果是1 有一个是0 结果是0
        //| 按位或 两个二进制位 有一个是1 那么结果就是1
        //^ 按位异或 异 就是不一样的再进行或  两个二进制位 对应的二进制位相同 则为0 不相同则为1
    }

    public static void main3(String[] args) {
        //逻辑运算符  &&  ||  ！ ^   就是并且 或 非  同C语言
        //&&也叫逻辑与   表达式1 && 表达式2 这两个表达式都要成立 这个式子才成立 这就是逻辑与
        //||也叫逻辑或   表达式1 || 表达式2 两个表达式一个成立结果就为真 一旦表达式1为真 就不执行表达式2了
        //! 叫逻辑非 原来为true的话 结果就为false 只能作用于boolean类型的数据上
        int a=10;
        int b=20;
        System.out.println(!(a<b));//表达式不成立  因为会报错 ！不能应用于整型 因为是和a先结合的 所以把a和b括住就行了
        boolean flg=true;
        System.out.println(!flg);//
    }

    public static void main2(String[] args) {
        //复合运算符 +=  -=  *=  /=  规则同C语言  ++  --  也一样  前置和后置++ --的规则和C语言一样
        int a=10;
        int b=++a;
        System.out.println(b);
        int i=10;
        i=i++;
        System.out.println(i);//10 因为是先赋值 后++

        //关系运算符 ==  !=  <  >  <=  >=  所有逻辑运算符的结果在Java当中只有true和false

        int c=10;
        int d=20;
        System.out.println(c==d);//再Java当中 只会输出true和false
    }

    public static void main1(String[] args) {
        //算术运算符 % 模 也可以对小数求余数
        System.out.println(10%3);//1  因为%取得是余数 所以是1
        System.out.println(-10%3);//-1  因为是模 不是除 所以余数是-1
        System.out.println(10%-3);//1  模是余数 所以是1
        System.out.println(-10%-3);//-1  同第二个

        //System.out.println(5/0);//这个代码会异常 是算术类型异常 不能除0

        //算术运算符 /除号
        System.out.println(5/2);//2  因为是整数 所以结果是2
        System.out.println(5.0/2);//2.5  因为有小数 所以结果也是小数
        System.out.println((float)5/2);//2.5  强制把5转化为小数 所以是2.5
        System.out.println((float)(5/2));//2.0  这里是把5/2的值转化为小数 原来是2 转化之后还是2

    }


}
