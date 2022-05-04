Feature: Customer Account Wishlist page Tests

  # Homework
    Scenario: Customer Account Wishlist displays list of items
        Given I am logged in
        And I see Home page

        When I click on Sofas
        Then I see Sofas page

        When I click on Wishlist icon of the product
        Then I see Wishlist icon is activated

        When I click on the Login icon
        Then I should be logged in

        When I click on Ihre Wunschliste
        Then I see added item

    Scenario: Customer Account Wishlist displays list of items
        Given I am logged in
        And I see Home page

        When I click on Sofas
        Then I see Sofas page

        When I click on Wishlist icon of the product
        Then I see Wishlist icon is activated
        And I see added item in Merkliste

#    Scenario: Search for the item on CA Wishlist
#        Given I am logged in as user with 5 wishlist items
#        And I see Home page
#
#        When I click on the Login icon
#        And I see Customer Account page
#
#        When I click on Ihre Wunschliste
#        Then I see 5 items on my Wishlist
#
#        When I search for item on the Wishlist
#        Then I see 1 item on wishlist
#        And I see item name corresponds to search name
#
  # это уже относится к тестированию Wixhlist, а не Customer Account Wishlist

#    Scenario: Delete item from Wishlist
#        Given I am logged in and Wishlist is not empty
#        And I see Customer Account page
#
#        When I click on Ihre Wunschliste
#        Then I see Wunschliste page with 3 items
#
#        When I click on cross on Sofa item
#        Then I see less items in Wishlist
