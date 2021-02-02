package com.zql.android.led.data;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

/**
 * Created by scott on 2017/6/30.
 */

@Dao
public interface LEDDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertLEDEntities(LEDEntity ...entities);

    @Update
    public void updateLEDEntities(LEDEntity ...entities);

    @Delete
    public void deleteLEDEntities(LEDEntity ...entities);

    @Query("select * from LEDEntity")
    public List<LEDEntity> getAllLEDEntities();
}
