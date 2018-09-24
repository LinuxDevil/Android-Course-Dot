# Android-Course-Dot
Android Course With Dot Android Media

Put a Song and a Video inside your res > raw folder.

Replace 'song' with your own song name.

```Java
songPlayer = MediaPlayer.create(this,R.raw.song);
```

Replace your 'g' with your own video name.

```Java
 Uri videoUri = Uri.parse("android.resource://"
                + getPackageName() +
                "/" + R.raw.g);
```

Follow the
```Java
      //TODO:
      ``` Inside your project.
