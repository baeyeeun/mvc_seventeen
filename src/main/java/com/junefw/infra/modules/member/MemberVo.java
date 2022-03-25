package com.junefw.infra.modules.member;

public class MemberVo {
	
//	
	private String ifmmSeq;
	
	private String ifmmId;
	private String ifmmName;
	private Integer ifmmAdminNy;
	private Integer ifmmDelNy;
	private String ifmmDesc;
	
	private Integer ifmaDefaultNy;
	private Integer ifmaTypeCd;
	private String ifmaTitle;
	private String ifmaAddress1;
	private String ifmaAddress2;
	private String ifmaZipCode;
	private Integer ifmaDelNy;
	private String ifmaDesc;

	private Integer ifmeDefaultNy;
	private Integer ifmeTypeCd;
	private String ifmeEmailFull;
	private String ifmeAccount;
	private String ifmeDomain;
	private Integer ifmeDelNy;
	private String ifmeDesc;	

	private Integer ifmpDefaultNy;
	private Integer ifmpTypeCd;
	private Integer ifmpDeviceCd;
	private Integer ifmpTelecomCd;
	private String ifmpNumber;
	private Integer ifmpDelNy;
	private String ifmpDesc;
	
	
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

	public String getIfmmSeq() {
		return ifmmSeq;
	}

	public void setIfmmSeq(String ifmmSeq) {
		this.ifmmSeq = ifmmSeq;
	}

	public String getIfmmId() {
		return ifmmId;
	}

	public void setIfmmId(String ifmmId) {
		this.ifmmId = ifmmId;
	}

	public String getIfmmName() {
		return ifmmName;
	}

	public void setIfmmName(String ifmmName) {
		this.ifmmName = ifmmName;
	}

	public Integer getIfmmAdminNy() {
		return ifmmAdminNy;
	}

	public void setIfmmAdminNy(Integer ifmmAdminNy) {
		this.ifmmAdminNy = ifmmAdminNy;
	}

	public Integer getIfmmDelNy() {
		return ifmmDelNy;
	}

	public void setIfmmDelNy(Integer ifmmDelNy) {
		this.ifmmDelNy = ifmmDelNy;
	}

	public String getIfmmDesc() {
		return ifmmDesc;
	}

	public void setIfmmDesc(String ifmmDesc) {
		this.ifmmDesc = ifmmDesc;
	}

	public Integer getIfmaDefaultNy() {
		return ifmaDefaultNy;
	}

	public void setIfmaDefaultNy(Integer ifmaDefaultNy) {
		this.ifmaDefaultNy = ifmaDefaultNy;
	}

	public Integer getIfmaTypeCd() {
		return ifmaTypeCd;
	}

	public void setIfmaTypeCd(Integer ifmaTypeCd) {
		this.ifmaTypeCd = ifmaTypeCd;
	}

	public String getIfmaTitle() {
		return ifmaTitle;
	}

	public void setIfmaTitle(String ifmaTitle) {
		this.ifmaTitle = ifmaTitle;
	}

	public String getIfmaAddress1() {
		return ifmaAddress1;
	}

	public void setIfmaAddress1(String ifmaAddress1) {
		this.ifmaAddress1 = ifmaAddress1;
	}

	public String getIfmaAddress2() {
		return ifmaAddress2;
	}

	public void setIfmaAddress2(String ifmaAddress2) {
		this.ifmaAddress2 = ifmaAddress2;
	}

	public String getIfmaZipCode() {
		return ifmaZipCode;
	}

	public void setIfmaZipCode(String ifmaZipCode) {
		this.ifmaZipCode = ifmaZipCode;
	}

	public Integer getIfmaDelNy() {
		return ifmaDelNy;
	}

	public void setIfmaDelNy(Integer ifmaDelNy) {
		this.ifmaDelNy = ifmaDelNy;
	}

	public String getIfmaDesc() {
		return ifmaDesc;
	}

	public void setIfmaDesc(String ifmaDesc) {
		this.ifmaDesc = ifmaDesc;
	}

	public Integer getIfmeDefaultNy() {
		return ifmeDefaultNy;
	}

	public void setIfmeDefaultNy(Integer ifmeDefaultNy) {
		this.ifmeDefaultNy = ifmeDefaultNy;
	}

	public Integer getIfmeTypeCd() {
		return ifmeTypeCd;
	}

	public void setIfmeTypeCd(Integer ifmeTypeCd) {
		this.ifmeTypeCd = ifmeTypeCd;
	}

	public String getIfmeEmailFull() {
		return ifmeEmailFull;
	}

	public void setIfmeEmailFull(String ifmeEmailFull) {
		this.ifmeEmailFull = ifmeEmailFull;
	}

	public String getIfmeAccount() {
		return ifmeAccount;
	}

	public void setIfmeAccount(String ifmeAccount) {
		this.ifmeAccount = ifmeAccount;
	}

	public String getIfmeDomain() {
		return ifmeDomain;
	}

	public void setIfmeDomain(String ifmeDomain) {
		this.ifmeDomain = ifmeDomain;
	}

	public Integer getIfmeDelNy() {
		return ifmeDelNy;
	}

	public void setIfmeDelNy(Integer ifmeDelNy) {
		this.ifmeDelNy = ifmeDelNy;
	}

	public String getIfmeDesc() {
		return ifmeDesc;
	}

	public void setIfmeDesc(String ifmeDesc) {
		this.ifmeDesc = ifmeDesc;
	}

	public Integer getIfmpDefaultNy() {
		return ifmpDefaultNy;
	}

	public void setIfmpDefaultNy(Integer ifmpDefaultNy) {
		this.ifmpDefaultNy = ifmpDefaultNy;
	}

	public Integer getIfmpTypeCd() {
		return ifmpTypeCd;
	}

	public void setIfmpTypeCd(Integer ifmpTypeCd) {
		this.ifmpTypeCd = ifmpTypeCd;
	}

	public Integer getIfmpDeviceCd() {
		return ifmpDeviceCd;
	}

	public void setIfmpDeviceCd(Integer ifmpDeviceCd) {
		this.ifmpDeviceCd = ifmpDeviceCd;
	}

	public Integer getIfmpTelecomCd() {
		return ifmpTelecomCd;
	}

	public void setIfmpTelecomCd(Integer ifmpTelecomCd) {
		this.ifmpTelecomCd = ifmpTelecomCd;
	}

	public String getIfmpNumber() {
		return ifmpNumber;
	}

	public void setIfmpNumber(String ifmpNumber) {
		this.ifmpNumber = ifmpNumber;
	}

	public Integer getIfmpDelNy() {
		return ifmpDelNy;
	}

	public void setIfmpDelNy(Integer ifmpDelNy) {
		this.ifmpDelNy = ifmpDelNy;
	}

	public String getIfmpDesc() {
		return ifmpDesc;
	}

	public void setIfmpDesc(String ifmpDesc) {
		this.ifmpDesc = ifmpDesc;
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
