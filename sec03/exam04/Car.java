package sec03.exam04;

public class Car {
		//필드
		String company = "현대자동차";
		String model;
		String color;
		int maxSpeed;
		String people;
		
		//생성자
		Car(){
			
		}
		Car(String model){
			this(model, null, 0, null);
		}
		
		Car(String model, String color){
			this(model, color, 0, null);
		}
		
		Car(String model, String color, int maxSpeed) {
			this(model, color, 0, null);
		}
			
		Car(String model, String color, int maxSpeed, String people){
			this.model = model;
			this.color = color;
			this.maxSpeed = maxSpeed;
			this.people = people;
			
			
		}

	}

