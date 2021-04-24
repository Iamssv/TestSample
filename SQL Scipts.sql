Create script for Customer Table:

CREATE TABLE `customer` (
  `id` int(11) NOT NULL DEFAULT '0',
  `name` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

Create script for DeliveryLog Table:

CREATE TABLE `deliverylog` (
  `delivery_id` bigint(11) NOT NULL AUTO_INCREMENT,
  `creation_date` datetime NOT NULL,
  `vehicle_number` smallint(6) NOT NULL,
  `receipt_number` varchar(10) NOT NULL,
  `sender_name` varchar(20) NOT NULL,
  `receiver_name` varchar(20) NOT NULL,
  `lot_count` smallint(6) NOT NULL,
  `destination` varchar(20) NOT NULL,
  `return_load` tinyint(4) NOT NULL,
  `amount` int(11) DEFAULT NULL,
  PRIMARY KEY (`delivery_id`),
  UNIQUE KEY `delivery_id_UNIQUE` (`delivery_id`),
  UNIQUE KEY `receipt_number_UNIQUE` (`receipt_number`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

Create script for Supplier Table:

CREATE TABLE `supplier` (
  `supplier_id` int(6) NOT NULL AUTO_INCREMENT,
  `supplier_name` varchar(45) NOT NULL,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `address` varchar(45) DEFAULT NULL,
  `phone_number` varchar(45) NOT NULL,
  `regular_supplier` tinyint(1) NOT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`supplier_id`),
  UNIQUE KEY `supplierName_UNIQUE` (`supplier_name`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

Create script for User Table:

CREATE TABLE `user` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(15) NOT NULL,
  `password` varchar(15) DEFAULT NULL,
  `type` varchar(6) NOT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
