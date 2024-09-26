package files;

import io.restassured.path.json.JsonPath;
import org.testng.Assert;

import static io.restassured.RestAssured.*;

public class GraphQLScript {
    public static void main(String[] args) {
        //query
        int characterId=9271;
        String response=given().log().all().headers("Content-Type","application/json").body("{\"query\":\"query($characterId: Int!,$episodeId: Int!){\\n  character(characterId: $characterId){\\n    name\\n    gender\\n    status\\n    id\\n  }\\n  location(locationId: 13988){\\n    name\\n    dimension\\n  }\\n  episode(episodeId:$episodeId){\\n    name\\n    air_date\\n    episode\\n  }\\n  \\n  \\n}\\n\",\"variables\":{\"characterId\":"+characterId+",\"episodeId\":10663}}")


                .when().post("https://rahulshettyacademy.com/gq/graphql")
                .then().extract().response().asString();
System.out.println(response);
        JsonPath js=new JsonPath(response);
        String characterName=js.getString("data.character.name");
        Assert.assertEquals(characterName, "Bhanu");

        //mutations
String newCharacterName="Bhanup";
        String mutationResponse=given().log().all().headers("Content-Type","application/json").body("{\"query\":\"mutation($locationName:String!,$characterName:String!,$episodeName:String!)\\n{\\n  createLocation(location : {name:$locationName, type:\\\"Southzone\\\",dimension:\\\"234\\\"}) {\\n    id\\n  }\\n  createCharacter(character:{name:$characterName,type:\\\"angrybird\\\",status:\\\"alive\\\",species:\\\"human\\\",gender:\\\"Male\\\",image:\\\"png\\\",originId:13987,locationId:13987}){\\n    id\\n  }\\n  createEpisode(episode:{name:\\\"village series\\\",air_date:\\\"15th aug 2024\\\",episode:$episodeName}){\\n    id\\n  }\\n  deleteLocations(locationIds:[13989]){\\n  locationsDeleted\\n}\\n  \\n}\\n\",\"variables\":{\"locationName\":\"Poland\",\"characterName\":\""+newCharacterName+"\",\"episodeName\":\"success\"}}\n")
                .when().post("https://rahulshettyacademy.com/gq/graphql")
                .then().extract().response().asString();
        System.out.println(mutationResponse);
        JsonPath js1=new JsonPath(mutationResponse);

    }
}
