package com.junefw.infra.modules.book;

import java.sql.Date;
import java.sql.Timestamp;

public class Book {

private String bkadSeq;

private String bkadName;
private String bkadSub;
private String bkadWriter;
private String Publisher;
private Date bkadPubDate;
private Integer bkadSales;
private Integer bkadPrice;

private String bkadCharge;

private Integer bkadPage;
private Integer bkadWeight;
private Integer bkadSize;
	
private Integer bkadIsbn13;
private Integer bkadIsbn10;

private Integer bkadDelNy;
private String bkadDesc;

private Date bkadUpdate;

private String bkbrImages;
private String bkbrMove;
private String bkbrPosition;
private Integer bkbrDelNy;

private String bkltMark;
private Integer bkltReviewCount;
private Timestamp bkltDate;
private String bkltDesc;
private Integer bkltDelNy;

private String bknsImages;
private String bknsMove;
private String bknsPosition;
private Integer bknsDelNy;

private String bkrwPubReview;
private String bkrwMemberReview;
private String bkrwMemberId;
private Timestamp bkrwReviewDate;
private Integer bkrwRecommend;
private Integer bkrwMark;
private String bkrwDesc;
private Integer bkrwDelNy;


public String getBkadName() {
	return bkadName;
}
public void setBkadName(String bkadName) {
	this.bkadName = bkadName;
}
public String getBkadSub() {
	return bkadSub;
}
public void setBkadSub(String bkadSub) {
	this.bkadSub = bkadSub;
}
public String getBkadWriter() {
	return bkadWriter;
}
public void setBkadWriter(String bkadWriter) {
	this.bkadWriter = bkadWriter;
}
public String getPublisher() {
	return Publisher;
}
public void setPublisher(String publisher) {
	Publisher = publisher;
}
public Date getBkadPubDate() {
	return bkadPubDate;
}
public void setBkadPubDate(Date bkadPubDate) {
	this.bkadPubDate = bkadPubDate;
}
public Integer getBkadSales() {
	return bkadSales;
}
public void setBkadSales(Integer bkadSales) {
	this.bkadSales = bkadSales;
}
public Integer getBkadPrice() {
	return bkadPrice;
}
public void setBkadPrice(Integer bkadPrice) {
	this.bkadPrice = bkadPrice;
}
public String getBkadCharge() {
	return bkadCharge;
}
public void setBkadCharge(String bkadCharge) {
	this.bkadCharge = bkadCharge;
}
public Integer getBkadPage() {
	return bkadPage;
}
public void setBkadPage(Integer bkadPage) {
	this.bkadPage = bkadPage;
}
public Integer getBkadWeight() {
	return bkadWeight;
}
public void setBkadWeight(Integer bkadWeight) {
	this.bkadWeight = bkadWeight;
}
public Integer getBkadSize() {
	return bkadSize;
}
public void setBkadSize(Integer bkadSize) {
	this.bkadSize = bkadSize;
}
public Integer getBkadIsbn13() {
	return bkadIsbn13;
}
public void setBkadIsbn13(Integer bkadIsbn13) {
	this.bkadIsbn13 = bkadIsbn13;
}
public Integer getBkadIsbn10() {
	return bkadIsbn10;
}
public void setBkadIsbn10(Integer bkadIsbn10) {
	this.bkadIsbn10 = bkadIsbn10;
}
public Integer getBkadDelNy() {
	return bkadDelNy;
}
public void setBkadDelNy(Integer bkadDelNy) {
	this.bkadDelNy = bkadDelNy;
}
public String getBkadDesc() {
	return bkadDesc;
}
public void setBkadDesc(String bkadDesc) {
	this.bkadDesc = bkadDesc;
}
public Date getBkadUpdate() {
	return bkadUpdate;
}
public void setBkadUpdate(Date bkadUpdate) {
	this.bkadUpdate = bkadUpdate;
}
public String getBkbrImages() {
	return bkbrImages;
}
public void setBkbrImages(String bkbrImages) {
	this.bkbrImages = bkbrImages;
}
public String getBkbrMove() {
	return bkbrMove;
}
public void setBkbrMove(String bkbrMove) {
	this.bkbrMove = bkbrMove;
}
public String getBkbrPosition() {
	return bkbrPosition;
}
public void setBkbrPosition(String bkbrPosition) {
	this.bkbrPosition = bkbrPosition;
}
public Integer getBkbrDelNy() {
	return bkbrDelNy;
}
public void setBkbrDelNy(Integer bkbrDelNy) {
	this.bkbrDelNy = bkbrDelNy;
}
public String getBkltMark() {
	return bkltMark;
}
public void setBkltMark(String bkltMark) {
	this.bkltMark = bkltMark;
}
public Integer getBkltReviewCount() {
	return bkltReviewCount;
}
public void setBkltReviewCount(Integer bkltReviewCount) {
	this.bkltReviewCount = bkltReviewCount;
}
public Timestamp getBkltDate() {
	return bkltDate;
}
public void setBkltDate(Timestamp bkltDate) {
	this.bkltDate = bkltDate;
}
public String getBkltDesc() {
	return bkltDesc;
}
public void setBkltDesc(String bkltDesc) {
	this.bkltDesc = bkltDesc;
}
public Integer getBkltDelNy() {
	return bkltDelNy;
}
public void setBkltDelNy(Integer bkltDelNy) {
	this.bkltDelNy = bkltDelNy;
}
public String getBknsImages() {
	return bknsImages;
}
public void setBknsImages(String bknsImages) {
	this.bknsImages = bknsImages;
}
public String getBknsMove() {
	return bknsMove;
}
public void setBknsMove(String bknsMove) {
	this.bknsMove = bknsMove;
}
public String getBknsPosition() {
	return bknsPosition;
}
public void setBknsPosition(String bknsPosition) {
	this.bknsPosition = bknsPosition;
}
public Integer getBknsDelNy() {
	return bknsDelNy;
}
public void setBknsDelNy(Integer bknsDelNy) {
	this.bknsDelNy = bknsDelNy;
}
public String getBkrwPubReview() {
	return bkrwPubReview;
}
public void setBkrwPubReview(String bkrwPubReview) {
	this.bkrwPubReview = bkrwPubReview;
}
public String getBkrwMemberReview() {
	return bkrwMemberReview;
}
public void setBkrwMemberReview(String bkrwMemberReview) {
	this.bkrwMemberReview = bkrwMemberReview;
}
public String getBkrwMemberId() {
	return bkrwMemberId;
}
public void setBkrwMemberId(String bkrwMemberId) {
	this.bkrwMemberId = bkrwMemberId;
}
public Timestamp getBkrwReviewDate() {
	return bkrwReviewDate;
}
public void setBkrwReviewDate(Timestamp bkrwReviewDate) {
	this.bkrwReviewDate = bkrwReviewDate;
}
public Integer getBkrwRecommend() {
	return bkrwRecommend;
}
public void setBkrwRecommend(Integer bkrwRecommend) {
	this.bkrwRecommend = bkrwRecommend;
}
public Integer getBkrwMark() {
	return bkrwMark;
}
public void setBkrwMark(Integer bkrwMark) {
	this.bkrwMark = bkrwMark;
}
public String getBkrwDesc() {
	return bkrwDesc;
}
public void setBkrwDesc(String bkrwDesc) {
	this.bkrwDesc = bkrwDesc;
}
public Integer getBkrwDelNy() {
	return bkrwDelNy;
}
public void setBkrwDelNy(Integer bkrwDelNy) {
	this.bkrwDelNy = bkrwDelNy;
}
public String getBkadSeq() {
	return bkadSeq;
}
public void setBkadSeq(String bkadSeq) {
	this.bkadSeq = bkadSeq;
}


}
