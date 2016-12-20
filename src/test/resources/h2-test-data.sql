--PRODUCT_CATALOG
Insert into PRODUCT_CATALOG (PART_NUMBER,CATEGORY,CHANNEL,CABLE_TYPE,MORE_INFO_URL,DISPLAY_TAGLINE,PRICE_TYPE,PRICE,SHORT_NAME) values ('PR007000','broadband','ijoin','FTTH','<strong>UniFi 30Mbps</strong><ul><li>Download speed - up to 30Mbps</li><li>Upload speed - up to 5Mbps</li></ul>','Download 30 Mbps, Upload 5 Mbps','M',179.14,'Unifi 30');
Insert into PRODUCT_CATALOG (PART_NUMBER,CATEGORY,CHANNEL,CABLE_TYPE,MORE_INFO_URL,DISPLAY_TAGLINE,PRICE_TYPE,PRICE,SHORT_NAME) values ('PR007001','broadband','ijoin','FTTH','<strong>UniFi 50Mbps</strong><ul><li>Download speed - up to 50Mbps</li><li>Upload speed - up to 10Mbps</li></ul>','Download 50 Mbps, Upload 5 Mbps','M',232.14,'Unifi 50');
Insert into PRODUCT_CATALOG (PART_NUMBER,CATEGORY,CHANNEL,CABLE_TYPE,MORE_INFO_URL,DISPLAY_TAGLINE,PRICE_TYPE,PRICE,SHORT_NAME) values ('PR006972','tv','ijoin','FTTH','<a href="https://www.tm.com.my/OnlineHelp/PublishingImages/Digital/HyppTV_Aneka_Pack.jpg" target="_blank">Click to download list of channels</a>','53 channels','M',31.8,'Aneka');
Insert into PRODUCT_CATALOG (PART_NUMBER,CATEGORY,CHANNEL,CABLE_TYPE,MORE_INFO_URL,DISPLAY_TAGLINE,PRICE_TYPE,PRICE,SHORT_NAME) values ('PR005360','tv','ijoin','FTTH','<a href="https://www.tm.com.my/OnlineHelp/PublishingImages/Digital/HyppTV_Ruby_Pack.jpg" target="_blank">Click to download list of channels</a>','55 channels','M',31.8,'Ruby');
Insert into PRODUCT_CATALOG (PART_NUMBER,CATEGORY,CHANNEL,CABLE_TYPE,MORE_INFO_URL,DISPLAY_TAGLINE,PRICE_TYPE,PRICE,SHORT_NAME) values ('PR006970','tv','ijoin','FTTH','<a href="https://www.tm.com.my/OnlineHelp/PublishingImages/Digital/HyppTV_Jumbo_Pack.jpg" target="_blank">Click to download list of channels</a>','80 channels','M',63.6,'Jumbo');
Insert into PRODUCT_CATALOG (PART_NUMBER,CATEGORY,CHANNEL,CABLE_TYPE,MORE_INFO_URL,DISPLAY_TAGLINE,PRICE_TYPE,PRICE,SHORT_NAME) values ('PR006973','tv','ijoin','FTTH','<a href="https://www.tm.com.my/OnlineHelp/PublishingImages/Digital/HyppTV_Varnam_Pack.jpg" target="_blank">Click to download list of channels</a>','51 channels','M',31.8,'Varnam');
Insert into PRODUCT_CATALOG (PART_NUMBER,CATEGORY,CHANNEL,CABLE_TYPE,MORE_INFO_URL,DISPLAY_TAGLINE,PRICE_TYPE,PRICE,SHORT_NAME) values ('PR000270','phone','ijoin','FTTH',null,'Voice calls, fixed to fixed & fixed to mobile','M',0,'Vobb');

--PRODUCT
Insert into product values ('PR007000', 'UniFi Advance 30Mbps',1);
Insert into product values ('PR007001', 'UniFi Advance Plus 50Mbps',1);

--COMPATIBILITY
Insert into COMPATIBILITY values('PR007001','PR000200','PR000200,PR0007001');
Insert into COMPATIBILITY values('PR007000','PR000200','PR000200,PR0007000');

--ELIGIBILITY
Insert into ELIGIBILITY values('PR007000','CONSUMER',parsedatetime('01-01-2015','dd-MM-yyyy'),null);
Insert into ELIGIBILITY values('PR007001','CONSUMER',parsedatetime('01-01-2015','dd-MM-yyyy'),null);

--SLOF - serviceable address
-- timestamp is timestamp -1 because slof runs after midnight and hence queries the previous day's data.
INSERT INTO SLOF_CUSTOMER_DETAILS values ('OLD NRIC', '1111-11-1111', 'TEST CUSTOMER', '0123456789', '17-12-1984', 'test@test.com', 'MALAYSIA', TIMESTAMPADD('DAY', -1, CURRENT_TIMESTAMP()),
'Kuala Lumpur', 'Malaysia', '40000', 'KL', 'JALAN', 'BUKIT BINTANG', 'SECTION', '3408', '34', 'THE WESTIN', 'Y');


--SLOF - non-serviceable address
-- timestamp is timestamp -1 because slof runs after midnight and hence queries the previous day's data.
INSERT INTO SLOF_CUSTOMER_DETAILS values ('OLD NRIC', '222222-22-2222', 'TEST CUSTOMER 2', '0123456790', '17-12-1985', 'test2@test.com', 'MALAYSIA', TIMESTAMPADD('DAY', -1, CURRENT_TIMESTAMP()),
'Kuala Lumpur', 'Malaysia', '40000', 'KL', 'JALAN', 'BUKIT BINTANG', 'SECTION', '3409', '34', 'THE MARRIOTT', 'N');

-- SLOF non-serviceable not interseted
INSERT INTO SLOF_NON_SERVICEABLE_ADDRESS values ('test@test.com', '012323232', TIMESTAMPADD('DAY', -1, CURRENT_TIMESTAMP()));

-- CUSTOMER PROFILE VALIDATION
INSERT INTO CUSTOMER_WEB_PROFILE values ('OLD NRIC', '111111-11-1111', 'testloginid');

-- EMAIL CONFIG
INSERT INTO EMAILCONFIG VALUES ('Test subject', 'Hello world email', 'test@ijoin.com', 'IJoinOrderConfirmation');