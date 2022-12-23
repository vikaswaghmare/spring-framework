package com.springcore.springThreadScope;

import java.util.Map;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

public class ThreadScope implements Scope {
	Map<String,Object> scope=null;
	CustomThreadLocalScopes customThreadLocalScopes=new CustomThreadLocalScopes();

	public Object get(String name, ObjectFactory objectFactory) {
		scope=(Map<String,Object>)customThreadLocalScopes.get();
		Object obj=scope.get("name");
		if(obj==null) {
			obj=objectFactory.getObject();
			scope.put(name, obj);
		}
		return obj;
	}

	public Object remove(String name) {
		Object obj=scope.remove(name);
		
		return obj;
	}

	public void registerDestructionCallback(String name, Runnable callback) {
		// TODO Auto-generated method stub

	}

	public Object resolveContextualObject(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getConversationId() {
		// TODO Auto-generated method stub
		return null;
	}

}
