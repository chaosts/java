package javaking;

import java.util.Scanner;

public class java_practice_if_switch {

	public static void main(String[] args) {
	
	 
/* Scnnaer를 사용해서 입력한 값을 if문으로 구현해보기 
 		
 
	 Scanner sc = new Scanner(System.in);
	 
	 int a = sc.nextInt();
	 
	 if(a%3==0 && a%5==0)
		 System.out.println(a+"는 3의 배수이면서 5의 배수");
     else if(a%3==0)	
    	 System.out.println(a+"는 3의 배수");
     else if(a%5==0)	
    	 System.out.println(a+"는 5의 배수");
     else 
    	 System.out.println("해당없음");
*/     
		

		
/* BMI(비만량지수) if문으로 만들어 보기  
   
    Scanner sc = new Scanner(System.in);	
	double a = sc.nextDouble();	
	double b = sc.nextDouble();	
    
	double height=a;		
    double weight=b;		
	double bmi = weight/(height*height);	
		
	if(bmi<18.5)	
		System.out.println("저체중입니다.");
	else if(bmi>=18.5 && bmi<=22.5)	
		System.out.println("정상체중입니다.");
	else
		System.out.println("비만입니다.");
*/		
		
	
/* 스위치문 혈액형	
	
	Scanner sc = new Scanner(System.in);	
	String a=sc.next();	
	switch(a.toUpperCase()) { // a는 문자열 변수이면서 객체이기도 하다.  toUpperCase() 소문자를 대문자로 바꿔주는 메서드
	case "A":
		System.out.println("혈액형은 A형입니다.");
	break;
	case "B":
		System.out.println("혈액형은 B형입니다.");
	break;
	case "O":
		System.out.println("혈액형은 O형입니다.");
	break;
	case "AB":
		System.out.println("혈액형은 AB형입니다.");
	break;
	default : 
		System.out.println("외계인입니다.");
	}
		
*/	
	
		
	
		
	}
}
