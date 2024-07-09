package com.valostats.valostats;

import com.calmwolfs.ktvalorantapi.KtValorantApi;
import com.calmwolfs.ktvalorantapi.datatypes.PlayerName;
import com.calmwolfs.ktvalorantapi.datatypes.SearchSize;
import com.calmwolfs.ktvalorantapi.enums.Region;
import com.calmwolfs.ktvalorantapi.models.StoredMatch;
import com.valostats.valostats.utils.GsonUtils;

import java.io.IOException;
import java.util.List;

public class ValoStats {

    public static void main(String[] args) throws IOException {
        String apiKey = GsonUtils.getApiKey();
        KtValorantApi api = new KtValorantApi(apiKey);
        System.out.println(api.getAccountDetails(new PlayerName("dloraH#0001"), false));

        List<StoredMatch> matches = api.getStoredMatches(Region.ASIA_PACIFIC, new PlayerName("Scooby dooby doo#wheru"), new SearchSize(10), null, null);
        int size = matches.size();
        System.out.println(size);

    }
}
