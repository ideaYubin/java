package sec03.exam02;

public class Korean {
	//필드
	String nation = "대한민국";
	String name;
	String ssn;
	
	//생성자
	// public Korean(String n, String s) { //n, s = 매개변수명, 작업자 입장에서 값을 유추하기 어려움, 
	//	name = n; // 대입연산자를 통해 name -> String name을 뜻함. 생성자를 통한 초기화 완료.
	//	ssn = s; // 초기화 완료되면 Korean 의 필드초기화 완료됨.
	

	public Korean(String name, String ssn){
	this.name = name; //- name이나 ssn 의 매개변수명이 동일하기 때문에 지금 만들고 있는 객체안에 필드에 this. 을 붙여 지금 생성된다는 것을 구분시키기. 
	this.ssn = ssn;
	
}
	
}
