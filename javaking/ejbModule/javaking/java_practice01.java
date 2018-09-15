package javaking;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class java_practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
// 각종 연산자 코딩 공부		

			
/* 실수 연산 오류 예제		
	
double dsum = 0.0;	
	dsum = 0.8+0.9;
	System.out.println("결과=" + dsum); 

// 결과값 결과=1.7000000000000002이 출력 된다.  
//즉 정확도가 떨어지는데 그 이유는 코딩을 할 때 10진수로 입력이되는데 컴파일할 때는 2진수로 변환되어 차이가 발생한다.
	
*/		
	
/* 정확한 실수의 연산을 할 수 있는 메서드 BigDecimal 
		
// 정확성을 높이기 위한 실수 계산  메서드 import=java.math.BigDecimal //		
// 나눗셈이 정확하게 몫이 나누어떨어지지 않을 때 자릿수를 정하면 나눗셈이 가능하다 이때 사용하는 방법 import java.math.RoungdingMode; 
BigDecimal big_cal1 = new BigDecimal("55.5");		
BigDecimal big_cal2 = new BigDecimal("3.4");		

//big_cal1=big_cal1.divide(big_cal2);
//정확하게 몫이 나누어떨어지지 않으면 오류를 발생한다. (/) 

//big_cal1=big_cal1.divide(big_cal2,1,RoundingMode.DOWN);
//소수 첫번 째 자리까지 보여주고 나머지는 버린다. 

//big_cal1=big_cal1.add(big_cal2);
//정확한 값이 나온다. (+)

System.out.println(big_cal1);
		
*/



/* BigDecimal(객체)의 관계(논리)연산자 
 
    BigDecimal BD1 = new BigDecimal("0.8");
    BigDecimal BD2 = new BigDecimal("0.8");
    
    //System.out.println("결과는=" + (BD1 == BD2));
    //결과는 false를 반환한다. 그이유는 참조변수는 매개변수가 아닌 참조 주소를 리턴한다. 
   
    //System.out.println("결과는=" + (BD1.equals(BD2)));
    //equals 를 사용하면 참조주소가아닌 매개변수를 가져 올 수 있다.
*/


/* 문자열 비교 일반 변수와 참조변수(객체)의 비교연산자
  
	String irum = "홍길동";	
	System.out.println("비교결과="+(irum=="홍길동"));			

	
	String irum = new String("홍길동");	
	
	System.out.println("비교결과="+(irum=="홍길동"));	
    //BigDesimal 의 객체와 마찬가지로 참조변수는 참조 주소를 가져온다.
	
	System.out.println("비교결과="+ (irum.equals("홍길동")));
	//equals 를 사용하면 매개변수를 가져올 수 있다.
	
*/		
	
	
		
/* 논리 연산자		
		 
//int a=0,b,c;
//boolean d;		
//a+=10;
//b=9;
//d=!(0==(b%3));
//System.out.println("결과1 ="+d);		
//System.out.println("결과2 ="+ ((a==++b) && (!d)));			

*/		

		
	
/* 조건 연산자 응용 프로그램	
		
int age = 60;
String result = null;
result=age>=60 ? "국민연금수급자" : "예비";
System.out.println(result);

int m = 30;
//boolean sw=m%3==0? true : false;
String sw=m%3==0? "3의 배수입니다." : "3의 배수가 아닙니다.";
System.out.println(sw);

*/	





/* 증가 감소 연산자 예제	
      int a=5, b=7;
	  System.out.println("계산결과1="+ ++a);
	  
	  System.out.println("계산결과1="+ a++);
	  //결과를 출력하고나서 나중에 1를 더하라. 
	  System.out.println("계산결과1="+(--b));
	  
	  System.out.println("계산결과1="+(a+b--) );
	  // b-- 결과를 실행하고 나서 1을 빼라.
	  System.out.println("계산결과1="+(a+b) );
	
	  System.out.println("계산결과1="+ a+b );
	  // 괄호의 중요성 괄호를 사용하지 않으면 단순히 연결의 의미로 사용된다.
*/	
	

		
		
/*		int a=5, b=7, c=10;
		System.out.println("결과1=" + (c+=5));
		System.out.println("결과1=" + (b-=2));
		System.out.println("결과1=" + (a*=2));
	 	System.out.println("결과1=" + (c%=4)); 
*/		//변수 c의 값은 맨위 연산자가 처리 된 후의 값을 나눈것.
		
		
		
		
	}

}
