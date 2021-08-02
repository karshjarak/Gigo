Feature: create customer post request

Scenario: create valid customer api request

Given i have valid key
And  i pass 'karshi555@gmail.com' as email
And i pass 'description' as description
When i send a post request to 'https://api.stripe.com/v1/customers' as uri
Then  i should get 200 as status code
And i should get 'karshi555@gmail.com' as email id
And i should get 'description' as description 
And customer id should not be null
