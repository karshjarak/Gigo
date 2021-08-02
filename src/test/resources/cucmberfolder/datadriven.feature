Feature: create customer post request

Scenario Outline: create valid customer api request

Given i have valid key
And  i pass '<email>' as email
And i pass '<description>' as description
When i send a post request to '<uri>' as uri
Then  i should get <statuscode> as status code
And i should get '<email id>' as email id
And i should get '<description>' as description 
And customer id should not be null


Examples:
|email|description|uri|statuscode|email id|description|
|test1@gmail.com|heyjhon|https://api.stripe.com/v1/customers|200|test1@gmail.com|heyjhon|
|test2@gmail.com|dear|https://api.stripe.com/v1/customers|200|test2@gmail.com|dear|
 
