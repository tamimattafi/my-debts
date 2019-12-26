package com.tamimattafi.mydebts.model.database.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RxRoom;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.tamimattafi.mydebts.model.entities.Debt;
import io.reactivex.Flowable;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class DebtsDao_Impl implements DebtsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Debt> __insertionAdapterOfDebt;

  private final EntityDeletionOrUpdateAdapter<Debt> __deletionAdapterOfDebt;

  private final EntityDeletionOrUpdateAdapter<Debt> __updateAdapterOfDebt;

  public DebtsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDebt = new EntityInsertionAdapter<Debt>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `debts` (`id`,`sum`,`currency`,`person`,`isDebtor`,`date`,`creationDate`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Debt value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getSum() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getSum());
        }
        if (value.getCurrency() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCurrency());
        }
        if (value.getPerson() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPerson());
        }
        final int _tmp;
        _tmp = value.isDebtor() ? 1 : 0;
        stmt.bindLong(5, _tmp);
        stmt.bindLong(6, value.getDate());
        stmt.bindLong(7, value.getCreationDate());
      }
    };
    this.__deletionAdapterOfDebt = new EntityDeletionOrUpdateAdapter<Debt>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `debts` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Debt value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
    this.__updateAdapterOfDebt = new EntityDeletionOrUpdateAdapter<Debt>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `debts` SET `id` = ?,`sum` = ?,`currency` = ?,`person` = ?,`isDebtor` = ?,`date` = ?,`creationDate` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Debt value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getSum() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getSum());
        }
        if (value.getCurrency() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCurrency());
        }
        if (value.getPerson() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPerson());
        }
        final int _tmp;
        _tmp = value.isDebtor() ? 1 : 0;
        stmt.bindLong(5, _tmp);
        stmt.bindLong(6, value.getDate());
        stmt.bindLong(7, value.getCreationDate());
        if (value.getId() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.getId());
        }
      }
    };
  }

  @Override
  public long insertItem(final Debt arg0) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfDebt.insertAndReturnId(arg0);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Long> insertAll(final ArrayList<Debt> arg0) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      List<Long> _result = __insertionAdapterOfDebt.insertAndReturnIdsList(arg0);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int deleteItem(final Debt arg0) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__deletionAdapterOfDebt.handle(arg0);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int updateItem(final Debt arg0) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__updateAdapterOfDebt.handle(arg0);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Debt> getList(final SupportSQLiteQuery arg0) {
    final SupportSQLiteQuery _internalQuery = arg0;
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _internalQuery, false, null);
    try {
      final List<Debt> _result = new ArrayList<Debt>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Debt _item;
        _item = __entityCursorConverter_comTamimattafiMydebtsModelEntitiesDebt(_cursor);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
    }
  }

  @Override
  public Debt getItem(final SupportSQLiteQuery arg0) {
    final SupportSQLiteQuery _internalQuery = arg0;
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _internalQuery, false, null);
    try {
      final Debt _result;
      if(_cursor.moveToFirst()) {
        _result = __entityCursorConverter_comTamimattafiMydebtsModelEntitiesDebt(_cursor);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
    }
  }

  @Override
  public Flowable<List<Debt>> getRxList(final SupportSQLiteQuery query) {
    final SupportSQLiteQuery _internalQuery = query;
    return RxRoom.createFlowable(__db, false, new String[]{"debts"}, new Callable<List<Debt>>() {
      @Override
      public List<Debt> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _internalQuery, false, null);
        try {
          final List<Debt> _result = new ArrayList<Debt>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Debt _item;
            _item = __entityCursorConverter_comTamimattafiMydebtsModelEntitiesDebt(_cursor);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }
    });
  }

  @Override
  public Flowable<Debt> getRxItem(final SupportSQLiteQuery query) {
    final SupportSQLiteQuery _internalQuery = query;
    return RxRoom.createFlowable(__db, false, new String[]{"debts"}, new Callable<Debt>() {
      @Override
      public Debt call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _internalQuery, false, null);
        try {
          final Debt _result;
          if(_cursor.moveToFirst()) {
            _result = __entityCursorConverter_comTamimattafiMydebtsModelEntitiesDebt(_cursor);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }
    });
  }

  private Debt __entityCursorConverter_comTamimattafiMydebtsModelEntitiesDebt(Cursor cursor) {
    final Debt _entity;
    final int _cursorIndexOfId = cursor.getColumnIndex("id");
    final int _cursorIndexOfSum = cursor.getColumnIndex("sum");
    final int _cursorIndexOfCurrency = cursor.getColumnIndex("currency");
    final int _cursorIndexOfPerson = cursor.getColumnIndex("person");
    final int _cursorIndexOfIsDebtor = cursor.getColumnIndex("isDebtor");
    final int _cursorIndexOfDate = cursor.getColumnIndex("date");
    final int _cursorIndexOfCreationDate = cursor.getColumnIndex("creationDate");
    final Long _tmpId;
    if (_cursorIndexOfId == -1) {
      _tmpId = null;
    } else {
      if (cursor.isNull(_cursorIndexOfId)) {
        _tmpId = null;
      } else {
        _tmpId = cursor.getLong(_cursorIndexOfId);
      }
    }
    final String _tmpSum;
    if (_cursorIndexOfSum == -1) {
      _tmpSum = null;
    } else {
      _tmpSum = cursor.getString(_cursorIndexOfSum);
    }
    final String _tmpCurrency;
    if (_cursorIndexOfCurrency == -1) {
      _tmpCurrency = null;
    } else {
      _tmpCurrency = cursor.getString(_cursorIndexOfCurrency);
    }
    final String _tmpPerson;
    if (_cursorIndexOfPerson == -1) {
      _tmpPerson = null;
    } else {
      _tmpPerson = cursor.getString(_cursorIndexOfPerson);
    }
    final boolean _tmpIsDebtor;
    if (_cursorIndexOfIsDebtor == -1) {
      _tmpIsDebtor = false;
    } else {
      final int _tmp;
      _tmp = cursor.getInt(_cursorIndexOfIsDebtor);
      _tmpIsDebtor = _tmp != 0;
    }
    final long _tmpDate;
    if (_cursorIndexOfDate == -1) {
      _tmpDate = 0;
    } else {
      _tmpDate = cursor.getLong(_cursorIndexOfDate);
    }
    final long _tmpCreationDate;
    if (_cursorIndexOfCreationDate == -1) {
      _tmpCreationDate = 0;
    } else {
      _tmpCreationDate = cursor.getLong(_cursorIndexOfCreationDate);
    }
    _entity = new Debt(_tmpId,_tmpSum,_tmpCurrency,_tmpPerson,_tmpIsDebtor,_tmpDate,_tmpCreationDate);
    return _entity;
  }
}
