package com.qakj.crm.untils;

import java.util.UUID;

public class UUIDUntil {
	//返回uuid的唯一标识字符串
		public static String getUUID(){
			String str = UUID.randomUUID().toString();
			return str.replaceAll("-", "");
		}
}
