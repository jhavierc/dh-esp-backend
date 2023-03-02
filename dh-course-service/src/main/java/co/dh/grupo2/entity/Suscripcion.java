package co.dh.grupo2.entity;

public class Suscripcion {

	private int id;
	private String startDate;
	private String endDate;
	private Plan plan;
	private int userId;

	public Suscripcion(int id, String startDate, String endDate, Plan plan, int userId) {
		super();
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.plan = plan;
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}
