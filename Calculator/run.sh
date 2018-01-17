#!/usr/bin/env bash

#Run this jar file, entry point is App.class
java -cp mvn/calculator/target/calculator-1.0-SNAPSHOT.jar com.weifengc.app.App

# You can't run in the following way. Error : no main manifest attribute.
#java -jar mvn/calculator/target/calculator-1.0-SNAPSHOT.jar
