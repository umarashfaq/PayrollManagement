package com.umar.payroll.view;

import java.beans.PropertyEditorSupport;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;

public class TimestampEditor extends PropertyEditorSupport {
	
	private DateFormat df;
	
	public TimestampEditor(DateFormat df) {
		this.df = df;
	}
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		try {
			Timestamp t = new Timestamp(df.parse(text).getTime());
			this.setValue(t);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String getAsText() {
		Timestamp t = (Timestamp) this.getValue();
		return t == null ? "" : df.format(t);
	}
	
}
