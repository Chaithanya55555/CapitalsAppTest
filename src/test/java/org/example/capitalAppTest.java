package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class capitalAppTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver obj = new ChromeDriver();
        obj.get("https://qacapitalsapp.ccbp.tech/");
        List <WebElement> dropdown = obj.findElements(By.xpath("//select[@class = 'capital-select']/child::option"));
        ArrayList<String> capitals = new ArrayList<>();
        capitals.add("New Delhi");
        capitals.add("London");
        capitals.add("Paris");
        capitals.add("Kathmandu");
        capitals.add("Helsinki");

        for (int i = 0; i < dropdown.size(); i++) {
            if (capitals.get(i).equals(dropdown.get(i).getText())){
                System.out.println("All options are as expected");
            }else {
                System.out.println("Mismatch found");
            }
        }
        obj.quit();
    }
}
