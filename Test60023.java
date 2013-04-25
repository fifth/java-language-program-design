//程序填空，不要改变与输入输出有关的语句。
//先输入一个字符ch。然后输入一个正整数n (0<n<10)，做n次下列运算：
//输入一行字符串，在字符串中查找该字符(ch)，如果找到，则输出
//该字符在字符串中最后出现的位置(从0开始)；否则输出“Not Found”。
//例：括号内是说明
//输入：
//m                         (输入一个字符)
//3                          (要输入3行字符串)
//moon
//programming
//1234   
//输出：
//0     (m在"moon"中最后出现位置是0)
//7     (m在"programming"中最后出现位置是7)
//Not Found    ("1234"中没有m)

import java.util.Scanner;
public class Test60023{
    public static void main(String []args){
         int index,i,n,j;
         char ch;
         String str;
         Scanner in=new Scanner(System.in);
         ch=(in.nextLine()).charAt(0);
         n=(in.nextLine()).charAt(0)-'0';
         for(i=1;i<=n;i++){
             str=in.nextLine();
             index=-1;
             for (j=0;j<str.length();j++) {
            	 if (ch==str.charAt(j)) index=j;
             }
             if(index>=0) System.out.println(index);
             else System.out.println("Not Found");
         }
   }
}