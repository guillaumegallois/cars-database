# Cars Database

## Installation

- MongoDB Compass
- MongoDB Command Line Database Tools Download. Download, extract folder and add it to your PATH
- Create MongoDB database on Atlas named as "cars_database" and get database URI

## Import data into MongoDB

- Download sample data from https://voiture.car2db.com
- Open CSV files and transform all text delimiters from " to '
- Upload every csv files to mongo cars_database: `mongoimport [YOUR_DATABASE_URI] -d cars_database -c XXX  --type csv --file XXX.csv --headerline`

# App configuration

Create "MONGODB_CARSDATABASE_URI" environment variable with with "[YOUR_DATABASE_URI]" value in Run configuration