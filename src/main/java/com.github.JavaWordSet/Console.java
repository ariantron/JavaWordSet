package com.github.JavaWordSet;import com.github.JavaWordSet.models.SpeechPart;import com.github.JavaWordSet.models.SpeechPartAdapter;import com.github.JavaWordSet.models.Word;import com.google.gson.Gson;import com.google.gson.GsonBuilder;import com.google.gson.reflect.TypeToken;import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.lang.reflect.Type;import java.net.URL;import java.util.ArrayList;import java.util.HashMap;import java.util.Map;public class Console {    public static void main(String[] args) throws IOException {        Gson gson = new GsonBuilder()                .registerTypeAdapter(SpeechPart.class, new SpeechPartAdapter())                .create();        Type collectionType = new TypeToken<Map<String, ArrayList<Word>>>() {        }.getType();        String json=getWordSetDataByFileName("a");        System.out.println(json);        Map<String, ArrayList<Word>> map = gson.fromJson(json, collectionType);        System.out.println(map.size());    }    public static String getLinkContent(String link) throws IOException {        URL url = new URL(link);        BufferedReader in = new BufferedReader(                new InputStreamReader(url.openStream()));        String inputLine;        StringBuilder stringBuilder = new StringBuilder();        while ((inputLine = in.readLine()) != null)            stringBuilder.append(inputLine);        in.close();        return stringBuilder.toString();    }    public static Map<String, String> getWordSetDataLinks() {        ArrayList<String> fileNames = new ArrayList<>();        char[] letters = "abcdefghijklmnopqrstuvwxyz".toCharArray();        for (char letter : letters)            fileNames.add(String.valueOf(letter));        fileNames.add("misc");        Map<String, String> links = new HashMap<>();        for (String fileName : fileNames)            links.put(fileName, getWordSetDataLinkByFileName(fileName));        return links;    }    public static String getWordSetDataLinkByFileName(String fileName) {        String link = "https://raw.githubusercontent.com/wordset/wordset-dictionary/master/data/";        return link + fileName + ".json";    }    public static Map<String, String> getWordSetData() throws IOException {        Map<String, String> links = getWordSetDataLinks();        Map<String, String> data = new HashMap<>();        for (Map.Entry<String, String> entry : links.entrySet()) {            data.put(entry.getKey(), getLinkContent(entry.getValue()));        }        return data;    }    public static String getWordSetDataByFileName(String fileName) throws IOException {        return getLinkContent(getWordSetDataLinkByFileName(fileName));    }}