package e_look;

public class Estrategia_Subject implements Estrategia
{
	public boolean before(Email m1, Email m2)
	{
		if(m1.subject.compareToIgnoreCase(m2.subject) < 0) // a negative integer, zero, or a positive integer as the specified String is greater than, equal to, or less than this String, ignoring case considerations
		{
			return true;
		}
		return false;
	}
}