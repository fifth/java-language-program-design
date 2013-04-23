// 程序填空，不要改变与输入输出有关的语句。
// 输入一个正整数 repeat (0<repeat<10)，做 repeat 次下列运算：
// 输入五级制成绩(A－E)，输出相应的百分制成绩(0－100)区间，要求使用switch语句。
// 五级制成绩对应的百分制成绩区间为：A(90-100)、B(80-89)、C(70-79)、D(60-69)和E(0-59),如果输入不正确的成绩，显示"Invalid input"。

// 输入输出示例：括号内是说明
// 输入
// 6
// A B C D E j     (repeat=6，输入的五级成绩分别为A、B、C、D、E和无效的字符j) 
// 输出
// 90-100
// 80-89
// 70-79
// 60-69
// 0-59
// Invalid input

import java.util.Scanner;
public class Test30010{
     public static void main(String args[]){
         int repeat, ri;
         char ch;
         Scanner in=new Scanner(System.in);
         repeat=in.nextInt();
         for(ri = 1; ri <= repeat; ri++){
             ch=(in.next()).charAt(0);
             switch (ch) {
                case 'A':
                    System.out.println("90-100");
                    break;
                case 'B':
                    System.out.println("80-89");
                    break;
                case 'C':
                    System.out.println("70-79");
                    break;
                case 'D':
                    System.out.println("60-69");
                    break;
                case 'E':
                    System.out.println("0-59");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
             }
         }
   }
}
