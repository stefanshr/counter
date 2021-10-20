#!/bin/bash
sudo git pull
sudo mvn clean
sudo mvn package
sudo docker rmi counterapp
sudo docker build -t counterapp -f Dockerfile .
sudo docker restart counterApp