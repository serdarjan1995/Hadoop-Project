/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hadoop.project;

import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

/**
 *
 * @author hadoop
 */
public class ReducerCountryDistrictTown
            extends Reducer<Text, IntWritable, Text, IntWritable> {
        public ReducerCountryDistrictTown(){}
        private IntWritable result = new IntWritable();
        private int count = 0;
        private int max = 0;
        private int min = 0;
        boolean first = true;
        public void reduce(Text key, Iterable<IntWritable> values, Reducer.Context context)
          throws IOException, InterruptedException {
            int sum = 0;
            int value;
            for (IntWritable val : values) {
                value = val.get();
                if(first){
                    max = value;
                    min = value;
                    first = false;
                }
                else{
                    if(max<value){
                        max=value;
                    }
                    if(min>value){
                        min=value;
                    }
                }
                sum += value;
                count++;
            }
        result.set(sum/count);
        context.write(new Text(key.toString()+" Max price:"), new IntWritable(max));
        context.write(new Text(key.toString()+" Min price:"), new IntWritable(min));
        context.write(new Text(key.toString()+" Avg price:"), result);
        }
    }
