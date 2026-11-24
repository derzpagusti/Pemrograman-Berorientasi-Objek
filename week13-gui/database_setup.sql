CREATE DATABASE IF NOT EXISTS db_gym;
USE db_gym;

CREATE TABLE IF NOT EXISTS member_gym (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nama VARCHAR(100) NOT NULL,
    usia INT NOT NULL,
    paket VARCHAR(50) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

DESCRIBE member_gym;

-- 4. (Opsional) Insert data contoh untuk testing
-- INSERT INTO member_gym (nama, usia, paket) VALUES
-- ('Budi Santoso', 25, 'Bulanan'),
-- ('Siti Rahayu', 30, '3 Bulan'),
-- ('Ahmad Wijaya', 22, 'Tahunan');

-- 5. Lihat data
-- SELECT * FROM member_gym;