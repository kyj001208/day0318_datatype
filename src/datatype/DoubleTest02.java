package datatype;

public class DoubleTest02 {

	public static void main(String[] args) {
		
		float sum=0;
		//(1.4 * 10^-46~  3.4 * 10^38)
		//정수형, 실수형 메모리에 저장하는 방식이 다름 (데이터 크기 기준으로는 실수형이 더 많이 저장 가능)
		
		for(int i=0;i<10;i++) {
		//i 변수가 0부터 1씩 증가하면서 10이 되기전까지 {}반복하라는 뜻
		//for경우는 메서드가 아닌 키워드 	
			
			sum = sum + 0.1f;
			// (공간/변수)=(값) / 오른쪽 값을 왼쪽 공간에 넣으시오
			
			
		}
		
		System.out.println("0.1f를 10번 더한 결과" +sum);
		//위와 같이 실행 할 경우 1.000001이 나오면 아래처럼 변경 시 범위를 설정하여 표현 가능
		//System.out.printf("0.1f를 10번 더한결과: %.6f",sum); // 1.0f 나올 예정
		//%.6f경우 숫자를 변경하여 몇자리로 표현할지 설정 가능
	}

}
