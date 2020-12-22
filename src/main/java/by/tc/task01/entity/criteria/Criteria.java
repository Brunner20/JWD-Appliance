package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Criteria {

	private String groupSearchName;
	private Map<String, Object> criteria = new HashMap<String, Object>();

	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}
	
	public String getGroupSearchName() {
		return groupSearchName;
	}

	public void add(String searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	public  Object getValue(String key){
		return criteria.get(key);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Criteria criteria1 = (Criteria) o;
		return groupSearchName.equals(criteria1.groupSearchName) &&
				criteria.equals(criteria1.criteria);
	}

	@Override
	public int hashCode() {
		return Objects.hash(groupSearchName, criteria);
	}
}
