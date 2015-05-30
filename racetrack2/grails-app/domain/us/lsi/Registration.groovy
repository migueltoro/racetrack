package us.lsi

import java.util.Date;

class Registration {
	static constraints = {
	  race()
	  runner()
	  paid()
	  dateCreated()
	}
	 
	static belongsTo = [race:Race, runner:Runner]
   
	Boolean paid
	Date dateCreated
  }
  