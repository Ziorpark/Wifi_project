package kr_ac_kopo28.Domain;

public class WifiItem {
	private int id; // 번호
	private String installlationLocationName; //장소명
	private String installlationDetails; // 장소상세
	private String installationcityName; // 설치시도명
	private String installationdistrictName; // 설치시군구명
	private String installationfaciltyType; // 설치시설구분
	private String wifiSsid; // 와이파이ssid
	private String dateOfInstallation; //설치연월
	private String roadNameAddress; //소재지도로명주소
	private String lotNumberAddress;// 소재지지번주소
	private String managementAgencyName; // 관리기관명
	private String managementAgencyPhoneNumber; //관리기관전화번호
	private double latitude; // 경도
	private double longitude; // 위도
	private String created; // 데이터기준일자
		
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
