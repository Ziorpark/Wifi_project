package kr_ac_kopo28.Service;
import java.util.ArrayList;
import java.util.List;

import kr_ac_kopo28.Domain.WifiItem;

public class WifiItemService {
	public double getDistance(WifiItem item1, WifiItem item2) {
		
		double dist = Math.sqrt(Math.pow(item2.getLatitude() - item1.getLatitude(), 2) // 피타고라스 정리를 활용한 거리구하기
				+ Math.pow(item2.getLongitude() - item1.getLongitude(), 2));
		
		return dist;
	}
	

}
