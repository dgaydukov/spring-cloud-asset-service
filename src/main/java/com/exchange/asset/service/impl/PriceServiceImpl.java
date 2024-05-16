package com.exchange.asset.service.impl;

import com.exchange.asset.exception.AppException;
import com.exchange.asset.service.PriceService;
import java.util.HashMap;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PriceServiceImpl implements PriceService {
  private Map<String, Double> prices = new HashMap<>();

  @Override
  public void setPrice(String symbol, double price) {
    log.info("Setting price for: symbol={}, price={}", symbol, price);
    prices.put(symbol, price);
  }

  @Override
  public double getPrice(String symbol) {
    log.info("Fetching price for: symbol={}", symbol);
    if (!prices.containsKey(symbol)){
      throw new AppException("Price not found for symbol=" + symbol);
    }
    return prices.get(symbol);
  }
}
