package com.github.JavaWordSet.models;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class SpeechPartAdapter extends TypeAdapter<SpeechPart> {
    @Override
    public void write(JsonWriter out, SpeechPart value) throws IOException {
        String string;
        if (value == SpeechPart.NOUN) {
            string = "noun";
        } else if (value == SpeechPart.PRONOUN) {
            string = "pronoun";
        } else if (value == SpeechPart.VERB) {
            string = "verb";
        } else if (value == SpeechPart.ADJECTIVE) {
            string = "adjective";
        } else if (value == SpeechPart.ADVERB) {
            string = "adverb";
        } else if (value == SpeechPart.PREPOSITION) {
            string = "preposition";
        } else if (value == SpeechPart.CONJUNCTION) {
            string = "conjunction";
        } else if (value == SpeechPart.INTERJECTION) {
            string = "interjection";
        } else {
            string = null;
        }
        out.value(string);
    }

    @Override
    public SpeechPart read(JsonReader in) throws IOException {
        return switch (in.nextString()) {
            case "noun" -> SpeechPart.NOUN;
            case "pronoun" -> SpeechPart.PRONOUN;
            case "verb" -> SpeechPart.VERB;
            case "adjective" -> SpeechPart.ADJECTIVE;
            case "adverb" -> SpeechPart.ADVERB;
            case "preposition" -> SpeechPart.PREPOSITION;
            case "conjunction" -> SpeechPart.CONJUNCTION;
            case "interjection" -> SpeechPart.INTERJECTION;
            default -> null;
        };
    }
}
