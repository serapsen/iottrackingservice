package com.iotdevice.iotdevicetracking.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mongodb.MongoClient;
import dev.morphia.Datastore;

@Configuration
public class DataSourceConfig {
  

  //private Morphia morphia() {
    //final Morphia morphia = new Morphia();
    // tell Morphia where to find your classes
    // can be called multiple times with different packages or classes
    //morphia.mapPackage("com.iotdevice.iotdevicetracking.model");

    //return morphia;
 // }

  @Bean
  public Datastore datastore(MongoClient mongoClient) {
    // create the Datastore connecting to the default port on the local host
    //final Datastore datastore = morphia().createDatastore(mongoClient, mongoProperties.getDatabase());
    //datastore.ensureIndexes();

    return null;
  }
}




