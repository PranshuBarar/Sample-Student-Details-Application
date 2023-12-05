# Sample-Student-Details-Application
This is a sample student details application repo referenced in a blog on hashnode. In this repo I have shared how we can develop a spring boot application with mysql as database and integrate it with AWS Services.

Clone this repository to your personal computer using clone feature above

Open it with Intellij (or the IDE you prefer)

As this is a containerized project, you do not need to setup environments on your personal computer
You just required docker installed on your system. 

Go inside the project folder ('demo' folder) and Run the following command to start your project containers:

```bash
docker build -t demo-student-application .
```
You can change the name of the image "demo-student-application" with something else of your choice but then you will have to do the respective changes in docker-compose.yml file also, otherwise the project will not work. (Actually without doing the respective changes in docker-compose file, docker compose command given below will not run at all)

This above command will build the image using Dockerfile.
After that run this command:

```bash
docker compose up
```
## Now there are two containers running on your system:
- Spring Boot Application

- MySQL Database

## Now you can do testing using postman or whatever you prefer:
Just paste the following URL with Get Method in your preferred API Testing Tool

```bash
http://localhost:8080/student
```
You will get following message:

```bash
Hi, How are you!!
```


