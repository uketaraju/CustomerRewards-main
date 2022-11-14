insert into customer(id, name) values (1000, 'Joseph');
insert into customer(id, name) values (1001, 'Jimmy');
insert into customer(id, name) values (1002, 'Gramy');

insert into my_transaction(id, description, total,customer_id) values (1001, 'Purchase 1', 100, 1000);
insert into my_transaction(id, description, total, customer_id) values (1002, 'Purchase 2', 50, 1000);
insert into my_transaction(id, description, total,customer_id) values (1003, 'Purchase 3', 120, 1000);
insert into my_transaction(id, description, total, customer_id) values (1004, 'Purchase 10', 175.32, 1000);
insert into my_transaction(id, description, total,customer_id) values (1005, 'Purchase 20', 65.75,1000);
insert into my_transaction(id, description, total,customer_id) values (1006, 'Purchase 30', 210.50, 1000);
insert into my_transaction(id, description, total,customer_id) values (1009, 'Purchase 31', 42.80, 1000);
insert into my_transaction(id, description, total,customer_id) values (1200, 'Purchase 200', 25.60,1002);
insert into my_transaction(id, description, total,customer_id) values (1201, 'Purchase 201', 80.50, 1002);
insert into my_transaction(id, description, total, customer_id) values (1202, 'Purchase 202', 116.14, 1002);
insert into my_transaction(id, description, total,customer_id) values (1008, 'Purchase 5', 200, 1001);

insert into rewards(id, condition, rewardpoints) values (1,'transactions<$50',0);
insert into rewards(id, condition, rewardpoints) values (2,'transactions over $50',1);
insert into rewards(id, condition, rewardpoints) values (3,'transactions over $100',2);