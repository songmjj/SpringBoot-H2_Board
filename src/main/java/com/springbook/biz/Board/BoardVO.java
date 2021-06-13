package com.springbook.biz.Board;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
//VO(Value Object)
@Entity
@Table(name= "BOARD")
public class BoardVO {
	
	@Id
	@GeneratedValue
	private int seq;
	private String title;
	private String writer;
	private String content;
	private Date regDate;


	@Override
	public String toString() {
		return "BoardVO [seq=" + seq + ", title=" + title + ", writer=" + writer + ", content=" + content + ", regDate="
				+ regDate + ", content=" + content + "]";
	}
}