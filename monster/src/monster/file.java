package monster;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.jar.*;
import org.apache.commons.io.FileUtils;

public class file 
{
public void compressQuery(String query, List<String> parameters) 
{
String[] par = (String[]) parameters.toArray();
int parLength = par.length;
//for(String par : parameters)
{
boolean first = true;
String resultString = "";

//par = "&" + par;  //System.out.println("par = " + par);
// String[] split=query.split("&" + par)[0];

String[] splittedArray = query.split("&");
for(String str : splittedArray)
{
boolean flag = true;
for(int i=0; i<parLength ; i++)
{
if(str.contains(par[i]))
{
flag = false;
}
}

if(flag)
{

if(first)
{
resultString = resultString  + str;
}

else
{
resultString = resultString + "&" + str;
}
first = false;
}
}

System.out.println("Output query = " + resultString);
}

}

public static void main(String[] args) throws IOException
{
//get the file
List<String> lines = FileUtils.readLines(new File("C:/Users/mandeep/workspace/monster/file"), "utf-8");

System.out.println("original query =" + lines);

List<String> parameters = Arrays.asList("fetchsize", "start");;

file t1 = new file();

for(String ln : lines)
{
t1.compressQuery(ln, parameters);

}

}}




		 
	