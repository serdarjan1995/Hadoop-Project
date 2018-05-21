package hadoop.project;

import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.Reducer.Context;

public class ReducerMostSales
            extends Reducer<Text, LongWritable, Text, LongWritable> {
        public ReducerMostSales(){}
        private LongWritable result = new LongWritable();
        public void reduce(Text key, Iterable<LongWritable> values, Context context)
          throws IOException, InterruptedException {
            long count = 0;
            Configuration conf = context.getConfiguration();
            for (LongWritable val : values) {
                count++;
            }
            if(conf.get("Town")==null && conf.get("Count")==null){
                conf.set("Town", key.toString());
                conf.set("Count", ""+count);
                result.set(count);
                context.write(key, result);
            }
            else if(Integer.parseInt(conf.get("Count"))<count){
                conf.set("Town", key.toString());
                conf.set("Count", ""+count);
                result.set(count);
                context.write(key, result);
            }
        }
    }
