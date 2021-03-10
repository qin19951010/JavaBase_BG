package com.jiangnanyidianyu;

import com.jiangnanyidianyu.mbg.mapper.PatVisitMapper;
import com.jiangnanyidianyu.mbg.model.PatVisit;
import lombok.extern.slf4j.Slf4j;
import lombok.var;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @ClassName mgbTest
 * @Author: Qinnn、
 * @Description: TODO
 * @Date: create in 2021/1/20 14:35
 */
@Slf4j
@SpringBootTest
public class mgbTest {

    @Autowired
    PatVisitMapper patVisitMapper;

    @Test
    public void testInsert()
    {
        PatVisit patVisit = new PatVisit();
        patVisit.setVisitId(1);
        patVisit.setAdmissionDateTime(new Date());
        patVisit.setDischargeDateTime(new Date());
        patVisit.setDeptAdmissionTo("");
        patVisit.setDeptDischargeFrom("");
        patVisit.setInpNo("700115");

        var PidBase = "ZA";
        for (int i = 0; i < 30; i++) {
            String Pid = PidBase.concat(RandomStringUtils.randomNumeric(7));
            patVisit.setName("cs" + RandomStringUtils.randomNumeric(6));
            patVisit.setPatientId(Pid);
            int insert = patVisitMapper.insert(patVisit);
            if(insert == 1) {
                log.info("第{}个患者已经插入", i);
            }else
            {
                log.warn("第{}个患者插入失败", i);
            }
        }
    }

    @Test
    public void testUpdate()
    {
        PatVisit patVisit = new PatVisit();
        patVisit.setInpNo("700115");
        patVisit.setDeptDischargeFrom("5455002");
        patVisit.setDeptAdmissionTo("5455001");
        patVisitMapper.updateByInpNo(patVisit);
    }
}
