insert into nexus (first_name, last_name, birth_date) values ('Roberto', 'Shiu', '1975-02-09');
insert into nexus (first_name, last_name, birth_date) values ('Tiger', 'Woods', '1990-11-02');
insert into nexus (first_name, last_name, birth_date) values ('Tony', 'Cheng', '1974-02-28');
insert into nexus (first_name, last_name, birth_date) values ('John', 'Smith', '1964-02-28');
insert into nexus (first_name, last_name, birth_date) values ('Peter', 'Jackson', '1944-1-10');
insert into nexus (first_name, last_name, birth_date) values ('Jacky', 'Chan', '1955-10-31');
insert into nexus (first_name, last_name, birth_date) values ('Susan', 'Boyle', '1970-05-06');
insert into nexus (first_name, last_name, birth_date) values ('Tinner', 'Turner', '1967-04-30');
insert into nexus (first_name, last_name, birth_date) values ('Lotus', 'Notes', '1990-02-28');
insert into nexus (first_name, last_name, birth_date) values ('Henry', 'Dickson', '1997-06-30');
insert into nexus (first_name, last_name, birth_date) values ('Sam', 'Davis', '2001-01-31');
insert into nexus (first_name, last_name, birth_date) values ('Max', 'Beckham', '2002-02-01');
insert into nexus (first_name, last_name, birth_date) values ('Paul', 'Simon', '2002-02-28');

insert into habit (habit_id) values ('Swimming');
insert into habit (habit_id) values ('Jogging');
insert into habit (habit_id) values ('Programming');
insert into habit (habit_id) values ('Movies');
insert into habit (habit_id) values ('Games');
insert into habit (habit_id) values ('Reading');

insert into nexus_habit_detail(nexus_id, habit_id) values (1, 'Reading'); 
insert into nexus_habit_detail(nexus_id, habit_id) values (1, 'Movies'); 
insert into nexus_habit_detail(nexus_id, habit_id) values (2, 'Swimming');