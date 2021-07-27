package com.training.train.bean;

import java.util.Objects;

public class Train {
	
	private String destination;
	private int number;
	private int time;



	public Train (String destination, int number, int time){
	
		this.destination = destination;
		this.number = number;
		this.time = time;
	}



	public String getDestination() {

		return destination;
	}



	public void setDestination(String destination) {

		this.destination = destination;
	}



	public int getNumber() {

		return number;
	}



	public void setNumber(int number) {
		this.number = number;
	}



	public int getTime() {
		return time;
	}



	public void setTime(int time) {
		this.time = time;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Train train = (Train) o;
		return number == train.number && time == train.time && destination.equals(train.destination);
	}

	@Override
	public int hashCode() {
		return Objects.hash(destination, number, time);
	}

	@Override
	public String toString() {
		return "Train{" +
				"destination='" + destination + '\'' +
				", number=" + number +
				", time=" + time +
				'}';
	}
}