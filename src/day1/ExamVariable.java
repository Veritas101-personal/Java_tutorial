package day1;

import java.util.Scanner;

public class ExamVariable {

	  // main: �ܼ��������α׷��� ����Ǳ� ���� �� �ʿ��� ��(�޼ҵ�,���)

	  public static void main(String[] args) {
	    // �ֿܼ� ���ϴ� ���ڿ��� ����� �Ŀ� ���͸� ġ�°�(�޼ҵ�)
	    
	    System.out.println("Hello world!");
	    System.out.println(7+7);
	    System.out.println(""+(7+7));
	    System.out.println();
	    System.out.print("�ȳ�\n");
	    System.out.println(""+7+7);
	    int num1 = 10, num2 = 20;
	    System.out.println(num1 + "," + num2);
	    num1 = 9;
	    num2 = 11;
	    System.out.println(num1 + "," + num2);
	    System.out.printf("%2d,%2d%n",num1,num2);
	    double dnum = 1.23;
	    System.out.printf("%7.3f%n",dnum);

	    Scanner scan = new Scanner(System.in);

	    int num = scan.nextInt();
	    System.out.println(num);
	    
	    char ch = scan.next().charAt(0);
	    System.out.println(ch);
	    String str = new String();
	    str = scan.next();
	    System.out.println(str);
	    scan.close();		

	   

	}

}
