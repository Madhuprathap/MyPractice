-- Copyright (c) 2002, 2012 Oracle and/or its affiliates. All rights reserved.
-- Oracle and Java are registered trademarks of Oracle and/or its affiliates. Other names may be trademarks of their respective owners.
-- 
-- This software and related documentation are provided under a license agreement containing restrictions 
-- on use and disclosure and are protected by intellectual property laws. Except as expressly permitted 
-- in your license agreement or allowed by law, you may not use, copy, reproduce, translate, broadcast, modify, 
-- license, transmit, distribute, exhibit, perform, publish or display any part, in any form, or by any means. 
-- Reverse engineering, disassembly, or decompilation of this software, unless required by law for interoperability, is prohibited.
-- 
-- The information contained herein is subject to change without notice and is not warranted to be error-free. If you find any errors, please report them to us in writing.
-- 
-- If this is software or related documentation that is delivered to the U.S. Government or anyone licensing it on behalf of the U.S. Government, the following notice is applicable:
-- 
-- U.S. GOVERNMENT END USERS: Oracle programs, including any operating system, integrated software, 
-- any programs installed on the hardware, and/or documentation, delivered to U.S. Government end users are "commercial computer software" 
-- pursuant to the applicable Federal Acquisition Regulation and agency-specific supplemental regulations. As such, use, duplication, 
-- disclosure, modification, and adaptation of the programs, including any operating system, integrated software, any programs installed 
-- on the hardware, and/or documentation, shall be subject to license terms and license restrictions applicable to the programs. No other rights are granted to the U.S. Government.
-- 
-- This software or hardware is developed for general use in a variety of information management applications. It is 
-- not developed or intended for use in any inherently dangerous applications, including applications that may create a risk of 
-- personal injury. If you use this software or hardware in dangerous applications, then you shall be responsible to take all 
-- appropriate fail- safe, backup, redundancy, and other measures to ensure its safe use. Oracle Corporation and its affiliates 
-- disclaim any liability for any damages caused by use of this software or hardware in dangerous applications.
-- 
-- This software or hardware and documentation may provide access to or information on content, products and services from third parties. 
-- Oracle Corporation and its affiliates are not responsible for and expressly disclaim all warranties of any kind with respect to 
-- third-party content, products, and services. Oracle Corporation and its affiliates will not be responsible for any loss, costs, 
-- or damages incurred due to your access to or use of third-party content, products, or services.

-- Create Table Scripts
CREATE TABLE DW_STG_DATA 
    (
     DATA_ID NUMERIC NOT NULL IDENTITY(0,1),
     EVENT_NAME VARCHAR (50) NOT NULL,
     DATE_INSERTED DATETIME DEFAULT CURRENT_TIMESTAMP,
     BATCH_NUM NUMERIC (10) DEFAULT -1 NOT NULL,
     IS_PROCESSED NUMERIC (1) DEFAULT -1 NOT NULL,
     DATE_PROCESSED DATETIME,
     EXCEPTION_ID NUMERIC (10) DEFAULT -1 NOT NULL,
     ACTION_EVENT VARCHAR (50) DEFAULT 'N/A' NOT NULL,
     ACTION_EVENT_REASON NVARCHAR (4000),
     ALIAS_ID VARCHAR (64) DEFAULT 'N/A' NOT NULL,
     ANSWER_ID NUMERIC (10) DEFAULT -1 NOT NULL,
     ANSWER_TYPE NUMERIC (2),
     BASED_MAJOR_VERSION NUMERIC (10),
     BASED_MINOR_VERSION NUMERIC (10),
     CASELINK_ID VARCHAR (64) DEFAULT 'N/A' NOT NULL,
     CASELINK_NAME VARCHAR (50),
     CATEGORY_ID VARCHAR (100) DEFAULT 'N/A' NOT NULL,
     CATEGORY_ID_LIST NVARCHAR (4000),
     CHANNEL_ID VARCHAR (64) DEFAULT 'N/A' NOT NULL,
     COLLECTION_NAME NVARCHAR (100),
     COLLISION NUMERIC (10),
     COMMENTS NVARCHAR (4000),
     COMPLETED_USER_ID VARCHAR (64) DEFAULT 'N/A' NOT NULL,
     CONTENT_ID VARCHAR (64) DEFAULT 'N/A' NOT NULL,
     CONTENTTEXT_ID VARCHAR (64) DEFAULT 'N/A' NOT NULL,
     DISCUSSION_BOARD_ID VARCHAR (64) DEFAULT 'N/A' NOT NULL,
     DISPLAY_ORDER NUMERIC (10),
     DOCUMENT_ID VARCHAR (50) DEFAULT 'N/A' NOT NULL,
     DOCUMENT_ID_LIST VARCHAR (4000),
     DOCUMENT_TYPE VARCHAR (255),
     DURATION NUMERIC (10),
     END_DATE DATETIME,
     EXPIRATION_DATE DATETIME,
     FACET_CLICKTHRU_ID NUMERIC (10),  
     FIRST_NAME NVARCHAR (100),
     FORUM_ID VARCHAR (64) DEFAULT 'N/A' NOT NULL,
     FULL_PATH NVARCHAR (4000),
     ID VARCHAR (100) DEFAULT 'N/A',
     INDEX_MASTER_ID NVARCHAR (4000) DEFAULT 'N/A' NOT NULL,
     IP_ADDRESS VARCHAR (50),
     IS_ACTIVE VARCHAR (1),
     IS_DEFAULT VARCHAR (1),
     IS_GOAL VARCHAR (1),
     IS_LINKED NUMERIC (1),
     IS_PUBLISHED VARCHAR (1),
     IS_UNLINKED NUMERIC (1),
     KEY_NUM NUMERIC (10),
     LAST_NAME NVARCHAR (100),
     LOCALE_ID VARCHAR (64) DEFAULT 'N/A' NOT NULL,
     LOGIN VARCHAR (100) DEFAULT 'N/A' NOT NULL,
     MAJOR_VERSION NUMERIC (10),
     MESSAGE_ID VARCHAR (64) DEFAULT 'N/A' NOT NULL,
     MINOR_VERSION NUMERIC (10),
     NAME NVARCHAR (1000),
     NORMALIZER NUMERIC (10),
     OBJECT_COUNT NUMERIC (10),
     OBJECT_ID NVARCHAR (100),
     PAGE_NUMBER NUMERIC (10),
     PARENT_ID VARCHAR (100) DEFAULT 'N/A' NOT NULL,
     POINTS NUMERIC (10),
     POSITION NUMERIC,
     PRIORITY NUMERIC (18),
     PUBLISHED_DATE DATETIME,
     PURPOSE NUMERIC,
     QUERY_SOURCE VARCHAR (255),
     QUESTION_ID NUMERIC (10) DEFAULT -1 NOT NULL,
     QUESTION_LOCALE_ID VARCHAR (64) DEFAULT 'N/A' NOT NULL,
     QUESTION_TEXT NVARCHAR (4000),
     REFERER NVARCHAR (4000),
     RELATED_FROM_CONTENT_ID VARCHAR (64) DEFAULT 'N/A' NOT NULL,
     REPORTING_USERGROUP_ID VARCHAR (100) DEFAULT 'N/A' NOT NULL,
     REPOSITORY_ID VARCHAR (64) DEFAULT 'N/A' NOT NULL,
     SCORE NUMERIC (17,16),
     SESSION_ID VARCHAR (64) DEFAULT 'N/A',
     SESSION_REPORTING_GROUP_ID VARCHAR (100) DEFAULT 'N/A' NOT NULL,
     SESSION_USER_ID VARCHAR (64) DEFAULT 'N/A' NOT NULL,
     START_DATE DATETIME,
     STATUS NUMERIC,
     STEP_ID VARCHAR (64) DEFAULT 'N/A' NOT NULL,
     SUBMITTED_USER_ID VARCHAR (64) DEFAULT 'N/A' NOT NULL,
     TEXT NVARCHAR (4000),
     TEXT_NORMALIZED NVARCHAR (4000),
     TIMESTAMP DATETIME,
     TIMESTAMP_STR VARCHAR (15),
     TOPIC_ID VARCHAR (64) DEFAULT 'N/A' NOT NULL,
     TRANSACTION_ID NUMERIC (10) DEFAULT -1 NOT NULL,
     TYPE VARCHAR (2000),
     TYPE_NUM NUMERIC,
     URL NVARCHAR (4000),
     USER_GROUP_ID_LIST NVARCHAR (4000),
     USER_ID VARCHAR (64) DEFAULT 'N/A' NOT NULL,
     VALUE NVARCHAR (4000),
     VALUE_NUM NUMERIC,
     VERSION VARCHAR (255),
     VERSION_AUTHOR_ID VARCHAR (64) DEFAULT 'N/A' NOT NULL,
     VERSION_OWNER_ID VARCHAR (64) DEFAULT 'N/A' NOT NULL,
     VIEW_ID VARCHAR (100) DEFAULT 'N/A' NOT NULL,
     VIEW_ID_LIST NVARCHAR (4000),
     WORKFLOW_ID VARCHAR (64) DEFAULT 'N/A' NOT NULL,
     WORKFLOW_STEP_ID VARCHAR (64) DEFAULT 'N/A' NOT NULL,
     CUSTOM_DATE_01 DATETIME,
     CUSTOM_DATE_02 DATETIME,
     CUSTOM_DATE_03 DATETIME,
     CUSTOM_DATE_04 DATETIME,
     CUSTOM_DATE_05 DATETIME,
     CUSTOM_NUMBER_01 NUMERIC,
     CUSTOM_NUMBER_02 NUMERIC,
     CUSTOM_NUMBER_03 NUMERIC,
     CUSTOM_NUMBER_04 NUMERIC,
     CUSTOM_NUMBER_05 NUMERIC,
     CUSTOM_STRING_01 NVARCHAR (4000),
     CUSTOM_STRING_02 NVARCHAR (4000),
     CUSTOM_STRING_03 NVARCHAR (4000),
     CUSTOM_STRING_04 NVARCHAR (4000),
     CUSTOM_STRING_05 NVARCHAR (4000),
    ) ON "default";

CREATE TABLE DW_STG_EVENT 
    (
     EVENT_NAME VARCHAR (50) NOT NULL,
     PRODUCT VARCHAR (50) NOT NULL,
     OBJECT VARCHAR (50) NOT NULL,
     ACTIVE VARCHAR (5) NOT NULL,
     COMMENTS NVARCHAR (1000),
     DATE_UPDATED DATETIME NOT NULL,
    ) ON "default";

CREATE TABLE DW_STG_EVENT_DEFINITION 
    (
     EVENT_NAME VARCHAR (50) NOT NULL,
     COLUMN_NAME VARCHAR (50) NOT NULL,
     COMMENTS NVARCHAR (1000),
     DATE_UPDATED DATETIME NOT NULL,
    ) ON "default";

-- Add Primary Keys
ALTER TABLE DW_STG_DATA ADD PRIMARY KEY CLUSTERED (DATA_ID) ON "default";
ALTER TABLE DW_STG_EVENT ADD PRIMARY KEY CLUSTERED (EVENT_NAME) ON "default";
ALTER TABLE DW_STG_EVENT_DEFINITION ADD PRIMARY KEY CLUSTERED (COLUMN_NAME, EVENT_NAME) ON "default";

-- Add Additional Constraints
ALTER TABLE DW_STG_DATA             ADD CONSTRAINT DATA_EVENT_FK      FOREIGN KEY (EVENT_NAME) REFERENCES DW_STG_EVENT (EVENT_NAME) ON DELETE NO ACTION ON UPDATE NO ACTION; 
ALTER TABLE DW_STG_EVENT_DEFINITION ADD CONSTRAINT EVENT_DEF_EVENT_FK FOREIGN KEY (EVENT_NAME) REFERENCES DW_STG_EVENT (EVENT_NAME) ON DELETE NO ACTION ON UPDATE NO ACTION;

-- Create Single Key Indexes
CREATE NONCLUSTERED INDEX DW_STG_DATA_ACTION_EVENT_IDX   ON DW_STG_DATA (ACTION_EVENT)   ON "default";
CREATE NONCLUSTERED INDEX DW_STG_DATA_ANSWER_ID_IDX      ON DW_STG_DATA (ANSWER_ID)      ON "default"; 
CREATE NONCLUSTERED INDEX DW_STG_DATA_ANSWER_TYPE_IDX    ON DW_STG_DATA (ANSWER_TYPE)    ON "default"; 
CREATE NONCLUSTERED INDEX DW_STG_DATA_BATCHNUM_IDX       ON DW_STG_DATA (BATCH_NUM)      ON "default";
CREATE NONCLUSTERED INDEX DW_STG_DATA_CONTENT_ID_IDX     ON DW_STG_DATA (CONTENT_ID)     ON "default";
CREATE NONCLUSTERED INDEX DW_STG_DATA_CONTENTTEXT_ID_IDX ON DW_STG_DATA (CONTENTTEXT_ID) ON "default";
CREATE NONCLUSTERED INDEX DW_STG_DATA_DOCUMENT_ID_IDX    ON DW_STG_DATA (DOCUMENT_ID)    ON "default";
CREATE NONCLUSTERED INDEX DW_STG_DATA_EVENT_NAME_IDX     ON DW_STG_DATA (EVENT_NAME)     ON "default"; 
CREATE NONCLUSTERED INDEX DW_STG_DATA_ID_IDX             ON DW_STG_DATA (ID)             ON "default";
CREATE NONCLUSTERED INDEX DW_STG_DATA_QUESTION_ID_IDX    ON DW_STG_DATA (QUESTION_ID)    ON "default"; 
CREATE NONCLUSTERED INDEX DW_STG_DATA_SESSION_ID_IDX     ON DW_STG_DATA (SESSION_ID)     ON "default"; 
CREATE NONCLUSTERED INDEX DW_STG_DATA_TRNS_ID_IDX        ON DW_STG_DATA (TRANSACTION_ID) ON "default";
CREATE NONCLUSTERED INDEX DW_STG_DATA_WORKFLOW_ID_IDX    ON DW_STG_DATA (WORKFLOW_ID)    ON "default";
CREATE NONCLUSTERED INDEX DW_STG_EVENT_PRODUCT_IDX       ON DW_STG_EVENT (PRODUCT)       ON "default";

-- Create Double Key Indexes
CREATE NONCLUSTERED INDEX DW_STG_DAT_EVT_NAME_WFS_ID_IDX ON DW_STG_DATA (EVENT_NAME,WORKFLOW_STEP_ID) ON "default";
CREATE NONCLUSTERED INDEX DW_STG_DATA_EVT_NAME_WF_ID_IDX ON DW_STG_DATA (EVENT_NAME,WORKFLOW_ID)      ON "default";
CREATE NONCLUSTERED INDEX DW_STG_DATA_PRF2_IDX           ON DW_STG_DATA (SESSION_ID,BATCH_NUM)        ON "default"; 
CREATE NONCLUSTERED INDEX DW_STG_DATA_PRF4_IDX           ON DW_STG_DATA (EVENT_NAME,BATCH_NUM)        ON "default"; 
CREATE NONCLUSTERED INDEX DW_STG_DATA_TIME_IS_PROS_IDX   ON DW_STG_DATA (TIMESTAMP,IS_PROCESSED)      ON "default";
CREATE NONCLUSTERED INDEX DW_STG_DATA_TS_ACTION_EVT_IDX  ON DW_STG_DATA  (TIMESTAMP,ACTION_EVENT)     ON "default";

-- Create Triple Key Indexes
CREATE NONCLUSTERED INDEX DW_STG_DATA_PRF3_IDX           ON DW_STG_DATA (TIMESTAMP, SESSION_ID, DATE_PROCESSED) ON "default";
CREATE NONCLUSTERED INDEX DW_STG_DATA_SESS_ID_PRF_IDX    ON DW_STG_DATA (SESSION_ID,EVENT_NAME,USER_ID)         ON "default";

-- Alter data base setting to avoid deadlock
ALTER DATABASE DW_STAGE SET ALLOW_SNAPSHOT_ISOLATION ON;
ALTER DATABASE DW_STAGE SET READ_COMMITTED_SNAPSHOT ON;
