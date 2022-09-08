# casandra-example-spring-boot

## Run below command to start casandra in docker
~~~
docker compose -f docker-compose.yml up -d
~~~

## Ref Link
~~~
https://github.com/Netflix/osstracker/blob/master/docker-compose.yml
~~~

# Why use Apache Cassandra?
~~~
Apache Cassandra is an open source, distributed, wide-column store, NoSQL database which delivers always-on availability

Elastic scalability − Cassandra is highly scalable; it allows to add more hardware to accommodate more customers and more data as per requirement.

Always on architecture − Cassandra has no single point of failure and it is continuously available for business-critical applications that cannot afford a failure.

Fast linear-scale performance − Cassandra is linearly scalable, i.e., it increases your throughput as you increase the number of nodes in the cluster. Therefore it maintains a quick response time.

Flexible data storage − Cassandra accommodates all possible data formats including: structured, semi-structured, and unstructured. It can dynamically accommodate changes to your data structures according to your need.

Easy data distribution − Cassandra provides the flexibility to distribute data where you need by replicating data across multiple data centers.

Transaction support − Cassandra supports properties like Atomicity, Consistency, Isolation, and Durability (ACID).

Fast writes − Cassandra was designed to run on cheap commodity hardware. It performs blazingly fast writes and can store hundreds of terabytes of data, without sacrificing the read efficiency.
~~~
