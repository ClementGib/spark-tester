package com.cdx.spark;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        // Create a Spark session
        SparkSession spark = SparkSession.builder()
                .appName("Simple Spark App")
                .config("spark.master", "local")
                .getOrCreate();

        // Read a JSON file into a DataFrame
//        Dataset<Row> df = spark.read().json("src/main/resources/people.json");

//        // Show the DataFrame
//        df.show();
//
//        // Stop the Spark session
//        spark.stop();
    }
}
