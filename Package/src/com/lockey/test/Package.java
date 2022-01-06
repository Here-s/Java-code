package com.lockey.test;
import com.lockey.test2.Test2;

public class Package extends Test2 {//如果不继承的话 也能访问到，只要字段是 public
    //在哪里使用都是可以的

    public static void main(String[] args) {
        Test2 test = new Test2();
        System.out.println(test.val);
    }

    public static void main1(String[] args) {
        Test2 test = new Test2();
        System.out.println(test.val);//这里就能访问到 因为 Test 和 Package在同一个目录下
    }
}
