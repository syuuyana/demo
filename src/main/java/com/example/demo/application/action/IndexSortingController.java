package com.example.demo.application.action;

public class IndexSortingController {
	
	public int indexOneSorting(int i, int j, int k) {
		int return_id = 0;
		if(i == 1 && j == 1 && k == 1) {
			return_id = 1;
		}
		else if(i == 1 && j == 1 && k == 2) {
			return_id = 2;
		}
		else if(i == 1 && j == 1 && k == 3) {
			return_id = 3;
		}
		else if(i == 1 && j == 2 && k == 1) {
			return_id = 4;
		}
		else if(i == 1 && j == 2 && k == 2) {
			return_id = 5;
		}
		else if(i == 1 && j == 2 && k == 3) {
			return_id = 6;
		}
		else if(i == 1 && j == 3 && k == 1) {
			return_id = 7;
		}
		else if(i == 1 && j == 3 && k == 2) {
			return_id = 8;
		}
		else if(i == 1 && j == 3 && k == 3) {
			return_id = 1;
		}
		else if(i == 2 && j == 1 && k == 1) {
			return_id = 2;
		}
		else {
			return_id = 9;
		}
		return return_id;
	}
}
