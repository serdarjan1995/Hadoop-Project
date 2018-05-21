package hadoop.project;

import java.io.IOException;
import java.util.StringTokenizer;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.LongWritable;

public class TokenizerMapperMostSales
        extends Mapper<Object, Text, Text, LongWritable> {
    public TokenizerMapperMostSales(){}
    private String country;
    private String town;
    private String yearMonth;
    private LongWritable one = new LongWritable(1);
    public void map(Object key, Text value, Mapper.Context context)
        throws IOException, InterruptedException {
            Configuration conf = context.getConfiguration();
            country = conf.get("Country");
            yearMonth = conf.get("YearMonth");
            boolean hit = true;
            if (!value.toString().contains("Property Type")){
                StringTokenizer itr = new StringTokenizer(value.toString(),",");
                int i=0;
                String val;
                while (itr.hasMoreTokens() && hit && i!=9) {
                    i++;
                    val=itr.nextToken();
                    switch(i){
                        case 3: if(!val.contains(yearMonth)) hit=false; break;
                        case 7: town=val; break;
                        case 9: if(!country.equalsIgnoreCase(val)) hit=false; break;
                    }

                }
                if(hit){
                    context.write(new Text(town), one);
                }
          }
    }
}