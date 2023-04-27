package kr_ac_kopo28.Dao;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;

import kr_ac_kopo28.Domain.WifiItem;


public class WifiItemDao {
	
	
	public WifiItem create(WifiItem wifiitem) {
		return null;
	}
	
	public WifiItem selectOne(int id) {
		return null;
	}
	
	public List<WifiItem>  selectAll() throws IOException{
		
		
		List<WifiItem> list = new ArrayList<WifiItem>();
		
		File f = new File("C:\\Users\\정해석\\교안\\자바심화\\무료와이파이정보t2.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		String readtxt;
		// 한줄을 먼저 읽어 필드명 확인
		if ((readtxt = br.readLine())==null) { // 빈파일확인
			System.out.printf("빈 파일 입니다\n");
		}
		String[] field_name = readtxt.split("\t"); // 필드확인
		
		int Linecnt = 0;
		while((readtxt = br.readLine())!=null) { // 내용이 있다면
			WifiItem wifiitem = new WifiItem();
			
			String[] field = readtxt.split("\t");
			wifiitem.setId(Linecnt);
			wifiitem.setInstalllationLocation(field[1]);
			wifiitem.setInstalllationDetails(field[10]);
			wifiitem.setLatitude(Double.parseDouble(field[13]));
			wifiitem.setLongitude(Double.parseDouble(field[14]));
			
			list.add(wifiitem);
			Linecnt++;

		}
		
		br.close();
		
		
		return list;
	}
	
	public WifiItem update(WifiItem wifiitem) {
		return null;
	}
	
	public WifiItem delete(int id) {
		return null;
	}
}
