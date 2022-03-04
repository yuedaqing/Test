package com.al.pojo;

/**
 * @author 岳岳
 * version  1.0
 */
public class Province {
    private Integer pNo;

    public Integer getpNo() {
        return pNo;
    }

    public void setpNo(Integer pNo) {
        this.pNo = pNo;
    }

    private String pName;

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    @Override
    public String toString() {
        return "Province{" +
                "pNo=" + pNo +
                ", pName='" + pName + '\'' +
                '}';
    }

    public Province(Integer pNo, String pName) {
        this.pNo = pNo;
        this.pName = pName;
    }
}
