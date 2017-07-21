package org.seckill.exception;

/**
 * Created by Taoxiao on 2017/4/24 0024.
 * Describe:重复秒杀异常(运行期异常)
 */
public class RepeatKillException extends SeckillException{
    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
