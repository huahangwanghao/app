package aop.bean;

public class XueSheng {
    private Integer s_id;

    private String s_name;

    private Integer s_age;

    private Integer laoshi_id;

    public Integer getS_id() {
        return s_id;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name == null ? null : s_name.trim();
    }

    public Integer getS_age() {
        return s_age;
    }

    public void setS_age(Integer s_age) {
        this.s_age = s_age;
    }

    public Integer getLaoshi_id() {
        return laoshi_id;
    }

    public void setLaoshi_id(Integer laoshi_id) {
        this.laoshi_id = laoshi_id;
    }
}