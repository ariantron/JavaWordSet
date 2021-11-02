package com.github.JavaWordSet.models;

import com.google.gson.annotations.SerializedName;

public class LabelParent {
    private String name;
    @SerializedName("is_dialect")
    private boolean isDialect;

    public LabelParent(String name, boolean isDialect) {
        this.name = name;
        this.isDialect = isDialect;
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
}
