# SERVERLESS 2049

## Overview

![1](https://user-images.githubusercontent.com/58912194/217022271-03a1bf5d-5a12-4636-9ce4-3a357a53dd77.png)

## Scenarios

### 01. From WEB to the serverless NoSQL database

**Description**  
- The serverless function, which HTTP triggers 100.000 times, writes an input to the serverless NoSQL database.

[Scenario](https://github.com/Berehulia/Serverless-2049/blob/master/scenarios/01/scenario-generic.yaml)

| Average execution cost      | AWS | AZURE | GCP |
|-----------------------------|-----|-------|-----|
| Java 11 - Plain             |     |       |     |
| Java 11 - Micronaut         |     |       |     |
| Java 11 - Micronaut & Graal |     |       |     |
| Java 11 - Quarkus           |     |       |     |
| Java 11 - Quarkus & Graal   |     |       |     |

| Average execution time      | AWS | AZURE | GCP |
|-----------------------------|-----|-------|-----|
| Java 11 - Plain             |     |       |     |
| Java 11 - Micronaut         |     |       |     |
| Java 11 - Micronaut & Graal |     |       |     |
| Java 11 - Quarkus           |     |       |     |
| Java 11 - Quarkus & Graal   |     |       |     |

---

### 02. From queue to the serverless NoSQL database

Description:
- The serverless function, which queue triggers 100.000 times, writes an input to the serverless NoSQL database.

| Average execution cost      | AWS | AZURE | GCP |
|-----------------------------|-----|-------|-----|
| Java 11 - Plain             |     |       |     |
| Java 11 - Micronaut         |     |       |     |
| Java 11 - Micronaut & Graal |     |       |     |
| Java 11 - Quarkus           |     |       |     |
| Java 11 - Quarkus & Graal   |     |       |     |

| Average execution time      | AWS | AZURE | GCP |
|-----------------------------|-----|-------|-----|
| Java 11 - Plain             |     |       |     |
| Java 11 - Micronaut         |     |       |     |
| Java 11 - Micronaut & Graal |     |       |     |
| Java 11 - Quarkus           |     |       |     |
| Java 11 - Quarkus & Graal   |     |       |     |

