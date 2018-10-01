# sandbox
Spring boot 2-based Kafka client
## Development

    docker network create -d bridge pipeline
    
Subscribes to a docker-compose spawned Kafka topic. 
    
    docker inspect --format '{{ .NetworkSettings.Networks.$network.IPAddress }}' 30f692fc1ed7

works out of the box with src/main/docker/pipeline.yml

shell #1

    docker-compose -f pipeline.yml up -d
    
shell #2

    docker run --rm -v /var/run/docker.sock:/var/run/docker.sock -e HOST_IP=docker_host_ip -e ZK=docker_host_ip:2181 -i -t  wurstmeister/kafka /bin/bash

    kafka-topics.sh --create --topic topic --partitions 1 --zookeeper $ZK --replication-factor 1
    kafka-console-producer.sh --topic=topic --broker-list=`broker-list.sh`

shell #3

    docker run --rm -v /var/run/docker.sock:/var/run/docker.sock -e HOST_IP=docker_host_ip -e ZK=docker_host_ip:2181 -i -t  wurstmeister/kafka /bin/bash
    kafka-console-consumer.sh --topic=topic --bootstrap-server=10.247.185.47:8092
