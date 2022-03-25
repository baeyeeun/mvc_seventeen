package com.junefw.infra.modules.book;

import java.sql.Date;
import java.sql.Timestamp;

public class BookVo {
	
//	
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
	
//	Search
	private String shIfmmId;
    private String shIfmmName;
	private Integer shIfcgDelNy;

//	common
	private String shOption;
	private String shValue;
	
//	paging
	private int thisPage = 1;									
	private int rowNumToShow = 10;							
	private int pageNumToShow = 5;						

	private int totalRows;									
	private int totalPages;										
	private int startPage;								
	private int endPage;									
	
	private int startRnumForOracle = 1;						
	private int endRnumForOracle;							
	private Integer RNUM;
	
	private int startRnumForMysql = 0;							
//------------
	
	public void setParamsPaging(int totalRowsParam) {
		
		totalRows = totalRowsParam;

		totalPages = totalRows / rowNumToShow;

		if (totalRows % rowNumToShow > 0) {
			totalPages = totalPages+ 1;
		}

		if (totalPages < thisPage) {
			thisPage = totalPages;
		}
		
		startPage = (((thisPage - 1) / pageNumToShow) * pageNumToShow + 1);

		endPage = (startPage + pageNumToShow - 1);

		if (endPage > totalPages) {
			endPage = (totalPages);
		}
		
		endRnumForOracle = ((rowNumToShow * thisPage));
		startRnumForOracle = ((endRnumForOracle - rowNumToShow) + 1);
		if (startRnumForOracle < 1) startRnumForOracle = 1;
		
		
		if (thisPage == 1) {
			startRnumForMysql = 0;
		} else {
			startRnumForMysql = ((rowNumToShow * (thisPage-1)));
		}
		
		System.out.println("getThisPage():" + thisPage);
		System.out.println("getTotalRows():" + totalRows);
		System.out.println("getRowNumToShow():" + rowNumToShow);
		System.out.println("getTotalPages():" + totalPages);
		System.out.println("getStartPage():" + startPage);
		System.out.println("getEndPage():" + endPage);		
		System.out.println("getStartRnumForOracle():" + startRnumForOracle);
		System.out.println("getEndRnumForOracle():" + endRnumForOracle);
		System.out.println("getStartRnumForMysql(): " + startRnumForMysql);
		
	}

	public String getBkadSeq() {
		return bkadSeq;
	}

	public void setBkadSeq(String bkadSeq) {
		this.bkadSeq = bkadSeq;
	}

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

	public String getShIfmmId() {
		return shIfmmId;
	}

	public void setShIfmmId(String shIfmmId) {
		this.shIfmmId = shIfmmId;
	}

	public String getShIfmmName() {
		return shIfmmName;
	}

	public void setShIfmmName(String shIfmmName) {
		this.shIfmmName = shIfmmName;
	}

	public Integer getShIfcgDelNy() {
		return shIfcgDelNy;
	}

	public void setShIfcgDelNy(Integer shIfcgDelNy) {
		this.shIfcgDelNy = shIfcgDelNy;
	}

	public String getShOption() {
		return shOption;
	}

	public void setShOption(String shOption) {
		this.shOption = shOption;
	}

	public String getShValue() {
		return shValue;
	}

	public void setShValue(String shValue) {
		this.shValue = shValue;
	}

	public int getThisPage() {
		return thisPage;
	}

	public void setThisPage(int thisPage) {
		this.thisPage = thisPage;
	}

	public int getRowNumToShow() {
		return rowNumToShow;
	}

	public void setRowNumToShow(int rowNumToShow) {
		this.rowNumToShow = rowNumToShow;
	}

	public int getPageNumToShow() {
		return pageNumToShow;
	}

	public void setPageNumToShow(int pageNumToShow) {
		this.pageNumToShow = pageNumToShow;
	}

	public int getTotalRows() {
		return totalRows;
	}

	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public int getStartRnumForOracle() {
		return startRnumForOracle;
	}

	public void setStartRnumForOracle(int startRnumForOracle) {
		this.startRnumForOracle = startRnumForOracle;
	}

	public int getEndRnumForOracle() {
		return endRnumForOracle;
	}

	public void setEndRnumForOracle(int endRnumForOracle) {
		this.endRnumForOracle = endRnumForOracle;
	}

	public Integer getRNUM() {
		return RNUM;
	}

	public void setRNUM(Integer rNUM) {
		RNUM = rNUM;
	}

	public int getStartRnumForMysql() {
		return startRnumForMysql;
	}

	public void setStartRnumForMysql(int startRnumForMysql) {
		this.startRnumForMysql = startRnumForMysql;
	}


	
}
