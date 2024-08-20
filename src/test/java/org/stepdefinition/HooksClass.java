package org.stepdefinition;

import java.io.IOException;

import org.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {

	String bookName = "CUCUMBERTASK";
	String sheetName = "FB";
	
	@Before(order = 1)
	public void openBrowser() throws IOException {

		launchBrowser(readParticularcell(bookName, sheetName, 0, 1));
	}

	@Before(order = 2)
	public void fullScreen() {

		windowMaximize();
	}

	@Before(order = 3)
	public void applaunch() throws IOException {

		launchUrl(readParticularcell(bookName, sheetName, 1, 1));
	}

	@Before(order = 4)
	public void waits() {

		implicitWait(20);
	}

	@After(order=1)
	public void closingapp() {

		closeWebBrowser();
		
	}

}
