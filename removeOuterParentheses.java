class removeOuterParentheses {
   
    public static String rOP(String s) {
       int count=0;
       StringBuilder result = new StringBuilder();

        for(char c: s.toCharArray()){
            if(c=='('){
                if(count>0){
                    result.append(c);
                }
                count++;
            }
            
            else if(c==')'){
                count--;
                if(count>0){
                    result.append(c);
                }
            }
        }
        
return result.toString();
    }

     public static void main(String args[]){
        String s= "(()())((()))";
        String str =rOP(s);
        System.out.println(str);
    }
}