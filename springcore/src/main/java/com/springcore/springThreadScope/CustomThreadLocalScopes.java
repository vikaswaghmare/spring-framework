package com.springcore.springThreadScope;

import java.util.HashMap;

public class CustomThreadLocalScopes extends ThreadLocal<Object> {
	
	@Override
	protected Object initialValue() {
		
		return new HashMap<String, Object>();
	}

}
