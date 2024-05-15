package com.exchange.asset.controllers;

import com.exchange.asset.facade.ApiFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ApiController {
  private final ApiFacade apiFacade;

  @GetMapping("/info")
  public String getInfo() {
    return "coinroutes-api";
  }

  // private endpoint
  @GetMapping("/version")
  public String getVersion() {
    return "coinroutes v1";
  }

  @PostMapping("/call")
  public String callApi(){
    try{
      return apiFacade.getData();
    } catch (Exception ex){
      return "ERR => "+ex.getLocalizedMessage();
    }
  }
}