package org.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
//Base Class
public class UtilityClass {
	
	public static WebDriver driver;
	
	public static  void launchChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}
	
	public static  void launchFirefox() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	public static void launchurl(String url) {
		driver.get(url);
	    }
	
	public static void timeout() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void getPageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		}
	
	public static void getTheUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		}
	
	public static void passText(String text,WebElement ele) {
		ele.sendKeys(text);
		}
	
	public static void clickWebEelment(WebElement btnWeEle) {
		btnWeEle.click();
		}
	
	public static void takeScreenShot(String name) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\usabi\\eclipse-workspace\\Utility\\screenshots\\"+name+".png"));
		}
	
	public static void dropDown(int index, WebElement ele) {
		Select s = new Select(ele);
		s.selectByIndex(index);
		}
	
	public static void getTxt(WebElement ele,String s ) {
			 s = ele.getText();
		}
	
	public static void particularExcelData(String filename,String sheetName,int RowIndex,int CellIndex) throws IOException {
		File f = new File("C:\\Users\\usabi\\eclipse-workspace\\Utility\\Excel\\"+filename);
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet mySheet = w.getSheet(sheetName); 
		Row parrow = mySheet.getRow(RowIndex);
		Cell parcell = parrow.getCell(CellIndex);
		System.out.println(parcell);
		}
	
	public static String toGetAllValuesInExcel(int getSheetNum,int getRowNum,int getCellNum ,String name) throws IOException {
		File f = new File("C:\\Users\\usabi\\eclipse-workspace\\Utility\\Excel\\"+name);
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);
		
		Sheet mysheet = w.getSheetAt(getSheetNum);
		
		for (int i = 0; i < mysheet.getPhysicalNumberOfRows(); i++) {
			Row r = mysheet.getRow(getRowNum);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(getCellNum);
				int cellType = c.getCellType();
				String value="";
				if (cellType ==1) {
					value = c.getStringCellValue();
					}
				else if (DateUtil.isCellDateFormatted(c)) {
					java.util.Date d =   c.getDateCellValue();
					SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyy");
					 value = s.format(d);
					}
				else {
					double dd = c.getNumericCellValue();
					long l = (long) dd;
					value = String.valueOf(l);
					}
				return value;
				}
				}
		return name;
			}
	
	public static  void createExcel(int creRow,int creCell,String creSheet,String setData,String name) throws IOException {
		
		File f = new File("C:\\Users\\usabi\\eclipse-workspace\\Utility\\Excel\\"+name);
		
		Workbook w = new XSSFWorkbook();
		
		Sheet newsheet = w.createSheet(creSheet);
		
		Row newRow = newsheet.createRow(creRow);
		
		Cell newCell = newRow.createCell(creCell);
		
		newCell.setCellValue(setData);
		
		FileOutputStream fos = new FileOutputStream(f);
		
		w.write(fos);
		
		System.out.println("Writed");
		
		}
	
	public static void createRow(int creRow,int creCell,String getSheet,String setData,String name) throws IOException {
		
		File f = new File("C:\\Users\\usabi\\eclipse-workspace\\Utility\\Excel\\"+name);
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook();
		
		Sheet newsheet = w.getSheet(getSheet);
		
		Row newRow = newsheet.createRow(creRow);
		
		Cell newCell = newRow.createCell(creCell);
		
		newCell.setCellValue(setData);
		
		FileOutputStream fos = new FileOutputStream(f);
		
		w.write(fos);
		
		System.out.println("Writed");
		
		}
	
	public static void createCell(int getRow,int creCell,String setData,String name) throws IOException {
		
		File f = new File("C:\\Users\\usabi\\eclipse-workspace\\Utility\\Excel\\"+name);
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook();
		
		Sheet newsheet = w.getSheet("sample");
		
		Row newRow = newsheet.getRow(getRow);
		
		Cell newCell = newRow.createCell(creCell);
		
		newCell.setCellValue(setData);
		
		FileOutputStream fos = new FileOutputStream(f);
		
		w.write(fos);
		
		System.out.println("Writed");
		
		}
	
	public static void updateTheExcel(int getsheet,int getRow,int getCell,String getData,String setData,String name) throws IOException {
		
		File f = new File("C:\\Users\\usabi\\eclipse-workspace\\Utility\\Excel\\"+name);
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);
		
		Sheet newsheet = w.getSheetAt(getsheet);
		
		Row newRow = newsheet.getRow(getRow);
		
		Cell newCell = newRow.getCell(getCell);
		
		String value = newCell.getStringCellValue();
		
		if (value.equals(getData)) {
			
			newCell.setCellValue(setData);
			
		}
		
		FileOutputStream fos = new FileOutputStream(f);
		
		w.write(fos);
		
		System.out.println("Writed");
		
		}
	
	public static void scrollUp(WebElement up) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		WebElement scroll = up;
		js.executeScript("arguments[0].scrollIntoView(true)",scroll);
		}
	
	public static void scrollDown(WebElement down) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		WebElement scroll = down;
		js.executeScript("arguments[0].scrollIntoView(false)",scroll);
		}
	
	public static String getAttributeValue(WebElement value) {
		String attribute = value.getAttribute("value");
		System.out.println(attribute);
		return attribute;
		
	}
	
		}


