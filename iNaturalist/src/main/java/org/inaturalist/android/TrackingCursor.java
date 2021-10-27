package org.inaturalist.android;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

import org.tinylog.Logger;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TrackingCursor extends SQLiteCursor {
    private static List<TrackingCursor> openCursors = Collections.synchronizedList(new LinkedList<>());
    private String[] mSelectionArgs;
    public String query;

    public TrackingCursor(SQLiteDatabase db, SQLiteCursorDriver driver,
                          String editTable, SQLiteQuery query) {
        super(db, driver, editTable, query);
        this.query = query.toString();
        synchronized (openCursors) {
            openCursors.add(this);
        }
    }

    public void close() {
        synchronized (openCursors) {
            openCursors.remove(this);
        }
    }

    public void setSelectionArgs(String[] selectionArgs) {
        mSelectionArgs = selectionArgs;
    }

}