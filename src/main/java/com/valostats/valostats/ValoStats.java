package com.valostats.valostats;

import com.calmwolfs.ktvalorantapi.KtValorantApi;
import com.calmwolfs.ktvalorantapi.datatypes.PlayerName;
import com.calmwolfs.valorantmodelapi.ValorantModelApi;
import com.calmwolfs.valorantmodelapi.models.Agent;
import com.valostats.valostats.utils.GsonUtils;

import java.io.IOException;
import java.util.List;

public class ValoStats {

    public static void main(String[] args) throws IOException {
        String apiKey = GsonUtils.getApiKey();
        KtValorantApi api = new KtValorantApi(apiKey);
        System.out.println(api.getAccountDetails(new PlayerName("dloraH#0001"), false));

        List<Agent> agentList = ValorantModelApi.INSTANCE.getAgents(false);
        List<String> agentNames = agentList.stream().map(Agent::getDisplayName).toList();
        System.out.println(agentNames);
    }
}
