package sparkmicro;

public class Session
{
	private String session;
	private String presenter;
	private String dayTime;
	private String id;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSession() {
		return name;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getPresenter() {
		return aboutUrl;
	}
	public void setPresenter(String presenter) {
		this.presenter = presenter;
	}
	public String getDayTime() {
		return imageUrl;
	}
	public void setDayTime(String dayTime) {
		this.dayTime = dayTime;
	}

}
