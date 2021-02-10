Feature: Place new order

Background:
Given Initialize the browser
And access the url


Scenario: add products to cart
When add the product in cart and place the order
Then Order should be placed successfully
And close the browser

