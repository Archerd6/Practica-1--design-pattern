package e_look;

import java.util.ArrayList;
import java.util.Iterator;

public class Mailbox
{
	ArrayList<Email> mails;
	Estrategia orden_a_seguir;
	
	public Mailbox(Estrategia orden_inicial)
	{
		mails = new ArrayList<Email>();
		orden_a_seguir=orden_inicial;
	}
	
	/**Muestra por terminal los mails*/
	public void show()
	{
		sort();
		Iterator<Email> iter = mails.iterator();
		while(iter.hasNext())
		{
			String email_x = iter.next().toString();
			System.out.println(email_x);
		}
	}

	/**Usa el algoritmo de ordenacion bubble sort*/
	private void sort()
	{
		for (int i = 0; i < mails.size()-1; i++)
            for (int j = 0; j < mails.size()-i - 1; j++)
				 if ( this.before(mails.get(j),mails.get(j+1)) )
				 {
					 // intercambiar los mensajes j y j-1 
					 Email temp = mails.get(j);
					 mails.set(j, mails.get(j+1));
					 mails.set(j+1, temp);
					 
				 }	 
			 
		 
	}
	
	/**¿Esta antes el email m1 que el m2?*/
	private boolean before(Email m1, Email m2)
	{
		return orden_a_seguir.before(m1, m2);
	}

}