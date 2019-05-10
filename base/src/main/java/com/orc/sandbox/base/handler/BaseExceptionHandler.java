package com.orc.sandbox.base.handler;

import com.orc.sandbox.common.bo.Result;
import com.orc.sandbox.common.constant.StatusCode;
import com.orc.sandbox.common.handler.CommonExceptionHandler;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

public class BaseExceptionHandler extends CommonExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public Result error(Exception e) {
        return new Result(false, StatusCode.ERROR.getCode(), "moudle exception handler");
    }

}
