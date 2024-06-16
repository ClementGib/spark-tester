package com.cdx.spark;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

import java.util.List;

public class FirstTest {
    SparkConf conf = new SparkConf().setAppName("FirstTest").setMaster("local");
    JavaSparkContext sparkContext = new JavaSparkContext(conf);
    List<Double> inputDatas = List.of(35.5d, 12d, 90.30d);
}
