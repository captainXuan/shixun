package com.xuan.project.service;

import java.util.List;

import com.xuan.project.model.Chess;

public class ChessService {
	public static void displayChessInfo(List<Chess> chess) {
		for(int i=0;i<chess.size();i++) {
			System.out.println(chess.get(i).getName()+"\t"+chess.get(i).getProfession().getProfessionName()+"\t"+chess.get(i).getRace().getRaceName()+"\t"+chess.get(i).getLevel());
		}
	
	}
}
