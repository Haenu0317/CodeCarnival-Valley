package com.haenu.subject.common.entity;

import com.haenu.subject.common.enums.ResultCodeEnum;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Result<T> {
    private Boolean success;
    private Integer code;
    private String message;
    private T data;

    public static Result ok() {
        Result r = Result.builder()
                .success(true)
                .code(ResultCodeEnum.SUCCESS.getCode())
                .message(ResultCodeEnum.SUCCESS.getDesc())
                .build();
        return r;
    }

    public static Result fail() {
        Result r = Result.builder()
                .success(true)
                .code(ResultCodeEnum.FAIL.getCode())
                .message(ResultCodeEnum.FAIL.getDesc())
                .build();
        return r;
    }

    public static <T> Result ok(T data) {
        Result r = Result.builder()
                .success(true)
                .code(ResultCodeEnum.SUCCESS.getCode())
                .message(ResultCodeEnum.SUCCESS.getDesc())
                .data(data)
                .build();
        return r;
    }

    public static <T> Result fail(T data) {
        Result r = Result.builder()
                .success(true)
                .code(ResultCodeEnum.FAIL.getCode())
                .message(ResultCodeEnum.FAIL.getDesc())
                .data(data)
                .build();
        return r;
    }
}
