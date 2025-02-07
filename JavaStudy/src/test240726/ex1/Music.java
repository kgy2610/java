package test240726.ex1;

public class Music {
	private String title;
	private String singer;
	
	public Music() {
		super();
	}
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	@Override
	public String toString() {
		return title + " - " + singer;
	}
	
	public int hashCode() {
		return super.hashCode();
	}
	   
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	   
	public void compareTo(Object o) {
		
	}
}
