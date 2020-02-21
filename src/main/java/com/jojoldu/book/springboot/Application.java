package com.jojoldu.book.springboot;

// p57

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//스프링부트의 자동설정, 스프링 빈 읽기와 생성을 모두 자동으로 설정.
public class Application { // 앞으로 만들 프로젝트의 메인 클래스. 이ㅡㄹ래스는 프로젝트의 최상단에 위치해야 한다.

  public static void main (String[] args) {
    SpringApplication.run(Application.class, args); // 내장 WAS 를 실행한다
  }
}
