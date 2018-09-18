package javaking;

interface Intogether 
  {
	  
     public void info(int type_info);	  
   // absctact 를 붙여주지 않아도 interface 클래스 명을  사용하게 되면 자동으로 인식한다.
   // 인터페이스에 여러개의 추상메서드를 만들어도 상관없다. 단 그 추상메서드를 전부 구현해줘야한다.
  }
 
 
  
  
  
  class cost_as implements Intogether {
	   int inwon;
	   private int cost;
	
	   @Override
	public void info(int type_info) 
    {
		
		if(type_info==1)
			cost=9000;
		else if(type_info==2)
			cost=15000;
		   
	}
      	  
	public void info_cost() 
	{
		
		System.out.println("가격정보 = " + inwon * cost );
		
	}
  }
	  
/*	  
  class cost_as {
	    int inwon;
		protected int cost;
		
		
   public void info_cost() 
	
    {
			
	  System.out.println("가격정보 = " + inwon * cost );
			
	}
   
  } 
 
 */
 
 
 
  /*
	class Foreign extends cost_as implements Intogether {
      // 상속과 추상메서드를 통해 오버라이딩
		@Override
		public void info(int type_info) 
		{
			
			// TODO Auto-generated method stub
			
				if(type_info==1)
					cost=9000;
				else if(type_info==2)
					cost=15000;
				   
		 }
		
	}
		
  */

public class Practice_implement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		cost_as ca = new cost_as();
		ca.inwon = 10;
		ca.info(2);
	    ca.info_cost();
	
	
	/*	
		Foreign f = new Foreign();	
		f.inwon=10;
		f.info(2);
		f.info_cost();
	*/
	
	}

}
