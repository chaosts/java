package javaking;

class super_sample {
       
	private String irum;
	
	public super_sample() 
	{
	   System.out.println("슈퍼 클래스 생성자");	
	}
	
	public super_sample(String irum) 
	{  
	   this.irum=irum;	
	   System.out.println(irum+"님 안녕하세요.");	
	}
	
	public void roan_info(String place_in) 
	{
		if(place_in=="서울강남3구" || place_in=="세종" || place_in=="과천")
		   System.out.println("투기과열지역");
       else
		   System.out.println(irum + "님의 지역은 일반지역입니다.");
	       
	}
	

}


class child_sample extends super_sample {
	
	child_sample()
	{   
		//super();  // 명시적으로 입력하지 않아도 묵시적으로 실행이 된다.(생성자의 파라메터가 없을때만)
		System.out.println("자식 클래스 생성자");
	}
	
	child_sample(String irum)
	{   
		super(irum); // 단 아규먼트가 존재 할 경우 자식클래스의 생성자는 부모클래스의 생성자와 똑같이 아규먼트를 넣어줘야 한다. 
		System.out.println("자식 클래스 생성자");
	}
	 
}   


public class constructor {	
    public static void main(String[] args) 
 {
	   
    	child_sample cs = new child_sample();
    	child_sample cs1 = new child_sample("베티"); 
    	//오류가 난다. 그 이유는 생성자의 아규먼트가 존재 할 경우 
    	
    	cs.roan_info("세종");
    	
    	cs1.roan_info("원주");
     	
  }
}
