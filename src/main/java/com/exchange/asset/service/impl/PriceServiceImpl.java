package com.exchange.asset.service.impl;

import com.exchange.asset.exception.AppException;
import com.exchange.asset.service.PriceService;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class PriceServiceImpl implements PriceService {
  private Map<String, Double> prices = new HashMap<>();

  @Override
  public void setPrice(String symbol, double price) {
    prices.put(symbol, price);
  }

  @Override
  public double getPrice(String symbol) {
    if (!prices.containsKey(symbol)){
      throw new AppException("Price not found for symbol=" + symbol);
    }
    return prices.get(symbol);
  }
}
