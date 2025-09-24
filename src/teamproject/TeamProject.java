package teamproject;

import java.util.Scanner;

public class TeamProject {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int moeny = 0;
		boolean run = true;
		
		while(run) {
			System.out.println(" ------------------------------- ");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println(" ------------------------------- ");
            System.out.print("선택 > ");
            
           int strNum = Integer.parseInt(scanner.nextLine());
           
           if(strNum == 1) {
               System.out.print("예금액 > ");
               int plus = Integer.parseInt(scanner.nextLine());
               moeny += plus;
           }
           else if(strNum == 2) {
        	   System.out.print("출금액 > ");
               int minus = Integer.parseInt(scanner.nextLine());
               moeny -= minus;
           }
           else if(strNum == 3) {
        	   System.out.print("출금액 > "+moeny+"\n");
           }
           else if(strNum == 4) {
        	   run = false;
           }
		}
		System.out.println("프로그램 종료");
	}
}