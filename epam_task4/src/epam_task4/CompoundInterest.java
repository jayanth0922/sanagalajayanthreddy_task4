package epam_task4;
public class CompoundInterest{
	public double calculate_Compound_Interest(double p,double t,double r,double n)
	{
		return (p*(Math.pow((1+r/(n*100)),n*t)));
	}

}