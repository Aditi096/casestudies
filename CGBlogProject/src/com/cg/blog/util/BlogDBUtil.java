package com.cg.blog.util;

import java.util.HashMap;

import com.cg.blog.beans.User;

public class BlogDBUtil {
	private static HashMap<Integer, User> users= new HashMap<Integer, User>();
	private static int BLOG_ID_COUNTER= 100;
	private static int USER_ID_COUNTER = 1000;
	
	public static long getBLOG_ID_COUNTER() {
		return ++BLOG_ID_COUNTER;
	}
	
	public static int getUSER_ID_COUNTER() {
		return ++USER_ID_COUNTER;
	}
	
}
