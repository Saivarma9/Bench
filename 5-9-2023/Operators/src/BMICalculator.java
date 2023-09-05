
public class BMICalculator {

	public static void main(String[] args) {
		
	//BMI = Weight in KG /(height*height) in meters ;
		
		double height = 5.11;
		
		double weight = 68;      
		
		double heightInMeters = height*0.4536;
		
		double bmi = weight/(heightInMeters*heightInMeters);
		
		System.out.println("BMI Is " +	 bmi);
	
	}
}

		