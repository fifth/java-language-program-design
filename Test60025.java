//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//输入一行字符串，对字符串做如下处理：滤去所有的非十六进制字符后，组成一个新字符串（十六进制形式），然后将其转换为十进制数后输出。
//
//例：括号内是说明
//输入：
//3     (输入3行字符串)
//10
//Pf4+1
//-+A  
//输出：
//16
//3905
//10

import java.util.Scanner;
public class Test60025{
    public static void main(String []args){
        int ri, repeat, i, j, d, number;
        char ch;
        String str;
        Scanner in=new Scanner(System.in);
        repeat=in.nextInt();
        for(ri=1; ri<=repeat; ri++){
             str=in.next();
             j=0;
             number=0;
             for (i=str.length()-1;i>=0;i--) {
            	 if ((str.charAt(i)>='0'&&str.charAt(i)<='9')||(str.charAt(i)>='a'&&str.charAt(i)<='f')||(str.charAt(i)>='A'&&str.charAt(i)<='F')) {
            		 if (str.charAt(i)>='0'&&str.charAt(i)<='9') {
            			 d=str.charAt(i)-'0';
            		 } else if (str.charAt(i)>='a'&&str.charAt(i)<='f') {
            			 d=str.charAt(i)-'a'+10;
            		 } else {
            			 d=str.charAt(i)-'A'+10;
            		 }
            		 number+=Math.pow(16,j)*d;
            		 j++;
            	 }
             }
             System.out.println(number);
        }
   }
}