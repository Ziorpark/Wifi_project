package kr_ac_kopo28.Domain;

public class WifiItem {
	private int id; // 번호
	private String installlationLocationName; //장소명
	private String installlationDetails; // 장소상세
	private double latitude; // 경도
	private double longitude; // 위도
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInstalllationLocation() {
		return installlationLocationName;
	}
	public void setInstalllationLocation(String installlationLocation) {
		this.installlationLocationName = installlationLocation;
	}
	public String getInstalllationDetails() {
		return installlationDetails;
	}
	public void setInstalllationDetails(String installlationDetails) {
		this.installlationDetails = installlationDetails;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	
}
