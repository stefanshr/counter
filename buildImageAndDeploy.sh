#!/bin/bash
sudo git pull
sudo mvn clean
sudo mvn package
sudo docker stop counterApp
sudo docker rmi counterapp -f
sudo docker build -t counterapp -f Dockerfile .
sudo docker start counterApp