# apache-kafka-example
This is an example of apache kafka with spring boot. It has simple producer and consumer example

Followings are the usefull commands:

TO START THE ZOOKEEPER

>zkserver

TO START THE KAFKA ON WINDOWS

>C:\kafka_2.12-3.3.1\bin\windows>kafka-server-start.bat ../../config/server.properties

TO CREATE THE TOPIC BY COMMAND

C:\kafka_2.12-3.3.1\bin\windows>kafka-topics.bat --bootstrap-server localhost:9092 --topic test --create --partitions 3 --replication 3

TO LIST THE TOPICS

C:\kafka_2.12-3.3.1\bin\windows>kafka-topics.bat --bootstrap-server localhost:9092 --list

TO CONSUME THE MESSAGES 

C:\kafka_2.12-3.3.1\bin\windows>kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic test --from-beginning
