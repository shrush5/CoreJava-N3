package org.tnsif.encapsulationdata;

public class HDFC {
	private int pin;
	
	void accept()
	{
		System.out.println("Enter the ATM pin Please : "+pin);
	}
	
	
    //getter and setter
	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
	

}
