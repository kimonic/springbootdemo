package trytest;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ImgCheck {
    public static void main(String[] args){
        File file=new File("F:\\juzimihome.txt");
        BufferedReader reader=null;
        try {
            reader=new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            String tempchar;
            StringBuilder builder=new StringBuilder();
            tempchar=reader.readLine();
            while (tempchar!=null){
                builder.append(tempchar);
                tempchar=reader.readLine();
            }
            String html=builder.toString();
//            Pattern p = Pattern.compile("src=\"([a-zA-z]+://[^\\s]*?).jpg\"");
//            Pattern p = Pattern.compile("src=\"(//[^\\s]*?).png\"");
            Pattern p = Pattern.compile("<img(.*?)/>");
            Matcher m=p.matcher(html);
            List<String> result=new ArrayList<>();
            while (m.find()){
                result.add(m.group());
            }
            System.out.println("-----------"+result.size());

            for (String s : result) {
                System.out.println("--------"+s+"\n\n\n");
            }


            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
