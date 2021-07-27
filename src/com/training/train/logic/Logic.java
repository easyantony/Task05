package com.training.train.logic;

import com.training.train.bean.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import com.training.train.main.*;
public class Logic {

	

	public static ArrayList<Train> findByNumber (int number){
		ArrayList<Train> result = new ArrayList<Train>();
		for (Train element : depot){
			if(element.getNumber() == number){
				result.add(element);
			}
		}
		return result;
	}

	public static class TrainSortByNumber implements Comparator<Train> {

		@Override
		public int compare(Train o1, Train o2) {
			return o1.getNumber() - o2.getNumber();
		}
	}

	public static class TrainSortByDestination implements Comparator<Train> {


		@Override
		public int compare(Train o1, Train o2) {
				if(o1.getDestination().compareTo(o2.getDestination()) !=0) {
				return o1.getDestination().compareTo(o2.getDestination());
									
			}
			return o1.getTime() - o2.getTime();
	}
	}


}






