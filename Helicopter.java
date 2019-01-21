package project;

public class Helicopter {
	
	//atribut
	int height;
	String maskapai;
	int speedVertical;
	int speedHorizontal;
	int fuel;
	boolean turnOn;
	
	void flyAbility() {
		if (fuel <= 0) {
			System.out.println("the gasoline has run out.You can't make it fly");
		} else if (fuel <=75) {
			System.out.println("Fuel is low. Please refuel");
			engine();
		} else {
			engine();
		}
	}
	
	void engine() {
		if (!turnOn) {
			System.out.println("engine is not active");
		} else {
			System.out.println("the helicopter is already on");
			flycheck ();	
		}
	}
	
	void flycheck () {
	if (height >=85 && speedVertical > 50 || speedHorizontal > 0) {
		System.out.println("Helicopter is ready to fly.be careful");
		heightAttention();
	} else {
		System.out.println("Helicopter Already Active!");
		heightAttention();
	}
	
	
	}
	void heightAttention() {
		if (height <120 ) {
			
		}else if (height <=120) {
			System.out.println("Altitude Warning! Decrase Altitude");
		}else if (height >= 175) {
			System.out.println("Attention! Decrase Altitude Now!");
		}
	}
	
	
	
	String rnString () {
		return "pisjaki";
}
	

}


