package e_look;

public class Estrategia_Priority implements Estrategia
{
	public boolean before(Email m1, Email m2)
	{
		if(m1.priority.compareTo(m2.priority) < 0) // a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object
		{
			return true;
		}
		return false;
	}
}