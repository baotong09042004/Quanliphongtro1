package model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Fomart {
	public static Date covertStringToDate(String text) {
	      DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		  try {
			return dateFormat.parse(text);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public static java.sql.Date covertDateToDateSql(Date d) {
		// TODO Auto-generated method stub
		return new java.sql.Date(d.getTime());
	}
}
