package com.example.demo.application.action_sele;

public class IndexSortingController {
	
	public int indexOneSorting(int i, int j, int k, int category) {
		int return_id = 0;
		switch (category) {
			case 1: {
				if(i == 3 && j == 3 && k == 3) {
					return_id = 1;
				}
				else {
					return_id = 9;
				}
				break;
			}
			case 2:
				if(i == 3 && j == 3 && k == 3) {
					return_id = 2;
				}
				else
				{
					return_id = 9;
				}
				break;
			default:
				System.out.println("カテゴリーが登録されていません。");
				break;
		}
		return return_id;
	}
}
