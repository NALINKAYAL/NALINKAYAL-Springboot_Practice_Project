package com.project1.p1.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Reports {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	int reportId;
	int reportedId;
	String reportedReason;
	int reportedBy;
	public int getReportId() {
		return reportId;
	}
	public void setReportId(int reportId) {
		this.reportId = reportId;
	}
	public int getReportedId() {
		return reportedId;
	}
	public void setReportedId(int reportedId) {
		this.reportedId = reportedId;
	}
	public String getReportedReason() {
		return reportedReason;
	}
	public void setReportedReason(String reportedReason) {
		this.reportedReason = reportedReason;
	}
	public int getReportedBy() {
		return reportedBy;
	}
	public void setReportedBy(int reportedBy) {
		this.reportedBy = reportedBy;
	}
	public Reports(int reportId, int reportedId, String reportedReason, int reportedBy) {
		super();
		this.reportId = reportId;
		this.reportedId = reportedId;
		this.reportedReason = reportedReason;
		this.reportedBy = reportedBy;
	}
	public Reports() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Reports [reportId=" + reportId + ", reportedId=" + reportedId + ", reportedReason=" + reportedReason
				+ ", reportedBy=" + reportedBy + "]";
	}
	
}