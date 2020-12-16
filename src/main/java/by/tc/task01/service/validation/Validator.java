package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

public class Validator {
	
	public static boolean criteriaValidator(Criteria criteria) {


		if(criteria.getValue("POWER_CONSUMPTION")!=null)
		{
			if((int)criteria.getValue("POWER_CONSUMPTION")<=0)
				return false;
		}
		else if(criteria.getValue("WEIGHT")!=null)
		{
			if((int)criteria.getValue("WEIGHT")<=0)
				return false;
		}
		else if(criteria.getValue("CAPACITY")!=null)
		{
			if((int)criteria.getValue("CAPACITY")<=0)
				return false;
		}
		else if(criteria.getValue("DEPTH")!=null)
		{
			if((int)criteria.getValue("DEPTH")<=0)
				return false;
		}
		else if(criteria.getValue("HEIGHT")!=null)
		{
			if((double)criteria.getValue("HEIGHT")<=0)
				return false;
		}
		else if(criteria.getValue("WIDTH")!=null)
		{
			if((double)criteria.getValue("WIDTH")<=0)
				return false;
		}
		else if(criteria.getValue("BATTERY_CAPACITY")!=null)
		{
			if((double)criteria.getValue("BATTERY_CAPACITY")<=0)
				return false;
		}
		else if(criteria.getValue("MEMORY_ROM")!=null)
		{
			if((int)criteria.getValue("MEMORY_ROM")<=0)
				return false;
		}
		else if(criteria.getValue("SYSTEM_MEMORY")!=null)
		{
			if((int)criteria.getValue("SYSTEM_MEMORY")<=0)
				return false;
		}
		else if(criteria.getValue("CPU")!=null)
		{
			if((double)criteria.getValue("CPU")<=0)
				return false;
		}
		else if(criteria.getValue("DISPLAY_INCHS")!=null)
		{
			if((int)criteria.getValue("DISPLAY_INCHS")<=0)
				return false;
		}
		else if(criteria.getValue("FREEZER_CAPACITY")!=null)
		{
			if((int)criteria.getValue("FREEZER_CAPACITY")<=0)
				return false;
		}
		else if(criteria.getValue("OVERALL_CAPACITY")!=null)
		{
			if((int)criteria.getValue("OVERALL_CAPACITY")<=0)
				return false;
		}
		else if(criteria.getValue("MOTOR_SPEED_REGULATION")!=null)
		{
			if((int)criteria.getValue("MOTOR_SPEED_REGULATION")<=0)
				return false;
		}
		else if(criteria.getValue("CLEANING_WIDTH")!=null)
		{
			if((int)criteria.getValue("CLEANING_WIDTH")<=0)
				return false;
		}
		else if(criteria.getValue("DISPLAY_INCHES")!=null)
		{
			if((int)criteria.getValue("DISPLAY_INCHES")<=0)
				return false;
		}
		else if(criteria.getValue("FLASH_MEMORY_CAPACITY")!=null)
		{
			if((int)criteria.getValue("FLASH_MEMORY_CAPACITY")<=0)
				return false;
		}
		else if(criteria.getValue("NUMBER_OF_SPEAKERS")!=null)
		{
			if((int)criteria.getValue("NUMBER_OF_SPEAKERS")<=0)
				return false;
		}
		else if(criteria.getValue("CORD_LENGTH")!=null)
		{
			if((int)criteria.getValue("CORD_LENGTH")<=0)
				return false;
		}

			return true;
	}

}

