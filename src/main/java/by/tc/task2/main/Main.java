package by.tc.task2.main;

import static by.tc.task2.entity.criteria.SearchCriteria.*;

import by.tc.task2.entity.Appliance;
import by.tc.task2.entity.Laptop;
import by.tc.task2.entity.criteria.Criteria;
import by.tc.task2.entity.criteria.SearchCriteria;
import by.tc.task2.service.impl.ApplianceServiceImpl;

import java.util.List;

public class Main {

	public static void main(String[] args) {


		ApplianceServiceImpl service = new ApplianceServiceImpl();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaLaptop = new Criteria(Laptop.class.getSimpleName());//"Oven"

		criteriaLaptop.add(SearchCriteria.Laptop.BATTERY_CAPACITY.toString(), "3");

		List<Appliance> appliances = service.find(criteriaLaptop);

		for (Appliance a:appliances) {
			System.out.println("1-->"+a);
		}

		//////////////////////////////////////////////////////////////////

		Criteria criteriaVacuumCleaner = new Criteria(VacuumCleaner.class.getSimpleName());
		criteriaVacuumCleaner.add(VacuumCleaner.MOTOR_SPEED_REGULATION.toString(), "200");


		appliances = service.find(criteriaVacuumCleaner);
		for (Appliance a:appliances) {
			System.out.println("2-->"+a);
		}


		//////////////////////////////////////////////////////////////////

		criteriaVacuumCleaner = new Criteria(VacuumCleaner.class.getSimpleName());
		criteriaVacuumCleaner.add(VacuumCleaner.MOTOR_SPEED_REGULATION.toString(), "200");
		criteriaVacuumCleaner.add(VacuumCleaner.CLEANING_WIDTH.toString(), "100");

		appliances = service.find(criteriaVacuumCleaner);

		for (Appliance a:appliances) {
			System.out.println("3-->" + a);
		}

		Appliance appliance = service.findCheapest();
		System.out.println("Cheapest-->"+appliance);

	}

}
