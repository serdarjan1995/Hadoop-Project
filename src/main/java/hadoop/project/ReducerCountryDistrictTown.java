package hadoop.project;

import java.io.IOException;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.Reducer.Context;

public class ReducerCountryDistrictTown
            extends Reducer<Text, LongWritable, Text, LongWritable> {
        public ReducerCountryDistrictTown(){}
        private LongWritable result = new LongWritable();
        private long count = 0;
        private LongWritable max = new LongWritable(0);
        private LongWritable min = new LongWritable(0);
        boolean first = true;
        public void reduce(Text key, Iterable<LongWritable> values, Context context)
          throws IOException, InterruptedException {
            long sum = 0;
            long value;
            for (LongWritable val : values) {
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
        context.write(new Text(key.toString()+" Max price:"), max);
        context.write(new Text(key.toString()+" Min price:"), min);
        context.write(new Text(key.toString()+" Avg price:"), result);
        }
    }
