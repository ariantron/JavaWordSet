package com.github.JavaWordSet.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Word {
    private String word;
    @SerializedName("wordset_id")
    private String wordSetId;
    private ArrayList<Meaning> meanings;

    public Word(String word, String wordSetId, ArrayList<Meaning> meanings) {
        this.word = word;
        this.wordSetId = wordSetId;
        this.meanings = meanings;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getWordSetId() {
        return wordSetId;
    }

    public void setWordSetId(String wordSetId) {
        this.wordSetId = wordSetId;
    }

    public ArrayList<Meaning> getMeanings() {
        return meanings;
    }

    public void setMeanings(ArrayList<Meaning> meanings) {
        this.meanings = meanings;
    }

    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                ", wordSetId='" + wordSetId + '\'' +
                ", meanings=" + meanings +
                '}';
    }
}
