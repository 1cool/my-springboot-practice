package com.example.demo.response;

public class BaseResponse<T> {
    private int code;
    private String message;
    private T data;

    private BaseResponse() {
    }

    public static <T> BaseResponse<T> newInstance(int code, String msg, T data) {
        BaseResponse<T> baseResponse = new BaseResponse<>();
        baseResponse.setCode(code);
        baseResponse.setMessage(msg);
        baseResponse.setData(data);
        return baseResponse;
    }

    public static BaseResponse error(int code, String errMsg) {
        return newInstance(code, errMsg, null);
    }

    public static BaseResponse success() {
        return newInstance(0, "success", null);
    }

    public static <T> BaseResponse<T> success(T data) {
        return newInstance(0, "success", data);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
