package javaking;

import java.util.Scanner;

public class java_practice_for {
    public static void main(String[] args) {
		
/* 5번 입력받아서 입력값의 짝수와 홀수의 합을 각각 구하는 for 반복문   	 
   
    Scanner sc = new Scanner(System.in);
    System.out.println("숫자를 입력하시오");
    int sum=0;
    int bsum=0;
    for(int i=1; i<=5; i++) {
    	
    int a= sc.nextInt();	
    
    if(a%2==0) 
    {
    	sum+=a;
    }
    else 
    {
    	bsum+=a;
    }
  }
    sc.close();
    System.out.println("짝수의 합계는=" + sum);
    System.out.println("홀수의 합계는=" + bsum);
 
 */  
    
    	
    	
 /* 1부터 입력값 까지의 합계 구하기 for문    	
     int sum=0;
     Scanner sc = new Scanner(System.in);
     System.out.println("합계를 입력하시오");
     int a = sc.nextInt();	
     sc.close();
     for(int i=1; i<=a; i++) {
     
          sum+=i;	 
     
     }
      System.out.println("1부터 " + a + "까지의 합계=" + sum);
*/    
    
    	
    	
/* 별찍기    	

   for(int i=1; i<=5; i++) 
   {
	   for(int j=1; j<=i; j++) 
	    {
		 System.out.print("☆");
		}
	   
	   for(int c=5; c>i; c--) 
	    {
		 System.out.print("★");   
	    }
	   
	   System.out.println();  
   } 
    	
/* 피라미드 */
    
//    int num =11;
//    for(int i=1; i<num; i++) {
//    	for(int j=i; j<num-1; j++ ) 
//    	{
//    		System.out.print(" ");
//    	}
//    	for(int c=1; c<i*2; c++) 
//    	{
//    		System.out.print("*");
//    	}
//    	System.out.println();
//    }
    

/* 확장 for문     	
// 반복대상(배열/콜렉션)의  값들을 하나하나 저장할 변수를 지정하여 반복 처리한다.
   
   
    int arr[] = {10,20,30,40,50};
    int sum=0;
    for(int a: arr) {
    	sum+=a;
    }System.out.println("배열의 합은 :"+ sum);
    
*/  	
    
    	
    	
    	
    	
    	
    
    
    }
}
