package by.tc.task01.creator;

import by.tc.task01.entity.Appliance;
import by.tc.task01.factory.ApplianceFactory;
import by.tc.task01.parser.ApplianceParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplianceCreator {

    private List<String> data;

    public ApplianceCreator(List<String> data){
        this.data=data;
    }

    public List<Appliance> createAppliance(){

        List<Appliance> appliancesList = new ArrayList<>();
        List<Map<String,Object>> appliancesData = ApplianceParser.parse(data);


        if (appliancesData != null) {
            for (Map<String,Object> data:appliancesData){
                appliancesList.add( ApplianceFactory.createElectronic(data));
            }
        }

        return appliancesList;

    }


}
