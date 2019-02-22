# angular-ear-8
JavaEE 8 EAR project with Angular frontend


### How to build the project
Tested with maven 3.5.3.

This project contains 2 profiles: backend and frontend.
The backend profile is selected by default. Optionally, the frontend can be built together or separately the backend by selecting its profile:

- mvn clean install: compiles the backend.
- mvn clean install -P frontend: compiles the frontend.
- mvn clean install -P backend,frontend: compiles both the backend and the frontend.