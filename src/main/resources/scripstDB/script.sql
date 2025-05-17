CREATE TABLE customers (
    subscription_date DATE NOT NULL,       -- Fecha de suscripción del cliente
    city VARCHAR(100) NOT NULL,           -- Ciudad del cliente
    company VARCHAR(150) NOT NULL,        -- Empresa asociada al cliente
    country VARCHAR(150) NOT NULL,        -- País del cliente
    customer_id VARCHAR(50) PRIMARY KEY,  -- ID único del cliente
    email VARCHAR(255) NOT NULL UNIQUE,   -- Correo electrónico del cliente (debe ser único)
    first_name VARCHAR(100) NOT NULL,     -- Nombre del cliente
    last_name VARCHAR(100) NOT NULL       -- Apellido del cliente
);


INSERT INTO customers (subscription_date, city, company, country, customer_id, email, first_name, last_name)
VALUES 
('2023-01-01', 'New York', 'Tech Corp', 'United States', 'CUST001', 'john.doe@example.com', 'John', 'Doe'),
('2023-02-15', 'Los Angeles', 'Media Inc', 'United States', 'CUST002', 'jane.smith@example.com', 'Jane', 'Smith'),
('2023-03-10', 'London', 'Finance Ltd', 'United Kingdom', 'CUST003', 'michael.brown@example.com', 'Michael', 'Brown'),
('2023-04-05', 'Berlin', 'Design Studio', 'Germany', 'CUST004', 'emily.johnson@example.com', 'Emily', 'Johnson'),
('2023-05-20', 'Tokyo', 'Tech Innovations', 'Japan', 'CUST005', 'ryo.sato@example.jp', 'Ryo', 'Sato'),
('2023-06-25', 'Paris', 'Fashion House', 'France', 'CUST006', 'claire.martin@example.fr', 'Claire', 'Martin'),
('2023-07-12', 'Sydney', 'Travel Co', 'Australia', 'CUST007', 'liam.wilson@example.au', 'Liam', 'Wilson'),
('2023-08-18', 'Toronto', 'Health Inc', 'Canada', 'CUST008', 'sophia.taylor@example.ca', 'Sophia', 'Taylor'),
('2023-09-09', 'Mumbai', 'Consulting Firm', 'India', 'CUST009', 'arjun.sharma@example.in', 'Arjun', 'Sharma'),
('2023-10-01', 'Cape Town', 'Eco Solutions', 'South Africa', 'CUST010', 'amelia.naidoo@example.za', 'Amelia', 'Naidoo'),
('2023-11-11', 'São Paulo', 'Energy Corp', 'Brazil', 'CUST011', 'carlos.silva@example.br', 'Carlos', 'Silva'),
('2023-12-03', 'Dubai', 'Real Estate LLC', 'UAE', 'CUST012', 'fatima.al@example.ae', 'Fatima', 'Al-Farsi'),
('2024-01-15', 'Seoul', 'Tech Ventures', 'South Korea', 'CUST013', 'hyun.kim@example.kr', 'Hyun', 'Kim'),
('2024-02-20', 'Rome', 'Culinary Arts', 'Italy', 'CUST014', 'lucas.rossi@example.it', 'Lucas', 'Rossi'),
('2024-03-30', 'Bangkok', 'Hospitality Group', 'Thailand', 'CUST015', 'suriya.chai@example.th', 'Suriya', 'Chai'),
('2024-04-18', 'Mexico City', 'Construction Co', 'Mexico', 'CUST016', 'sofia.hernandez@example.mx', 'Sofia', 'Hernandez'),
('2024-05-05', 'Buenos Aires', 'Media House', 'Argentina', 'CUST017', 'martin.gonzalez@example.ar', 'Martin', 'Gonzalez'),
('2024-06-12', 'Moscow', 'Logistics LLC', 'Russia', 'CUST018', 'alexei.ivanov@example.ru', 'Alexei', 'Ivanov'),
('2024-07-28', 'Shanghai', 'Manufacturing Inc', 'China', 'CUST019', 'li.wei@example.cn', 'Li', 'Wei'),
('2024-08-16', 'Singapore', 'FinTech Group', 'Singapore', 'CUST020', 'jia.lim@example.sg', 'Jia', 'Lim');
