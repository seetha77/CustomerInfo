insert into customer(id, name) values (1000, 'Alex');
insert into customer(id, name) values (1001, 'Marker');
insert into customer(id, name) values (1002, 'Pritt');

insert into my_transaction(id, description, total, save_date, customer_id) values (1111, 'Transaction 1', 100, '2019-10-17 10:20:10', 1000);
insert into my_transaction(id, description, total, save_date, customer_id) values (1222, 'Transaction 2', 50, '2019-10-01 10:20:10', 1000);
insert into my_transaction(id, description, total, save_date, customer_id) values (1223, 'Transaction 3', 120, '2019-10-10 10:20:10', 1000);
insert into my_transaction(id, description, total, save_date, customer_id) values (1224, 'Transaction 10', 175.32, '2019-10-07 10:20:10', 1000);
insert into my_transaction(id, description, total, save_date, customer_id) values (1225, 'Transaction 20', 65.75, '2019-10-05 10:20:10', 1000);
insert into my_transaction(id, description, total, save_date, customer_id) values (1226, 'Transaction 30', 210.50, '2019-10-03 10:20:10', 1000);
insert into my_transaction(id, description, total, save_date, customer_id) values (1227, 'Transaction 31', 42.80, '2019-10-18 17:10:10', 1000);

insert into my_transaction(id, description, total, save_date, customer_id) values (1228, 'Transaction 200', 25.60, '2019-10-01 12:20:10', 1002);
insert into my_transaction(id, description, total, save_date, customer_id) values (1229, 'Transaction 201', 80.50, '2019-10-05 15:00:10', 1002);
insert into my_transaction(id, description, total, save_date, customer_id) values (1230, 'Transaction 202', 116.14, '2019-10-10 11:30:10', 1002);

insert into my_transaction(id, description, total, save_date, customer_id) values (1234, 'Transaction 5', 200, '2019-10-17 10:20:10', 1001);