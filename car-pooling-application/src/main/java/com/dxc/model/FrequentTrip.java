package com.dxc.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
@Entity
public class FrequentTrip implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer ftripId; 
	private String origin;
	private String destination ;

	private String  startDate ;
	
	private String finishDate;
	private int amount;
	private String driverId;
	@JsonFormat(pattern="HH:MM")
	private String depTime;
	
	public FrequentTrip() {
		super();
	}
	public FrequentTrip(String string, HttpStatus ok) {
		super();
	}
	public FrequentTrip(Integer ftripId, String origin, String destination, String startDate, String finishDate,
			int amount, String driverId, String depTime) {
		super();
		this.ftripId = ftripId;
		this.origin = origin;
		this.destination = destination;
		this.startDate = startDate;
		this.finishDate = finishDate;
		this.amount = amount;
		this.driverId = driverId;
		this.depTime = depTime;
	}
	public Integer getFtripId() {
		return ftripId;
	}
	public void setFtripId(Integer ftripId) {
		this.ftripId = ftripId;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getFinishDate() {
		return finishDate;
	}
	public void setFinishDate(String finishDate) {
		this.finishDate = finishDate;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDriverId() {
		return driverId;
	}
	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}
	public String getDepTime() {
		return depTime;
	}
	public void setDepTime(String depTime) {
		this.depTime = depTime;
	}
	@Override
	public String toString() {
		return "FrequentTrip [ftripId=" + ftripId + ", origin=" + origin + ", destination=" + destination
				+ ", startDate=" + startDate + ", finishDate=" + finishDate + ", amount=" + amount + ", driverId="
				+ driverId + ", depTime=" + depTime + "]";
	}
	
}