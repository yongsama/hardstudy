package fastjson;

import com.alibaba.fastjson.JSON;
import model.TracesVO;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * @author yongsama@foxmail.com
 * @ClassName: AnalysisTest
 * @Description: 解析fastjson
 * @date: 2016/11/21
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AnalysisTest {

    @org.junit.Test
    public void jsonTest(){
        //json序列化
        TracesVO tracesVO = new TracesVO();
        tracesVO.setAcceptStation("【广东省广州市白云龙归公司】 已收件");
        tracesVO.setAcceptTime(new Date());
        String outJson = JSON.toJSONString(tracesVO);
        System.out.println(outJson);

        //json反序列化
        TracesVO tracesVOs = JSON.parseObject(outJson,TracesVO.class);
        System.out.println(tracesVO.getAcceptStation());
        System.out.println(JSON.toJSONStringWithDateFormat(tracesVO.getAcceptTime(), "yyyy-MM-dd HH:mm:ss.SSS"));

    }


}
