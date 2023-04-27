package kr_ac_kopo28.Service;
import java.util.ArrayList;
import java.util.List;

import kr_ac_kopo28.Domain.WifiItem;

public class WifiItemService {
	public double getDistance(WifiItem item1, WifiItem item2) {
		
		
		
		// 최소거리 장소 정보
		double min = Double.MAX_VALUE;
		String min_adress = "";
		String min_name = "";
		double min_wi = 0.0;
		double min_geng = 0.0;
		
		double dist = Math.sqrt(Math.pow(item2.getLatitude() - item1.getLatitude(), 2) // 피타고라스 정리를 활용한 거리구하기
				+ Math.pow(item2.getLongitude() - item1.getLongitude(), 2));
		
		
		
		if (min > dist) { // 최소거리를 찾아 그 장소에 대한 정보저장하기
			min_adress = item2.getInstalllationDetails(); // 장소의 주소
			min = dist; // 장소의 거리
			min_name = item2.getInstalllationLocation(); // 장소의 이름
			min_wi = item2.getLatitude(); // 장소의 위도
			min_geng = item2.getLongitude(); // 장소의 경돈
		}
		
		return dist;
	}
	

}
