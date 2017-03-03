package aop.dao;

import aop.bean.XueSheng;
import aop.bean.XueShengCriteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XueShengMapper {
    int countByExample(XueShengCriteria example);

    int deleteByExample(XueShengCriteria example);

    int deleteByPrimaryKey(Integer s_id);

    int insert(XueSheng record);

    int insertSelective(XueSheng record);

    List<XueSheng> selectByExample(XueShengCriteria example);

    XueSheng selectByPrimaryKey(Integer s_id);

    int updateByExampleSelective(@Param("record") XueSheng record, @Param("example") XueShengCriteria example);

    int updateByExample(@Param("record") XueSheng record, @Param("example") XueShengCriteria example);

    int updateByPrimaryKeySelective(XueSheng record);

    int updateByPrimaryKey(XueSheng record);
}