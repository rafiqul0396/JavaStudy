package com.company.DesignPattern.Builder;

import lombok.Getter;
import lombok.Setter;

@Getter
public class DataStore {
    private String host;
    private  Integer port;
    private  String username;
    private  Long id;
    private  DatabaseType type;

    // step-1: hide our outer construcor
    private  DataStore(){}

    // add a static method to create instance of builder method
    // static initializer

    public  static  DataStoreBuilder builder(){
        return  new DataStoreBuilder();
    }

    // step2: create a builder class

    public static  class  DataStoreBuilder{

        // step 3: copy all the fields from outer class
        private String host;
        private  Integer port;
        private  String username;
        private  Long id;
        private  DatabaseType type;

      // step-4: add a fluents interfaces for setters

     public  DataStoreBuilder withHost(String host){
         this.host=host;
         return  this;
     }

     public  DataStoreBuilder byType(DatabaseType type){
         this.type=type;
         return  this;
     }
        // step-5: add build hook
        public DataStore build(){
            DataStore dataStore= new DataStore();
            dataStore.host=host;
            dataStore.port=port;
            dataStore.type=type;
            return  dataStore;

        }



    }



}
