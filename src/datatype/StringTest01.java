package datatype;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
//java.lang. *:

public class StringTest01 {

	public static void main(String[] args) throws IOException {
	
		Scanner sc = new Scanner(System.in); //system.in 경우 키보드 입력장치
		//클래스 : 변수, 메서드=기능(방법), 생성자
		
		int readData;
		
		//readData=System.in.read(); // 키보드에서 읽으라는 뜻
		//읽는것에 대해 저장공간을 만들 경우 read에 마우스 올릴시 int로 준다는 내용이 뜨며 이럴경우 
		//int로 메모리를 만들어주면 됌
		//read() 경우 메서드 , 뭐 뒤에 ()가 있으면 메서드인거 같음
		
		//console 창에 입력할 경우 아스키코드(유니코드)로 보임
		
		readData=sc.nextInt();//해당 코드 입력 시 숫자로 변형해서 보여줌
		System.out.println(readData);
	
	}

}
