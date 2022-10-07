package by.tc.task2.service;

import by.tc.task2.entity.Appliance;
import by.tc.task2.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceService {	
	
	List<Appliance> find(Criteria criteria);
	
}
