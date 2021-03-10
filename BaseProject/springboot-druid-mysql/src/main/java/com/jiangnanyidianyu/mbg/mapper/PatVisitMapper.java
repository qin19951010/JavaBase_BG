package com.jiangnanyidianyu.mbg.mapper;

import com.jiangnanyidianyu.mbg.model.PatVisit;
import com.jiangnanyidianyu.mbg.model.PatVisitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PatVisitMapper {
    long countByExample(PatVisitExample example);

    int deleteByExample(PatVisitExample example);

    int deleteByPrimaryKey(@Param("patientId") String patientId, @Param("visitId") String visitId);

    int insert(PatVisit record);

    int insertSelective(PatVisit record);

    List<PatVisit> selectByExample(PatVisitExample example);

    PatVisit selectByPrimaryKey(@Param("patientId") String patientId, @Param("visitId") String visitId);

    int updateByExampleSelective(@Param("record") PatVisit record, @Param("example") PatVisitExample example);

    int updateByExample(@Param("record") PatVisit record, @Param("example") PatVisitExample example);

    int updateByPrimaryKeySelective(PatVisit record);

    int updateByInpNo(PatVisit record);

    int updateByPrimaryKey(PatVisit record);
}