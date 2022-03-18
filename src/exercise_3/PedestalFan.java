package exercise_3;

class Guard {
	String guardMaterial;
}

class MetalGuard extends Guard {
	public MetalGuard() {
		this.guardMaterial = "Iron";
	}
}

class Blade {
	int fins;
	String bladeMaterial;
}

class PlasticBlade extends Blade {
	public PlasticBlade() {
		this.bladeMaterial = "Plastic";
	}
}

class Stand {
	String standMaterial;
}

class MetalStand extends Stand {
	public MetalStand() {
		this.standMaterial = "Iron";
	}
}

abstract class Motor {
	int horsePower;
	String motorType;
	int motorSpeed = 0;

	public Motor(int hp) {
		this.horsePower = hp;
	}

	public abstract void updateSpeed();

}

class ElectricMotor extends Motor {
	int powerInput;

	public ElectricMotor(int hp) {
		super(hp);
		this.motorType = "Electric Motor";
	}

	@Override
	public void updateSpeed() {
		this.motorSpeed = powerInput * this.horsePower;
	}

	public void updatePowerInput(int powerInput) {
		this.powerInput = powerInput;
		updateSpeed();
	}

}

class Regulator {
	int speedLevel;
	int[] speedSettings;
	int powerOutput;

	public Regulator(int[] speedSettings) {
		this.speedSettings = speedSettings;
	}

	public void changePowerOutput() {
		powerOutput = speedSettings[speedLevel];
	}

	public void updateSpeedLevel(int speedLevel) {
		this.speedLevel = speedLevel;
		changePowerOutput();
	}

}

class Fan {
	Motor motor;
	Blade blade;
	Regulator regulator;

	int maxSpeed;
	int fanSpeed;

	public Fan(Motor motor, Blade blade, Regulator regulator, int maxSpeed) {
		this.motor = motor;
		this.blade = blade;
		this.regulator = regulator;
		this.maxSpeed = maxSpeed;
		this.fanSpeed = 0;
	}

	private void updatefanSpeed() {
		this.fanSpeed %= (this.maxSpeed + 1);
	}

	public void increaseFanSpeed() {
		this.fanSpeed++;
		updatefanSpeed();
	}

	public void decreaseFanSpeed() {
		if (this.fanSpeed == 0) {
			this.fanSpeed = this.maxSpeed;
		} else {
			this.fanSpeed--;
		}
		updatefanSpeed();
	}
}

public class PedestalFan extends Fan {
	Stand stand;
	Guard guard;

	public PedestalFan(Motor motor, Blade blade, Regulator regulator, int maxSpeed, Stand stand, Guard guard) {
		super(motor, blade, regulator, maxSpeed);
		this.stand = stand;
		this.guard = guard;
	}

	public static void main(String[] args) {

	}
}
