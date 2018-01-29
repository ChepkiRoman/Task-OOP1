package by.tc.task01.entity.criteria;


import java.util.*;

public class Criteria<E> {

	private String applianceType;

	private Map<E, Object> criteria = new HashMap<E, Object>();

	public void add(E searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	public Map<E, Object> getCriteria(){
	    return criteria;
    }
    public Collection<Object> getCriteriaContent(){
	    return criteria.values();
    }

	public String getApplianceType() {
		return applianceType;
	}

	public void setApplianceType(String applianceType) {
		this.applianceType = applianceType;
	}
	public List<String> getStringCriteria() {
		List<String> arr = new ArrayList<>();
		for (Map.Entry<E, Object> entry : criteria.entrySet()) {
			arr.add(entry.getKey().toString().toUpperCase() + "=" + entry.getValue().toString().toLowerCase());
		}
		return arr;
	}



}
