package javaking;

public class Night_salary extends Basic_salary {
     
	 long danger_pay = 50000;
	 long special_pay= 17000;

// public void night_work() {
// 부모클래스의 메소드 호출시 사용법	
//	super.day_pay();
//	System.out.println("야간 일 급여액 =" + (danger_pay+special_pay));
//}

// 부모클래스의 메소드 day_pay()를 오버라이딩 해보기
	 
	 public void day_pay() {
		 
		 long night_allpay = danger_pay + special_pay;
		 System.out.println("일 급여액은(야간수당포함)=" + (work_time*work_pay+night_allpay));
	
	 
	 }
}
