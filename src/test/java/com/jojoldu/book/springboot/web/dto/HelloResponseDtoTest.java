package com.jojoldu.book.springboot.web.dto;

import com.jojoldu.book.springboot.web.HelloController;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// p73
public class HelloResponseDtoTest {

  @Test
  public void 롬복_기능_테스트() {

    // given
    String name = "test";
    int amount = 1000;

    // when
    HelloResponseDto dto = new HelloResponseDto(name, amount);

    // then
    assertThat(dto.getName()).isEqualTo(name);  // 1 2 assertj 라는 검증 라이브러리의 검증 메소드. 검증하고 싶은 대상을 메소드로 받는다.
    assertThat(dto.getAmount()).isEqualTo(amount); // assertj 의 동등 메소드 이다.
  }
}
