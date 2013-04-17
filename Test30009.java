import java.util.Scanner;
public class Test30009{
     public static void main(String args[]){
         int repeat, ri;
         int a,b,c,d;
         double x1,x2;
         Scanner in=new Scanner(System.in);
         repeat=in.nextInt();
         for(ri = 1; ri <= repeat; ri++){
            a=in.nextInt();
            b=in.nextInt();
            c=in.nextInt();
            if (a==0) {
                if (b==0) {
                    if (c==0){
                        System.out.println("a=b=c=0,meaningless");
                    } else {
                        System.out.println("a=b=0,c!=0,error");
                    }
                } else {
                    x1=-c*1.0/b;
                    if (x1>0) {
                        x1=((int)(x1*100+0.5))*1.0/100;
                    } else {
                        x1=((int)(x1*100-0.5))*1.0/100;
                    }
                    System.out.println("x="+x1);
                }
            } else{
                d=b*b-4*a*c;
                if (d>=0) {
                    x1=(-b+Math.sqrt(d))*1.0/(2*a);
                    x2=(-b-Math.sqrt(d))*1.0/(2*a);
                    if (x1>0) {
                        x1=((int)(x1*100+0.5))*1.0/100;
                    } else {
                        x1=((int)(x1*100-0.5))*1.0/100;
                    }
                    if (x2>0) {
                        x2=((int)(x2*100+0.5))*1.0/100;
                    } else {
                        x2=((int)(x2*100-0.5))*1.0/100;
                    }
                    System.out.println("x1="+x1);
                    System.out.println("x2="+x2);
                } else {
                    x1=-b*1.0/(2*a);
                    x2=Math.sqrt(-d)*1.0/(2*a);
                    if (x1>0) {
                        x1=((int)(x1*100+0.5))*1.0/100;
                    } else {
                        x1=((int)(x1*100-0.5))*1.0/100;
                    }
                    if (x2>0) {
                        x2=((int)(x2*100+0.5))*1.0/100;
                    } else {
                        x2=((int)(x2*100-0.5))*1.0/100;
                    }
                    System.out.println("x1="+x1+"+"+x2+"i");
                    System.out.println("x2="+x1+"-"+x2+"i");
                }
            }
     }
   }
}
