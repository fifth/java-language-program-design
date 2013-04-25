//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//输入一行字符串，生成一个新的字符串，将原字符串中的大写字母用下面列出的对应大写字母替换, 其余字符不变, 输出新字符串. 
//原字母   对应字母
//    A ──→ Z
//    B ──→ Y
//    C ──→ X
//    D ──→ W
//       ……
//    X ──→ C
//    Y ──→ B
//    Z ──→ A
//例：括号内是说明
//输入：
//3     (输入3行字符串)
//A flag of USA
//IT12
//oueiaba
//输出：
//Z flag of FHZ
//RG12
//oueiaba

import java.util.Scanner;
public class Test60024{
    public static void main(String []args){
        int ri, repeat, i;
        char ch;
        String str1,str2;
        Scanner in=new Scanner(System.in);
        repeat=(in.nextLine()).charAt(0)-'0';
        for(ri=1; ri<=repeat; ri++){
             str1=in.nextLine();
             str2=str1;
             for (i=0;i<str1.length();i++) {
            	 if (str1.charAt(i)>='A'&&str1.charAt(i)<='Z') {
            		 System.out.print((char)('A'+'Z'-str1.charAt(i)));
            	 } else {
            		 System.out.print(str1.charAt(i));
            	 }
             }
             System.out.println();
        }
   }
}