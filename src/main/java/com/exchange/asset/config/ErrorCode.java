package com.exchange.asset.config;

import lombok.Getter;

@Getter
public enum ErrorCode {
    INTERNAL_SERVER_ERROR(100000, "server_error"),
    FAILED_TO_PROCESS_REQUEST(100001, "failed_to_process_request"),
    PRICE_NOT_FOUND(100001, "price_not_found");

    private int code;
    private String errorCode;

    ErrorCode(int code, String errorCode) {
        this.code = code;
        this.errorCode = errorCode;
    }
}
