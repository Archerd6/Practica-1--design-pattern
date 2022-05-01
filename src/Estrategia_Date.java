package e_look;

public class Estrategia_Date implements Estrategia
{
	public boolean before(Email m1, Email m2)
	{
		if(m1.date.compareTo(m2.date) < 0) // the value 0 if the argument Date is equal to this Date; a value less than 0 if this Date is before the Date argument; and a value greater than 0 if this Date is after the Date argument
		{
			return false;
		}
		return true;
	}
}
