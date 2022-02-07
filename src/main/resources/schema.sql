DROP TABLE IF EXISTS select_one CASCADE;
DROP TABLE IF EXISTS select_two CASCADE;
DROP TABLE IF EXISTS push_one CASCADE;
-- DROP TABLE IF EXISTS pull_one CASCADE;


CREATE TABLE IF NOT EXISTS select_one (
	select_id SERIAL NOT NULL ,
	one_first_times int NOT NULL,
	one_second_times int NOT NULL,
	one_third_times int NOT NULL,
	select_one_date DATE NOT NULL,
	category int NOT NULL,
	PRIMARY KEY (select_id)
);

CREATE TABLE IF NOT EXISTS select_two (
	select_id SERIAL NOT NULL,
	two_first_times int NOT NULL,
	two_second_times int NOT NULL,
	two_third_times int NOT NULL,
	select_two_date DATE NOT NULL,
	-- pull_index int NOT NULL,
	PRIMARY KEY (select_id)
);

CREATE TABLE IF NOT EXISTS push_one (
	push_id SERIAL NOT NULL,
	push_name TEXT NOT NULL,
	iou_star TEXT NOT NULL,
	color_star TEXT NOT NULL,
	temp_star TEXT NOT NULL,
	exp TEXT NOT NULL,
	quality TEXT NOT NULL,
	effect TEXT NOT NULL,
	PRIMARY KEY (push_id)
);

--ALTER TABLE select_one DROP CONSTRAINT IF EXISTS FK_selectoneid;
--ALTER TABLE push_one ADD CONSTRAINT FK_selectoneid FOREIGN KEY (pull_index) REFERENCES select_one;
	

