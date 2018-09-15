package javaking;

public class java_practice_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		java_practice_class jpc = new java_practice_class();	
		java_practice_class jpc1 = new java_practice_class();
		jpc.info(20, "홍길동");
	    
		jpc1.age=30;
	    jpc1.name="박혁거세";
	    jpc.info(jpc1.age, jpc1.name);
	}
}
