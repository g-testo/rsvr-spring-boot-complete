INSERT INTO user(user_id, name, email) VALUES (1, 'Jane Smith', 'jsmith@smith.com');
INSERT INTO event(event_id, name, location, cost, event_date) VALUES (2, 'Music at the Marsh','https://www.musicatthemarsh.com', 50, 20200101);
INSERT INTO user_event(user_id, event_id) VALUES (1, 2);