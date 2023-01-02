package com.company.DesignPattern.Builder;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@NoArgsConstructor
@Setter
@Getter
public class Database {

    private String host;
    private  Integer port;
    private  String username;
    private  Long id;
    private  DatabaseType type;

    public Database(String host, Integer port, String username, Long id, DatabaseType type) {
        this.host = host;
        this.port = port;
        this.username = username;
        this.id = id;
        this.type = type;
    }
// anti-pattern
    public  Database(String host,Integer port,DatabaseType type){
        new Database(host,port,null,null,type);
    }
    public  Database(DatabaseType type){
        this(null,null,type);
    }

    public Database(Map<String,Object>values){
        this.host= (String) values.get("host");
        this.port= (Integer) values.get("port");
        this.type= (DatabaseType) values.get("type");


    }
}
