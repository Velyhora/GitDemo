package InterviewTasks;

public class Test2 {
    public static String SimplePassword(String str) {
        boolean isThereCapital = false;
        boolean isThereNumber= false;
        boolean isTherePunctuation= false;
        boolean notContainsPassword=!str.toLowerCase().contains("password");
        boolean isItInTheRange= str.length()>7&&str.length()<31;
        String punctuation = "!@#$%^&*()-+=<>?/.:;',|}{[]";
        String number = "0123456789";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
                isThereCapital = true;
            } for(int t=0;t<number.length();t++){
                if(number.charAt(t)==str.charAt(i)){
                    isThereNumber=true;
                }
            }
            for(int j=0;j<punctuation.length();j++){
                if(str.charAt(i)==punctuation.charAt(j)){
                    isTherePunctuation=true;
                }
            }
        }
        boolean result =isThereCapital&&isThereNumber&&isTherePunctuation&&
                notContainsPassword&&isItInTheRange;
        return result +"";
    }


    public static void main (String[] args) {

        System.out.println(SimplePassword("A!turkey90AAA="));
    }
    }
