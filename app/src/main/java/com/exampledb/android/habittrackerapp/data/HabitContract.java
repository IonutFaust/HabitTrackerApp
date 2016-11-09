package com.exampledb.android.habittrackerapp.data;
/**
 * Created by Catrina on 27/10/2016.
 */

import android.provider.BaseColumns;

/**
 * API Contract for the Habits app.
 */
public final class HabitContract {

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private HabitContract() {}

    /**
     * Inner class that defines constant values for the habits database table.
     * Each entry in the table represents a single habit.
     */
    public static final class HabitEntry implements BaseColumns {

        /** Name of database table for habits */
        public final static String TABLE_NAME = "habits";

        /**
         * Unique ID number for the habit (only for use in the database table).
         *
         * Type: INTEGER
         */
        public final static String _ID = BaseColumns._ID;

        /**
         * Name of the habit.
         *
         * Type: TEXT
         */
        public final static String COLUMN_HABIT_NAME ="name";

        /**
         * Time of the habit.
         *
         * Type: TEXT
         */
        public final static String COLUMN_HABIT_TIME = "time";

        /**
         * REGULARITY of the habit.
         *
         * The only possible values are {@link #REGULARITY_UNKNOWN}, {@link #REGULARITY_DAILY},
         * or {@link #REGULARITY_WEEKLY}.
         *
         * Type: INTEGER
         */
        public final static String COLUMN_HABIT_REGULARITY = "regularity";

        /**
         * location of the habit.
         *
         * Type: INTEGER
         */
        public final static String COLUMN_HABIT_LOCATION = "location";

        /**
         * Possible values for the REGULARITY of the habit.
         */
        public static final int REGULARITY_UNKNOWN = 0;
        public static final int REGULARITY_DAILY = 1;
        public static final int REGULARITY_WEEKLY = 2;


    }

}

