public class Test {

    //反射：通过反射就能获得类的属性  使用反射 要先获取 class 对象
    //然后通过 class 对象 来获取这个方法
    public static void main(String[] args) {
        String str = "abcdef";
    }

    public static void main1(String[] args) {
        String str = "hello";
        str = str + "word";
        str += "!!!";
        //这样拼接的时候 会产生很多对象 会很大程度上降低效率
        //会产生的对象：hello   word   ！！！  helloword   helloword！！！
        //产生这五个对象 极大的降低效率   字符串的拼接，会被优化为 StringBuilder 对象
        System.out.println(str);
    }
}
