# Android-Course-Dot
Android Course With Dot
SQLite Lecture


SQLiteDatabase database = this.openOrCreateDatabase("Users" , MODE_PRIVATE, null);

String TALBE = "CREATE TABLE IF NOTEXISTS userinfo (name VARCHAR, age INTEGER(3), id INTEGER PRIMARY AUTOINCREMENT)"
String SELECT = "SELECT (name,age,id) from users"
String INSERT = INSERT into userinfo (name, age) values('ali', '20') 
String DELETE = "DELETE from userinfo where id = 1"
STRING UPDATE = "UPDATE userinfo set age = 28, name= mohammad where id = 1"

database.execSQL(TABLE);
database.execSQL(INSERT);
database.execSQL(UPDATE);

Cursor c = db.rawQuery(SELECT, null);
c.moveToFirst();

while(c.moveToNext()){
  Log.v("SQLITE_DATA Name: " , c.getString(c.getColumnIndex("name")));
  Log.v("SQLITE_DATA AGE: " , Integer.toString(c.getInt(c.getColumnIndex("age"))));
  Log.v("SQLITE_DATA ID: " , Integer.toString(c.getInt(c.getColumnIndex("id"))));
}
