package sparkmicro;

import java.util.ArrayList;

public class SessionData {
	
	public ArrayList<Session> getAllSessions(){
		
		ArrayList<Session> sessions = new ArrayList<Session>(3);
		Session p1 = new Session();
		p1.setId("HOL6270");
		p1.setSession("DevOps in the Cloud with Oracle Developer Cloud Service");
		p1.setPresenter("Abhinav Shroff & Murtaza Amiji");
		p1.setDayTime("Tuesday, Oct 23, 12:45 p.m. - 1:45 p.m, Marriott Marquis (Yerba Buena Level) - Salon 10/11");
		
		Session p2 = new Session();
		p2.setId("TIP3967");
		p2.setSession("DevOps for Polyglot Microservices Using Oracle Developer Cloud Service");
		p2.setPresenter("Abhinav Shroff");
		p2.setDayTime("Tuesday, Oct 23, 11:15 a.m. - 12:00 p.m, Marriott Marquis (Golden Gate Level) - Golden Gate C2");
		
		Session p3 = new Session();
		p3.setId("PRO3966");
		p3.setSession("Develop, Build, and Deploy Docker on Oracle IaaS Using Oracle Developer Cloud");
		p3.setPresenter("Abhinav Shroff");
		p3.setDayTime("Tuesday, Oct 23, 3:45 p.m. - 4:30 p.m, Moscone West - Room 3018");
		
		
		Session p4 = new Session();
		p4.setId("DEV5483");
		p4.setSession("A Code Monk’s Guide to Smart Contracts and Blockchain");
		p4.setPresenter("Abhinav Shroff");
		p4.setDayTime("Wednesday, Oct 24, 10:30 a.m. - 11:15 a.m. | Moscone West - Room 2009");
		
		sessions.add(p1);
		sessions.add(p2);
		sessions.add(p3);
		sessions.add(p4);
		return sessions;
	}

}
