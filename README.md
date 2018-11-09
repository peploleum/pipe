# sandbox
Spring boot 2-based Kafka client
## Development

    docker network create -d bridge pipeline
    
Subscribes to a docker-compose spawned Kafka topic. 
    
    docker inspect --format '{{ .NetworkSettings.Networks.$network.IPAddress }}' 30f692fc1ed7

works out of the box with src/main/docker/dev/broker.yml

shell #1

    docker-compose -f broker.yml up -d
    
shell #2

    docker run --rm -v /var/run/docker.sock:/var/run/docker.sock -e HOST_IP=docker_host_ip -e ZK=docker_host_ip:2181 -i -t  wurstmeister/kafka /bin/bash

    kafka-topics.sh --create --topic topic --partitions 1 --zookeeper $ZK --replication-factor 1
    kafka-console-producer.sh --topic=topic --broker-list=`broker-list.sh`

shell #3

    docker run --rm -v /var/run/docker.sock:/var/run/docker.sock -e HOST_IP=docker_host_ip -e ZK=docker_host_ip:2181 -i -t  wurstmeister/kafka /bin/bash
    kafka-console-consumer.sh --topic=topic --bootstrap-server=10.247.185.47:8092

## Pipeline

    cd C:\dev\pipe\src\main\docker
    docker-compose  -f .\insight.yml  -p insight up


    curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' --header 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImF1dGgiOiJST0xFX0FETUlOLFJPTEVfVVNFUiIsImV4cCI6MTU0MTc5MjEyOX0.zDIKMMm7aFkTVdgb_9pU6vOASRvWyLMlA83AByuo7yLiK0cZl8wQLrFh5ABIEcd1gu-5-qV12DbnVsg2r8im7g' -d '{ \ 
       "dateDebut": "2018-11-09T07:34:46.443Z", \ 
       "dateFin": "2018-11-09T07:34:46.443Z", \ 
       "nombreJours": 0, \ 
       "objetsObserves": "string", \ 
       "type": "string" \ 
     }' 'http://localhost:8080/api/observed-data'
