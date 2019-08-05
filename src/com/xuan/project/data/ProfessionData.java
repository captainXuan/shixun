package com.xuan.project.data;

import com.xuan.project.model.Profession;

public class ProfessionData {
	static Profession professions[] = new Profession[10];
	static {
		Profession profession1 = new Profession();
		profession1.setProfessionName("战士");
		professions[0] = profession1;
		
		Profession profession2 = new Profession();
		profession2.setProfessionName("猎人");
		professions[1] = profession2;
		
		Profession profession3 = new Profession();
		profession3.setProfessionName("法师");
		professions[2] = profession3;
	}
	
}
