package hadoop.project;

import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.Reducer.Context;

public class ReducerCountryDistrictTown
            extends Reducer<Text, IntWritable, Text, IntWritable> {
        public ReducerCountryDistrictTown(){}
        private IntWritable result = new IntWritable();
        private int count = 0;
        private IntWritable max = new IntWritable(0);
        private IntWritable min = new IntWritable(0);
        boolean first = true;
        public void reduce(Text key, Iterable<IntWritable> values, Context context)
          throws IOException, InterruptedException {
            int sum = 0;
            int value;
            for (IntWritable val : values) {
                value = val.get();
                if(first){
                    max.set(value);
                    min.set(value);
                    first = false;
                }
                else{
                    if(max.get()<value){
                        max.set(value);
                    }
                    if(min.get()>value){
                        min.set(value);
                    }
                }
                sum += value;
                count++;
            }
        result.set(sum/count);
//        context.write(key, max);
//        context.write(key, min);
//        context.write(key, result);
        context.write(new Text(key.toString()+" Max price:"), max);
        context.write(new Text(key.toString()+" Min price:"), min);
        context.write(new Text(key.toString()+" Avg price:"), result);
        }
    }
