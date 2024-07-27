FROM adoptopenjdk/openjdk8

RUN mkdir -p /etc/xamazon

WORKDIR /etc/xamazon

ADD ./build/libs/*.jar .

CMD java $JAVA_OPTS  -jar *.jar
