package com.training.train.main;

import com.training.train.bean.Train;
import com.training.train.view.TrainView;
import com.training.train.logic.Logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Train> depot = new ArrayList<Train>();
		
		depot.add(new Train("Moscow", 3, 10));
		depot.add(new Train("Moscow", 4, 8));
		depot.add(new Train("Minsk",  1, 11));
		depot.add(new Train("Anapa",  5, 12));
		depot.add(new Train("Minsk",  2, 7));


		
		TrainView view = new TrainView();
		 

		Collections.sort(depot, new Logic.TrainSortByNumber());

		view.print(depot);

		Collections.sort(depot, new Logic.TrainSortByDestination());

		view.print(depot);
												
	}

}
