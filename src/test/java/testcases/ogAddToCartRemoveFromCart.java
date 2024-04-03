package testcases;

import org.testng.annotations.Test;

import utilities.commonMethods;

public class ogAddToCartRemoveFromCart extends commonMethods {

	@Test
	public void addToCartandRemove(){
		commonMethods.click(cOP.selectItemFromHomePage);
		commonMethods.click(cOP.itemAddToCart);
		commonMethods.click(cOP.selectColor);
		commonMethods.click(cOP.selectSize);
		commonMethods.click(cOP.addToCartFromProductPage);
		commonMethods.click(cOP.closePopUp);
		commonMethods.click(cP.homeButton);
		commonMethods.click(cOP.selectItemFromHomePage);
		commonMethods.click(cOP.anotherItemAddToCart);
		commonMethods.click(cOP.selectAnotherColor);
		commonMethods.click(cOP.selectAnotherSize);
		commonMethods.click(cOP.addToCartFromProductPage);
		commonMethods.click(cOP.closePopUp);
		commonMethods.SMALL_WAIT();
		commonMethods.click(cOP.cartIcon);
		System.out.println(cOP.confirmNumberOfItemsInCart.getText());
		commonMethods.click(cOP.removeItemsFromCart);
		commonMethods.SMALL_WAIT();
		commonMethods.click(cOP.removeItemsFromCart);
		System.out.println(cOP.isCartEmpty.getText());
	}	
}
