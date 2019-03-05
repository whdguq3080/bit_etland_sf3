package com.bit_etland.web.domain;

import lombok.Data;

@Data

public class ImageDTO {
	private String imgSeq, imgName,imgExtention,owner;

	public String getImgSeq() {
		return imgSeq;
	}

	public void setImgSeq(String imgSeq) {
		this.imgSeq = imgSeq;
	}

	public String getImgName() {
		return imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}

	public String getImgExtention() {
		return imgExtention;
	}

	public void setImgExtention(String imgExtention) {
		this.imgExtention = imgExtention;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
}
