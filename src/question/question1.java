package question;

public class question1 {
    public boolean isPermutation(String s,String t){
        char []array1 = s.toCharArray();
        char []array2 = t.toCharArray();
        for(int i=0;i<array1.length;i++){
            char temps = array1[i];
            for(int j=0;j<array1.length;j++){
                if(temps ==array2[j]){
                    array1[i] = '0';
                    array2[j] = '0';
                    break;
                }
            }
        }
        for(char c:array1){
            if(c!='0'){
                return false;
            }
        }
        for(char c:array2){
            if(c!='0'){
                return false;
            }
        }
        return true;
    }


}
