package com.example.btl_android.Model;

public class ModelChinhSach {
    private int idChinhSach;
    private String nameChinhSach;
    private String detailChinhSach;

    public ModelChinhSach(int idChinhSach, String nameChinhSach, String detailChinhSach) {
        this.idChinhSach = idChinhSach;
        this.nameChinhSach = nameChinhSach;
        this.detailChinhSach = detailChinhSach;
    }

    public ModelChinhSach() {
    }

    public int getIdChinhSach() {
        return idChinhSach;
    }

    public void setIdChinhSach(int idChinhSach) {
        this.idChinhSach = idChinhSach;
    }

    public String getNameChinhSach() {
        return nameChinhSach;
    }

    public void setNameChinhSach(String nameChinhSach) {
        this.nameChinhSach = nameChinhSach;
    }

    public String getDetailChinhSach() {
        return detailChinhSach;
    }

    public void setDetailChinhSach(String detailChinhSach) {
        this.detailChinhSach = detailChinhSach;
    }
}