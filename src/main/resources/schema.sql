CREATE DATABASE HotelBooking;
USE HotelBooking;

-- Hotel Room Table
CREATE TABLE HotelRoom (
    id INT AUTO_INCREMENT PRIMARY KEY,
    room_name VARCHAR(100),
    price DECIMAL(10, 2),
    room_capacity INT,
    beds INT,
    image_url VARCHAR(255),
    availability BOOLEAN DEFAULT TRUE,
    wifi BOOLEAN DEFAULT FALSE,
    bath BOOLEAN DEFAULT FALSE,
    tv BOOLEAN DEFAULT FALSE,
    drinks BOOLEAN DEFAULT FALSE,
    food BOOLEAN DEFAULT FALSE
);

-- Banquet Hall Table
CREATE TABLE BanquetHall (
    id INT AUTO_INCREMENT PRIMARY KEY,
    hall_name VARCHAR(100),
    price DECIMAL(10, 2),
    hall_capacity INT,
    image_url VARCHAR(255),
    availability BOOLEAN DEFAULT TRUE,
    wifi BOOLEAN DEFAULT FALSE,
    food BOOLEAN DEFAULT FALSE
);

select * from HotelRoom;
select * from BanquetHall;

-- Dummy data for testing
INSERT INTO HotelRoom (room_name, price, room_capacity, beds, image_url, wifi, bath, tv, drinks, food)
VALUES
    ('Ambassador Suite', 15000, 2, 1, 'https://i.imgur.com/TkIKKWF.png', TRUE, TRUE, TRUE, TRUE, TRUE),
    ('Junior Suite', 12000, 2, 2, 'https://i.imgur.com/4C6V7ly.jpeg', TRUE, TRUE, TRUE, FALSE, TRUE),
    ('Deluxe Room', 10000, 3, 1, 'https://i.imgur.com/4C6V7ly.jpeg', TRUE, TRUE, TRUE, TRUE, FALSE),
    ('Standard Room', 8000, 2, 1, 'https://imgur.com/jkl012', TRUE, FALSE, TRUE, TRUE, TRUE),
    ('Economy Room', 6000, 1, 1, 'https://i.imgur.com/EkRrvjp.jpg', FALSE, FALSE, FALSE, FALSE, FALSE),
    ('Suite Room', 18000, 2, 1, 'https://imgur.com/pqr678', TRUE, TRUE, TRUE, TRUE, TRUE),
    ('Family Room', 15000, 4, 2, 'https://imgur.com/stu901', TRUE, TRUE, TRUE, TRUE, TRUE),
    ('Presidential Suite', 25000, 2, 1, 'https://i.imgur.com/EkRrvjp.jpg', TRUE, TRUE, TRUE, TRUE, TRUE),
    ('Single Room', 5000, 1, 1, 'https://i.imgur.com/EkRrvjp.jpg', FALSE, FALSE, FALSE, FALSE, FALSE),
    ('Twin Room', 7000, 2, 2, 'https://i.imgur.com/EkRrvjp.jpg', TRUE, TRUE, TRUE, FALSE, TRUE),
    ('Luxury Room', 22000, 2, 1, 'https://imgur.com/abc123', TRUE, TRUE, TRUE, TRUE, TRUE);

INSERT INTO BanquetHall (hall_name, price, hall_capacity, image_url, availability, wifi, food)
VALUES
    ('A Hall', 15000.00, 500, 'https://i.imgur.com/TkIKKWF.png', true, false, true),
    ('J Hall', 12000.00, 300, 'https://i.imgur.com/sRYnwDD.jpeg', false, true, false),
    ('R Banquet Hall', 20000.00, 700, 'https://i.imgur.com/4C6V7ly.jpeg', true, true, true),
    ('G Hall', 18000.00, 400, 'https://i.imgur.com/EkRrvjp.jpg', false, false, false),
    ('Crystal Banquet', 22000.00, 600, 'https://i.imgur.com/TkIKKWF.png', true, true, true),
    ('Grand Hall', 25000.00, 1000, 'https://i.imgur.com/sRYnwDD.jpeg', true, false, true),
    ('Event Space', 30000.00, 1200, 'https://i.imgur.com/4C6V7ly.jpeg', true, true, true),
    ('Convention Hall', 20000.00, 800, 'https://i.imgur.com/EkRrvjp.jpg', false, false, false),
    ('Meeting Room', 10000.00, 100, 'https://i.imgur.com/TkIKKWF.png', true, true, true),
    ('VIP Hall', 35000.00, 400, 'https://i.imgur.com/sRYnwDD.jpeg', true, true, true),
    ('Outdoor Banquet', 18000.00, 300, 'https://i.imgur.com/4C6V7ly.jpeg', true, true, false);



select * from HotelRoom;
select * from BanquetHall;