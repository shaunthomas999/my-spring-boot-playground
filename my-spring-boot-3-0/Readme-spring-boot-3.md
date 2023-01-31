# Spring-boot 3.x

* [Release Notes - https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-3.0-Release-Notes](https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-3.0-Release-Notes)
* [Migration Guide - https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-3.0-Migration-Guide](https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-3.0-Migration-Guide)
* [Dependencies List - https://docs.spring.io/spring-boot/docs/3.0.0-SNAPSHOT/reference/html/dependency-versions.html#appendix.dependency-versions](https://docs.spring.io/spring-boot/docs/3.0.0-SNAPSHOT/reference/html/dependency-versions.html#appendix.dependency-versions)

## Spring 6

* [Spring Security - Migration - https://docs.spring.io/spring-security/reference/5.8/migration/index.html](https://docs.spring.io/spring-security/reference/5.8/migration/index.html)

## Build

* GraalVM
* `mvn -DskipTests -Pnative native:compile`

## Prometheus

* https://www.callicoder.com/spring-boot-actuator-metrics-monitoring-dashboard-prometheus-grafana/
* https://prometheus.io/docs/prometheus/latest/getting_started/#configuring-prometheus-to-monitor-itself

```
docker run -d --name=prometheus -p 9090:9090 -v $HOME/Developer/git2/02_Spring/my-spring-boot-playground:/etc/prometheus/prometheus.yml prom/prometheus --config.file=/etc/prometheus/prometheus.yml
```
