package com.wei.lolbox.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.wei.lolbox.model.discover.PlayerCache;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "PLAYER_CACHE".
*/
public class PlayerCacheDao extends AbstractDao<PlayerCache, Long> {

    public static final String TABLENAME = "PLAYER_CACHE";

    /**
     * Properties of entity PlayerCache.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property UserName = new Property(1, String.class, "userName", false, "USER_NAME");
        public final static Property ServiceName = new Property(2, String.class, "serviceName", false, "SERVICE_NAME");
        public final static Property ServiceId = new Property(3, String.class, "serviceId", false, "SERVICE_ID");
    }


    public PlayerCacheDao(DaoConfig config) {
        super(config);
    }
    
    public PlayerCacheDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"PLAYER_CACHE\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"USER_NAME\" TEXT," + // 1: userName
                "\"SERVICE_NAME\" TEXT," + // 2: serviceName
                "\"SERVICE_ID\" TEXT);"); // 3: serviceId
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"PLAYER_CACHE\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, PlayerCache entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String userName = entity.getUserName();
        if (userName != null) {
            stmt.bindString(2, userName);
        }
 
        String serviceName = entity.getServiceName();
        if (serviceName != null) {
            stmt.bindString(3, serviceName);
        }
 
        String serviceId = entity.getServiceId();
        if (serviceId != null) {
            stmt.bindString(4, serviceId);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, PlayerCache entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String userName = entity.getUserName();
        if (userName != null) {
            stmt.bindString(2, userName);
        }
 
        String serviceName = entity.getServiceName();
        if (serviceName != null) {
            stmt.bindString(3, serviceName);
        }
 
        String serviceId = entity.getServiceId();
        if (serviceId != null) {
            stmt.bindString(4, serviceId);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public PlayerCache readEntity(Cursor cursor, int offset) {
        PlayerCache entity = new PlayerCache( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // userName
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // serviceName
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3) // serviceId
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, PlayerCache entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setUserName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setServiceName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setServiceId(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(PlayerCache entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(PlayerCache entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(PlayerCache entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}