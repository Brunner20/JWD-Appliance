package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.ApplianceFactory;
import by.tc.task01.entity.criteria.Criteria;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplianceDAOImpl implements ApplianceDAO{

	private static final String PATH = "appliances_db.txt";

	@Override
	public List<Appliance> find(Criteria criteria) {

	List<Appliance> appliance = new ArrayList<>();
	try {
		List<String> lines = Files.readAllLines(Paths.get(PATH));

		for(String line: lines) {
			if(line.contains(criteria.getGroupSearchName()) ||criteria.getGroupSearchName()==null || criteria.getGroupSearchName().isEmpty())
			{
				Appliance app =	search(line,criteria);
				if(app!=null)
					appliance.add(app);
			}


		}
	} catch (IOException e) {
			e.printStackTrace();
	}
		return appliance;
	}
	
	private Appliance createAppliance(String[] applianceParam){

		Map<String,Object> params = new HashMap<>();
		params.put("TYPE",applianceParam[0]);
		for (int i =1;i< applianceParam.length;i+=2) {
			params.put(applianceParam[i],applianceParam[i+1]);
		}


		return ApplianceFactory.createElectronic(params);
	}

	private Appliance search(String line,Criteria criteria){
		Appliance appliance = null;
		boolean isApplianceToSearch=false;
		String [] sentences = line.split("[,;:=\\s]+");

		for (int i =1;i< sentences.length;i+=2)
		{
			if(criteria.getValue(sentences[i])!=null)
			{
				String value = String.valueOf(criteria.getValue(sentences[i])).toLowerCase();
				isApplianceToSearch = false;

				if(value.equals(sentences[i+1]))
				{
					isApplianceToSearch =true;
				}
			}
		}
		if(isApplianceToSearch)
			appliance=createAppliance(sentences);

		return appliance;
	}

}


