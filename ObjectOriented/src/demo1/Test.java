package demo1;

class Shape {
    public void draw(){
        System.out.println("Shape::draw()");
    }
}
class Rect extends Shape{
    public void draw() {
        System.out.println("♦");
    }
}
class Flower extends Shape{
    @Override
    public void draw() {
        System.out.println("❀");
    }
}
class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("🔺");
    }
}
class Cycle extends Shape {
    //alt + insert 快捷键输出方法
    @Override
    public void draw() {
        System.out.println("●");
    }
}

public class Test {

    public static void main(String[] args) {
        Rect rect = new Rect();
        Flower flower = new Flower();
        Triangle triangle = new Triangle();
        Shape[] shapes = {triangle,rect,triangle,rect,flower,new Cycle()};
        for (Shape s: shapes) {
            s.draw();
        }
    }

    public static void main4(String[] args) {
        Rect rect = new Rect();
        Flower flower = new Flower();
        Triangle triangle = new Triangle();

        String[] shapes = {"cycle", "rect", "triangle", "rect", "flower"};
        //不使用多态的话 就要用到大量的 if else
        for (String x: shapes) {
            if(x.equals("triangle")) {
                triangle.draw();
            } else if(x.equals("rect")){
                rect.draw();
            } else {
                flower.draw();
            }
        }
    }

    public static void drawMap(Shape shape){
        shape.draw();
    }

    //通过一个引用 去调用同一个的 draw 方法 会表现出不同的表现形式  就是多态
    public static void main3(String[] args) {
        drawMap(new Rect());//这里就是在用上面写好的方法
        drawMap(new Flower());
        drawMap(new Triangle());
    }

    public static void main2(String[] args) {
        Shape shape1 = new Rect();
        shape1.draw();//这里就发生了向上转型
        Shape shape2 = new Flower();
        shape2.draw();//这里的 flower 也重写了 shape 的 draw 方法
    }

    public static void main1(String[] args) {
        Rect rect = new Rect();
        rect.draw();//调用自己的 draw 方法输出
    }
}
