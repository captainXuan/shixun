package com.xuan.project.data;

import com.xuan.project.model.Profession;
import com.xuan.project.model.Race;

public class RaceData {
	static Race races[] = new Race[10];
	static {
		Race race1 = new Race();
		race1.setRaceName("����");
		races[0] = race1;
		
		Race race2 = new Race();
		race2.setRaceName("����");
		races[1] = race2;
		
		Race race3 = new Race();
		race3.setRaceName("����");
		races[2] = race3;
		
		Race race4 = new Race();
		race4.setRaceName("��ħ");
		races[3] = race4;
	}
	
}
