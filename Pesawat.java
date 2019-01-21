
public class Pesawat {
	
	//atribut
	int height;
	String maskapai;
	int speedvertical;
	int speedHorizontal;
	int fuel;
	boolean turnOnMachine;
	
	void flyAbility() {
		if (fuel <= 0) {
			System.out.println("Fuel is empty. You can't make it fly.");
		} else if (fuel <=100) {
			System.out.println("Fuel is low. Please refuel");
			machine();
		} else {
			machine();
		}
	}
	
	// Gagal
	void machine() {
		if (!turnOnMachine) {
			System.out.println("machine not active yet");
		} else {
			System.out.println("machine Starting....machine active");
			flycheck ();	
		}
	}
	
	void flycheck () {
//	maskapai = rnString();
	if (height >=100 && speedvertical > 0 || speedHorizontal > 0) {
		System.out.println("pesawat start moving.be careful.");
		heightAttention();
	} else {
		System.out.println("pesawat Already Active!");
		heightAttention();
	}
	
	
	}
	void heightAttention() {
		if (height <150 ) {
			
		}else if (height <=175) {
			System.out.println("Altitude Warning! Decrase Altitude");
		}else if (height >= 175) {
			System.out.println("Attention! Decrase Altitude Now!");
		}
	}
	
	
	
	String rnString () {
		return "boeing";
}
	

}
