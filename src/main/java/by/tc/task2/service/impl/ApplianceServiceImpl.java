package by.tc.task2.service.impl;

import by.tc.task2.dao.impl.ApplianceDAOImpl;
import by.tc.task2.entity.Appliance;
import by.tc.task2.entity.criteria.Criteria;
import by.tc.task2.service.ApplianceService;

import java.util.Comparator;
import java.util.List;


public class ApplianceServiceImpl implements ApplianceService{


	public ApplianceServiceImpl() {
	}

	public List<Appliance> find(Criteria criteria) {

		ApplianceDAOImpl applianceDAO =new ApplianceDAOImpl();

		List<Appliance> result= applianceDAO.find(criteria);

		return result;
	}

	public Appliance findCheapest(){

		ApplianceDAOImpl applianceDAO =new ApplianceDAOImpl();

		List<Appliance> appliances= applianceDAO.getAll();

		Comparator<Appliance> comparator = new Comparator<Appliance>() {
			@Override
			public int compare(Appliance o1, Appliance o2) {
				int x= Integer.parseInt( o1.getCost());
				int y=Integer.parseInt(o2.getCost());
				return (x < y) ? -1 : ((x == y) ? 0 : 1);
			}
		};
		appliances.sort(comparator);

		return appliances.get(0);
	}



}


