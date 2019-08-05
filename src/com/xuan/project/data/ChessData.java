package com.xuan.project.data;

import java.util.ArrayList;
import java.util.List;

import com.xuan.project.model.Chess;
import com.xuan.project.model.Race;

public class ChessData {
	public static List<Chess> chessesList = new ArrayList();
	static {
		Chess chess1 = new Chess();
		chess1.setName("斧王");
		chess1.setProfession(ProfessionData.professions[0]);
		chess1.setRace(RaceData.races[1]);
		chess1.setLevel(1);
		chessesList.add(chess1);
		
		Chess chess2 = new Chess();
		chess2.setName("风行者");
		chess2.setProfession(ProfessionData.professions[1]);
		chess2.setRace(RaceData.races[2]);
		chess2.setLevel(2);
		chessesList.add(chess2);
		
		Chess chess3 = new Chess();
		chess3.setName("光法");
		chess3.setProfession(ProfessionData.professions[2]);
		chess3.setRace(RaceData.races[0]);
		chess3.setLevel(3);
		chessesList.add(chess3);
	}
}
