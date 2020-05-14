Prior to start this app you have to have Kafka (and Zookeeper, as it is required for Kafka) be installed on your machine.

**Installation of Zookeeper**
0. Download and unpack http://zookeeper.apache.org/releases.html
1. Go to your ZooKeeper config directory. For me its _C:\zookeeper-3.4.7\conf_
2. Rename file “zoo_sample.cfg” to “zoo.cfg”
3. Open zoo.cfg in any text editor. Find and edit `dataDir=/tmp/zookeeper` to `dataDir=C:\zookeeper-3.4.7\data`  
4. Add an entry in the System Environment Variables.
Add `ZOOKEEPER_HOME = C:\zookeeper-3.4.7` to the System Variables.
Edit the System Variable named “Path” and add `;%ZOOKEEPER_HOME%\bin` 
5. You can change the default Zookeeper port in _zoo.cfg_ file (Default port 2181).
6. Run ZooKeeper by opening a new cmd and type `zkserver`.

**Installation of Kafka**
1. http://kafka.apache.org/downloads.html
2. Go to your Kafka config directory. For me its _C:\kafka_2.11-0.9.0.0\config_
3. Edit the file _server.properties_
4. Find and edit the line `log.dirs=/tmp/kafka-logs` to `log.dir=C:\kafka_2.11-0.9.0.0\kafka-logs`.
5. If your ZooKeeper is running on some other machine or cluster you can edit `zookeeper.connect=localhost:2181` to your custom IP and port. For this demo, we are using the same machine so there's no need to change. Also the Kafka port and broker.id are configurable in this file. Leave other settings as is.
6. Your Kafka will run on default port `9092` and connect to ZooKeeper’s default port, `2181`.

See for additional info: https://habr.com/ru/post/440400/
