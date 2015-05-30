package us.lsi

class RaceController {
	
	def scaffold = true
	
	def search = {
		flash.message = "Search results for: City = ${params.q}"
		def resultsMap = Race.findAllByCity(params.q,[max:5, order: "desc"])
		render(view:'list',
			   model:[
				 raceInstanceList:resultsMap,
				 raceInstanceTotal:resultsMap.size()
			   ]
		)
	  }
  
  }
