package com.bangbang.baseframe.model;

import java.util.Collection;

/**
 * @Description 封装的返回集合对象，多个对象或分页建议使用
 * @Author Joy
 * @Date 2018/12/24 20:34
 **/
public class ResponseResults<T extends Collection<?>> {
    private final boolean success;
    private final String message;
    private final T results;
    private final int total;

    public ResponseResults(boolean success, String message, T results) {
        this.success = success;
        this.message = message;
        this.results = results;
        this.total = 0;
    }

    public ResponseResults(boolean success, String message, T results, int total) {
        this.success = success;
        this.message = message;
        this.results = results;
        this.total = total;
    }

    public static <E extends Collection<?>> ResponseResults<E> success(E results) {
        return new ResponseResults(true, "invoked success!", results, results.size());
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public T getResults() {
        return results;
    }

    public int getTotal() {
        return total;
    }
}
