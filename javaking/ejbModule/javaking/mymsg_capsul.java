package javaking;

import java.util.Scanner;

/* 환율 계산기 */

class Exchange_currency{
	
      long kor_cache;
      private int exchange;
      private double ex_perrate;
      private String irum;
      
      
    void fee(int ex_ch) {
	
	 double fees = 0.0;
	 int result = 0;
	 switch(ex_ch) {
	 
	 case 1:
		 fees=0.0187;
	     break;
	 case 2:
		 fees=0.017;
		 break;
	 case 3:
		 fees=0.019;
		 break;
	 case 4:
		 fees=0.015;
		 break;
	 }
	   
	   pay(ex_ch);
	   result = exchange(ex_ch);
	   ex_perrate = result * fees;
 }
     
   private int exchange(int a) {
	       
	     int exchange_1 = 0; 
		 switch(a) 
		 {
		 
		 case 1:
			 exchange_1=1139;
		     break;
		 case 2:
			 exchange_1=1016;
			 break;
		 case 3:
			 exchange_1=171;
			 break;
		 case 4:
			 exchange_1=1332;
			 break;
		 }
		 
		  exchange=exchange_1;
		  return exchange_1;
      }
   
    private void pay(int a) {
    	
    	String ex_irum = null;
    	
    	switch(a) 
    	{
    	case 1:
    		ex_irum="달러";
    	   break;
    	case 2:
    		ex_irum="엔(100엔단위)";
    	   break;
    	case 3:
    		ex_irum="위안";
    	   break;
    	case 4:
    		ex_irum="유로";
    	   break;
    	
    	}
    	irum = ex_irum;
    }
   
   
 
   void result() {
	   
	   long pay_cash = kor_cache/exchange;
	   double pay_fee = pay_cash * ex_perrate;
	   System.out.println("환전 할 금액은" + kor_cache + "원");
       System.out.println("총 환전금액은" + pay_cash + irum  );
       System.out.println("환전 수수료는" + pay_fee + "원" );
       
   }
 
 
}
public class mymsg_capsul {
      public static void main(String[] args) {
	
     int num; // 번호
     long my_cache;  
     System.out.println("환전할 번호를 선택하시오.(1-us달러,2-엔화,3-위안화,4-유로화)");
     Scanner sc = new Scanner(System.in);
     num = sc.nextInt();
     
     System.out.println("환전할 금액을 입력하시오.");
     my_cache = sc.nextInt();   
     sc.close();  
     
     Exchange_currency ec = new Exchange_currency();
     ec.kor_cache = my_cache;
     ec.fee(num);
     ec.result();
     
   }
}





