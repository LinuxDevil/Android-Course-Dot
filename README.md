# Android-Course-Dot
Android Course With Dot
SQLite Lecture

```Java
//Creating a DB called Users
SQLiteDatabase database = this.openOrCreateDatabase("Users" , MODE_PRIVATE, null);

//Creating a Table called userinfo with cols: name, age and id 
//name --> Varchar: string
//age --> integer(3): int with 3 digits
//id --> integer: int which is a primary key and get auto INCREMENTED
String TALBE = "CREATE TABLE IF NOTEXISTS userinfo (name VARCHAR, age INTEGER(3), id INTEGER PRIMARY AUTOINCREMENT)";

//Selecting cols: name,age,id from the table userinfo
String SELECT = "SELECT (name,age,id) from userinfo";

//Inserting into the table userinfo inside the cols: name and age the values ali and 20 , and the id gets auto incremented
String INSERT = "INSERT into userinfo (name, age) values('ali', '20')"; 

//Deleting from the table userinfo where the id is 1
String DELETE = "DELETE from userinfo where id = 1"

//Updating from the table userinfo (age will be 28) (name will be mohammad) where the id is 1
STRING UPDATE = "UPDATE userinfo set age = 28, name= mohammad where id = 1";

//Executing the SQL commands
database.execSQL(TABLE);
database.execSQL(INSERT);
database.execSQL(UPDATE);

//Query the select statment and saving the results into the cursor
Cursor c = db.rawQuery(SELECT, null);

//Moving to the first result (We need to do it becasue it starts at -1)
c.moveToFirst();

//While the cursor have another result
while(c.moveToNext()){ 
    
   //Get the string that is inside this result inside the column with index name 
  Log.v("SQLITE_DATA Name: " , c.getString(c.getColumnIndex("name")));
  Log.v("SQLITE_DATA AGE: " , Integer.toString(c.getInt(c.getColumnIndex("age"))));
  Log.v("SQLITE_DATA ID: " , Integer.toString(c.getInt(c.getColumnIndex("id"))));
}
```



```Java

System.out.println("Happy Coding!");

```

For any Questions please go to:
fb.com/aligmohammad
