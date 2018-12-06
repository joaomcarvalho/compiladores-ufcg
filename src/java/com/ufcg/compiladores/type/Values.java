package com.ufcg.compiladores.type;

import java.util.HashMap;
import java.util.Map;

public class Values {
	public static Map < String, String > types = new HashMap< String, String >();
	
	public Values() {
	}
	
	public static String getType(Object id) {
		return types.get((String)id);		
	}
	
	public static void setType(Object id, Object t) {
		types.put((String)id, (String)t);
	}
}
