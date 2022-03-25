package com.junefw.infra.modules.book;

import java.sql.Date;

public class BookVo {
	
//	
	private String bkadSeq;

	private String bkadName;
	private String bkadSub;
	private String bkadWriter;
	private String bkadPublisher;
	private String bkadPainter;
	private String bkadTranslator;
	private String bkadPubDate;
	private String bkadSales;
	private String bkadPrice;
	private String bkadExplain;

	private String bkadCharge;

	private String bkadPage;
	private String bkadWeight;
	private String bkadSize;
		
	private String bkadIsbn13;
	private String bkadIsbn10;

	private Integer bkadDelNy;
	private String bkadDesc;

	private Date bkadUpdate;

	private String bkbrImages;
	private String bkbrMove;
	private String bkbrPosition;
	private Integer bkbrDelNy;

	private String bkltMark;
	private Integer bkltReviewCount;
	private Date bkltDate;
	private String bkltDesc;
	private Integer bkltDelNy;

	private String bknsImages;
	private String bknsMove;
	private String bknsPosition;
	private Integer bknsDelNy;

	private String bkrwPubReview1;
	private String bkrwPubReview2;
	private String bkrwMemberReview;
	private String bkrwMemberId;
	private Date bkrwReviewDate;
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

	public String getBkadPublisher() {
		return bkadPublisher;
	}

	public void setBkadPublisher(String bkadPublisher) {
		this.bkadPublisher = bkadPublisher;
	}

	public String getBkadPubDate() {
		return bkadPubDate;
	}

	public void setBkadPubDate(String bkadPubDate) {
		this.bkadPubDate = bkadPubDate;
	}

	public String getBkadSales() {
		return bkadSales;
	}

	public void setBkadSales(String bkadSales) {
		this.bkadSales = bkadSales;
	}

	public String getBkadPrice() {
		return bkadPrice;
	}

	public void setBkadPrice(String bkadPrice) {
		this.bkadPrice = bkadPrice;
	}

	public String getBkadCharge() {
		return bkadCharge;
	}

	public void setBkadCharge(String bkadCharge) {
		this.bkadCharge = bkadCharge;
	}



	public String getBkadPage() {
		return bkadPage;
	}

	public void setBkadPage(String bkadPage) {
		this.bkadPage = bkadPage;
	}

	public String getBkadWeight() {
		return bkadWeight;
	}

	public void setBkadWeight(String bkadWeight) {
		this.bkadWeight = bkadWeight;
	}

	public String getBkadSize() {
		return bkadSize;
	}

	public void setBkadSize(String bkadSize) {
		this.bkadSize = bkadSize;
	}

	public String getBkadIsbn13() {
		return bkadIsbn13;
	}

	public void setBkadIsbn13(String bkadIsbn13) {
		this.bkadIsbn13 = bkadIsbn13;
	}

	public String getBkadIsbn10() {
		return bkadIsbn10;
	}

	public void setBkadIsbn10(String bkadIsbn10) {
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

	public Date getBkltDate() {
		return bkltDate;
	}

	public void setBkltDate(Date bkltDate) {
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

	

	public String getBkrwPubReview1() {
		return bkrwPubReview1;
	}

	public void setBkrwPubReview1(String bkrwPubReview1) {
		this.bkrwPubReview1 = bkrwPubReview1;
	}

	public String getBkrwPubReview2() {
		return bkrwPubReview2;
	}

	public void setBkrwPubReview2(String bkrwPubReview2) {
		this.bkrwPubReview2 = bkrwPubReview2;
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

	public Date getBkrwReviewDate() {
		return bkrwReviewDate;
	}

	public void setBkrwReviewDate(Date bkrwReviewDate) {
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

	public String getBkadExplain() {
		return bkadExplain;
	}

	public void setBkadExplain(String bkadExplain) {
		this.bkadExplain = bkadExplain;
	}

	public String getBkadPainter() {
		return bkadPainter;
	}

	public void setBkadPainter(String bkadPainter) {
		this.bkadPainter = bkadPainter;
	}

	public String getBkadTranslator() {
		return bkadTranslator;
	}

	public void setBkadTranslator(String bkadTranslator) {
		this.bkadTranslator = bkadTranslator;
	}


}
