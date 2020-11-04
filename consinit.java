class Car{
	final int speed; // blank final keyword

	Car() //Constructor
	{
		speed=125;  
		System.out.println("Speed of the car is "+speed);
	}
	public static void main(String[] args) {
		new Car();  // obj of the Car
	}
}