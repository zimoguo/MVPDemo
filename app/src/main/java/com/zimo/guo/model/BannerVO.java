package com.zimo.guo.model;

import java.io.Serializable;

public class BannerVO implements Serializable {
	/**
	 * "adPicid":100086,"isNew":false,"itemGroupName":"100086","itemID":-1,
	 * "itemName":"测试banner05", "picUrl":
	 * "http://wireless.xingshulin.com/UploadFiles/attached/quan05.png"}
	 * 
	 * {"numRows":0,"obj":[{"adPicid":100078,"fullLink":
	 * "http://www.xingshulin.com","isNew":false,
	 * "itemGroupName":"100078","itemID"
	 * :-1,"itemName":"测试banner01外部链接","itemObject":"URL", "picUrl":
	 * "http://wireless.xingshulin.com/UploadFiles/attached/quan01.png"}
	 * ,{"adPicid":100080,"fullLink":
	 * "http://www.xingshulin.com/products/mobileDownload.html"
	 * ,"isNew":false,"itemGroupName"
	 * :"100080","itemID":-1,"itemName":"测试banner02内部链接"
	 * ,"itemObject":"URL_INNER","picUrl":
	 * "http://wireless.xingshulin.com/UploadFiles/attached/quan02.png"},
	 * {"adPicid"
	 * :100082,"fullLink":"6#59#1","isNew":false,"itemGroupName":"100082"
	 * ,"itemID"
	 * :-1,"itemName":"测试banner03跳向指南","itemObject":"GUIDELINE","picUrl"
	 * :"http://wireless.xingshulin.com/UploadFiles/attached/quan03.png"
	 * },{"adPicid"
	 * :100084,"fullLink":"6#52#2","isNew":false,"itemGroupName":"100084"
	 * ,"itemID"
	 * :-1,"itemName":"测试banner04跳向指南","itemObject":"GUIDELINE","picUrl"
	 * :"http://wireless.xingshulin.com/UploadFiles/attached/quan04.png"
	 * },{"adPicid"
	 * :100086,"fullLink":"6#53#3","isNew":false,"itemGroupName":"100086"
	 * ,"itemID"
	 * :-1,"itemName":"测试banner05跳向指南","itemObject":"GUIDELINE","picUrl"
	 * :"http://wireless.xingshulin.com/UploadFiles/attached/quan05.png"
	 * }],"resultObj":{"result":true}}
	 */

	public static final String Template_type_Url = "URL";

	public static final String Template_type_InnerUrl = "URL_INNER";

	public static final String Template_type_GuideLine = "GUIDELINE";
	
	public static final String Template_type_new_GuideLine = "TO_GUIDELINE";

	public static final String SOCIAL_GROUP = "SOCIAL_GROUP";

	public static final String SOCIAL_DISCUSS = "SOCIAL_DISCUSS";

	public static final String BOOK = "BOOK";


	private static final long serialVersionUID = 5407106666389151495L;

	private String fullLink;
	private String picUrl;
	private boolean isChecked;
	private boolean isNew;
	private String itemGroupName;
	private int itemID;
	private int adPicid;
	private String itemName;
	private String itemObject;

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public boolean isNew() {
		return isNew;
	}

	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

	public String getItemGroupName() {
		return itemGroupName;
	}

	public void setItemGroupName(String itemGroupName) {
		this.itemGroupName = itemGroupName;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public int getAdPicid() {
		return adPicid;
	}

	public void setAdPicid(int adPicid) {
		this.adPicid = adPicid;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public boolean isChecked() {
		return isChecked;
	}

	public void setChecked(boolean isChecked) {
		this.isChecked = isChecked;
	}

	public String getItemObject() {
		return itemObject;
	}

	public void setItemObject(String itemObject) {
		this.itemObject = itemObject;
	}

	public String getFullLink() {
		return fullLink;
	}

	public void setFullLink(String fullLink) {
		this.fullLink = fullLink;
	}

}
