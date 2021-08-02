package basic;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import org.testng.Assert;

public class api {

	RequestSpecification reqs = null;
	Response res = null;

	@Given("^i have valid key$")
	public void i_have_valid_key() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("key is passed");

		reqs = given().auth().basic(
				"sk_test_51JBxNkSApskib57ZfvHQosp78ljzCinFXHwH3GLHJClGJXWfXjgjs83SMy9R45mKDCJRizhUwq0pZtBfV5ESwdwh00Ac3JKxCc",
				"");
	}

	@Given("^i pass '(.*?)' as email$")
	public void i_pass_as_email(String email) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("email is passed");

		reqs.formParam("email", email);

	}

	@Given("^i pass '(.*?)' as description$")
	public void i_pass_as_description(String description) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("description is passed");

		reqs.formParam("description", description);

	}

	@When("^i send a post request to '(.*?)' as uri$")
	public void i_send_a_post_request_to_as_uri(String string) {
		// Write code here that turns the phrase above into concrete actions

		System.out.println("seeher"+string);
		
		res = reqs.log().all().post(string);
		res.prettyPeek();
	}

	@Then("^i should get (\\d+) as status code$")
	public void i_should_get_as_status_code(int statuscode) {

		Assert.assertEquals(res.statusCode(), statuscode);

	}

	@Then("^i should get '(.*?)' as email id$")
	public void i_should_get_karshi555_gmail_com_as_email_id(String validemail) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("email id actual is passed");

		Assert.assertEquals(res.jsonPath().get("email"), validemail);

	}

	@Then("^i should get '(.*?)' as description$")
	public void i_should_get_as_description(String validesc) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("description  actual is passed");
		Assert.assertEquals(res.jsonPath().get("description"), validesc);

	}

	@Then("^customer id should not be null$")
	public void customer_id_should_not_be_null() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("customer not null id ");
		Assert.assertNotNull(res.jsonPath().get("id"));
	}

}
