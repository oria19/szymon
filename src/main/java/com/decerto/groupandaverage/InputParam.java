package com.decerto.groupandaverage;

import java.math.BigDecimal;

class InputParam {

    public InputParam(String groupCode, int productsNumber, int totalPrice) {
        this.groupCode = groupCode;
        this.productsNumber = productsNumber;
        this.totalPrice = totalPrice;
    }

    private String groupCode;
    private int productsNumber;
    private int totalPrice;

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public int getProductsNumber() {
        return productsNumber;
    }

    public BigDecimal getProductsNumberAsBigDecimal() {
        return BigDecimal.valueOf(productsNumber);
    }

    public void setProductsNumber(int productsNumber) {
        this.productsNumber = productsNumber;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}
