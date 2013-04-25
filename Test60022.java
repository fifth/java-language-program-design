//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数n (0<n<10)，做n次下列运算：
//输入一行字符串，统计并输出字符串中大写辅音字母的个数
//(大写辅音字母:除“A”,“E”,“I”,“O”,“U”以外的大写字母)。
//例：括号内是说明
//输入：
//3   (输入3个字符串)
//HELLO
//IT12
//uieiaba
//输出：
//3     ("HELLO"中有3个大写辅音字母)
//1    （"IT12"中有1个大写辅音字母） 
//0    （"uieiaba"中没有大写辅音字母） 

import java.util.Scanner;
public class Test60022{
    public static void main(String []args){
         int count,i,j,n;
         char ch;
         String str;
         Scanner in=new Scanner(System.in);
         n=(in.nextLine()).charAt(0)-'0';
         for(i=1;i<=n;i++){
             str=in.nextLine();
             count=0;
             for (j=0; j<str.length(); j++) {
            	 if (up(str.charAt(j))) {
            		 count++;
            	 }
             }
             System.out.println(count);
         }
   }
    public static boolean up(char ch) {
    	if (ch>='A'&&ch<='Z') {
    		if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
    			return false;
    		} else {
    			return true;
    		}
    	} else {
    		return false;
    	}
    }
}