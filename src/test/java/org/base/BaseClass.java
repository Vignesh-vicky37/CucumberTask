package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Actions a;
	public static Alert alert;
	public static Select s;
	public static JavascriptExecutor jse;

//WEB DRIVER	

	public static void launchBrowser(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

	}

	public static void windowMaximize() {
		driver.manage().window().maximize();
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void closeCurrentPage() {
		driver.close();
	}

	public static void closeWebBrowser() {
		driver.quit();
	}

	public static String getTitleOfCurrentPage() {
		String title = driver.getTitle();
		return title;
	}

	public static String getUrlOfCurrentPage() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	
// NAVIGATION

	public static void refreshPage() {
		driver.navigate().refresh();
	}

	public static void gotoPreviousPage() {
		driver.navigate().back();
	}

	public static void gotoNextpage() {
		driver.navigate().forward();
	}

	public static void navigateToUrl(String url) {
		driver.navigate().to(url);

	}

//WebElement	

	public static String getTextOfWebElement(WebElement element) {
		String text = element.getText();
		return text;
	}

	public static String getAttributeOfWebElement(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}

	public static void clickWebElement(WebElement element) {
		element.click();
	}

	public static void passTextTOWebElement(WebElement element, String textValue) {
		element.sendKeys(textValue);
	}

//actions	

	public static void moveCursorToWebElement(WebElement element) {
		a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	public static void doubleClickTheWebElement(WebElement element) {
		a = new Actions(driver);
		a.doubleClick(element).perform();
	}

	public static void dragAndDropToWebElement(WebElement source, WebElement target) {
		a = new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}

	public static void rightClickTheWebElement(WebElement element) {
		a = new Actions(driver);
		a.contextClick(element).perform();
	}

//ALERTS	

	public static void switchToAlert() {
		alert = driver.switchTo().alert();
	}

	public static void acceptTheAlert() {
		alert.accept();
	}

	public static void dismissTheAlert() {
		alert.dismiss();
	}

	public static void passTextToAlertTextBox(String enterText) {
		alert.sendKeys(enterText);
	}

	public static String getTextFromAlert(String enterText) {
		String text = alert.getText();
		return text;
	}

//FRAMES

	public static void switchToFrame(WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}

	public static void switchTOParentFrame() {
		driver.switchTo().parentFrame();
	}

	public static void switchTODefaultContent() {
		driver.switchTo().defaultContent();
	}

//TAKESCREENSHOT

	public static void takeSS(String nameofss) throws IOException {
		TakesScreenshot tss = (TakesScreenshot) driver;
		File source = tss.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\JUJU\\eclipse-workspace\\CucumberTask\\ScreenShot\\" + nameofss + ".png");
		FileUtils.copyFile(source, destination);
	}

	public static void attachSSToHtml(io.cucumber.core.api.Scenario scen) {

		TakesScreenshot ass = (TakesScreenshot) driver;
		byte[] ss = ass.getScreenshotAs(OutputType.BYTES);
		scen.embed(ss, "image/png");

	}
//JAVA SCRIPT EXECUTOR

	public static void javaScriptSetAttribute(String enterText, WebElement element) {
		jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('value'," + "'" + enterText + "'" + ")", element);
	}

	public static void javaScriptClick(WebElement element) {
		jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", element);
	}

	public static String javaScriptGetAttribute(WebElement element) {
		jse = (JavascriptExecutor) driver;
		Object text = jse.executeScript("return arguments[0].getAttribute('value')", element);
		String s = (String) text;
		System.out.println(s);
		return s;
	}

	public static void javaScriptScrollInToView(WebElement element, boolean enterTrueOrFlase) {
		jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(" + enterTrueOrFlase + ")", element);
	}

//SELECT method	

	public static void selectByValue(String value) {
		s.selectByValue(value);
	}

	public static void selectByVisibleText(String text) {
		s.selectByVisibleText(text);
	}

	public static void selectByIndex(int index) {
		s.selectByIndex(index);
	}

	public static boolean selectIsMultiple() {
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		return multiple;
	}

	public static String SelectGetOptionsTxt(WebElement element, int i) {

		s = new Select(element);

		List<WebElement> options = s.getOptions();
		WebElement webElement = options.get(i);
		String text = webElement.getText();
		return text;
	}

	public static String SelectGetOptionsAttribute(WebElement element, int i) {

		s = new Select(element);

		List<WebElement> options = s.getOptions();
		WebElement webElement = options.get(i);
		String text = webElement.getAttribute("value");
		return text;
	}

	public static String selectGetAllSelectedOption(WebElement element, int i) {

		s = new Select(element);

		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		WebElement webElement = allSelectedOptions.get(i);
		String attribute = webElement.getAttribute("value");
		return attribute;
	}

	public static String selectGetFirstSelectedOption(WebElement element) {

		s = new Select(element);

		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String attribute = firstSelectedOption.getAttribute("value");
		return attribute;
	}

	public static void selectDeSelectByValue(WebElement element, String value) {

		s = new Select(element);

		s.deselectByValue(value);
	}

	public static void selectDeSelectByVisibleText(WebElement element, String text) {

		s = new Select(element);

		s.deselectByVisibleText(text);
	}

	public static void selectDeSelectByIndex(WebElement element, int index) {

		s = new Select(element);

		s.deselectByIndex(index);
	}

	public static void selectDeSelectAll(WebElement element) {

		s = new Select(element);

		s.deselectAll();
	}

//WINDOW HANDLING

	public static void switchToWindow(int i) {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> winId = new ArrayList<String>();
		winId.addAll(windowHandles);
		driver.switchTo().window(winId.get(i));
	}

//WAITS 

	public static void threadSleep(long enterMillis) throws InterruptedException {
		Thread.sleep(enterMillis);
	}

	public static void implicitWait(long time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}

//DATADRIVEN(EXCEL)	

	public static String readParticularcell(String bookName, String sheetName, int r, int c) throws IOException {
		File f = new File("C:\\Users\\JUJU\\eclipse-workspace\\CucumberTask\\WorkBook\\" + bookName + ".xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(r);
		Cell cell = row.getCell(c);
		int cellType = cell.getCellType();
		String value = "";
		if (cellType == 1) {
			value = cell.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
			value = sdf.format(dateCellValue);
		} else {
			double numericCellValue = cell.getNumericCellValue();
			long lon = (long) numericCellValue;
			value = String.valueOf(lon);
		}
		return value;
	}

	public static void readAllcell(String bookName, String sheetName) throws IOException {
		File f = new File("C:\\Users\\JUJU\\eclipse-workspace\\CucumberTask\\WorkBook\\" + bookName + ".xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet(sheetName);

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				int cellType = cell.getCellType();
				if (cellType == 1) {
					String value = cell.getStringCellValue();
					System.out.println(value);
				} else if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
					String value = sdf.format(dateCellValue);
					System.out.println(value);

				} else {
					double numericCellValue = cell.getNumericCellValue();
					long l = (long) numericCellValue;
					String value = String.valueOf(l);
					System.out.println(value);
				}
			}
		}

	}

	public static void readParticularRow(String bookName, String sheetName, int i) throws IOException {
		File f = new File("C:\\Users\\JUJU\\eclipse-workspace\\CucumberTask\\WorkBook\\" + bookName + ".xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet(sheetName);

		Row row = sheet.getRow(i);
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			Cell cell = row.getCell(j);
			int cellType = cell.getCellType();
			if (cellType == 1) {
				String value = cell.getStringCellValue();
				System.out.println(value);
			} else if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
				String value = sdf.format(dateCellValue);
				System.out.println(value);

			} else {
				double numericCellValue = cell.getNumericCellValue();
				long l = (long) numericCellValue;
				String value = String.valueOf(l);
				System.out.println(value);
			}
		}
	}

//WRITE IN EXCEL

	public static void createNewFileInExcel(String newFileName, String newSheetName, int r, int c, String dataInput)
			throws IOException {

		File f = new File("C:\\Users\\JUJU\\eclipse-workspace\\CucumberTask\\WorkBook\\" + newFileName + ".xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet newSheet = w.createSheet(newSheetName);
		Row newRow = newSheet.createRow(r);
		Cell newCell = newRow.createCell(c);
		newCell.setCellValue(dataInput);
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);

	}

	public static void createNewSheetInExcel(String fileName, String newSheetName, int r, int c, String dataInput)
			throws IOException {

		File f = new File("C:\\Users\\JUJU\\eclipse-workspace\\CucumberTask\\WorkBook\\" + fileName + ".xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet newSheet = w.createSheet(newSheetName);
		Row newRow = newSheet.createRow(r);
		Cell newCell = newRow.createCell(c);
		newCell.setCellValue(dataInput);
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);

	}

	public static void createNewRowInExcel(String fileName, String sheetName, int r, int c, String dataInput)
			throws IOException {

		File f = new File("C:\\Users\\JUJU\\eclipse-workspace\\CucumberTask\\WorkBook\\" + fileName + ".xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet newSheet = w.getSheet(sheetName);
		Row newRow = newSheet.createRow(r);
		Cell newCell = newRow.createCell(c);
		newCell.setCellValue(dataInput);
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);

	}

	public static void createNewCellInExcel(String fileName, String sheetName, int r, int c, String dataInput)
			throws IOException {

		File f = new File("C:\\Users\\JUJU\\eclipse-workspace\\CucumberTask\\WorkBook\\" + fileName + ".xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet newSheet = w.getSheet(sheetName);
		Row newRow = newSheet.getRow(r);
		Cell newCell = newRow.createCell(c);
		newCell.setCellValue(dataInput);
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);

	}

	public static void updateDataToExcel(String fileName, String sheetName, int r, int c, String checkData,
			String newData) throws IOException {

		File f = new File("C:\\Users\\JUJU\\eclipse-workspace\\CucumberTask\\WorkBook\\" + fileName + ".xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheet = w.getSheet(sheetName);
		Row row = sheet.getRow(r);
		Cell cell = row.getCell(c);
		String data = cell.getStringCellValue();
		if (data.equals(checkData)) {
			cell.setCellValue(newData);
			FileOutputStream fos = new FileOutputStream(f);
			w.write(fos);
			System.out.println("Excel Updated...");

		} else {
			System.out.println("Excel Not Updated...");
		}

	}

	public static void ageInYears(int year, int month, int day) {

		LocalDate today = LocalDate.now();
		LocalDate bDay = LocalDate.of(year, month, day);
		int years = Period.between(bDay, today).getYears();
		System.out.println(years);

	}

}
