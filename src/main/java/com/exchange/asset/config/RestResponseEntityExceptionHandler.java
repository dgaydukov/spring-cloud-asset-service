package com.exchange.asset.config;

import com.exchange.asset.domain.AppError;
import com.exchange.asset.exception.AppException;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
@Slf4j
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({AppException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public AppError handleAppException(HttpServletRequest req, AppException ex) {
        log.error("catch AppException: url={}", req.getRequestURI(), ex);
        return new AppError(ex.getCode(), ex.getErrorCode(), ex.getMsg(), null);
    }
}