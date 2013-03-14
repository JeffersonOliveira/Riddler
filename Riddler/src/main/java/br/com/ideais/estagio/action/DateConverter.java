package br.com.ideais.estagio.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

public class DateConverter extends StrutsTypeConverter{


	public Object convertFromString(Map context, String[] value, Class toClass) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;
		System.out.println("========================= ================\n chamei o converter!!!!!!");
		try {
			date = sdf.parse(value[0]);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public String convertToString(Map context, Object o) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(o);
	}

}
