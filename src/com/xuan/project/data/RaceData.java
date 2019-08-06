package com.xuan.project.data;

import com.xuan.project.model.Profession;
import com.xuan.project.model.Race;

public class RaceData {
	static Race races[] = new Race[10];
	static {
		Race race1 = new Race();
		race1.setRaceName("人类");
		races[0] = race1;
		
		Race race2 = new Race();
		race2.setRaceName("兽人");
		races[1] = race2;
		
		Race race3 = new Race();
		race3.setRaceName("精灵");
		races[2] = race3;
		
		Race race4 = new Race();
		race4.setRaceName("恶魔");
		races[3] = race4;
	}
	
}
