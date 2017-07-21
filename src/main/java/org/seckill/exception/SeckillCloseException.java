package org.seckill.exception;

/**
 * Created by Taoxiao on 2017/4/24 0024.
 * Describe:秒杀关闭异常
 */
public class SeckillCloseException extends SeckillException{
    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
