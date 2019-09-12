import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Datas {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date data = Date.from(Instant.parse("2019-09-12T15:55:00Z"));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		//ADICIONANDO HORA EM UMA DATA
		//cal.add(Calendar.HOUR_OF_DAY, 10);
		//data = cal.getTime();
		
		int min = cal.get(Calendar.MINUTE);
		int hora = cal.get(Calendar.HOUR);
		int seg = cal.get(Calendar.SECOND);
		
		System.out.println("Data: " + sdf.format(data));
		System.out.println("Hora: " + hora);
		System.out.println("Minutos: " + min);
		System.out.println("Segundos: " + seg);
		
		
	}

}
