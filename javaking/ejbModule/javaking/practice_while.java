package javaking;

import java.util.Scanner;

public class practice_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
/* 합계 구하기
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int sum=0;
		while(i<5) {
			int a = sc.nextInt();		
			sum+=a;
			i++;
		}
		sc.close();
		System.out.println(sum);
*/	
		

		
		
/* if문		
		boolean a = true;
		int cnt = 1;
		while(a)
		{
		  System.out.println(cnt + "회 반복수행");
		  if(cnt==10)
		      break;
		  cnt++;
		}
		System.out.println("반복 종료");
		
	
	   int i = 1;
	   int sum = 0;
	   while(true) {
	
	      sum+=i;
		  
	   if(sum>=1000)
		   break;
	       i++;
	    
	   }System.out.print(i+ "번째의 합이" + sum + "입니다");
	    System.out.println();	
		
*/		
		
		

/* continue 를 사용하여 5의 배수의 합을 구하기		
		
		int sum = 0;
		while(true)
		{
		   Scanner sc = new Scanner(System.in);
		   int num = sc.nextInt();
		   
		   if(num==0)
			   break;
		   if(num%5!=0)
		       continue;
		   
		   sum+=num;
		    
		}System.out.println("5의 배수의 합은 :"+ sum);
		
*/		
		
		

	int sum=0, num;
	do {
		
		Scanner sc = new Scanner(System.in);
	    num = sc.nextInt();
	    sum+=num;
	}
	while(num%5==0); {
		System.out.println("5의배수의 합은 :" + sum);
	}
//주의점 while문 조건식가로 ;    
//어떤 값을 입력하더라도 한번은 꼭 출력이 되기 때문에 5의 배수가 아닌 값을 넣어도 한번은 출력된다. 
	
		
		
		
		
		
		
		
		
	}
}
