//程序填空，不要改变与输入输出有关的语句。
//输入一个大写英文字母，输出相应的小写字母。
//例：
//输入
//G
//输出
//g

import java.io.*;
public class Test20006 {
   public static void main(String[] args) throws IOException {
      char ch;
      ch=(char)System.in.read();
      ch=(char)((int)ch-(int)'A'+(int)'a');
      System.out.println(ch);    
   }
}