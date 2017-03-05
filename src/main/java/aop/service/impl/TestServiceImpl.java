package aop.service.impl;

import aop.bean.XueSheng;
import aop.dao.XueShengMapper;
import aop.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by wanghao on 17-3-3.
 */
@Service
public class TestServiceImpl implements TestService {

    @Resource
    private XueShengMapper xueShengMapper;

    @Override
    public String getTest() {
        System.out.println("this is service impl");
        //int i=1/0;
        return "hello World";
    }

    @Override
    public void insert() {
        XueSheng xueSheng=new XueSheng();
        xueSheng.setLaoshi_id(1);
        xueSheng.setS_age(2);
        xueSheng.setS_name("adf");
       // xueShengMapper.insertSelective(xueSheng);
        xueSheng.setS_id(3);
        xueShengMapper.updateByPrimaryKeySelective(xueSheng);
        int i=1/0;
    }
}
