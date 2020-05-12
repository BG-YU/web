package com.bg.web.model;

public class BoardVO {
    public int bid;
    public String cate_cd;
    public String title;
    public String content;
    public String tag;
    public int view_cnt;
    public String reg_id;
    public String reg_dte;
    public String edit_id;
    public String edit_dte;
    public int page;
    public int board_row_cnt;
    public int page_start;
    public int page_end;
    public int page_prev;
    public int page_next;
    public int page_current;

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getCate_cd() {
        return cate_cd;
    }

    public void setCate_cd(String cate_cd) {
        this.cate_cd = cate_cd;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public int getView_cnt() {
        return view_cnt;
    }

    public void setView_cnt(int view_cnt) {
        this.view_cnt = view_cnt;
    }

    public String getReg_id() {
        return reg_id;
    }

    public void setReg_id(String reg_id) {
        this.reg_id = reg_id;
    }

    public String getReg_dte() {
        return reg_dte;
    }

    public void setReg_dt(String reg_dte) {
        this.reg_dte = reg_dte;
    }
    
    public String getEdit_id() {
        return edit_id;
    }

    public void setEdit_id(String edit_id) {
        this.edit_id = edit_id;
    }
    
    public String getEdit_dte() {
        return edit_dte;
    }

    public void setEdit_dt(String edit_dte) {
        this.edit_dte = edit_dte;
    }
    
    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
    
    public int getBoard_row_cnt() {
        return board_row_cnt;
    }

    public void setBoard_row_cnt(int board_row_cnt) {
        this.board_row_cnt = board_row_cnt;
    }
    
    public int getPage_start() {
        return page_start;
    }

    public void setPage_start(int page_start) {
        this.page_start = page_start;
    }

    public int getPage_end() {
        return page_end;
    }

    public void setPage_end(int page_end) {
        this.page_end = page_end;
    }

    public int getPage_prev() {
        return page_prev;
    }

    public void setPage_prev(int page_prev) {
        this.page_prev = page_prev;
    }

    public int getPage_next() {
        return page_next;
    }

    public void setPage_next(int page_next) {
        this.page_next = page_next;
    }

    public int getPage_current() {
        return page_current;
    }

    public void setPage_current(int page_current) {
        this.page_current = page_current;
    }

    @Override
    public String toString() {
        return "BoardVO [bid=" + bid + ", cate_cd=" + cate_cd + ", title=" + title + ", content=" + content + ", tag="
                + tag + ", view_cnt=" + view_cnt + ", reg_id=" + reg_id + ", reg_dte=" + reg_dte + ", edit_id="
                + edit_id + ", edit_dte=" + edit_dte + ", page=" + page + ", board_row_cnt=" + board_row_cnt + ", page_start="
                + page_start + ", page_end=" + page_end + ", page_prev=" + page_prev + ", page_next=" + page_next
                + ", page_current=" + page_current + "]";
    }
}
