package e_look;

public class Estrategia_Text implements Estrategia
{
	public boolean before(Email m1, Email m2)
	{
		if(m1.text.compareToIgnoreCase(m2.text) < 0)
		{
			return true;
		}
		return false;
	}
}