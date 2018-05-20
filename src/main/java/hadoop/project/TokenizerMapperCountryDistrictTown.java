package hadoop.project;

import java.io.IOException;
import java.util.StringTokenizer;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.conf.Configuration;

public class TokenizerMapperCountryDistrictTown
        extends Mapper<Object, Text, Text, IntWritable> {
    public TokenizerMapperCountryDistrictTown(){}
    private IntWritable price = new IntWritable();
    private Text houseType = new Text();
    private String country;
    private String district;
    private String town;
    public void map(Object key, Text value, Mapper.Context context)
        throws IOException, InterruptedException {
            Configuration conf = context.getConfiguration();
            country = conf.get("Country");
            district = conf.get("District");
            town = conf.get("Town");
            boolean hit = true;
            if (!value.toString().contains("Property Type")){
                StringTokenizer itr = new StringTokenizer(value.toString(),",");
                int i=0;
                while (itr.hasMoreTokens() && hit && i!=9) {
                    i++;
                    switch(i){
                        case 2: price.set(Integer.parseInt(itr.nextToken())); break;
                        case 7: if(!town.equalsIgnoreCase(itr.nextToken())) hit=false; break;
                        case 8: if(!district.equalsIgnoreCase(itr.nextToken())) hit=false; break;
                        case 9: if(!country.equalsIgnoreCase(itr.nextToken())) hit=false; break;
                        default: itr.nextToken();
                    }

                }
                if(hit){
                    context.write(new Text(country+"/"+district+"/"+town), price);
                }
          }
    }
}