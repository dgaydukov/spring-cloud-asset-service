package com.exchange.asset.service;

import com.exchange.asset.config.AppConfig;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {
  private final AppConfig appConfig;

  @PostConstruct
  public void test(){
    new Thread(()->{
      while (true){
        try {
          Thread.sleep(10_000);
          System.out.println("data.env => "+ nacosConfig.getdataEnv());
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }
    }).start();
  }
}
