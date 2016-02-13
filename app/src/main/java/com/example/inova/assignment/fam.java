package com.example.inova.assignment;

/**
 * Created by 1421016 on 2/10/2016.
 */
public class fam {
    private String nanme;
    private String rel;
    private int Img_ID;

    public fam(String nanme, String rel, int img_ID) {
        this.nanme = nanme;
        this.rel = rel;
        Img_ID = img_ID;
    }

    public String getNanme() {
        return nanme;
    }

    public void setNanme(String nanme) {
        this.nanme = nanme;
    }

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public int getImg_ID() {
        return Img_ID;
    }

    public void setImg_ID(int img_ID) {
        Img_ID = img_ID;
    }
}
