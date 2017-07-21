package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Successkilled;

/**
 * Created by Taoxiao on 2017/4/21 0021.
 * Describe:秒杀成功的接口
 */
public interface SuccessKilledDao {

    /**
     * 插入购买明细，可过滤重复
     * @param seckillId
     * @param userPhone
     * @return 插入几行
     */
    int insertSuccessKilled(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

    /**
     * 根据id查询SuccessKilled并携带秒杀产品对象实体
     * @param seckillId
     * @param userPhone 因为一个seckillId对应多个成功记录，所以要加上userPhone
     * @return
     */
    Successkilled queryByIdWithSeckill(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);


}
