package com.smhrd.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* (1) SpringBootConfigration : 해당하는 클래스파일이 스프링 부트를 사용하는 피일임을 나타내는 annotation
 * (2) EnableAutoConfiguration : 해당하는 클래스 파일 하위에 위치해있다면, 다양한 클래스 파일들을 자동으로 설정해주는 역할을 진행하는 annotation
 * (3) ConponentScan : 컨트롤러(@Controller/@Mapper/@RestController) 자동으로 스캔해서 메모리 할당
 */
@SpringBootApplication
public class MySpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringbootApplication.class, args);
	}

}
