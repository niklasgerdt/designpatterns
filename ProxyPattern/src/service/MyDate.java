package service;

import java.io.Serializable;
import java.util.Date;

public class MyDate implements Serializable{
	/**
	 * Must be Serializable!
	 */
	private static final long serialVersionUID = -4654289710986617618L;
	private String date;
	
	public MyDate(Date _date){
		date = _date.toString();
	}
	
	public String getDateString(){
		return date;
	}
}
