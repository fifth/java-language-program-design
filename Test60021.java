//程序填空，不要改变与输入输出有关的语句。
//输入一行以 # 结束的多串字符（不包含空格,各串之间也用 # 进行间隔）。
//统计并输出每串字符的长度。
//输出使用：System.out.println(len);
//例：括号内是说明
//输入：
//hello_12#abc+0#   (连续输入2串字符“hello_12”和“abc+0”)
//输出：
//8     (“hello_12”的长度是8)
//5    （“abc+0”的长度是5） 

import java.util.Scanner;
public class Test60021{
   public static void main(String []args){
      int len,count,i,k;
      char ch;
      String str;
      Scanner in=new Scanner(System.in);
      str=in.next();    //对5月7日前建立的练习用in.nextLine();
      i=0;
      while (i<str.length()) {
    	  count=0;
    	  while (i<str.length()&&str.charAt(i)!='#') {
    		  count++;
    		  i++;
    	  }
          System.out.println(count);
          i++;
      }
   }
}