package hadoop.project;

import java.io.IOException;
import java.util.StringTokenizer;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class MapperJob2MostSales
        extends Mapper<Object, Text, Text, Text> {
    public MapperJob2MostSales(){}
    public void map(Object key, Text value, Mapper.Context context)
        throws IOException, InterruptedException {
            StringTokenizer itr = new StringTokenizer(value.toString(),"\t");
            String tt = itr.nextToken();
            String cc = itr.nextToken();
            context.write(new Text("1"),new Text(tt+","+cc));
          }
    }