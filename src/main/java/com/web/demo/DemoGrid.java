package com.web.demo;

/**
 * Created by liuhaiyang on 2017/6/6.
 */
public class DemoGrid {
    private String bonusAmt;
    private String name;
    private String desc;

    public DemoGrid(String bonusAmt, String name, String desc) {
        this.bonusAmt = bonusAmt;
        this.name = name;
        this.desc = desc;
    }

    public DemoGrid() {
    }

    public String getBonusAmt() {
        return bonusAmt;
    }

    public void setBonusAmt(String bonusAmt) {
        this.bonusAmt = bonusAmt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
