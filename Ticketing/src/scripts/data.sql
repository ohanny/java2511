INSERT INTO customer VALUES (1, 'Émile', 'Lampion', 'emile@example.com');
INSERT INTO customer VALUES (2, 'Adèle', 'Blanc-Sec', 'adele@example.com');

INSERT INTO event VALUES (1, 'Concert Jazz', '2025-11-10 20:00:00', 35.00);
INSERT INTO event VALUES (2, 'Salon Tech', '2025-10-28 09:00:00', 20.00);
ALTER TABLE event ALTER COLUMN id RESTART WITH 3;

INSERT INTO booking VALUES (1, 1, 1, '2025-10-20 10:51:14', 'RES-001', 'PAID');
INSERT INTO booking VALUES (2, 2, 2, '2025-10-21 13:12:22', 'RES-002', 'PAID');
INSERT INTO booking VALUES (3, 1, 2, '2025-10-21 19:41:36', 'RES-003', 'BOOKED');

INSERT INTO ticket VALUES (1, 1);
INSERT INTO ticket VALUES (2, 1);
INSERT INTO ticket VALUES (3, 2);
INSERT INTO ticket VALUES (4, 3);
