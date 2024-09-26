//import io.restassured.RestAssured;
//import io.restassured.response.Response;
//
//import static io.restassured.RestAssured.given;
//import static org.hamcrest.Matchers.*;
//
//public class API2 {
//    public static void main(String[] args) {
//        RestAssured.baseURI = "https://rahulshettyacademy.com";
//
//        // Capture the response
//        Response response = given().log().all()
//                .queryParam("key", "qaclick123")
//                .header("Content-Type", "application/json")
//                .body("""
//                        {
//                          "location": {
//                            "lat": "-38.383494",
//                            "lng": "33.427362"
//                          },
//                          "accuracy": "50",
//                          "name": "Frontline house",
//                          "phone_number": "(+91) 983 893 3937",
//                          "address": "70 winter walk, USA",
//                          "types": ["shoe park", "shop"],
//                          "website": "https://rahulshettyacademy.com",
//                          "language": "French-IN"
//                        }
//                        """)
//                .when().post("maps/api/place/add/json")
//                .then().log().all()
//                .assertThat().statusCode(200)
//                .header("Server", "Apache/2.4.52 (Ubuntu)")
//                .extract().response();  // Extracting the response
//
//        // Print the entire response body as a string
//        String responseBody = response.asString();
//        System.out.println("Response Body is: " + responseBody);
//
//        // Validate specific fields from the response (assuming response is not empty)
//        String placeId = response.path("place_id");  // Extract a specific field like 'place_id'
//        System.out.println("Place ID is: " + placeId);
//
//        // You can also validate fields like this
//        response.then().assertThat()
//                .body("scope", equalTo("APP"))  // Validate 'scope' in the response
//                .body("status", equalTo("OK")); // Validate 'status' field
//    }
//}
//
