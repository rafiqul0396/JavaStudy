package com.company.DesignPattern.Builder.test;

import com.company.DesignPattern.Builder.DataStore;
import com.company.DesignPattern.Builder.Database;
import com.company.DesignPattern.Builder.DatabaseType;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DatabaseTest {

    @Test
    public  void testContructor(){
        Database db= new Database("localhost",234,"rafik", 1L, DatabaseType.MY_SQL);
        assertNotNull(" if the constucotr not null",db);
    }
    @Test
    public  void testSetter(){
        Database database = new Database();
        database.setHost("localhost");
        database.setPort(2342);
        assertEquals("this is local host test","localhost",database.getHost());
    }
    @Test
    public void testHashMapcontor(){
        Map<String, Object> values= new HashMap<>();
        values.put("host","localhost");
        values.put("port",234);
        values.put("type",DatabaseType.MY_SQL);

        Database database = new Database(values);

    }
    @Test
    public  void testBuilder(){
        //DataStore.DataStoreBuilder dataStore= new DataStore.DataStoreBuilder();
        DataStore dataStore= DataStore.builder().build();
    }
    @Test
    public  void  testBuilder1(){
        DataStore.DataStoreBuilder builder= DataStore.builder();
        //builder.setHost("localhost");
        //builder.setPort(5432);
        //builder.setType(DatabaseType.MY_SQL);
        DataStore dataStore=builder.build();
        //assertEquals("if host setter will be call then it should be localhost","localhost",dataStore.getHost());
        //assertEquals("if host setter will be call then it should be localhost",DatabaseType.MY_SQL,dataStore.getType());

    }
    @Test
    public  void testDataStore(){
     DataStore builder= DataStore.builder().withHost("localhost").byType(DatabaseType.MY_SQL).build();
    }
}
