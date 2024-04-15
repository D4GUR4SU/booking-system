package com.booking.auth.feignclients;

import com.booking.auth.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name = "user", path = "/users")
public interface UserFeignClient {

  @GetMapping("/search")
  ResponseEntity<User> findByEmail(@RequestParam String email);
}
