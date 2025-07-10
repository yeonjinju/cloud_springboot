package com.smhrd.web.entity;

import org.hibernate.annotations.ColumnDefault;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity // entity 클래스임을 나타내는 어노테이션
@Table(name="datamember") // (선택) 해당하는 클래스가 datamember 테이블을 나타내는 클래스임을 표시
public class DataMember {
	// DB테이블 자체를 의미하는 클래스
	
	@Id // 제공하는 package가 peristence여야함, @Id : 프라이머리키를 의미
	@Column(name="id", length = 100)
	private String id;
	@Column(nullable = false, length = 100)
	private String pw;
	
	// default값 설정 필요
	@ColumnDefault("'users'")
	@Column(nullable = false, insertable = false)
	private String roles;
}
