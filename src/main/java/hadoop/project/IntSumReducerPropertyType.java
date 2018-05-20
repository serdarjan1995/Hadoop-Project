package hadoop.project;

import java.io.IOException;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.Reducer.Context;

public class IntSumReducerPropertyType
            extends Reducer<Text, LongWritable, Text, LongWritable> {
        public IntSumReducerPropertyType(){}
        private LongWritable result = new LongWritable();
        private long count = 0;
        public void reduce(Text key, Iterable<LongWritable> values, Context context)
          throws IOException, InterruptedException {
            long sum = 0;
            for (LongWritable val : values) {
              sum += val.get();
              count++;
            }
        result.set(sum/count);
        context.write(new Text("Property type: '"+key.toString()+"' Avg price:"), result);
        }
    }