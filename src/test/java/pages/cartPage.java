package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class cartPage {

	public cartPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//*[@data-em='footwearbubbles__hp__trending-card__card2__image__oncloudmonster2__aem']")
	public WebElement selectItemFromHomePage;
	
	@FindBy(xpath = "//*[@data-em='plp_1_1_23MAZWCLDMNSTR2BLFTW_pinned']//button//div")
	public WebElement itemAddToCart;
	
	@FindBy(xpath = "//*[@class='attribute-groups product-attributes hmf-flex-column']//div//div//div//div//div//img[@title='Aloe']")
	public WebElement selectColor;
	
	@FindBy(xpath = "//*[@aria-labelledby='AttributeGroup-Shoe-Size']//div//div//p[text()=\"6.0\"]")
	public WebElement selectSize;
	
	@FindBy(xpath = "//*[@class='dsg-react-button-label hmf-display-flex hmf-align-items-center hmf-justify-content-center']")
	public WebElement addToCartFromProductPage;
	
	@FindBy(xpath="//div[@class='close']")
	public WebElement closePopUp;
	
	@FindBy(xpath="//*[@data-em='plp_1_2_23MAZMCLDPLSLTBLRMNS_pinned']//button//div")
	public WebElement anotherItemAddToCart;
	
	@FindBy(xpath= "//img[@id='Black/Grey']")
	public WebElement selectAnotherColor;
	
	@FindBy(xpath="//div[@class='value false false']//p[text()='8.5']")
	public WebElement selectAnotherSize;
	
	@FindBy(xpath="//*[@class='cart-icon']")
	public WebElement cartIcon;
	
	@FindBy(xpath="//h3[@class='hmf-mb-0 cart-title']")
	public WebElement confirmNumberOfItemsInCart;
	
	@FindBy(xpath="//img[@class='delete-icon']")
	public WebElement removeItemsFromCart;
	
	@FindBy(xpath="//h1[@class='empty-cart-heading hmf-mb-xs center-text']")
	public WebElement isCartEmpty;
}