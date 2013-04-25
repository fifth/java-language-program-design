//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)并换行，然后做repeat次下列运算：
//输入一行字符，统计其中单词的个数。各单词之间用空格分隔，空格数可以是多个。
//说明：
//1）使用c=line.charAt(i);表示从line中获得第i个字符，i从0开始。
//2）line中的字符个数为：line.length()
//例：括号内是说明
//输入
//2   (repeat=2)
//Reold building  room   123
//  Programming is fun
//输出
//4
//3 

import java.util.Scanner;
public class Test40031{
  public static void main(String []args ){
     int ri, repeat,count, word,i;
     String line;
     char c;
     Scanner in=new Scanner(System.in);
     repeat=(in.nextLine()).charAt(0)-'0';   //输入repeat
     for(ri=1; ri<=repeat; ri++){
        line=in.nextLine();                  //输入一行字符
        i=0;
        count=0;
        while (i<line.length()) {
        	while (i<line.length()&&line.charAt(i)==' ') {
        		i++;
        	}
        	count++;
        	while (i<line.length()&&line.charAt(i)!=' ') {
        		i++;
        	}
        }        
        System.out.println(count);
     }
  }
}