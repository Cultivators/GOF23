package cn.cultivator.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ChessFlyWeightFactory {
	private static Map<String,ChessFlyWeight> map = new HashMap<String, ChessFlyWeight>();
	public static ChessFlyWeight getChess(String color){
		if(null!=map.get(color)){
			return map.get(color);
		}
		ChessFlyWeight cfw = new ConcreteChess(color);
		map.put(color, cfw);
		return cfw;
	}
}
