package first;

public class ti_557 {
    public String reverseWords(String s) {
        int len =s.length();
        if(len <=1) return s;
        StringBuffer st = new StringBuffer();
        int start = 0;
        int end=0;
        while (end<=len){
            start =end;
            while(s.charAt(end)!= ' '&&end<=len) {
                end++;
            }
            for(int i =end;i>=start;i--){
                st.append(s.charAt(i));
            }
            while(s.charAt(end)== ' '&&end<=len) {
                end++;
                st.append(' ');
            }
        }

        return st.toString();




    }
    public static void main(){
        ti_557 ti_557 = new ti_557();
        String a ="Let's take LeetCode contest";
        String b = ti_557.reverseWords(a);
        System.out.println(b);
    }



}