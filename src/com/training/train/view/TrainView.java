package com.training.train.view;

import com.training.train.bean.Train;
import com.training.train.logic.Logic;

import java.util.ArrayList;
import java.util.List;

public class TrainView {

    public void print(List<Train> depot) {
        for (Train train : depot) {
            System.out.println(train.getDestination() + " " + train.getNumber() + " " + train.getTime());
        }
        System.out.println();
    }

    public void print2(int number){
        ArrayList<Train> result = Logic.findByNumber(number);
        for (Train element: result){
            System.out.println(element);
        }
    }



}
