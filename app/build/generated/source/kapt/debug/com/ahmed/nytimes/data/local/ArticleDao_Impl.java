package com.ahmed.nytimes.data.local;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.ahmed.nytimes.data.model.Article;
import com.ahmed.nytimes.data.model.Multimedia;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ArticleDao_Impl implements ArticleDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Article> __insertionAdapterOfArticle;

  private final EntityDeletionOrUpdateAdapter<Article> __deletionAdapterOfArticle;

  public ArticleDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfArticle = new EntityInsertionAdapter<Article>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `articles` (`id`,`url`,`byline`,`multimedia`,`published_date`,`section`,`short_url`,`subsection`,`description`,`title`,`isSaved`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Article value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUrl());
        }
        if (value.getByline() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getByline());
        }
        final String _tmp = Converters.fromListMultimedia(value.getMultimedia());
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp);
        }
        if (value.getPublished_date() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPublished_date());
        }
        if (value.getSection() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getSection());
        }
        if (value.getShort_url() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getShort_url());
        }
        if (value.getSubsection() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getSubsection());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getDescription());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getTitle());
        }
        final int _tmp_1 = value.isSaved() ? 1 : 0;
        stmt.bindLong(11, _tmp_1);
      }
    };
    this.__deletionAdapterOfArticle = new EntityDeletionOrUpdateAdapter<Article>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `articles` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Article value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
      }
    };
  }

  @Override
  public Object insert(final Article article, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfArticle.insert(article);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteArticle(final Article article,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfArticle.handle(article);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<List<Article>> getSavedArticles() {
    final String _sql = "SELECT * FROM articles";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"articles"}, false, new Callable<List<Article>>() {
      @Override
      public List<Article> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfByline = CursorUtil.getColumnIndexOrThrow(_cursor, "byline");
          final int _cursorIndexOfMultimedia = CursorUtil.getColumnIndexOrThrow(_cursor, "multimedia");
          final int _cursorIndexOfPublishedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "published_date");
          final int _cursorIndexOfSection = CursorUtil.getColumnIndexOrThrow(_cursor, "section");
          final int _cursorIndexOfShortUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "short_url");
          final int _cursorIndexOfSubsection = CursorUtil.getColumnIndexOrThrow(_cursor, "subsection");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfIsSaved = CursorUtil.getColumnIndexOrThrow(_cursor, "isSaved");
          final List<Article> _result = new ArrayList<Article>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Article _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            final String _tmpByline;
            if (_cursor.isNull(_cursorIndexOfByline)) {
              _tmpByline = null;
            } else {
              _tmpByline = _cursor.getString(_cursorIndexOfByline);
            }
            final List<Multimedia> _tmpMultimedia;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfMultimedia)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfMultimedia);
            }
            _tmpMultimedia = Converters.toListMultimedia(_tmp);
            final String _tmpPublished_date;
            if (_cursor.isNull(_cursorIndexOfPublishedDate)) {
              _tmpPublished_date = null;
            } else {
              _tmpPublished_date = _cursor.getString(_cursorIndexOfPublishedDate);
            }
            final String _tmpSection;
            if (_cursor.isNull(_cursorIndexOfSection)) {
              _tmpSection = null;
            } else {
              _tmpSection = _cursor.getString(_cursorIndexOfSection);
            }
            final String _tmpShort_url;
            if (_cursor.isNull(_cursorIndexOfShortUrl)) {
              _tmpShort_url = null;
            } else {
              _tmpShort_url = _cursor.getString(_cursorIndexOfShortUrl);
            }
            final String _tmpSubsection;
            if (_cursor.isNull(_cursorIndexOfSubsection)) {
              _tmpSubsection = null;
            } else {
              _tmpSubsection = _cursor.getString(_cursorIndexOfSubsection);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final boolean _tmpIsSaved;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsSaved);
            _tmpIsSaved = _tmp_1 != 0;
            _item = new Article(_tmpId,_tmpUrl,_tmpByline,_tmpMultimedia,_tmpPublished_date,_tmpSection,_tmpShort_url,_tmpSubsection,_tmpDescription,_tmpTitle,_tmpIsSaved);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
