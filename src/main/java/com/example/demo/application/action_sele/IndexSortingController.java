package com.example.demo.application.action_sele;

public class IndexSortingController {
	
	public int indexOneSorting(int i, int j, int k, int category) {
		int return_id = 0;
		switch (category) {
			case 1:
				if(i == 3) {
					if(j == 3) {
						return_id = 4;
					}
					else if (j == 2) {
						return_id = 5;
					}
					else {
						return_id = 6;
					}
				}
				else if(i == 2) {
					if (j == 3) {
						return_id = 1;
					}
					else if (j == 2) {
						return_id = 8;
					}
					else {
						return_id = 2;
					}
				}
				else if (i == 1) {
					if(j == 3) {
						return_id = 1;
					}
					else if (j == 2) {
						return_id = 7;
					}
					else {
						return_id = 3;
					}
				}
				else {
					return_id = 9;
				}
				break;
			case 2:
				if(i == 3) {
					if(j == 3) {
						return_id = 1;
					}
					else if (j == 2) {
						return_id = 8;
					}
					else {
						if(k == 3) {
							return_id = 1;
						}
						else if (k == 2) {
							return_id = 8;
						}
						else {
							return_id = 1;
						}
					}
				}
				else if (i == 2) {
					if(j == 3) {
						return_id = 5;
					}
					else if (j == 2) {
						return_id = 6;
					}
					else {
						if(k == 3) {
							return_id = 4;
						}
						else if (k == 2) {
							return_id = 6;
						}
						else {
							return_id = 5;
						}
					}
				}
				else if (i == 1) {
					if (k == 3) {
						return_id = 3;
					}
					else if (k == 2) {
						return_id = 7;
					}
					else {
						return_id = 2;
					}
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
