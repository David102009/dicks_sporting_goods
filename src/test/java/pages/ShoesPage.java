package pages;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class ShoesPage {

	public ShoesPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath="//*[@id='facetCatgroup_facet_value_12301_202102']")
	public WebElement ShoesButton;
	
	@FindBy(xpath="//*[@id='facet_list_label_Gender']")
	public WebElement GenderSection;
	
	@FindBy(xpath="//div[@id='facet_list_5495']/div/div[2]/span")
	public WebElement WomensCheckBox;
	
	@FindBy(xpath="//div[@id='facet_list_label_Brand']")
	public WebElement BrandSelection;
	
	@FindBy(xpath="//input[@placeholder='Search Brands']")
	public WebElement BrandSerchBox;
	
	@FindBy(xpath="//div[@alt='Nike']/span")
	public WebElement nikeCheckBox;
	
	@FindBy(xpath="//div[@id='facet_list_label_Product_Type']")
	public WebElement ProductTypeText;
	
	@FindBy(xpath="//label[@id='5382_facet_value_Athletic___Sneakers']")
	public WebElement AthleticAndSneakers;
	
	@FindBy(xpath="//*[contains(text(),'Product Type: Athletic & Sneakers')]")
	public WebElement selectionTextForAthleticAndSneakers;
	
	@FindBy(xpath="//span[contains(text(),'Activity: Casual')]")
	public WebElement selectionTextForCasual;
	
	@FindBy(xpath="//*[@id='facet_list_label_Activity']")
	public WebElement activityDropDown;
	
	@FindBy(xpath="//*[@alt='Casual']")
	public WebElement casualCheckBox;
	
	@FindBy(xpath="//div[@id='facet_list_label_Womens_Shoe_Size']")
	public WebElement womenShoeSizeDropDown;
	
	@FindBy(xpath="//div[@id='facet_list_5213']/div/div[2]/input[@type='text']")
	public WebElement searchSizeCheckBox;
	
	@FindBy(xpath="//div[@id='facet_list_5213']//div[@data-testid='checkbox' and @alt='6.0']")
	public WebElement womenShoesSize6;
	
	@FindBy(xpath="//span[contains(text(),'Womens Shoe Size: 6.0')]")
	public WebElement womenShoesSize6Text;
	
	@FindBy(xpath="//div[@id='facet_list_label_Shoe_Width']")
	public WebElement shoesWidthDropDown;
	
	@FindBy(xpath="//label[@id='5471_facet_value_Medium']")
	public WebElement mediumCheckBox;
	
	@FindBy(xpath="//span[contains(text(),'Shoe Width: Medium')]")
	public WebElement mediumText;
	
	@FindBy(xpath="//div[@id='facet_list_label_Color']")
	public WebElement colorDropDown;
	
	@FindBy(xpath="//label[@id='3232_facet_value_Black']")
	public WebElement colorBlack;
	
	@FindBy(xpath="//span[contains(text(),'Color: Black')]")
	public WebElement colorBlackText;
	
	@FindBy(xpath="//div[@id='facet_list_label_Sale']")
	public WebElement saleDropDown;
	
	@FindBy(xpath="//div[@class='mdc-switch__thumb-underlay  ball-left ']")
	public WebElement saleToggle;
	
	@FindBy(xpath="//span[contains(text(),'Sale')]")
	public WebElement saleText;
	
	@FindBy(xpath="//div[@id='facet_list_label_Price']")
	public WebElement priceDropDown;
	
	@FindBy(xpath="//div[@alt='$50 - $100']")
	public WebElement price$50_$100;
	
	@FindBy(xpath="//span[contains(text(),'Price: $50 - $100')]")
	public WebElement price$50_$100Text;
	
	@FindBy(xpath="//div[@class='rs-sort-text']")
	public WebElement sortDropDown;
	
	@FindBy(xpath="//div[contains(text(),'Top Sellers')]")
	public WebElement topSellersButton;
	
	@FindBy(xpath="//div[contains(text(),'7423 results for \"shoes\"')]")
	public WebElement resultsForShoesText;
	
	@FindBy(xpath="//div[contains(text(),'Price High to Low')]")
	public WebElement highToLow;
	
	@FindBy(xpath="//div[contains(text(),'Price Low to High')]")
	public WebElement lowToHigh;
	
	@FindBy(xpath="//p[@class='offer-price']")
	public List<WebElement> lowToHighPrices;
	
	@FindBy(xpath="//p[@class='final-price']")
	public List<WebElement> highToLowPrices;
	
	public double getPrice(WebElement priceElement) {
	    String priceText = priceElement.getText().replaceAll("[^0-9,]", "").replace(",", ".");
	    DecimalFormat format = (DecimalFormat) NumberFormat.getNumberInstance(Locale.US);
	    format.setParseBigDecimal(true);
	    try {
	        return format.parse(priceText).doubleValue();
	    } catch (ParseException e) {
	        e.printStackTrace();
	        return 0.0;
	    }
	}
	@FindBy(xpath="//a[contains(text(),'Select a nearby store')]")
	public WebElement selectANearByStore;
	
	@FindBy(xpath="//div[@class='store-selection-modal-search hmf-display-flex hmf-align-items-flex-start hmf-mt-m hmf-mb-m-0']/button")
	public WebElement updateButton;
	
	@FindBy(xpath="//*[@class='homefield-textinput  store-selection-modal-search-input hmf-flex-2']")
	public WebElement enterZipCodeTextBox;
	
	@FindBy(xpath="//div[@class='store-selection-modal-store-list']/div/div/div[5]/button/span/span")
	public List<WebElement> selectStore;
	
	@FindBy(xpath="//div[@class='dsg-store-display-label']/a")
	public WebElement shippingTo;
	
	@FindBy(xpath="//div[@id='facetCatgroup_facet_value_12301_202102']")
	public WebElement categoriesShoes;
	
	@FindBy(xpath="//div[@class='dsg-flex align-items-center flex-grow-none flex-shrink']/div[4]/button/span")
	public WebElement sameDayDelivery;
	
	@FindBy(xpath="//div[@id='hmf-modal-container-id']/div/div[@aria-label='Close']")
	public WebElement ExitFromSameDayDeliveryFilter;
	
	@FindBy(xpath="//div[contains(@class, 'filter-chip')]//*[local-name()='svg' and contains(@class, 'filter-chip-close')]/*[local-name()='path']")
	public WebElement shoesExitButton;
	
	@FindBy(xpath="//a[@class='dsg-react-inline-hyperlink ']")
	public WebElement clearAllLink;
	

	
	
	
	@FindBy(xpath ="//*[@class='find-a-store hmf-subheader-bold-l']")
    public WebElement findAStoreButton;

    @FindBy(xpath ="//div[contains(@class, 'store-selection-modal-search-input')]//input[@placeholder='Enter Zip code']")
    public WebElement storeSearchBox;

    @FindBy(xpath="//button[@aria-label='SEARCH']")
    public WebElement storeSearchButton;

    @FindBy(xpath = "//div[@class='store-selection-modal-header hmf-p-s hmf-mb-xxxs hmf-body-bold-l']")
    public WebElement iframeStoreLocationBox;
}
