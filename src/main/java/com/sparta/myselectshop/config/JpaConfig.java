package com.sparta.myselectshop.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration // 아래 설정을 등록하여 활성화 합니다.
@EnableJpaAuditing // 시간 자동 변경이 가능하도록 합니다. -> 원래 MyselectshopApplication 위에 있던 건데 test할 땐 Jpa를 안 쓰니까 얠 붙이면 에러가 남.
// 그래서 빼야하는데 시간 자동 변경 기능을 쓰긴 써야하니까 여기에 따로 설정해줌.
public class JpaConfig {
}
