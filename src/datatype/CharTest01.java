package datatype;

public class CharTest01 {
	
	public static void main(String[] args) {
		
		char ch1='0'; // ''한글자만 표현하는 특징, 두글자이상 불가능
		String st1="0"; // 클래스를 데이터타입으로 사용하는 예, ""로 감싸는 특징
		int num1=0;
		
		//변수: 값을 변경할수  값, 상수: 고정된 값
		
		System.out.println("문자타입"+ch1); //char '0' 경우 아스키코드로 문자형(숫자형 x) 
		//"" 문자열과 + 연산은 문자열 결합을 표현 
		System.out.println((int)ch1);//char 경우 0-65535까지 표현 가능 
		//숫자형 경우 int 사용으로 하여 표현 
		System.out.println(num1);
	}

}
