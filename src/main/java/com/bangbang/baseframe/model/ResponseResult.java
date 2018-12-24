package com.bangbang.baseframe.model;

/**
 * @Description 封装的返回对象, 单个建议使用
 * @Author Joy
 * @Date 2018/12/24 20:34
 **/
public class ResponseResult<T> {
    private final boolean success;
    private final String message;
    private final T result;

    public ResponseResult(boolean success, String message, T result) {
        this.success = success;
        this.message = message;
        this.result = result;
    }

    public static <E> ResponseResult<E> success(E result) {
        return new ResponseResult(true, "invoked success!", result);
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public T getResult() {
        return result;
    }
}
