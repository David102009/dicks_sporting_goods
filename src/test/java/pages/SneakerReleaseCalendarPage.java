package pages;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class SneakerReleaseCalendarPage {

	public SneakerReleaseCalendarPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath="//span[text()='Home']")
	public WebElement selectHomeButton;
	
	@FindBy(xpath="//homefield-icon[@name='notification-add']")
	public List<WebElement> setReminderButton;
	
	@FindBy(xpath="//div[@class='notification-button hmf-py-s hmf-my-xxs hmf-pl-l']")
	public  List <WebElement> selectGoogleButton;
	
	@FindBy(xpath="//span[@class='date-container d-flex flex-column text-center']")
	 List<WebElement> dateElements;
	
	public boolean checkDatesNotBeforeCurrent() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy", Locale.ENGLISH);
        LocalDate currentDate = LocalDate.now();
       
        for (WebElement dateElement : dateElements) {
            String dateText = dateElement.getText().replaceAll("\\r?\\n", ""); // Remove newline characters
            LocalDate date = LocalDate.parse(dateText, formatter);
            if (date.isBefore(currentDate)) {
                return false;
            }
        }

        return true;
    }

}
