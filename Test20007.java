//程序填空，不要改变与输入输出有关的语句。
//已知某位学生的数学、英语和计算机课程的成绩分别是87分、72分和93分，求该生3门课程的平均分。
//本题无输入。
//输出示例：
//math = 87, eng = 72, comp = 93
//average = 84

public class Test20007 {
   public static void main(String[] args)  {
      int math, eng, comp, average;
      math=87;
      eng=72;
      comp=93;
      average=(math+eng+comp)/3;
      System.out.println("math = "+math+", eng = "+eng+", comp = "+comp);
      System.out.println("average = "+ average);
   }
}