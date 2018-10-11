package sparkmicro;

import static spark.Spark.get;
import java.util.ArrayList;
import com.google.gson.Gson;

import spark.Request;
import spark.Response;

public class Service {

    public static void main(String[] args) {
        get("/", (req, res) -> {
            return "Hello All";
        });
		
		get("/sessions", Service::getSessions);
    }
	
	public static String getSessions(Request req, Response res) {

    	Gson gson = new Gson();
    	res.status(200);
    	res.type("application/json");
    	SessionData sData = new SessionData();
    	ArrayList<Session> sessions = sData.getAllSessions();
        return gson.toJson(sessions);
     }

}