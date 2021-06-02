public class Operator {
    public static void main(String[] args) {
        //单精度 float
        float f = 12.3f;//报错 因为12.3就是一个double double 8个字节 float 4个字节
        //Java不能把大字节变成小字节 就是不能把double变成float 就是不能把double的值赋给float
        //但是只要在12.3后面加个小写的F就行了
        //从侧面表示java是安全的语言 Java是一个强类型语言 C语言是一个弱类型语言
        //float对应的包装类就是Float
        System.out.println(f);
    }

    public static void main3(String[] args) {
        //双精度浮点型
        double d=12.5;//默认是双精度类型 只要是小数 都是默认双精度类型
        System.out.println(d);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        //int long double 都是基本数据类型
        //Integer Long Double 是包装类 优势是后期使用很方便
        //要除下小数 那么两个数必须有一个是double类型的
        double num=1.1;
        System.out.println(num*num);//理论上是1.21 结果是最后有一个2 因为是双精度 最后的2 是精度的表示
        //double占八个字节 一般情况 如果写项目 遇到小数 建议使用double 小数没有精确值 是有一个范围
    }

    public static void main2(String[] args) {
        //String[] args 是干什么的 是之前网易考过的笔试题
        //每年去搜集面试题 笔试题
        //String[] args 叫做运行时参数 args是一个数组 数组里面放的是string字符串
        //通过for循环来看里面放的啥
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
        System.out.println("off");
        //String[] args  放的是命令行参数 就是输入的东西 数组是方括号 方括号写在类型后面
        //不论多简单的代码 都要写 在Java当中 数组在堆上

    }

    //main函数只有一个 如果main写出main1就不是main函数了
    public static void main1(String[] args) {//讲解长整型
        //int就占四个字节 最大值+1 就变成最小值了 最小值-1 就变成最大值了
        //拿到int的最大值 使用Integer

        long a=10L;//长整型 再java当中是八个字节 标识当前的长整型要在后面加个L
        //不加L的话 还默认是整型 输出结果还是10 但这里的10是长整型 不建议写成
        //写成小写L 因为不易分辨 长整型的最高位也是符号位
        System.out.println(a);
        System.out.println("最大值"+Long.MAX_VALUE);//最大值 用+来拼接 整体代表字符串
        System.out.println("最小值"+Long.MIN_VALUE);//最小值
        int b=20;
        int c=10;
        System.out.println(b+c);//这里的加号就不是拼接的意思了 是想加的意思 因为b和c都是整型
        System.out.println("哈哈哈"+b+c);//这里的+就是拼接的意思 将三者全部拼接了
        //任何数据的类型和字符串进行拼接的时候 结果就是字符串
        System.out.println("哈哈哈"+(b+c));//如果加上括号就没问题了
    }
}


