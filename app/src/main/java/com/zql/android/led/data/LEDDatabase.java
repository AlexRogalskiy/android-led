package com.zql.android.led.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

/**
 * Created by scott on 2017/6/30.
 */

@Database(entities = {LEDEntity.class} ,version = 1)
public abstract class LEDDatabase extends RoomDatabase{
    public abstract LEDDao getLEDDao();
}
