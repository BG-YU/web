package com.bg.web.model;

public class MenuVO {
    private String cate_cls;
    private int cate_id;
    private String cate_nm;
    private int cate_depth;
    private String sort;
    private String reg_id;
    private String edit_id;
    
    public String getCate_cls() {
        return cate_cls;
    }
    public void setCate_cls(String cate_cls) {
        this.cate_cls = cate_cls;
    }
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
    public String getSort() {
        return sort;
    }
    public void setSort(String sort) {
        this.sort = sort;
    }
    public String getReg_id() {
        return reg_id;
    }
    public void setReg_id(String reg_id) {
        this.reg_id = reg_id;
    }
    public String getEdit_id() {
        return edit_id;
    }
    public void setEdit_id(String edit_id) {
        this.edit_id = edit_id;
    }
    @Override
    public String toString() {
        return "MenuVO ["
                + "cate_cls=" + cate_cls 
                + ", cate_id=" + cate_id 
                + ", cate_nm=" + cate_nm 
                + ", cate_depth=" + cate_depth 
                + ", sort=" + sort 
                + ", reg_id=" + reg_id 
                + ", edit_id=" + edit_id 
                + "]";
    }
}
