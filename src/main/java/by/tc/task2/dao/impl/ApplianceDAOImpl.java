package by.tc.task2.dao.impl;

import by.tc.task2.dao.ApplianceDAO;
import by.tc.task2.entity.Appliance;
import by.tc.task2.entity.Laptop;
import by.tc.task2.entity.VacuumCleaner;
import by.tc.task2.entity.criteria.Criteria;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


import javax.xml.parsers.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;
import java.util.Map;


public class ApplianceDAOImpl implements ApplianceDAO{


	public ApplianceDAOImpl() {
	}


	private static ArrayList<Appliance> appliances = new ArrayList<>();

	private static Criteria criteria=new Criteria();

	private static class XMLHandler extends DefaultHandler {
		@Override
		public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {


			if (qName.equals("Laptop")) {
				String COST = attributes.getValue("COST");
				String BATTERY_CAPACITY = attributes.getValue("BATTERY_CAPACITY");
				String OS = attributes.getValue("OS");
				String MEMORY_ROM = attributes.getValue("MEMORY_ROM");
				String SYSTEM_MEMORY = attributes.getValue("SYSTEM_MEMORY");
				String CPU = attributes.getValue("CPU");
				String DISPLAY_INCHS = attributes.getValue("DISPLAY_INCHS");

				appliances.add(new Laptop(COST, BATTERY_CAPACITY,OS,MEMORY_ROM,SYSTEM_MEMORY,CPU,DISPLAY_INCHS));
			}

			if(qName.equals("VacuumCleaner")){
				String COST = attributes.getValue("COST");
				String POWER_CONSUMPTION = attributes.getValue("POWER_CONSUMPTION");
				String FILTER_TYPE = attributes.getValue("FILTER_TYPE");
				String BAG_TYPE = attributes.getValue("BAG_TYPE");
				String WAND_TYPE = attributes.getValue("WAND_TYPE");
				String MOTOR_SPEED_REGULATION = attributes.getValue("MOTOR_SPEED_REGULATION");
				String CLEANING_WIDTH = attributes.getValue("CLEANING_WIDTH");

				appliances.add(new Laptop(COST, POWER_CONSUMPTION,FILTER_TYPE,BAG_TYPE,WAND_TYPE,MOTOR_SPEED_REGULATION,CLEANING_WIDTH));

			}
		}

		}

	private static class XMLHandlerWithCriteria extends DefaultHandler {
		@Override
		public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {



			if (qName.equals(criteria.getGroupSearchName())) {



				boolean addFlag = true;

				for (Map.Entry<String, Object> entry : criteria.getCriteria().entrySet()) {

					String nameAttrib = attributes.getValue(entry.getKey());



					if (nameAttrib != null) {
						if (nameAttrib.equals(entry.getValue().toString())) {

							continue;
						}
					}
					addFlag=false;

				}
				if(addFlag) {

					if (qName.equals("Laptop")) {
						String COST = attributes.getValue("COST");
						String BATTERY_CAPACITY = attributes.getValue("BATTERY_CAPACITY");
						String OS = attributes.getValue("OS");
						String MEMORY_ROM = attributes.getValue("MEMORY_ROM");
						String SYSTEM_MEMORY = attributes.getValue("SYSTEM_MEMORY");
						String CPU = attributes.getValue("CPU");
						String DISPLAY_INCHS = attributes.getValue("DISPLAY_INCHS");

						appliances.add(new Laptop(COST, BATTERY_CAPACITY, OS, MEMORY_ROM, SYSTEM_MEMORY, CPU, DISPLAY_INCHS));
					}

					if (qName.equals("VacuumCleaner")) {
						String COST = attributes.getValue("COST");
						String POWER_CONSUMPTION = attributes.getValue("POWER_CONSUMPTION");
						String FILTER_TYPE = attributes.getValue("FILTER_TYPE");
						String BAG_TYPE = attributes.getValue("BAG_TYPE");
						String WAND_TYPE = attributes.getValue("WAND_TYPE");
						String MOTOR_SPEED_REGULATION = attributes.getValue("MOTOR_SPEED_REGULATION");
						String CLEANING_WIDTH = attributes.getValue("CLEANING_WIDTH");

						appliances.add(new VacuumCleaner(COST, POWER_CONSUMPTION, FILTER_TYPE, BAG_TYPE, WAND_TYPE, MOTOR_SPEED_REGULATION, CLEANING_WIDTH));

					}
				}
			}
		}
	}

	public List<Appliance> getAll() {

		try {
			appliances = new ArrayList<>();

			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser parser = factory.newSAXParser();

			XMLHandler handler = new XMLHandler();
			parser.parse(new File("data.xml"), handler);

		}
		catch (ParserConfigurationException | SAXException | IOException e){}
		return appliances;
	}

	public List<Appliance> find(Criteria curCriteria) {

		try {
			appliances = new ArrayList<>();
			criteria=curCriteria;

			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser parser = factory.newSAXParser();

			XMLHandlerWithCriteria handler = new XMLHandlerWithCriteria();
			parser.parse(new File("data.xml"), handler);

		}
		catch (ParserConfigurationException | SAXException | IOException e){}
		return appliances;
	}

}


