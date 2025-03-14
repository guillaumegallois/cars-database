# Cars Database

## Installation

- Mongodb Compass
- MongoDB Command Line Database Tools Download. Download, extract folder and add it to your PATH

## Import data into MongoDB
- Download sample data from https://voiture.car2db.com
- Open CSV files and transform all text delimiters from " to '
- Upload every csv files to mongo cars_database: `mongoimport mongodb+srv://[USER]:[password]@[DATABASE_HOST] -d cars_database -c XXX  --type csv --file XXX.csv --headerline`

