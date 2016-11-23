package model;

import java.util.Date;

/**
 * @author yongsama@foxmail.com
 * @ClassName: TracesVO
 * @Description:直接用对接快递鸟API时所需要解析的VO类
 * @date: 2016/11/22
 */

public class TracesVO {
    private Date AcceptTime;
    private String AcceptStation;
    private String Remark;

    public Date getAcceptTime() {
        return AcceptTime;
    }

    public void setAcceptTime(Date acceptTime) {
        AcceptTime = acceptTime;
    }

    public String getAcceptStation() {
        return AcceptStation;
    }

    public void setAcceptStation(String acceptStation) {
        AcceptStation = acceptStation;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }
}
