package LiveProject;

import au.com.dius.pact.consumer.dsl.DslPart;
import au.com.dius.pact.consumer.dsl.PactDslJsonBody;
import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.consumer.junit5.PactConsumerTestExt;
import au.com.dius.pact.consumer.junit5.PactTestFor;
import au.com.dius.pact.core.model.RequestResponsePact;
import au.com.dius.pact.core.model.annotations.Pact;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@ExtendWith(PactConsumerTestExt.class)
public class ConsumerTest {

    //set the headers
    Map<String,String> headers = new HashMap<>();

    //create the contract
    @Pact(consumer ="UserConsumer" ,provider ="UserProvider" )
    public RequestResponsePact createPact(PactDslWithProvider buider){
        //Required headers
        headers.put("Content-Type","application/json");

        //Request and Response body
        DslPart reqAndResBody = new PactDslJsonBody()
                .numberType("id", 123)
                .stringType("firstName", "chaya")
                .stringType("lastName", "BR")
                .stringType("email", "chaya@example.com");



        //Interaction
        return buider.given("POST Request").
             uponReceiving("a request to create a user").
             method("POST").
             path("/api/users").
             headers(headers).
             body(reqAndResBody).
             willRespondWith().
             status(201).
             body(reqAndResBody).
             toPact();

    }
    @Test
    @PactTestFor(providerName = "UserProvider",port = "8282")
    public void postRequestTest(){
        //create request body
        Map<String,Object> reqbody = new HashMap<>();
        reqbody.put("id", 123);
        reqbody.put("firstName", "chaya");
        reqbody.put("lastName", "BR");
        reqbody.put("email", "chaya@example.com");

        //send request, get response, assert response
        given().baseUri("http://localhost:8282").headers(headers).body(reqbody).log().all().
        when().post("/api/users").
        then().statusCode(201).body("firstName",equalTo("chaya")).log().all();
    }
}
