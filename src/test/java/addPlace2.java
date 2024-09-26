//import files.Payloads;
//import io.restassured.RestAssured;
//import io.restassured.path.json.JsonPath;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//
//import static io.restassured.RestAssured.given;
//import static org.hamcrest.Matchers.equalTo;
//
//public class addPlace2 {
//    //validate if Add Place API is working as expected
//    //given-all input details
//    //when-submit the API
//    //then-validates the response( import static rest assured for all these three methods)
//    //content of the file to string->content of the file can covert into Byte->Byte data to string
//    public static void main(String[] args) throws IOException {
//        RestAssured.baseURI = "https://rahulshettyacademy.com";
//        String response = given().log().all().queryParam("key", "qaclick123")
//                .header("Content-Type", "application/json")
//                .body(new String(Files.readAllBytes(Paths.get("C:\\Users\\Harshitha\\Downloads\\payload.json")))).when().post("maps/api/place/add/json")
//                .then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP")).header("Server", "Apache/2.4.52 (Ubuntu)").extract().response().asString();
//        System.out.println(response);
//        JsonPath js = new JsonPath(response); //for parsing Json
//        String placeId = js.getString("place_id");
//
//        System.out.println(placeId);
//    }
//}
