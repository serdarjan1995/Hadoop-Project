package hadoop.project;

import java.io.IOException;
import java.util.StringTokenizer;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.LongWritable;

public class TokenizerMapperAveragePropertyType
        extends Mapper<Object, Text, Text, LongWritable> {
    public TokenizerMapperAveragePropertyType(){}
    private LongWritable price = new LongWritable();
    private Text houseType = new Text();
    private String prType;
    public void map(Object key, Text value, Mapper.Context context)
        throws IOException, InterruptedException {
            Configuration conf = context.getConfiguration();
            prType = conf.get("PropertyType");
            if (!value.toString().contains("Property Type")){
                StringTokenizer itr = new StringTokenizer(value.toString(),",");
                int i=0;
                while (itr.hasMoreTokens() && i!=4) {
                    i++;
                    if(i==2){
                        price.set(Integer.parseInt(itr.nextToken()));
                    }
                    else{
                        houseType.set(itr.nextToken());
                    }
                    if(houseType.toString().equals(prType)){
                        context.write(houseType, price);
                    }
                }
          }
    }
}