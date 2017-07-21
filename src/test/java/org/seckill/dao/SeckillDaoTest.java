package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.Seckill;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.Date;
import java.util.List;


/**
 * Created by Taoxiao on 2017/4/24 0024.
 * Describe:配置spring和junit整合,    junit启动时加载springIOC容器->@RunWith(SpringJUnit4ClassRunner.class)
 * spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SeckillDaoTest {

    //注入Dao实现类依赖
    @Resource
    private SeckillDao seckillDao;

    @Test
    public void queryById() throws Exception {
        long id = 1001;
        Seckill seckill = seckillDao.queryById(id);
        System.out.println(seckill.getName());
        System.out.println(seckill);
    }

    @Test
    public void queryAll() throws Exception {
        //@Param("offset") int offset, @Param("limit") int limit 标识
        List<Seckill> seckills = seckillDao.queryAll(0,100);
        for (Seckill seckill:seckills){
            System.out.println(seckill);
        }
    }

    @Test
    public void reduceNumber() throws Exception {
        Date killTime = new Date();
        int updateCount= seckillDao.reduceNumber(1001L, killTime);
        System.out.println(updateCount);
    }



}