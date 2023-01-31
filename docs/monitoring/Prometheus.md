# Prometheus

* https://www.callicoder.com/spring-boot-actuator-metrics-monitoring-dashboard-prometheus-grafana/
* https://prometheus.io/docs/prometheus/latest/getting_started/#configuring-prometheus-to-monitor-itself
* https://prometheus.io/docs/introduction/first_steps/

```
docker run -d --name=prometheus -p 9090:9090 -v $HOME/Developer/git2/02_Spring/my-spring-boot-playground:/etc/prometheus prom/prometheus --config.file=/etc/prometheus/prometheus.yml
```

PS: update IP address inside prometheus.yml file

* Expression Query
  * `system_cpu_usage`
  * `http_server_requests_seconds_max{uri="/greetings"}`
  * `http_server_requests_seconds_count{uri="/greetings"}`
  * Ref: https://prometheus.io/docs/introduction/first_steps/#using-the-expression-browser
