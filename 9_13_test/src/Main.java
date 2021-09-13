import java.util.*;

class Student{
    private String name;
    private int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] str = new String[n];
        for(int i = 0; i < n ;i++){
            String[] str1 = scanner.nextLine().split(" ")
        }
    }

    public static void isPalindrome(String[] str){
        int left = 0;
        int right = str.length - 1;
        int flag = 1;
        while(left <= right){
            if(!str[left].equals(str[right])){
                flag = 0;
            }
            left++;
            right--;
        }
        if(flag == 1){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
    public static void main1(String[] args) {
        //判断是否为回文字符串
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split("");
        isPalindrome(str);
    }
}
