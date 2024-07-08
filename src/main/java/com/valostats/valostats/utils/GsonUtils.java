package com.valostats.valostats.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GsonUtils {

    static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static String getApiKey() {
        try {
            String content = new String(Files.readAllBytes(Paths.get("secrets.json")));
            JsonObject secret = gson.fromJson(content, JsonObject.class);
            String key = secret.getAsJsonObject("secrets").get("apiKey").getAsString();
            if (key == null) {
                throw new IllegalArgumentException("API key not found in secrets.json");
            }
            return key;
        } catch (IOException e) {
            throw new IllegalArgumentException("secrets.json not found " + e.getMessage());
        }
    }

}
