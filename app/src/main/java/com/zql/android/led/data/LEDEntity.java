package com.zql.android.led.data;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * Created by scott on 2017/6/30.
 */

@Entity
public class LEDEntity {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public String content;

    public int textColor;

    public int bgColor;

    public int textSize;

    public int ledSize;
}
