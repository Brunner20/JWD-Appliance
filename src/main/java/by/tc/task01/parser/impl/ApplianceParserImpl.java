package by.tc.task01.parser.impl;

import by.tc.task01.parser.ApplianceParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplianceParserImpl implements ApplianceParser {


    public  static List<Map<String,Object>> parse(List<String> appliancesList){

        List<Map<String,Object>> maps = new ArrayList<>();
        for(String appliance:appliancesList)
        {
            String[] sentences = appliance.split("[,;:=\\s]+");
            Map<String, Object> params = new HashMap<>();

            params.put("TYPE", sentences[0]);
            for (int i = 1; i < sentences.length; i += 2) {
                params.put(sentences[i], sentences[i + 1]);
            }
            maps.add(params);
        }
        return maps;
    }
}
