To run docker image of mongo DB

`docker run -d -p 27017:27017 --name mongodbdocker <ImageId of Mongo>`

to create spring boot docker

`docker build -t <spring-docker-Image-Name>:<version> .`

to run spring boot docker image
`docker run -p 8080:8080 --name spring-boot-mongo --link mongodbdocker:mongo -d <spring-boot-image-Id>`

to spring boot docker container logs
`docker logs <container-name>`

to using docker-compose.yml
`docker-compose up`