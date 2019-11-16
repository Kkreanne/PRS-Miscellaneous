package com.maxTrainBootcamp.prs.request;

import java.util.Date;

import javax.persistence.*;

import com.maxTrainBootcamp.prs.user.User;

@Entity
@Table
public class Request {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(length=100, nullable=false)
	private String description;
	@Column(length=255, nullable=false)
	private String justification;
	@Column()
	private Date dateNeeded;
	@Column(length=25, nullable=false)
	private String deliveryMode;
	@Column(length=20, nullable=false)
	private String status;
	@Column(columnDefinition="decimal(10, 2) NOT NULL DEFAULT 0.0")
	private double total;
	@Column
	private Date submittedDate;
	@Column(length=100, nullable=true)
	private String reasonForRejection;
	@ManyToOne(optional=false)
	@JoinColumn(name="userId")
	private User user;
	
	public Request() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getJustification() {
		return justification;
	}

	public void setJustification(String justification) {
		this.justification = justification;
	}

	public Date getDateNeeded() {
		return dateNeeded;
	}

	public void setDateNeeded(Date dateNeeded) {
		this.dateNeeded = dateNeeded;
	}

	public String getDeliveryMode() {
		return deliveryMode;
	}

	public void setDeliveryMode(String deliveryMode) {
		this.deliveryMode = deliveryMode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Date getSubmittedDate() {
		return submittedDate;
	}

	public void setSubmittedDate(Date submittedDate) {
		this.submittedDate = submittedDate;
	}

	public String getReasonForRejection() {
		return reasonForRejection;
	}

	public void setReasonForRejection(String reasonForRejection) {
		this.reasonForRejection = reasonForRejection;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
