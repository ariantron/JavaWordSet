package com.github.JavaWordSet.models;

import com.google.gson.annotations.SerializedName;

public class Label {
    private String name;
    @SerializedName("is_dialect")
    private boolean isDialect;
    @SerializedName("parent")
    private LabelParent labelParent;

    public Label(String name, boolean isDialect, LabelParent labelParent) {
        this.name = name;
        this.isDialect = isDialect;
        this.labelParent = labelParent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDialect() {
        return isDialect;
    }

    public void setDialect(boolean dialect) {
        isDialect = dialect;
    }

    public LabelParent getLabelParent() {
        return labelParent;
    }

    public void setLabelParent(LabelParent labelParent) {
        this.labelParent = labelParent;
    }
}
