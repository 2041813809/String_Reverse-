package String_Reverse;
//定义一个方法，实现字符串的反转。键盘录入一个字符串，调用该方法后，在控制台输出结果

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner ac = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = ac.nextLine();

        System.out.println(abc(line));
    }

    public static String abc(String line){

        String line2 = "";

        for (int i = line.length()-1;i>=0;i--){
            line2 +=line.charAt(i);
        }
        return line2;
    }
}
