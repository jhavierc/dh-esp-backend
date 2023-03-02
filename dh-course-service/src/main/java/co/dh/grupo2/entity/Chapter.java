package co.dh.grupo2.entity;

public class Chapter {

	private int id;
	private String name;
	private String urlStreaming;

	public Chapter(int id, String name, String urlStreaming) {
		super();
		this.id = id;
		this.name = name;
		this.urlStreaming = urlStreaming;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrlStreaming() {
		return urlStreaming;
	}

	public void setUrlStreaming(String urlStreaming) {
		this.urlStreaming = urlStreaming;
	}

}
