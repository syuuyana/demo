DROP TABLE IF EXISTS select_one CASCADE;
DROP TABLE IF EXISTS select_two CASCADE;
DROP TABLE IF EXISTS pull_data CASCADE;


CREATE TABLE IF NOT EXISTS select_one (
	select_id SERIAL NOT NULL ,
	one_first_times int NOT NULL,
	one_second_times int NOT NULL,
	one_third_times int NOT NULL,
	select_one_date DATE NOT NULL,
	-- pull_index int NOT NULL,
	PRIMARY KEY (select_id)
);

CREATE TABLE IF NOT EXISTS select_two (
	select_id SERIAL NOT NULL,
	two_first_times int NOT NULL,
	two_second_times int NOT NULL,
	two_third_times int NOT NULL,
	select_two_date DATE NOT NULL,
	pull_index int NOT NULL,
	PRIMARY KEY (select_id)
);

CREATE TABLE IF NOT EXISTS pull_data (
	pull_id SERIAL NOT NULL,
	pull_name  VARCHAR(256),
	PRIMARY KEY (pull_id)
);
	

