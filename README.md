# Sample project for using [HibernateTools](https://docs.jboss.org/tools/latest/en/hibernatetools/html/ant.html) with Gradle & Ant

This is a small demo project for reverse engineering a database schema into Java objects using HibernateTools with Gradle and Ant.

## Testing with docker

Create MySQL database with docker:

```
docker-compose up &
```

Run reverse engineering task using Gradle Wrapper:
```
./gradlew hibernate
```

Database connection can be configured in [hibernate-db.properties](https://github.com/Merve40/hibernatetools-reverse-engineering/blob/master/src/main/resources/hibernate-db.properties).





