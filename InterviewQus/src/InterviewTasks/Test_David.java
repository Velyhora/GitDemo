package InterviewTasks;

import java.util.ArrayList;
import java.util.Collections;

public class Test_David {

    public static String HTMLElements(String str) {
        ArrayList<String> openningTags=new ArrayList<String>();
        ArrayList <String> closingTags=new ArrayList<String>();

        String [] result=str.split("<");

        for(int i=1;i<result.length;i++){

            if(result[i].startsWith("/")){
                closingTags.add(result[i].substring(0,result[i].indexOf(">")));
            }else{
                openningTags.add(result[i].substring(0,result[i].indexOf(">")));
            }
        }
        Collections.sort(openningTags);
        Collections.sort(closingTags);
        for(int i=0;i<openningTags.size();i++){

           for(int k=0;k<closingTags.size();k++){
               if(closingTags.get(k).contains(openningTags.get(i))){
                   closingTags.remove(k);
                   openningTags.remove(i);
                   i--;
                   break;
               }
           }
        }
        if(openningTags.size()==0){
            return "true";
        }

        // code goes here
        return openningTags.get(0);
    }

    public static void main(String[] args) {
        String str="<div><div><b></b></div></p>";
        System.out.println(HTMLElements(str));
    }
}
