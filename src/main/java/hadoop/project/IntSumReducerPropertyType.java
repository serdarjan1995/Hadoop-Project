package hadoop.project;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.Reducer.Context;

//public class IntSumReducer
//    extends Reducer<Text, IntWritable, Text, IntWritable> {
//  private static IntWritable result = new IntWritable();
//
//  public void reduce(Text key, Iterable<IntWritable> values, Context context)
//      throws IOException, InterruptedException {
//    int sum = 0;
//    for (IntWritable val : values) {
//      sum += val.get();
//    }
//    result.set(sum);
//    context.write(key, result);
//  }
//}

public class IntSumReducerPropertyType
            extends Reducer<Text, IntWritable, Text, IntWritable> {
        public IntSumReducerPropertyType(){}
        private IntWritable result = new IntWritable();
        private int count = 0;
        public void reduce(Text key, Iterable<IntWritable> values, Context context)
          throws IOException, InterruptedException {
            int sum = 0;
            for (IntWritable val : values) {
              sum += val.get();
              count++;
            }
        //context.write(key, new IntWritable(sum));
        result.set(sum/count);
        context.write(new Text("Property type: '"+key.toString()+"' Avg price:"), result);
        }
    }