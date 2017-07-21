package org.seckill.dao.cache;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.dao.SeckillDao;
import org.seckill.entity.Seckill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by Taoxiao on 2017/5/7 0007.
 * Describe:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class RedisDaoTest {
    long id =1002;
    @Autowired
    private RedisDao redisDao;

    @Autowired
    private SeckillDao seckillDao; //拿到对应的秒杀对象

    @Test
    public void Seckill() throws Exception {
            //get and put
        Seckill seckill =redisDao.getSeckill(id); //空的
        if (seckill ==null){            //如果是空，就从seckillDao用queryById的方法取
            seckill =seckillDao.queryById(id);
            if (seckill!=null){
                //从seckillDao用queryById的方法取到后用put存入redis中
                String result =redisDao.putSeckill(seckill);
                System.out.println(result);
                //再从redis中取得
                seckill = redisDao.getSeckill(id);
                System.out.println(seckill);
            }

        }
    }



}