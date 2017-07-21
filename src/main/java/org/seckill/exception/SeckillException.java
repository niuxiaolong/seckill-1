package org.seckill.exception;

/**
 * Created by Taoxiao on 2017/4/24 0024.
 * Describe:秒杀相关业务异常
 */
public class SeckillException extends RuntimeException{
    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
