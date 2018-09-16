package javaking;

import java.util.Date;

public class java_practice_main {
	
/*	
	 public int age;
	 public String name;
	
	 public void info(int age, String name) {
	   
	   System.out.println("나이는 =" + age);
	   System.out.println("이름은 =" + name );
  }
*/

	private String irum;
	private String import_date;
	
	void test() {
		System.out.println(irum+"님이" + import_date+ "에 방문하셨습니다.");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
/*
		java_practice_main jpc = new java_practice_main();	
		java_practice_main jpc1 = new java_practice_main();
		jpc.info(20, "홍길동");
	    
		jpc1.age=30;
	    jpc1.name="박혁거세";
	    jpc.info(jpc1.age, jpc1.name);
*/
	   
		java_practice_main main1 = new java_practice_main();
		
		java_practice_main main2 = new java_practice_main();
		
		Date tody = new Date();
		main1.irum="김두한";
	    main1.import_date=tody.toString();
	    main1.test();
	    
	    main2 = main1; // 값이 아닌 참조 주소가 옮겨져서 main1이 참조하고 있는 주소를  main2도 참조하게 된다.
	    
	    main1.test();  
	    main2.test();
	    
	    
	}
}
