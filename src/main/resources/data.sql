INSERT INTO USERS (ID, USER_NAME, EMAIL, PASSWORD_HASH, DATE_CREATED) VALUES
(1001, 'chef_mario', 'mario@example.com', 'hash123', CURRENT_TIMESTAMP),
(1002, 'breakfast_queen', 'sarah@example.com', 'hash123', CURRENT_TIMESTAMP),
(1003, 'dessert_master', 'linda@example.com', 'hash123', CURRENT_TIMESTAMP),
(1004, 'healthy_eats', 'alex@example.com', 'hash123', CURRENT_TIMESTAMP),
(1005, 'taco_lover', 'carlos@example.com', 'hash123', CURRENT_TIMESTAMP);

INSERT INTO RECIPES (USER_ID, NAME, DESCRIPTION, CATEGORY) VALUES
(1001, 'Spaghetti Bolognese', 'Classic pasta with beef tomato sauce', 'Dinner'),
(1001, 'Lasagna', 'Layered pasta with ricotta and meat sauce', 'Dinner'),
(1002, 'Pancakes', 'Fluffy pancakes with maple syrup', 'Breakfast'),
(1003, 'Chocolate Chip Cookies', 'Soft cookies with chocolate chips', 'Dessert'),
(1004, 'Chicken Caesar Salad', 'Grilled chicken with romaine and Caesar dressing', 'Lunch'),
(1005, 'Beef Tacos', 'Seasoned ground beef tacos', 'Dinner');