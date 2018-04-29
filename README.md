http://wonwoo.ml/index.php/post/268

http://chanwookpark.github.io/spring/aws/docker/%EB%B0%B0%ED%8F%AC/2016/02/03/springboot-aws-docker/

https://github.com/spotify/docker-maven-plugin

## Usage

docker login 을 수행한다.

### You can build an image with the above configurations by running this command.

```
mvn clean package docker:build

아래와 같은 방법으로 tag를 설정하고 push를 한다.
docker tag firstimage YOUR_DOCKERHUB_NAME/firstimage
docker push YOUR_DOCKERHUB_NAME/firstimage


docker tag sunnyvale urstory/sunnyvale
docker push urstory/sunnyvale
``

### To push the image you just built to the registry, specify the pushImage flag.

```
mvn clean package docker:build -DpushImage
```
`
### To push only specific tags of the image to the registry, specify the pushImageTag flag.

```
mvn clean package docker:build -DpushImageTag
```

---

nginx --> docker 로 proxy를 설정할 때

오류가 발생함. 아래와 같이 해결함. 

https://confluence.atlassian.com/bitbucketserverkb/13-permission-denied-while-connecting-to-upstream-while-configuring-ngnix-803374014.html


centos 에서 특정 포트를 차단하기

firewall-cmd --zone=public --remove-port=8080/tcp
firewall-cmd --runtime-to-permanent 
firewall-cmd --reload 