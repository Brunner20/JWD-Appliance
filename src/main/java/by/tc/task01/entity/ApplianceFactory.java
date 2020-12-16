package by.tc.task01.entity;

import java.util.Map;

public class ApplianceFactory {


    public  static Appliance createElectronic(Map<String,Object> map){
        Appliance electronics = null;
        String type = (String) map.get("TYPE");
        switch (type){
            case "Oven" : electronics= createOven(map);
            break;
            case "Laptop": electronics= createLaptop(map);
            break;
            case "Speakers":electronics= createSpeakers(map);
            break;
            case "TabletPC": electronics = createTablet(map);
            break;
            case "Refrigerator":electronics = createRefrigerator(map);
            break;
            case "VacuumCleaner":electronics = createVacuumCleaner(map);
            break;
            default:
                throw new IllegalArgumentException("wrong type "+type);
        }
        return electronics;
    }

    private static Oven createOven(Map<String, Object> map) {
        int powerConsumption = Integer.parseInt( (String) map.get("POWER_CONSUMPTION"));
        int weight = Integer.parseInt( (String) map.get("WEIGHT"));
        double height = Double.parseDouble( (String) map.get("HEIGHT"));
        double width = Double.parseDouble( (String) map.get("WIDTH"));
        int capacity = Integer.parseInt( (String) map.get("CAPACITY"));
        int depth = Integer.parseInt( (String) map.get("DEPTH"));
        return new Oven(powerConsumption, weight, capacity,depth,height, width);
    }

    private static Laptop createLaptop(Map<String, Object> map) {
        int batteryCapacity = Integer.parseInt( (String) map.get("BATTERY_CAPACITY"));
        String operatingSystem = (String) map.get("OS");
        int memoryRom = Integer.parseInt( (String) map.get("MEMORY_ROM"));
        int systemMemory = Integer.parseInt( (String)map.get("SYSTEM_MEMORY"));
        double cpu = Double.parseDouble((String) map.get("CPU"));
        int displayInches = Integer.parseInt( (String) map.get("DISPLAY_INCHS"));
        return new Laptop(batteryCapacity,operatingSystem, memoryRom,  systemMemory, cpu,displayInches);
    }

    private static Refrigerator createRefrigerator(Map<String, Object> map) {
        int powerConsumption = Integer.parseInt( (String) map.get("POWER_CONSUMPTION"));
        int weight =Integer.parseInt( (String) map.get("WEIGHT"));
        int freezerCapacity = Integer.parseInt( (String) map.get("FREEZER_CAPACITY"));
        double overallCapacity = Double.parseDouble((String) map.get("OVERALL_CAPACITY"));
        int height = Integer.parseInt( (String)map.get("HEIGHT"));
        int width = Integer.parseInt( (String) map.get("WIDTH"));

        return new Refrigerator(powerConsumption, weight,freezerCapacity,overallCapacity, height, width);
    }

    private static Speakers createSpeakers(Map<String, Object> map) {
        int powerConsumption = Integer.parseInt( (String)map.get("POWER_CONSUMPTION"));
        int numberOfSpeakers = Integer.parseInt( (String) map.get("NUMBER_OF_SPEAKERS"));
        String frequencyRange = (String) map.get("FREQUENCY_RANGE");
        int cordLength = Integer.parseInt( (String) map.get("CORD_LENGTH"));
        return new Speakers(powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
    }

    private static TabletPC createTablet(Map<String, Object> map) {
        double batteryCapacity = Double.parseDouble( (String) map.get("BATTERY_CAPACITY"));
        int displayInches = Integer.parseInt( (String) map.get("DISPLAY_INCHES"));
        int memoryRom = Integer.parseInt( (String) map.get("MEMORY_ROM"));
        int flashMemoryCapacity = Integer.parseInt( (String) map.get("FLASH_MEMORY_CAPACITY"));
        String color = (String) map.get("COLOR");

        return new TabletPC(batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, color);
    }

    private static VacuumCleaner createVacuumCleaner(Map<String, Object> map){

        int powerConsumption=Integer.parseInt( (String) map.get("POWER_CONSUMPTION"));
        String filterType =(String) map.get("FILTER_TYPE");
        String bagType= (String) map.get("BAG_TYPE");
        String wandType= (String) map.get("WAND_TYPE");
        int motorSpeedRegulation=Integer.parseInt( (String) map.get("MOTOR_SPEED_REGULATION"));
        int cleaningWidth=Integer.parseInt( (String) map.get("CLEANING_WIDTH"));
        return new VacuumCleaner(powerConsumption, filterType, bagType, wandType, motorSpeedRegulation, cleaningWidth);
    }
}
