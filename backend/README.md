# MacroMate API

### How to run the project
Make sure you are in the backend directory
```bash
cd backend
```

Make sure you have maven installed
```bash
mvn -v
```
Expected output: something like `Apache Maven 3.6.3...`

Build the project
```bash
mvn clean package
```

Run the project
```bash
docker-compose -p macro-mate-api up -d
```

### Initial DB setup
User `./src/persistence/init_db.sql` to create the initial database schema and populate it with some data.