CREATE TABLE IF NOT EXISTS event_queue
(
    `videoId`      UInt64,
    `userId`       UInt64,
    `type`         String,
    `creationDate` DateTime('Europe/Moscow'),
    `videoTime`    UInt64
) ENGINE = Kafka SETTINGS
    kafka_broker_list = 'kafka:9092',
    kafka_topic_list = 'INPUT_DATA',
    kafka_group_name = 'example',
    kafka_format = 'JSONEachRow',
    kafka_num_consumers = 1;

CREATE TABLE IF NOT EXISTS event
(
    `videoId`      UInt64,
    `userId`       UInt64,
    `type`         String,
    `creationDate` DateTime('Europe/Moscow'),
    `videoTime`    UInt64
) Engine = MergeTree()
           order by userId;

CREATE MATERIALIZED VIEW event_mv TO event AS
SELECT videoId, userId, type, creationDate, videoTime
FROM event_queue;