package com.bg.web.menu.model;

import java.sql.Timestamp;

public class MenuVO {
    private int cate_id;
    private String cate_nm;
    private int cate_depth;
    private String reg_id;
    private Timestamp reg_dte;
    private String edit_id;
    private Timestamp edit_dte;
    
    public int getCate_id() {
        return cate_id;
    }
    public void setCate_id(int cate_id) {
        this.cate_id = cate_id;
    }
    public String getCate_nm() {
        return cate_nm;
    }
    public void setCate_nm(String cate_nm) {
        this.cate_nm = cate_nm;
    }
    public int getCate_depth() {
        return cate_depth;
    }
    public void setCate_depth(int cate_depth) {
        this.cate_depth = cate_depth;
    }
    public String getReg_id() {
        return reg_id;
    }
    public void setReg_id(String reg_id) {
        this.reg_id = reg_id;
    }
    public Timestamp getReg_dte() {
        return reg_dte;
    }
    public void setReg_dte(Timestamp reg_dte) {
        this.reg_dte = reg_dte;
    }
    public String getEdit_id() {
        return edit_id;
    }
    public void setEdit_id(String edit_id) {
        this.edit_id = edit_id;
    }
    public Timestamp getEdit_dte() {
        return edit_dte;
    }
    public void setEdit_dte(Timestamp edit_dte) {
        this.edit_dte = edit_dte;
    }
    
    @Override
    public String toString() {
        return "MenuVO [cate_id=" + cate_id + ", cate_nm=" + cate_nm + ", cate_depth=" + cate_depth + ", reg_id="
                + reg_id + ", reg_dte=" + reg_dte + ", edit_id=" + edit_id + ", edit_dte=" + edit_dte + "]";
    }
}
