package com.exchange.asset.controllers;

import com.exchange.asset.domain.Asset;
import com.exchange.asset.service.PriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/asset/price")
@RequiredArgsConstructor
public class PriceController {
  private final PriceService priceService;

  @PostMapping
  public void setPrice(@RequestBody Asset asset) {
    priceService.setPrice(asset.getSymbol(), asset.getPrice());
  }

  @GetMapping("/{symbol}")
  public Asset getPrice(@RequestParam String symbol) {
    Asset asset = new Asset();
    asset.setSymbol(symbol);
    asset.setPrice(priceService.getPrice(symbol));
    return asset;
  }
}