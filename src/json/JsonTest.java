package json;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class JsonTest {
	
	private List<Riot> gameList=new ArrayList<>();
	private String result="";
	public static void main(String[] args) {
		try {
			new JsonTest().run();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void run() throws Exception{
		File jsonFile=new File("C:/Users/coderlt/Desktop/get_data.json");
		FileInputStream is=new FileInputStream(jsonFile);
		BufferedReader reader=new BufferedReader(new InputStreamReader(is));
		String line="";
		StringBuilder sb=new StringBuilder("");
		
		while((line=reader.readLine())!=null) {
			sb.append(line);
		}
		
		result=sb.toString();
		System.out.println(result);
		JSONArray jsonArray=JSON.parseArray(result);
		for(int i=0;i<jsonArray.size();i++) {
			JSONObject object=jsonArray.getJSONObject(i);
			Riot riot=new Riot();
			riot.setId(object.getIntValue("id"));
			riot.setName(object.getString("name"));
			riot.setVersion(object.getString("version"));
			gameList.add(riot);
		}
		System.out.println(gameList);
	}
}
