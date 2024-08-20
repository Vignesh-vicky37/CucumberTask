package org.jvm.report;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class GenerateJvmReport {
	
	public static void report(String addJsonReport) {

		File f = new File("src\\test\\resources");
		
		Configuration c = new Configuration(f, "DemoQa");
		c.addClassifications("Browser Name", "Edge");
		c.addClassifications("Browser Version", "123.0");
		c.addClassifications("Platform Name", "Windows");
		c.addClassifications("Platform version", "11");
		c.addClassifications("Sprint No", "1");
		
		List<String> l = new LinkedList<String>();
		l.add(addJsonReport);
		
		ReportBuilder r = new ReportBuilder(l, c);
		r.generateReports();
		
	}

}
