package com.qakj.crm.pojo;

public class Maven {
	private Integer id;

    private String mavenname;

    private String discount;

    private String effectivetime;

    private Integer mlevel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMavenname() {
        return mavenname;
    }

    public void setMavenname(String mavenname) {
        this.mavenname = mavenname == null ? null : mavenname.trim();
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount == null ? null : discount.trim();
    }

    public String getEffectivetime() {
        return effectivetime;
    }

    public void setEffectivetime(String effectivetime) {
        this.effectivetime = effectivetime == null ? null : effectivetime.trim();
    }

    public Integer getMlevel() {
        return mlevel;
    }

    public void setMlevel(Integer mlevel) {
        this.mlevel = mlevel;
    }
}