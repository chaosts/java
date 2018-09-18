package javaking;
import java.util.*;

public class practice_arraylist2 {
public static void main(String[] args) {
  //문자배열을 ArrayList로 바꾸기
  /*
  String [] arr = new String[] {"채송화", "금잔화", "다알리아"}; 
  List<String> Myflower= new ArrayList<>(Arrays.asList(arr));
  System.out.println("리스트변환결과" + Myflower);
  Myflower.set(2, "진달래");
  Myflower.add(1, "무궁화");
  System.out.println("리스트변환결과" + Myflower);
  */
	
   int [] arr = {100,200,300,400};
   List<Integer> Mynum = new ArrayList<>();
   for(int a : arr)
	   Mynum.add(a);
       Mynum.add(2,250);
	System.out.println("리스트 변환결과" + Mynum);
}
 }
