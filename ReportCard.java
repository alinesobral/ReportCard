package reportCardProject;

public class ReportCard {
	private String studentId;
	private String name;
	private double avgMath;
	private double avgEnglish;
	private double avgHistory;
	private double avgGeography;
	private double avgPhysics;
	private double avgChemistry;
	private double totalAvg;
	
	// default constructor
	public ReportCard(){};
	
	// overloaded constructor
	public ReportCard(String studentId, String name, double avgMath, double avgEnglish, double avgHistory,
			double avgGeography, double avgPhysics, double avgChemistry)
	{
		this.studentId = studentId;
		this.name = name;
		this.avgMath = avgMath;
		this.avgEnglish = avgEnglish;
		this.avgHistory = avgHistory;
		this.avgGeography = avgGeography;
		this.avgPhysics = avgPhysics;
		this.avgChemistry = avgChemistry;
	}
	
	// get student ID
	public String getStudentId()
	{
		return studentId;
	}
	
	// set student ID
	public void setStudentId(String studentId)
	{
		this.studentId = studentId;
	}
	
	// get student name
	public String getName()
	{
		return name;
	}
	
	// set student name
	public void setName(String name)
	{
		this.name = name;
	}
	
	// get Math's average grade
	public double getAvgMath()
	{
		return avgMath;
	}
	
	// set Math's average grade
	public void setAvgMath(double avgMath)
	{
		this.avgMath = avgMath;
	}
	
	// get English's average grade
	public double getAvgEnglish()
	{
		return avgEnglish;
	}
	
	// set English's average grade
	public void setAvgEnglish(double avgEnglish)
	{
		this.avgEnglish = avgEnglish;
	}
	
	// get History's average grade
	public double getAvgHistory()
	{
		return avgHistory;
	}
	
	// set History's average grade
	public void setAvgHistory(double avgHistory)
	{
		this.avgHistory = avgHistory;
	}
	
	// get Geography's average grade
	public double getAvgGeography()
	{
		return avgGeography;
	}
	
	// set Geography's average grade
	public void setAvgGeography(double avgGeography)
	{
		this.avgGeography = avgGeography;
	}
	
	// get Physics' average grade
	public double getAvgPhysics()
	{
		return avgPhysics;
	}
	
	// set Physics' average grade
	public void setAvgPhysics(double avgPhysics)
	{
		this.avgPhysics = avgPhysics;
	}
	
	// get Chemistry's average grade
	public double getAvgChemistry()
	{
		return avgChemistry;
	}
	
	// set Chemistry's average grade
	public void setAvgChemistry(double avgChemistry)
	{
		this.avgChemistry = avgChemistry;
	}
	
	// get total average grade
	public double getTotalAvg()
	{
		// Round up the result to 2 decimal places and type cast it as a double 
		// so it can be stored in the totalAvg variable
		totalAvg = (double) Math.round((avgMath + avgEnglish + avgHistory + avgGeography + avgPhysics + avgChemistry)/6 * 100)/100;
		return totalAvg;
	}
	
	@Override
	public String toString()
	{
		return "REPORT CARD" +
				"\nStudent: " + name + 
				"\nStudent Id: " + studentId +
				"\n\t -" +
				"\nMathematics: " + avgMath +
				"\nEnglish: " + avgEnglish +
				"\nHistory: " + avgHistory +
				"\nGeography: " + avgGeography +
				"\nPhysics: " + avgPhysics +
				"\nChemistry: " + avgChemistry +
				"\n\t - " +
				"\nTOTAL: " + getTotalAvg();
	}
}
