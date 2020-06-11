package com.qakj.crm.pojo;

public class Product {
    private String productid;

    private Integer productprice;

    private String productdes;

    private String productsize;

    private String productimg;

    public String getProductid() {
        return productid;
    }

    public void setProductid(String string) {
        this.productid = string;
    }

    public Integer getProductprice() {
        return productprice;
    }

    public void setProductprice(Integer productprice) {
        this.productprice = productprice;
    }

    public String getProductdes() {
        return productdes;
    }

    public void setProductdes(String productdes) {
        this.productdes = productdes == null ? null : productdes.trim();
    }

    public String getProductsize() {
        return productsize;
    }

    public void setProductsize(String productsize) {
        this.productsize = productsize == null ? null : productsize.trim();
    }

    public String getProductimg() {
        return productimg;
    }

    public void setProductimg(String productimg) {
        this.productimg = productimg == null ? null : productimg.trim();
    }
}