package com.github.JavaWordSet.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Meaning {
    private String id;
    private String def;
    private String example;
    @SerializedName("speech_part")
    private SpeechPart speechPart;
    private ArrayList<String> synonyms;
    private ArrayList<Label> labels;

    public Meaning(String id, String def, String example, SpeechPart speechPart, ArrayList<String> synonyms, ArrayList<Label> labels) {
        this.id = id;
        this.def = def;
        this.example = example;
        this.speechPart = speechPart;
        this.synonyms = synonyms;
        this.labels = labels;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public SpeechPart getSpeechPart() {
        return speechPart;
    }

    public void setSpeechPart(SpeechPart speechPart) {
        this.speechPart = speechPart;
    }

    public ArrayList<String> getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(ArrayList<String> synonyms) {
        this.synonyms = synonyms;
    }

    public ArrayList<Label> getLabels() {
        return labels;
    }

    public void setLabels(ArrayList<Label> labels) {
        this.labels = labels;
    }
}
