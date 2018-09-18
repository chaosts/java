package javaking;

import java.util.*;


public class practice_array_list {
      public static void main(String[] args) {

	/*
	List list = new ArrayList();
	// 제네릭을 사용하지 않았을 경우 값의 일관성이 없어진다.
    
	list.add("호랑이");
	list.add("사자");
	list.add("개");
	list.add(30);
	System.out.println(list.size());
    System.out.println(list);
    */
    
	List <String> list = new ArrayList();
	// 제네릭을 사용하지 않았을 경우
    
	list.add("호랑이");
	list.add("사자");
	list.add("개");
//	list.add(30); 속성이 문자타입이기때문에 오류가 난다.
	System.out.println(list.size());
    System.out.println(list);
//    list.remove(0);   // 항목을 제거하게되면 1번째 있던 데이터가 앞으로 자리이동 // 빈번한 삭제는 성능에 문제를 끼친다.
    
//    System.out.println(list.size());
//    System.out.println(list);
    list.set(2, "하마");
    System.out.println(list);
   
//  for(int i=0; i<list.size(); i++) {
//    	System.out.println(list.get(i));
//    }
    
    for(String a : list) {
    	System.out.print(a + " / ");
    }
    
    Iterator<String> itrinfo = list.iterator();   // itrinfo를 list객체에 접근이 가능하도록 한다.
    while(itrinfo.hasNext()) { // hasNext는 다음값이 있는지 확인
    	System.out.println(itrinfo.next());  // next()는 차례차례 값을 출력한다.
    }
    
      
      
      
      
      
    }    
}
