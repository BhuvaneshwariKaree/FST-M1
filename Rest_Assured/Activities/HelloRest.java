package examples;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

  public class HelloRest {

  	String baseURI; 

      @Test
      public void helloRest() {
          // Specify the base URL to the RESTful web service
          baseURI = "https://petstore.swagger.io/v2/pet";
          

          Response response = 
             given().contentType(ContentType.JSON) // Set headers
             // given().contentType(ContentType.XML).accept(ContentType.XML) // Set headers
              .when().get(baseURI + "/findByStatus?status=sold"); // Run GET request
          
          response.prettyPrint();
          
          // Assertions
          response.then().statusCode(200);
          response.then().body("[0].status", equalTo("sold"));
      }

  }