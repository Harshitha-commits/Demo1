//package files;
//
//import io.restassured.RestAssured;
//import io.restassured.path.json.JsonPath;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//import files.ReUsableMethods;
//
//import static io.restassured.RestAssured.given;
//import static io.restassured.RestAssured.responseSpecification;
//
//public class DynamicJson {
//    @Test(dataProvider="BooksData")
//    public void addBook(String isbn, String aisle){
//        RestAssured.baseURI="http://216.10.245.166";
//        String response=given().log().all().header("Content-Type","application/json").body(Payloads.addBook(isbn,aisle))
//                .when().
//                post("/Library/Addbook.php")
//                .then().log().all().assertThat().statusCode(200).
//                extract().response().asString();
//        JsonPath js= ReUsableMethods.rawToJson(response);
//        String id=js.get("ID");
//        System.out.println(id);
//
////deletebook
//
//    }
//    @DataProvider(name="BooksData")
//    public Object[][]  getData()
//    {
////array=collection of elements
////multidimensional array= collection of arrays
//        return new Object[][] {{"ojfwt54y","936673"},{"cwet76ee","42573"}, {"okbhfet","53783"} };
//    }
//
//
//
//
//
//}
