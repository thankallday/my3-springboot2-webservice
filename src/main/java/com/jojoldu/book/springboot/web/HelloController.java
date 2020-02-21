package com.jojoldu.book.springboot.web;

// p60

import com.jojoldu.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController             // 1 컨트롤러를 JSON 을 반환하는 컨트롤러로 만들어 준다. 예전엔 @RequestBody
public class HelloController {

  @GetMapping("/hello")   // 2 HTTP 메소드인 Get 의 요청을 받을수 있는 API 를 만들어 준다. 예전엔 @RequestMapping
  public String hello() {
    return "hello";
  }

  // p75
  @GetMapping("/hello/dto")
  public HelloResponseDto helloDto(@RequestParam("name") String name, // 1 @RequestParam 외부에서 API 로 넘긴 파라미터를 가져오는 어노테이션
                                   @RequestParam("amount") int amount) {

    return new HelloResponseDto(name, amount);
  }

}
