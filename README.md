# Kubernetes_Path

# Hi I am Jidendiran, welcoming you all on this Kubernetes from scratch tutorial.

# THIS IS SIMPLE SPRING BOOT APPLICATION AND WILL BE USED FOR ALL PROJECTS:

In this Repository each Folder as a project and it will go Step by step from Traditional Approach to Advanced Approach. Each folder Inside README.md available you may check it out.

1. 1.DEPLOYING_APPLICATION_MANUALLY: In this Folder Explains how to make live an simple Java application in a traditional manual Way in Ubuntu OS.

2. 2.CONTAINER_AN_APPLICATION: I Used Same application, This time I converted this application as a Docker images and run it in the Docker engine as a Docker Container.

3. 3.CICDPROJECT_USING_MAVEN: In the very first Project used the manual method and created the Jar File but this Project Used Jenkins Pipeline and built the JAR file using Maven.

4. 4.CICDPROJECT_USING_MAVEN_WITH_ANSIBLE: In the Third Project created the jar file, Now We want to deploy it to the Production server without manual intervention, So we introduced ansible here for deployment, perfomed the following Action by using Ansible. (Taken the Backup of the existing Project and Killed it, Copy the new version of Jar file from Jenkins server to Production and made it live)

5. 5.CICDPROJECT_USING_DOCKER_WITH_ANSIBLE: Previous Projectes explained about the jar file deployments in VM level, In this project we used docker container modern approach. We used Jenkins for Creating Jar file as well as store the docker images in dockerhub. Finally used ansible script for image deployment in production server.