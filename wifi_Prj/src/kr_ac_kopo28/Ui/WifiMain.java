package kr_ac_kopo28.Ui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import kr_ac_kopo28.Dao.WifiItemDao;
import kr_ac_kopo28.Domain.WifiItem;
import kr_ac_kopo28.Service.WifiItemService;

public class WifiMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WifiItemService wifiItemService = new WifiItemService(); 
		
		// CRUD
		WifiItemDao wifiItemDao = new WifiItemDao();
		
		// R
		List<WifiItem> wifiItems = wifiItemDao.selectAll();
		
		// 융기원)의 위도 경도 값 넣기
		WifiItem me = new WifiItem();
		me.setLatitude(37.3860521);
		me.setLongitude(127.1214038);
		
		// 최대거리 장소 정보
		double maxdistance = Double.MIN_VALUE;
		String max_adress = "";
		String max_name = "";
		double max_wi = 0.0;
		double max_geng = 0.0;
		WifiItem maxWifiItem = null;
	
		// 최소거리 장소 정보
		double mindistance = Double.MAX_VALUE;
		String min_adress = "";
		String min_name = "";
		double min_wi = 0.0;
		double min_geng = 0.0;
		WifiItem minWifiItem = null;
		
		// 거리구하기
		for (WifiItem target : wifiItems) {
			double d = wifiItemService.getDistance(me, target);
			
			if (maxdistance < d) { // 최대거리를 찾아 그 장소에 대한 정보저장하기
				maxWifiItem = target;
				maxdistance = d;
			}
			if (mindistance > d) { // 최소거리를 찾아 그 장소에 대한 정보저장하기
				minWifiItem = target;
				mindistance = d;
			}
		}
		
		System.out.printf("==최대거리 장소==\n");
		System.out.printf("ID : %d\n", maxWifiItem.getId());
		System.out.printf("거리 : %f\n", maxdistance);
		System.out.printf("장소명 : %s\n", maxWifiItem.getInstalllationLocation());
		System.out.printf("주소 : %s\n", maxWifiItem.getInstalllationDetails());
		System.out.printf("위도 : %f\n", maxWifiItem.getLatitude());
		System.out.printf("경도 : %f\n", maxWifiItem.getLongitude());
		System.out.println();
		System.out.printf("==최소거리 장소==\n");
		System.out.printf("ID : %d\n", minWifiItem.getId());
		System.out.printf("거리 : %f\n", mindistance);
		System.out.printf("장소명 : %s\n", minWifiItem.getInstalllationLocation());
		System.out.printf("주소 : %s\n", minWifiItem.getInstalllationDetails());
		System.out.printf("위도 : %f\n", minWifiItem.getLatitude());
		System.out.printf("경도 : %f\n", minWifiItem.getLongitude());
		
//		System.out.printf("==최대거리 장소==\n");
//		System.out.printf("거리 : %f\n", max);
//		System.out.printf("장소명 : %s\n", max_name);
//		System.out.printf("주소 : %s\n", max_adress);
//		System.out.printf("위도 : %f\n", max_wi);
//		System.out.printf("경도 : %f\n", max_geng);

//		System.out.println();
//		
//		System.out.printf("==최소거리 장소==\n");
//		System.out.printf("거리 : %f\n", min);
//		System.out.printf("장소명 : %s\n", min_name);
//		System.out.printf("주소 : %s\n", min_adress);
//		System.out.printf("위도 : %f\n", min_wi);
//		System.out.printf("경도 : %f\n", min_geng);
	}

}
