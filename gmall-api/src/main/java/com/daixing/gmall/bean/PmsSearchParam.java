package com.daixing.gmall.bean;

import org.apache.catalina.LifecycleState;

import java.io.Serializable;
import java.util.List;

public class PmsSearchParam implements Serializable
{
    private String catalog3Id;
    private String keyword;
    private List<String> valueId;

    public String getCatalog3Id() {
        return catalog3Id;
    }

    public void setCatalog3Id(String catalog3Id) {
        this.catalog3Id = catalog3Id;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public List<String> getValueId() {
        return valueId;
    }

    public void setValueId(List<String> valueId) {
        this.valueId = valueId;
    }
}
