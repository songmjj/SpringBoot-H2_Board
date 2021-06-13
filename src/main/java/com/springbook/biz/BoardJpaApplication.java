package com.springbook.biz;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BoardJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardJpaApplication.class, args);
		System.out.println("Application 시작~ ^^"); // Console 출력 문 입력 저장
	}


}