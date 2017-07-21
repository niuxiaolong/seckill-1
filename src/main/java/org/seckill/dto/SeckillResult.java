package org.seckill.dto;

/**
 * Created by Taoxiao on 2017/4/26 0026.
 * Describe:所有ajax请求放回类型，封装json结果
 */
public class SeckillResult<T> {
    //判断是否成功
    private boolean success;

    //数据类型
    private T data;

    //错误信息
    private String error;

    public SeckillResult(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    public SeckillResult(boolean success, String error) {
        this.success = success;
        this.error = error;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
