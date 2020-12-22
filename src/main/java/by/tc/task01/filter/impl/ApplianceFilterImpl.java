package by.tc.task01.filter.impl;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.filter.ApplianceFilter;

import java.util.ArrayList;
import java.util.List;

public class ApplianceFilterImpl implements ApplianceFilter {
    
    private static final String REGEX = "[,;:=\\s]+";

    List<String> applianceData;

    public void setApplianceData(List<String> applianceData) {
        this.applianceData = applianceData;
    }

    public List<String> getApplianceData(){return applianceData;}


    public List<String> filterAll(Criteria criteria){

        List<String> applianceList = new ArrayList<>();

        for(String appliance: applianceData) {
            if(appliance.contains(criteria.getGroupSearchName()) ||criteria.getGroupSearchName()==null || criteria.getGroupSearchName().isEmpty())
            {
                if(search(appliance,criteria))
                    applianceList.add(appliance);
            }

        }
        return applianceList;
    }

    private boolean search(String line,Criteria criteria){

        boolean isApplianceToSearch=false;
        String [] sentences = line.split(REGEX);

        for (int i =1;i< sentences.length;i+=2)
        {
            if(criteria.getValue(sentences[i])!=null)
            {
                String value = String.valueOf(criteria.getValue(sentences[i])).toLowerCase();
                isApplianceToSearch = value.equals(sentences[i + 1]);
            }
        }
        return isApplianceToSearch;
    }

}
