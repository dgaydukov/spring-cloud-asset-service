package com.exchange.asset.service;

import com.exchange.asset.exception.AppException;
import com.exchange.asset.service.impl.PriceServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PriceServiceTest {

  private PriceService priceService;

  @BeforeEach
  public void init() {
    priceService = new PriceServiceImpl();
  }

  @Test
  public void setPriceTest() {
    final String symbol = "BTC";
    final double price = 100;
    priceService.setPrice(symbol, price);
    Assertions.assertEquals(price, priceService.getPrice(symbol), "price mismatch");
  }

  @Test
  public void getPriceTest() {
    final String symbol = "BTC";
    final String errorMsg = "Price not found for symbol=" + symbol;
    AppException thrown = Assertions.assertThrows(
        AppException.class,
        () -> priceService.getPrice(symbol),
        "AppException should be thrown if price not found"
    );
    Assertions.assertEquals(thrown.getMessage(), errorMsg, "exception message mismatch");
  }
}
