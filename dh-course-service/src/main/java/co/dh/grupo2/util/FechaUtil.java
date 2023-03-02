package co.dh.grupo2.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class FechaUtil {

	public static Date castearStringToDate(String fecha) {
		java.util.TimeZone timeZone = TimeZone.getTimeZone("America/Bogota");
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		formatter.setTimeZone(timeZone);
		Date date = null;
		try {
			date = formatter.parse(fecha);
		} catch (ParseException e) {
			System.out.println("castearStringToDate: Error al castear la fecha");
		}
		return date;
	}

}
