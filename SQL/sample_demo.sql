-- sample_2データベースが存在していたら削除
DROP DATABASE IF EXISTS sample_2;

-- sample_2データベースの作成
CREATE DATABASE sample_2;

-- データベースの切り替え
USE sample_2;

-- 顧客テーブル作成
CREATE TABLE customer
	(customer_id varchar(10) NOT NULL
	, name varchar(50) NOT NULL
	, email varchar(254) NOT NULL
	, created_datetime DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP
	, updated_datetime DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP
	, PRIMARY KEY(customer_id)
	)
;

-- 商品テーブル作成
CREATE TABLE item
	(item_code varchar(5) NOT NULL
	, item_name varchar(50) NOT NULL
	, selling_price int(5) NOT NULL
	, purchase_price int(5) NOT NULL
	, created_datetime DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP
	, updated_datetime DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP
	, PRIMARY KEY(item_code)
	)
;

-- 購入履歴テーブル作成
CREATE TABLE purchase_history
	(history_id varchar(10) NOT NULL
	, customer_id varchar(10) NOT NULL
	, item_code varchar(5) NOT NULL
	, created_datetime DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP
	, updated_datetime DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP
	, PRIMARY KEY(history_id)
	, FOREIGN KEY fk_customer (customer_id) REFERENCES customer(customer_id)
	, FOREIGN KEY fk_item (item_code) REFERENCES item (item_code)
	);

INSERT INTO customer
	(customer_id, name, email)
VALUES
	('00001', 'yamada', 'yamada@sample.com')
	, ('00002', 'tanaka', 'tanaka@sample.com')
	, ('00003', 'yoshida', 'yoshida@sample.com');

INSERT INTO item
	(item_code, item_name, selling_price,purchase_price )
VALUES
	('00001', 'apple', 200,150)
	, ('00002', 'orange', 150,100)
	, ('00003', 'banana', 300,200);

INSERT INTO purchase_history
	(history_id, customer_id, item_code)
VALUES
	('00001', '00003', '00001')
	, ('00002', '00003', '00002')
	, ('00003', '00001', '00003');


