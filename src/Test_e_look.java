package e_look;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test_e_look
{
	public static void main(String[] args)
	{
		Mailbox e_look_Mailbox=new Mailbox(new Estrategia_Priority());
		
		Date primera_fecha = null;
		Date segunda_fecha = null;
		Date tercera_fecha = null;
		try
		{
			primera_fecha = new SimpleDateFormat("yyyy-MM-dd").parse("2022-06-01");
			segunda_fecha = new SimpleDateFormat("yyyy-MM-dd").parse("2022-06-02");
			tercera_fecha = new SimpleDateFormat("yyyy-MM-dd").parse("2022-06-03");
		}
		catch (ParseException e)
		{
			e.printStackTrace();
		}

		Email primer_email=new Email("Manu","Planes","¿Que vas a hacer mañana para tu cumple?",primera_fecha,Priority.BAJA);
		Email segundo_email=new Email("Sergio","Esperadme","Que hay atasco y llego un poco tarde",segunda_fecha,Priority.ALTA);
		Email tercer_email=new Email("Miguel","Review","La fiesta fue perfect :)",tercera_fecha,Priority.MEDIA);
		
		e_look_Mailbox.mails.add(primer_email);
		e_look_Mailbox.mails.add(segundo_email);
		e_look_Mailbox.mails.add(tercer_email);
		
		e_look_Mailbox.show();
		
//		e_look_Mailbox.Orden = new Estrategia_Date();
	}

}