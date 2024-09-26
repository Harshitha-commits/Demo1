//import io.restassured.RestAssured;
//import io.restassured.path.json.JsonPath;
//
//import java.io.File;
//
//import static io.restassured.RestAssured.given;
//
//public class BugTest {
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        RestAssured.baseURI = "https://harshithasuraparaj.atlassian.net/";
//        String createIssueResponse = given().header("Content-Type", "application/json")
//                .header("Authorization", "Basic aGFyc2hpdGhhc3VyYXBhcmFqQGdtYWlsLmNvbTpBVEFUVDN4RmZHRjBTWHQwN1k4TURtd3RfZUJkQUk0X1pqd2RhLTY1R3hIRmZNMWFUM21iOUV6UnRQMXRROUtoVHRuOU1iVTdRYXdGcWJwLWN0SWRRM2phMmlxRUhjelNzYWhEUk9wcGVkTDdraE8yMk9WdVJsenFBaWt3bGRSa3l5THNZOXRfMG1sM1JiMGlrbUFzREg4WGJPUXB6dHVEcnNMOHBOSXh4Z2diTHo2WlJJSEFDcDA9NDIxREQwOEQ=")
//                .body("{\n" + "\"fields\":{\n" + "\"project\":\n" + "{\n" + "\"key\": \"SCRUM\"\n" + "},\n" + "\"summary\": \"Website items are not working- automation Rest Assured\",\n" + "\"issuetype\": {\n" + "\"name\": \"Bug\"\n" + "}\n" + "}\n" + "}").log().all()
//                .post("rest/api/3/issue")
//                .then().log().all().assertThat().statusCode(201).contentType("application/json").extract().response().asString();
//        JsonPath js = new JsonPath(createIssueResponse);
//        String issueId = js.getString("id");
//        System.out.println(issueId);
//
//        given().pathParam("key", issueId).header("X-Atlassian-Token", "no-check")
//                .header("Authorization", "Basic aGFyc2hpdGhhc3VyYXBhcmFqQGdtYWlsLmNvbTpBVEFUVDN4RmZHRjBTWHQwN1k4TURtd3RfZUJkQUk0X1pqd2RhLTY1R3hIRmZNMWFUM21iOUV6UnRQMXRROUtoVHRuOU1iVTdRYXdGcWJwLWN0SWRRM2phMmlxRUhjelNzYWhEUk9wcGVkTDdraE8yMk9WdVJsenFBaWt3bGRSa3l5THNZOXRfMG1sM1JiMGlrbUFzREg4WGJPUXB6dHVEcnNMOHBOSXh4Z2diTHo2WlJJSEFDcDA9NDIxREQwOEQ=")
//                .multiPart("file", new File("C:\\Users\\Harshitha\\Downloads\\payload.txt")).log().all()
//                .post("rest/api/3/issue/{key}/attachments")
//                .then().log().all().assertThat().statusCode(200);
//    }
//}
