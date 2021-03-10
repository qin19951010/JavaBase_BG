package com.jiangnanyidianyu.mbg.model;

//import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class PatVisit implements Serializable {
    //@ApiModelProperty(value = "病人id")
    private String patientId;

    //@ApiModelProperty(value = "病人住院次")
    private int visitId;

    //@ApiModelProperty(value = "住院号")
    private String inpNo;

    //@ApiModelProperty(value = "姓名")
    private String name;

    //@ApiModelProperty(value = "入院科室编码")
    private String deptAdmissionTo;

    //@ApiModelProperty(value = "入院时间")
    private Date admissionDateTime;

    //@ApiModelProperty(value = "出院科室编码")
    private String deptDischargeFrom;

    //@ApiModelProperty(value = "出院时间")
    private Date dischargeDateTime;

    private static final long serialVersionUID = 1L;

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public int getVisitId() {
        return visitId;
    }

    public void setVisitId(int visitId) {
        this.visitId = visitId;
    }

    public String getInpNo() {
        return inpNo;
    }

    public void setInpNo(String inpNo) {
        this.inpNo = inpNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptAdmissionTo() {
        return deptAdmissionTo;
    }

    public void setDeptAdmissionTo(String deptAdmissionTo) {
        this.deptAdmissionTo = deptAdmissionTo;
    }

    public Date getAdmissionDateTime() {
        return admissionDateTime;
    }

    public void setAdmissionDateTime(Date admissionDateTime) {
        this.admissionDateTime = admissionDateTime;
    }

    public String getDeptDischargeFrom() {
        return deptDischargeFrom;
    }

    public void setDeptDischargeFrom(String deptDischargeFrom) {
        this.deptDischargeFrom = deptDischargeFrom;
    }

    public Date getDischargeDateTime() {
        return dischargeDateTime;
    }

    public void setDischargeDateTime(Date dischargeDateTime) {
        this.dischargeDateTime = dischargeDateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", patientId=").append(patientId);
        sb.append(", visitId=").append(visitId);
        sb.append(", inpNo=").append(inpNo);
        sb.append(", name=").append(name);
        sb.append(", deptAdmissionTo=").append(deptAdmissionTo);
        sb.append(", admissionDateTime=").append(admissionDateTime);
        sb.append(", deptDischargeFrom=").append(deptDischargeFrom);
        sb.append(", dischargeDateTime=").append(dischargeDateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}