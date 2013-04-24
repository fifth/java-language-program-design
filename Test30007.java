//程序填空，不要改变与输入输出有关的语句。
//输入一批以问号“?”结束的字符，对“?”以前的每一个字符，如果它是大写字母，输出相应的小写字母；如果它是小写字母，输出相应的大写字母；否则，原样输出。
//例：
//输入
//F=y?
//输出
//f=Y

import java.io.*;
public class Test30007 {
   public static void main(String[] args)throws IOException{
      char ch;
      ch=(char)System.in.read();
      while(ch!='?'){
          if (ch>='a'&&ch<='z') {
        	  ch=(char)(ch-'a'+'A');
          } else if (ch>='A'&&ch<='Z') {
        	  ch=(char)(ch-'A'+'a');
          }
          System.out.print(ch);
          ch=(char)System.in.read();
      }
   }
}