# System Design Overview

System Design is the process of defining the architecture, components, and interfaces of a system to meet specific requirements.
It is broadly divided into two major phases — **High-Level Design (HLD)** and **Low-Level Design (LLD)**.

---

## High-Level Design (HLD)

### **What it is**

High-Level Design focuses on the *overall system architecture*.
It defines how different components interact, what technologies to use, and how data flows through the system.

### **Key Focus Areas**

* System architecture and modules
* Data flow between components
* High-level technology stack decisions
* Database selection and schema outline
* APIs and service boundaries
* Scalability, reliability, and performance considerations

### **Deliverables**

* Architectural diagrams (e.g., component, deployment, sequence)
* Service and data flow diagrams
* API contracts or endpoint summaries
* Non-functional requirement (NFR) handling strategy

### **Example**

**System:** Ride-sharing platform (e.g., Uber)

* Components: Passenger Service, Driver Service, Matching Service, Notification Service
* Architecture: Microservices communicating via REST/gRPC
* Storage: PostgreSQL for transactional data, Redis for caching
* Communication: Kafka for asynchronous messaging

---

## Low-Level Design (LLD)

### **What it is**

Low-Level Design deals with the *internal logic* of each component defined in HLD.
It focuses on classes, methods, data structures, and detailed algorithms.

### **Key Focus Areas**

* Class diagrams and object interactions
* Database schema details and relationships
* Design patterns (e.g., Singleton, Factory, Observer)
* Detailed API request/response modeling
* Error handling and logging strategies
* Internal algorithms and data structure choices

### **Deliverables**

* Class & sequence diagrams
* Detailed pseudo-code or function-level design
* Schema design with relationships and constraints
* API specifications and object models

### **Example**

**Component:** Matching Service (from HLD example)

* Classes: `Driver`, `Rider`, `MatchEngine`
* Logic: MatchEngine finds nearest available driver using geohash indexing
* Pattern Used: Strategy pattern for distance calculation algorithms
* Database: Indexed table for driver locations updated every few seconds

---

## Case Studies (HLD + LLD Integration)

| System        | Key Concepts                                              |
| ------------- | --------------------------------------------------------- |
| URL Shortener | Hashing, Database Design, Redirection                     |
| Instagram     | Object Storage, Feed Generation, Caching                  |
| WhatsApp      | Message Queues, Real-time Sync, Sharding                  |
| YouTube       | CDN, Data Streaming, Metadata Indexing                    |
| Netflix       | Load Balancing, Microservices, Caching                    |
| Uber          | Geospatial Indexing, Event Streaming, Matching Algorithms |
| Twitter       | Fanout, Rate Limiting, Feed Ranking                       |


---

## Summary Table

| Aspect          | High-Level Design (HLD)                   | Low-Level Design (LLD)      |
| --------------- | ----------------------------------------- | --------------------------- |
| **Focus**       | System architecture                       | Component-level logic       |
| **Granularity** | Broad overview                            | Detailed implementation     |
| **Output**      | Architecture diagrams, module definitions | Class diagrams, pseudo-code |
| **Audience**    | Architects, senior engineers              | Developers, tech leads      |
| **Goal**        | Define *what* to build                    | Define *how* to build it    |

---

## Best Practices

* Start with **HLD** before jumping into **LLD**.
* Use **design patterns** to keep your LLD scalable and maintainable.
* Keep diagrams up to date with codebase evolution.
* Always consider **non-functional requirements** (scalability, fault-tolerance, availability).
* Document **assumptions** and **trade-offs** made during design.

---


