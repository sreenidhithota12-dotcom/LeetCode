class Solution {
    public String addBinary(String a, String b) {
        int n = a.length();
        int m = b.length();
        char c = '0';
        StringBuilder sb = new StringBuilder();
        int i = n-1,j=m-1;
        while(i>=0 && j>=0){
            char c1=a.charAt(i);
            char c2=b.charAt(j);
            if(c1=='1' && c2=='1') {
                sb.append(c);
                c='1';
            }
            else if(c1=='1' || c2=='1'){
                if(c=='1'){
                    sb.append('0');
                }
                else{
                    sb.append('1');
                }
            }
            else{
                sb.append(c);
                c='0';
            }
            i--;
            j--;
        }
        while(i>=0){
            char c1=a.charAt(i);
            if(c1=='1'){
                if(c=='1'){
                    sb.append('0');
                }
                else{
                    sb.append('1');
                }
            }
            else{
                sb.append(c);
                c='0';
            }
            i--;
        }
        
    while(j>=0){
            char c1=b.charAt(j);
            if(c1=='1'){
                if(c=='1'){
                    sb.append('0');
                }
                else{
                    sb.append('1');
                }
            }
            else{
                sb.append(c);
                c='0';
            }
            j--;
    }
    if(c=='1') sb.append(c);
    return sb.reverse().toString();
    }
   
}