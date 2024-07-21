db = db.getSiblingDB('admin');
db.auth(
    process.env.MONGO_INITDB_ROOT_USERNAME,
    process.env.MONGO_INITDB_ROOT_PASSWORD,
);

db = db.getSiblingDB(process.env.MONGO_INITDB_DATABASE);

db.createUser({
    'user': "dbUser",
    'pwd': "dbPwd",
    'roles': [{
        'role': 'dbOwner',
        'db': 'DB_test'}]});

db.createCollection('users');
db.createCollection('products');
