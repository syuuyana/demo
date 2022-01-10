DROP TABLE IF EXISTS select_one, select_two CASCADE;


CREATE TABLE select_one (
	select_id SERIAL NOT NULL ,
	one_first_times int NOT NULL,
	one_second_times int NOT NULL,
	one_third_times int NOT NULL,
	select_one_date DATE TIME NOT NULL,
	one_pull_index int NOT NULL,
)


CREATE TABLE select_two (
	select_id int PRIMARY KEY,
	two_first_times int NOT NULL,
	two_second_times int NOT NULL,
	two_third_times int NOT NULL,
	select_two_date DATE TIME NOT NULL,
	two_pull_index int NOT NULL,
)
