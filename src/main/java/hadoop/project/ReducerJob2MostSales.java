package hadoop.project;

import java.io.IOException;
import java.util.StringTokenizer;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.Reducer.Context;

public class ReducerJob2MostSales
            extends Reducer<Text, Text, Text, Text> {
        public ReducerJob2MostSales(){}
        public void reduce(Text key, Iterable<Text> values, Context context)
          throws IOException, InterruptedException {
            String town = "";
            String count = "";
            for (Text val : values) {
                StringTokenizer itr = new StringTokenizer(val.toString(),",");
                if(town.equals("")){
                    town = itr.nextToken();
                    count = itr.nextToken();
                }
                break;
            }
            context.write(new Text(town+" has most sales"),new Text(count));              
        }
    }
