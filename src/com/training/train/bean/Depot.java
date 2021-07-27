package com.training.train.bean;

import java.util.ArrayList;
import java.util.List;

public class Depot {
	
	private  List <Train> depot;
	
	public Depot() {
		
		depot = new ArrayList<Train>();
				
	}

	public List<Train> getDepot() {

		return depot;
	}

	public void setDepot(List<Train> depot) {

		this.depot = depot;
	}
	
	
	public void add(Train tr) { 

		depot.add(tr);
	}
	 

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((depot == null) ? 0 : depot.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Depot other = (Depot) obj;
		if (depot == null) {
			if (other.depot != null)
				return false;
		} else if (!depot.equals(other.depot))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Depot [Depot=" + depot + "]";
	}
	
	

}
