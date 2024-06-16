package com.cdx.spark;

import org.apache.spark.api.java.JavaRDD;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        setup();
        FirstTest firstTest = new FirstTest();
        JavaRDD myRDD = firstTest.sparkContext.parallelize(firstTest.inputDatas);
        firstTest.sparkContext.close();
        Logger.getLogger("org.apache").setLevel(Level.INFO);
//        System.out.println("Starting Spark App");
//        // Create a Spark session
//        SparkSession spark = SparkSession.builder()
//                .appName("Simple Spark App")
//                .config("spark.master", "local")
//                .getOrCreate();
//
//        Dataset<Row> df = spark.read().json("src/main/resources/people.json");
//
//        // Show the DataFrame
//        df.show();
//
//        // Stop the Spark session
//        spark.stop();
    }

    protected static void setup() {
        System.out.println("Starting app");
    }
}
