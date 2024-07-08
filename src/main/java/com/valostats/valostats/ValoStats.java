package com.valostats.valostats;

import com.calmwolfs.ktvalorantapi.KtValorantApi;
import com.valostats.valostats.utils.GsonUtils;

public class ValoStats {

    public static void main(String[] args) {
        String apiKey = GsonUtils.getApiKey();
        KtValorantApi api = new KtValorantApi(apiKey);
    }
}
