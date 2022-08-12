package sec04.exam04;

public class Calculator {
	//필드
	//생성자
	//메소드
	int plus(int x, int y) { // 3. plus에 호출된 x, y값을 넣어 x+y진행   
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) { // 2. avg에 넣은 x,y를 plus에 호출 
		double sum = plus(x, y);
		double result = sum / 2; // 4. x+y 값에 /2를 진행
		return result;
	}
	
	void execute() {
		double result = avg(7, 10); // 1. avg x = 7, avg y = 10로 double avg 에 값을 전달(void)
		println("실행결과: " + result);
	}
	void println(String message) { //"실행결과"+ result가 문자열이므로 String 메시지로 출력
		System.out.println(message); //해당 값을 전달한 execute로 돌아감.
	}

}
