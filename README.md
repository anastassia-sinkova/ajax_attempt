# Sectors application

## Functionality
UI is not working, the form is not serialized.

## Setup
Checkout the source from `https://github.com/anastassia-sinkova/attempt_at_ajax.git`.

Assuming you have Docker installed,
run the next command to create and initialize database:
```
cd docker && docker build -t sectors-db ./
```

## Running application
Run the database:
```
cd docker && docker run -d --name sectors-db-container -p 5432:5432 sectors-db
```
Run the application:
```
gradle bootRun
```
Application is available at `http://localhost:8080`.
