package com.exchange.asset.service;

public interface PriceService {

    void setPrice(String symbol, double price);

    double getPrice(String symbol);

    double getPrice2(String symbol);
}
